package u69;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.feature.notification_centre.impl.data.database.InboxDatabase;
import dcl.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.joda.time.DateTime;
import prk.o;
import tx0.p4;
import u4e.i;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f277518a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f277520c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f277519b = new t0g.b(this, 6);
    public final g0 d = new g0(19);
    public final g0 e = new g0(this, 20);

    public h(InboxDatabase inboxDatabase) {
        this.f277518a = inboxDatabase;
    }

    public static /* synthetic */ Unit m(h hVar, ArrayList arrayList, DateTime dateTime) {
        super.i(arrayList, dateTime);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit n(h hVar, ArrayList arrayList) {
        super.g(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit o(h hVar, ArrayList arrayList) {
        super.h(arrayList);
        return Unit.f186387a;
    }

    @Override // u69.d
    public final List a() {
        return (List) DBUtil.performBlocking(this.f277518a, true, false, new p4(this, 29));
    }

    @Override // u69.d
    public final v69.b b(String str) {
        return (v69.b) DBUtil.performBlocking(this.f277518a, true, false, new g(this, str, 0));
    }

    @Override // u69.d
    public final List c(DateTime dateTime) {
        return (List) DBUtil.performBlocking(this.f277518a, true, false, new twg.a(this, dateTime, 28));
    }

    @Override // u69.d
    public final void d() {
        DBUtil.performBlocking(this.f277518a, false, true, new i(13));
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        v69.b bVar = (v69.b) obj2;
        bVar.getClass();
        DBUtil.performBlocking(this.f277518a, false, true, new e(this, bVar, 0));
    }

    @Override // u69.d
    public final void e(DateTime dateTime, DateTime dateTime2) {
        DBUtil.performBlocking(this.f277518a, false, true, new lmd.h(this, dateTime, dateTime2, 1));
    }

    @Override // u69.d
    public final void f(DateTime dateTime, DateTime dateTime2) {
        DBUtil.performBlocking(this.f277518a, false, true, new lmd.h(this, dateTime, dateTime2, 2));
    }

    @Override // u69.d
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f277518a, false, true, new f(this, arrayList, 0));
    }

    @Override // u69.d
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f277518a, false, true, new f(this, arrayList, 1));
    }

    @Override // u69.d
    public final void i(ArrayList arrayList, DateTime dateTime) {
        DBUtil.performBlocking(this.f277518a, false, true, new toh.h(this, 14, arrayList, dateTime));
    }

    @Override // u69.d
    public final void j(List list) {
        DBUtil.performBlocking(this.f277518a, false, true, new twg.a(this, list, 29));
    }

    @Override // u69.d
    public final void k(String str, String str2, List list) {
        StringBuilder sbS = p.a.s("UPDATE inbox_item SET state = ? WHERE id IN(");
        int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") AND state == ");
        sbS.append("?");
        DBUtil.performBlocking(this.f277518a, false, true, new b6.a(sbS.toString(), str, list, size, str2, 6));
    }

    @Override // u69.d
    public final void l(String str, List list) {
        DBUtil.performBlocking(this.f277518a, false, true, new toh.h(o.p(")", list, p.a.s("UPDATE inbox_item SET state = ? WHERE id IN(")), str, list));
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        v69.b bVar = (v69.b) obj2;
        bVar.getClass();
        return ((Integer) DBUtil.performBlocking(this.f277518a, false, true, new e(this, bVar, 1))).intValue();
    }
}
