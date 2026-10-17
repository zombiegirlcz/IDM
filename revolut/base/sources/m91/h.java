package m91;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase;
import dcl.g0;
import is6.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f203611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f203612b = new x(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f203613c = new x(11);
    public final x d = new x(12);
    public final x e = new x(13);
    public final g0 f = new g0(9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f203614g = new g0(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f203615h = new g0(11);
    public final g0 i = new g0(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f203616j = new g0(13);
    public final g0 k = new g0(8);

    public h(AccountSwitchingDatabase accountSwitchingDatabase) {
        this.f203611a = accountSwitchingDatabase;
    }

    public static /* synthetic */ Unit u(h hVar, ArrayList arrayList) {
        super.n(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit v(h hVar, ArrayList arrayList) {
        super.o(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit w(h hVar, ArrayList arrayList) {
        super.q(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit x(h hVar, ArrayList arrayList) {
        super.p(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit y(h hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        super.m(arrayList, arrayList2, arrayList3, arrayList4);
        return Unit.f186387a;
    }

    @Override // m91.f
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 1));
    }

    @Override // m91.f
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 3));
    }

    @Override // m91.f
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 5));
    }

    @Override // m91.f
    public final List d() {
        return (List) DBUtil.performBlocking(this.f203611a, true, false, new m62.l(19));
    }

    @Override // m91.f
    public final List e() {
        return (List) DBUtil.performBlocking(this.f203611a, true, false, new m62.l(17));
    }

    @Override // m91.f
    public final List f() {
        return (List) DBUtil.performBlocking(this.f203611a, true, false, new m62.l(20));
    }

    @Override // m91.f
    public final List g() {
        return (List) DBUtil.performBlocking(this.f203611a, true, false, new m62.l(18));
    }

    @Override // m91.f
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 11));
    }

    @Override // m91.f
    public final void i(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 6));
    }

    @Override // m91.f
    public final void j(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 2));
    }

    @Override // m91.f
    public final void k(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 0));
    }

    @Override // m91.f
    public final void l() {
        DBUtil.performBlocking(this.f203611a, false, true, new m62.l(21));
    }

    @Override // m91.f
    public final void m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        DBUtil.performBlocking(this.f203611a, false, true, new kwg.e(this, arrayList, arrayList2, arrayList3, arrayList4, 3));
    }

    @Override // m91.f
    public final void n(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 13));
    }

    @Override // m91.f
    public final void o(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 12));
    }

    @Override // m91.f
    public final void p(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 7));
    }

    @Override // m91.f
    public final void q(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 9));
    }

    @Override // m91.f
    public final void r(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 8));
    }

    @Override // m91.f
    public final void s(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 4));
    }

    @Override // m91.f
    public final void t(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203611a, false, true, new g(this, arrayList, 10));
    }
}
