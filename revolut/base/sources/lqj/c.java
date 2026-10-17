package lqj;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.impl.AnalyticsDatabase;
import dcl.g0;
import e4k.m0;
import efm.r;
import is6.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import llh.j;
import prk.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f199318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f199319b = new x(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f199320c = new g0(6);
    public final g0 d = new g0(7);

    public c(AnalyticsDatabase analyticsDatabase) {
        this.f199318a = analyticsDatabase;
    }

    public static /* synthetic */ Unit h(c cVar, long j2, long j3, ArrayList arrayList) {
        super.g(j2, j3, arrayList);
        return Unit.f186387a;
    }

    @Override // lqj.a
    public final r a(long j2, long j3, ArrayList arrayList) {
        e1.c cVar = new e1.c(com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("SELECT date, SUM(balance) as total FROM balance_history WHERE date BETWEEN ? AND ? AND source IN ("), ") GROUP BY date ORDER BY date"), arrayList, 2, j2, j3);
        return RxRoom.createObservable(this.f199318a, false, new String[]{"balance_history"}, cVar);
    }

    @Override // lqj.a
    public final r b(long j2, ArrayList arrayList) {
        csl.a aVar = new csl.a(com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("SELECT date, SUM(balance) as total FROM balance_history WHERE date <= ? AND source IN ("), ") GROUP BY date ORDER BY date"), j2, arrayList, 8);
        return RxRoom.createObservable(this.f199318a, false, new String[]{"balance_history"}, aVar);
    }

    @Override // lqj.a
    public final r c(long j2, List list) {
        csl.a aVar = new csl.a(o.p(") GROUP BY date, source ORDER BY source", list, p.a.s("SELECT date, source, SUM(balance) as total FROM balance_history WHERE date = ? AND source IN (")), j2, list, 7);
        return RxRoom.createObservable(this.f199318a, false, new String[]{"balance_history"}, aVar);
    }

    @Override // lqj.a
    public final Long d() {
        return (Long) DBUtil.performBlocking(this.f199318a, true, false, new loc.a(9));
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        mqj.a aVar = (mqj.a) obj2;
        aVar.getClass();
        DBUtil.performBlocking(this.f199318a, false, true, new b(this, aVar, 1));
    }

    @Override // lqj.a
    public final void e() {
        DBUtil.performBlocking(this.f199318a, false, true, new loc.a(10));
    }

    @Override // lqj.a
    public final void f(Long l2, long j2) {
        DBUtil.performBlocking(this.f199318a, false, true, new m0(l2, j2, 8));
    }

    @Override // lqj.a
    public final void g(long j2, long j3, ArrayList arrayList) {
        DBUtil.performBlocking(this.f199318a, false, true, new e1.c(this, arrayList, 1, j2, j3));
    }

    @Override // lqj.a
    public final void insertAll(List list) {
        DBUtil.performBlocking(this.f199318a, false, true, new j(this, (ArrayList) list, 17));
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        mqj.a aVar = (mqj.a) obj2;
        aVar.getClass();
        return ((Integer) DBUtil.performBlocking(this.f199318a, false, true, new b(this, aVar, 0))).intValue();
    }
}
