package ql7;

import android.content.Context;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f247341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f247342b;

    public j0(k0 k0Var, int i) {
        this.f247341a = k0Var;
        this.f247342b = i;
    }

    @Override // phm.a
    public final Object get() {
        k0 k0Var = this.f247341a;
        int i = this.f247342b;
        switch (i) {
            case 0:
                rl7.e eVar = (rl7.e) k0Var.f247351a.f247254l.get();
                vc.s.j(eVar);
                return new pl7.h(eVar, (sri.m) k0Var.o.get());
            case 1:
                Context context = k0Var.f247352b;
                j2.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return sri.o.c(context, null, null, 14);
            case 2:
                InsuranceCarService insuranceCarService = (InsuranceCarService) k0Var.f247361q.get();
                ne0.j jVar = (ne0.j) k0Var.f247362r.get();
                ue0.c cVarA = k0Var.d.a();
                vc.s.j(cVarA);
                return new ll7.h(insuranceCarService, jVar, cVarA);
            case 3:
                ik0.b bVarM = ((nj0.d) k0Var.f247353c).m();
                vc.s.j(bVarM);
                return l2.a(((nj0.d) k0Var.f247353c).d(), bVarM);
            case 4:
                return new ne0.d();
            case 5:
                InsuranceCarService insuranceCarService2 = (InsuranceCarService) k0Var.f247361q.get();
                ne0.j jVar2 = (ne0.j) k0Var.f247362r.get();
                ue0.c cVarA2 = k0Var.d.a();
                vc.s.j(cVarA2);
                return new ll7.e0(insuranceCarService2, jVar2, cVarA2, (ll7.l) k0Var.u.get(), (String) k0Var.v.get());
            case 6:
                return new ll7.l((CoroutineScope) k0Var.f247364t.get(), qgh.c.i(k0Var.f247352b));
            case 7:
                return k2.a();
            case 8:
                return qgh.c.n(((nj0.d) k0Var.f247353c).f());
            case 9:
                return new ll7.u((InsuranceCarService) k0Var.f247361q.get(), (ne0.j) k0Var.f247362r.get(), (String) k0Var.v.get());
            case 10:
                InsuranceCarService insuranceCarService3 = (InsuranceCarService) k0Var.f247361q.get();
                ne0.j jVar3 = (ne0.j) k0Var.f247362r.get();
                ue0.c cVarA3 = k0Var.d.a();
                vc.s.j(cVarA3);
                return new ll7.i0(insuranceCarService3, jVar3, cVarA3);
            case 11:
                return new ll7.p((InsuranceCarService) k0Var.f247361q.get(), new i90.b(), (String) k0Var.v.get());
            case 12:
                return new ll7.k((InsuranceCarService) k0Var.f247361q.get(), (ne0.j) k0Var.f247362r.get());
            default:
                throw new AssertionError(i);
        }
    }
}
