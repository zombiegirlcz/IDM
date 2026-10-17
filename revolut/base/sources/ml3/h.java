package ml3;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.contacts.impl.data.database.ContactsDatabase;
import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f206590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f206591b = new ao.g(this, 18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ipk.d f206592c = new ipk.d(2);
    public final ipk.d d = new ipk.d(this, 3);

    public h(ContactsDatabase contactsDatabase) {
        this.f206590a = contactsDatabase;
    }

    public static /* synthetic */ Unit s(h hVar, ArrayList arrayList) {
        super.b(arrayList);
        return Unit.f186387a;
    }

    @Override // ml3.a
    public final int a() {
        return ((Integer) DBUtil.performBlocking(this.f206590a, true, false, new mk3.c(16))).intValue();
    }

    @Override // ml3.a
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f206590a, false, true, new g(this, arrayList, 1));
    }

    @Override // ml3.a
    public final int c(List list) {
        return ((Integer) DBUtil.performBlocking(this.f206590a, false, true, new mk5.s(this, list, 2))).intValue();
    }

    @Override // ml3.a
    public final i d(String str) {
        return (i) DBUtil.performBlocking(this.f206590a, true, false, new b(this, str, 2));
    }

    @Override // ml3.a
    public final d0 e(List list) {
        return RxRoom.createSingle(this.f206590a, true, false, new c(this, prk.o.p(")", list, p.a.s("SELECT * FROM contact WHERE id IN (")), list, 0));
    }

    @Override // ml3.a
    public final i f(long j2) {
        return (i) DBUtil.performBlocking(this.f206590a, true, false, new a82.r(this, j2));
    }

    @Override // ml3.a
    public final i g(String str) {
        return (i) DBUtil.performBlocking(this.f206590a, true, false, new b(this, str, 0));
    }

    @Override // ml3.a
    public final i h(String str) {
        return (i) DBUtil.performBlocking(this.f206590a, true, false, new b(this, str, 1));
    }

    @Override // ml3.a
    public final List i(int i, int i2) {
        return (List) DBUtil.performBlocking(this.f206590a, true, false, new meb.f(i, i2, 1));
    }

    @Override // ml3.a
    public final List j() {
        return (List) DBUtil.performBlocking(this.f206590a, true, false, new d(this, 1));
    }

    @Override // ml3.a
    public final int k() {
        return ((Integer) DBUtil.performBlocking(this.f206590a, true, false, new mk3.c(17))).intValue();
    }

    @Override // ml3.a
    public final List l() {
        return (List) DBUtil.performBlocking(this.f206590a, true, false, new d(this, 0));
    }

    @Override // ml3.a
    public final void m(final long j2, final List list) {
        StringBuilder sbS = p.a.s("UPDATE contact SET transactionsCount = transactionsCount + 1, timestamp = ? WHERE point IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") or registeredAs IN (");
        final String strP = prk.o.p(")", list, sbS);
        DBUtil.performBlocking(this.f206590a, false, true, new Function1() { // from class: ml3.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                long j3 = j2;
                List<String> list2 = list;
                int i = size;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(strP);
                try {
                    sQLiteStatementPrepare.bindLong(1, j3);
                    int i2 = 2;
                    for (String str : list2) {
                        if (str == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, str);
                        }
                        i2++;
                    }
                    int i3 = i + 2;
                    for (String str2 : list2) {
                        if (str2 == null) {
                            sQLiteStatementPrepare.bindNull(i3);
                        } else {
                            sQLiteStatementPrepare.bindText(i3, str2);
                        }
                        i3++;
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        });
    }

    @Override // ml3.a
    public final List n(ArrayList arrayList) {
        return (List) DBUtil.performBlocking(this.f206590a, false, true, new g(this, arrayList, 2));
    }

    @Override // ml3.a
    public final efm.r o(List list) {
        c cVar = new c(this, prk.o.p(") ORDER BY displayedName COLLATE NOCASE ASC", list, p.a.s("SELECT * FROM contact WHERE code IN (")), list, 1);
        return RxRoom.createObservable(this.f206590a, false, new String[]{"contact"}, cVar);
    }

    @Override // ml3.a
    public final efm.r p(List list) {
        c cVar = new c(this, prk.o.p(")", list, p.a.s("SELECT * FROM contact WHERE id IN (")), list, 2);
        return RxRoom.createObservable(this.f206590a, false, new String[]{"contact"}, cVar);
    }

    @Override // ml3.a
    public final void q(ArrayList arrayList) {
        DBUtil.performBlocking(this.f206590a, false, true, new g(this, arrayList, 0));
    }

    @Override // ml3.a
    public final efm.b r(int i, long j2, String str) {
        return RxRoom.createCompletable(this.f206590a, false, true, new e(i, j2, str));
    }
}
