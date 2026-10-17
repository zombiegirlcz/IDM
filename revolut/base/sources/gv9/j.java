package gv9;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.payments.messaging.data.impl.data.database.SocialPaymentsDatabase;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f147114a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fv9.a f147116c = new fv9.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f147115b = new i(this, 0);
    public final ao.g d = new ao.g(4);

    public j(SocialPaymentsDatabase socialPaymentsDatabase) {
        this.f147114a = socialPaymentsDatabase;
    }

    public final r b(final String str, final boolean z, final List list, final List list2) {
        StringBuilder sbS = p.a.s("\n        SELECT \n            * \n        FROM \n            payments_social_reactions \n        WHERE \n            (senderId = ? OR recipientId = ?) AND \n            status IN (");
        final int size = list2.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") AND ");
        sbS.append("\n");
        sbS.append("            state IN (");
        final int size2 = list.size();
        StringUtil.appendPlaceholders(sbS, size2);
        sbS.append(") AND ");
        sbS.append("\n");
        sbS.append("            isGroupChat = ");
        j6.a.D(sbS, "?", "\n", "        ORDER BY ", "\n");
        sbS.append("            updatedDate ASC");
        final String string = sbS.toString();
        Function1 function1 = new Function1() { // from class: gv9.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List<String> list3 = list2;
                int i = size;
                List<String> list4 = list;
                int i2 = size2;
                boolean z3 = z;
                j jVar = this.f147104a;
                jVar.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(string);
                String str2 = str;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    int i3 = 3;
                    for (String str3 : list3) {
                        if (str3 == null) {
                            sQLiteStatementPrepare.bindNull(i3);
                        } else {
                            sQLiteStatementPrepare.bindText(i3, str3);
                        }
                        i3++;
                    }
                    int i5 = i + 3;
                    int i6 = i5;
                    for (String str4 : list4) {
                        if (str4 == null) {
                            sQLiteStatementPrepare.bindNull(i6);
                        } else {
                            sQLiteStatementPrepare.bindText(i6, str4);
                        }
                        i6++;
                    }
                    sQLiteStatementPrepare.bindLong(i5 + i2, z3 ? 1L : 0L);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "senderId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "media");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isGroupChat");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "metadata");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        int i21 = columnIndexOrThrow7;
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                        long j2 = sQLiteStatementPrepare.getLong(i21);
                        int i22 = columnIndexOrThrow;
                        arrayList.add(new iv9.a(text, text2, text3, text4, text5, z4, j2, sQLiteStatementPrepare.getLong(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), jVar.f147116c.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11))));
                        columnIndexOrThrow7 = i21;
                        columnIndexOrThrow = i22;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        };
        return RxRoom.createObservable(this.f147114a, false, new String[]{"payments_social_reactions"}, function1);
    }
}
