package lrl;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends Migration {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f199562c = new m();

    private m() {
        super(21, 22);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase db8) throws IOException {
        String str;
        Intrinsics.checkNotNullParameter(db8, "db");
        db8.execSQL("ALTER TABLE `invest_orders` ADD COLUMN `portfolio_id` TEXT DEFAULT NULL");
        try {
            db8.execSQL("UPDATE `invest_orders`\nSET `portfolio_id` = COALESCE(\n    CASE WHEN json_valid(`stock_order`) THEN json_extract(`stock_order`, '$.portfolioId') END,\n    CASE WHEN json_valid(`tax_advantaged_order`) THEN json_extract(`tax_advantaged_order`, '$.portfolioId') END,\n    CASE WHEN json_valid(`margin_order`) THEN json_extract(`margin_order`, '$.portfolioId') END,\n    CASE WHEN json_valid(`fund_order`) THEN json_extract(`fund_order`, '$.portfolioId') END\n)");
        } catch (SQLiteException e) {
            String message = e.getMessage();
            if (message == null || !d0.J(message, "no such function: json_", false)) {
                throw e;
            }
            Cursor cursorQuery = db8.query("SELECT `id`, `stock_order`, `tax_advantaged_order`, `margin_order`, `fund_order`\nFROM `invest_orders`");
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("id");
                List listK = zhm.v.k(Integer.valueOf(cursorQuery.getColumnIndexOrThrow("stock_order")), Integer.valueOf(cursorQuery.getColumnIndexOrThrow("tax_advantaged_order")), Integer.valueOf(cursorQuery.getColumnIndexOrThrow("margin_order")), Integer.valueOf(cursorQuery.getColumnIndexOrThrow("fund_order")));
                aim.e eVarB = zhm.u.b();
                while (cursorQuery.moveToNext()) {
                    Iterator it8 = listK.iterator();
                    do {
                        str = null;
                        if (!it8.hasNext()) {
                            break;
                        }
                        String string = cursorQuery.getString(((Number) it8.next()).intValue());
                        if (string != null) {
                            f199562c.getClass();
                            try {
                                Object objOpt = new JSONObject(string).opt("portfolioId");
                                if (objOpt instanceof String) {
                                    str = (String) objOpt;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    } while (str == null);
                    if (str != null) {
                        eVarB.add(new Pair(cursorQuery.getString(columnIndexOrThrow), str));
                    }
                }
                aim.e eVarA = zhm.u.a(eVarB);
                cursorQuery.close();
                ListIterator listIterator = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar = (aim.b) listIterator;
                    if (!bVar.hasNext()) {
                        return;
                    }
                    Pair pair = (Pair) bVar.next();
                    db8.execSQL("UPDATE `invest_orders` SET `portfolio_id` = ? WHERE `id` = ?", new String[]{(String) pair.f186386b, (String) pair.f186385a});
                }
            } finally {
            }
        }
    }
}
