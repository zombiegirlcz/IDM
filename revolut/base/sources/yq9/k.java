package yq9;

import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ar9.s;
import ar9.t;
import ar9.u;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f316014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f316015c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ k(l lVar, String str, ArrayList arrayList, int i) {
        this.f316013a = i;
        this.f316014b = lVar;
        this.f316015c = str;
        this.d = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        Integer numValueOf;
        switch (this.f316013a) {
            case 0:
                l lVar = this.f316014b;
                lVar.getClass();
                String groupId = this.f316015c;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                ArrayList members = this.d;
                Intrinsics.checkNotNullParameter(members, "members");
                DBUtil.performBlocking(lVar.f316016a, false, true, new y9d.c(groupId, 23));
                lVar.b(members);
                return Unit.f186387a;
            default:
                ArrayList<String> arrayList = this.d;
                xq9.g gVar = this.f316014b.f316018c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f316015c);
                try {
                    int i2 = 1;
                    for (String str : arrayList) {
                        if (str == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, str);
                        }
                        i2++;
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "memberId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "inviterId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countryCode");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolut");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        s sVarA = xq9.g.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        s sVarA2 = xq9.g.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                        u uVarA = xq9.h.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                            i = columnIndexOrThrow2;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow2;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                        }
                        arrayList2.add(new t(text, text2, sVarA, sVarA2, uVarA, text3, text4, text5, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null));
                        columnIndexOrThrow2 = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
        }
    }
}
