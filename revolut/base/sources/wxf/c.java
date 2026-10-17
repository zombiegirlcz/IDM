package wxf;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import n4d.w;
import wg9.p;
import wvg.d0;
import wvg.r1;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f300933a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f300935c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f300934b = new t0g.b(this, 13);

    public c(TravelDatabase travelDatabase) {
        this.f300933a = travelDatabase;
    }

    public static /* synthetic */ Unit n(c cVar, ArrayList arrayList, String str, oxf.b[] bVarArr) {
        super.k(arrayList, str, bVarArr);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit o(c cVar, ArrayList arrayList, oxf.b[] bVarArr) {
        super.l(arrayList, bVarArr);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit p(c cVar, oxf.b[] bVarArr) {
        super.m(bVarArr);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit q(c cVar, String str, oxf.b[] bVarArr) {
        super.j(str, bVarArr);
        return Unit.f186387a;
    }

    @Override // wxf.a
    public final void a() {
        DBUtil.performBlocking(this.f300933a, false, true, new r1(24));
    }

    @Override // wxf.a
    public final void b(String str) {
        DBUtil.performBlocking(this.f300933a, false, true, new wsg.j(str, 6));
    }

    @Override // wxf.a
    public final void c(String str, ArrayList arrayList) {
        DBUtil.performBlocking(this.f300933a, false, true, new w(com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM travel_booking WHERE state = ? AND type IN ("), ")"), str, arrayList));
    }

    @Override // wxf.a
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f300933a, false, true, new a54.c(17, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM travel_booking WHERE type IN ("), ")"), arrayList));
    }

    @Override // wxf.a
    public final List e() {
        return (List) DBUtil.performBlocking(this.f300933a, true, false, new d0(this, 14));
    }

    @Override // wxf.a
    public final List f(String str) {
        return (List) DBUtil.performBlocking(this.f300933a, true, false, new wwa.a(this, str, 5));
    }

    @Override // wxf.a
    public final List g(String str, ArrayList arrayList) {
        return (List) DBUtil.performBlocking(this.f300933a, true, false, new p((Object) this, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("SELECT * FROM travel_booking WHERE state = ? AND type IN ("), ")"), (Object) str, arrayList, 2));
    }

    @Override // wxf.a
    public final List h(ArrayList arrayList) {
        return (List) DBUtil.performBlocking(this.f300933a, true, false, new wtl.f(this, 4, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("SELECT * FROM travel_booking WHERE type IN ("), ")"), arrayList));
    }

    @Override // wxf.a
    public final void i(oxf.b... bVarArr) {
        bVarArr.getClass();
        DBUtil.performBlocking(this.f300933a, false, true, new b(this, bVarArr, 0));
    }

    @Override // wxf.a
    public final void j(String str, oxf.b... bVarArr) {
        DBUtil.performBlocking(this.f300933a, false, true, new wtl.f(this, 3, str, bVarArr));
    }

    @Override // wxf.a
    public final void k(ArrayList arrayList, String str, oxf.b... bVarArr) {
        DBUtil.performBlocking(this.f300933a, false, true, new p(this, arrayList, str, bVarArr, 3));
    }

    @Override // wxf.a
    public final void l(ArrayList arrayList, oxf.b... bVarArr) {
        DBUtil.performBlocking(this.f300933a, false, true, new wtl.f(this, 5, arrayList, bVarArr));
    }

    @Override // wxf.a
    public final void m(oxf.b... bVarArr) {
        DBUtil.performBlocking(this.f300933a, false, true, new b(this, bVarArr, 1));
    }
}
