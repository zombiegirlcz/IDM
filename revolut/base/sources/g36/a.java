package g36;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s7a.r;
import ybl.h;
import yji.l;
import zhm.a1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f140205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140206c;

    public /* synthetic */ a(String str, Set set, int i) {
        this.f140204a = i;
        this.f140206c = str;
        this.f140205b = set;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140204a) {
            case 0:
                Set<String> set = this.f140205b;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f140206c);
                try {
                    int i = 1;
                    for (String str : set) {
                        if (str == null) {
                            sQLiteStatementPrepare.bindNull(i);
                        } else {
                            sQLiteStatementPrepare.bindText(i, str);
                        }
                        i++;
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "external_asset_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "display_name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fractional_digits");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "display_fractional_digits");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticker");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "icon_url");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new d((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)), sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 1:
                ax4.b updateState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Set set2 = this.f140205b;
                String str2 = this.f140206c;
                return ax4.b.a(updateState, null, set2.contains(str2) ? a1.j(set2, str2) : a1.m(set2, str2), null, null, null, null, null, null, null, null, null, null, null, 8189);
            case 2:
                Set<String> set3 = this.f140205b;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(this.f140206c);
                try {
                    int i2 = 1;
                    for (String str3 : set3) {
                        if (str3 == null) {
                            sQLiteStatementPrepare2.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare2.bindText(i2, str3);
                        }
                        i2++;
                    }
                    sQLiteStatementPrepare2.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare2.close();
                    return unit;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
            case 3:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, null, a1.m(a1.m(this.f140205b, this.f140206c), "PICKER_SELECT_ALL_ITEM_ID"), null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 4:
                r update2 = (r) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return r.a(update2, null, null, a1.m(this.f140205b, this.f140206c), null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 5:
                r update3 = (r) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Set set4 = this.f140205b;
                String str4 = this.f140206c;
                return r.a(update3, null, null, set4.contains(str4) ? a1.j(set4, str4) : a1.m(set4, str4), null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 6:
                r update4 = (r) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return r.a(update4, null, null, a1.j(a1.j(this.f140205b, this.f140206c), "PICKER_SELECT_ALL_ITEM_ID"), null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 7:
                r update5 = (r) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return r.a(update5, null, null, a1.j(this.f140205b, this.f140206c), null, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 8:
                y7a.r updateState2 = (y7a.r) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return y7a.r.a(updateState2, null, null, a1.m(this.f140205b, this.f140206c), null, false, false, false, null, 507);
            case 9:
                y7a.r updateState3 = (y7a.r) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                Set set5 = this.f140205b;
                String str5 = this.f140206c;
                return y7a.r.a(updateState3, null, null, set5.contains(str5) ? a1.j(set5, str5) : a1.m(set5, str5), null, false, false, false, null, 507);
            case 10:
                y7a.r updateState4 = (y7a.r) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return y7a.r.a(updateState4, null, null, a1.j(a1.j(this.f140205b, this.f140206c), "PICKER_SELECT_ALL_ITEM_ID"), null, false, false, false, null, 507);
            case 11:
                y7a.r updateState5 = (y7a.r) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return y7a.r.a(updateState5, null, null, a1.j(this.f140205b, this.f140206c), null, false, false, false, null, 507);
            case 12:
                y7a.r updateState6 = (y7a.r) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return y7a.r.a(updateState6, null, null, a1.m(a1.m(this.f140205b, this.f140206c), "PICKER_SELECT_ALL_ITEM_ID"), null, false, false, false, null, 507);
            default:
                h productGroupAvailability = (h) obj2;
                Intrinsics.checkNotNullParameter(productGroupAvailability, "productGroupAvailability");
                return Boolean.valueOf(productGroupAvailability.a(this.f140205b, this.f140206c, new z8h.b(0)));
        }
    }

    public /* synthetic */ a(Set set, String str, int i) {
        this.f140204a = i;
        this.f140205b = set;
        this.f140206c = str;
    }

    public /* synthetic */ a(l lVar, Set set, String str, int i) {
        this.f140204a = i;
        this.f140205b = set;
        this.f140206c = str;
    }
}
