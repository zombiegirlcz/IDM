package nx7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import efm.d0;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zw7.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends ori.a implements b, rz7.n, rz7.j, rz7.h, rz7.f, rz7.b, rz7.d, rz7.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz7.n f220459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz7.j f220460c;
    public final /* synthetic */ rz7.h d;
    public final /* synthetic */ rz7.f e;
    public final /* synthetic */ rz7.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rz7.d f220461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rz7.l f220462h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fx7.f f220463j;
    public final fx7.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a5h.g f220464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ifm.b f220465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f220466n;
    public final Lazy o;

    public n(d state, fx7.f petInteractor, fx7.a petAnalyticsInteractor, a5h.g stepScreenValidator, ifm.b flowDisposable, rz7.n petTypeFieldPresentationModel, rz7.j petNameFieldPresentationModel, rz7.h petGenderFieldPresentationModel, rz7.f petDobFieldPresentationModel, rz7.b petAmountFieldPresentationModel, rz7.d petBreeFieldPresentationModel, rz7.l petSterilizedFieldPresentationModel, com.google.firebase.messaging.t factory) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(stepScreenValidator, "stepScreenValidator");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(petTypeFieldPresentationModel, "petTypeFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petNameFieldPresentationModel, "petNameFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petGenderFieldPresentationModel, "petGenderFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petDobFieldPresentationModel, "petDobFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petAmountFieldPresentationModel, "petAmountFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petBreeFieldPresentationModel, "petBreeFieldPresentationModel");
        Intrinsics.checkNotNullParameter(petSterilizedFieldPresentationModel, "petSterilizedFieldPresentationModel");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f220459b = petTypeFieldPresentationModel;
        this.f220460c = petNameFieldPresentationModel;
        this.d = petGenderFieldPresentationModel;
        this.e = petDobFieldPresentationModel;
        this.f = petAmountFieldPresentationModel;
        this.f220461g = petBreeFieldPresentationModel;
        this.f220462h = petSterilizedFieldPresentationModel;
        this.i = state;
        this.f220463j = petInteractor;
        this.k = petAnalyticsInteractor;
        this.f220464l = stepScreenValidator;
        this.f220465m = flowDisposable;
        this.f220466n = yhm.j.b(new nsh.e(factory, this, 10));
        this.o = yhm.j.b(new nwf.b(2));
    }

    @Override // rz7.b
    public final efm.r A1() {
        return this.f.A1();
    }

    @Override // rz7.d
    public final efm.r D() {
        return this.f220461g.D();
    }

    @Override // rz7.j
    public final efm.r D2() {
        return this.f220460c.D2();
    }

    @Override // rz7.d
    public final efm.b E0(PetBreedDetailsContract$BreedParam breed) {
        Intrinsics.checkNotNullParameter(breed, "breed");
        return this.f220461g.E0(breed);
    }

    @Override // rz7.n
    public final efm.r F() {
        return this.f220459b.F();
    }

    @Override // rz7.n
    public final efm.b I(c0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        a0 a0Var = (a0) this.i;
        if (type == ((c0) te0.w.O(a0Var.f220447b.h0()))) {
            return te0.w.z0(a0Var.f220447b.h0(), type);
        }
        pfm.a aVarE = a0Var.reset().e(te0.w.z0(a0Var.f220447b.h0(), type));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // rz7.b
    public final efm.r K() {
        return this.f.K();
    }

    @Override // rz7.f
    public final efm.r M() {
        return this.e.M();
    }

    @Override // rz7.h
    public final efm.b M1(zw7.z gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        return this.d.M1(gender);
    }

    @Override // rz7.h
    public final efm.r O() {
        return this.d.O();
    }

    @Override // rz7.d
    public final efm.r O1() {
        return this.f220461g.O1();
    }

    @Override // rz7.h
    public final efm.r R1() {
        return this.d.R1();
    }

    @Override // rz7.f
    public final efm.r S() {
        return this.e.S();
    }

    @Override // rz7.j
    public final efm.r Y() {
        return this.f220460c.Y();
    }

    @Override // rz7.l
    public final efm.b Z1(boolean z) {
        return this.f220462h.Z1(z);
    }

    @Override // ori.b
    public final void c1(Object obj2) {
        e step = (e) obj2;
        Intrinsics.checkNotNullParameter(step, "step");
        ((a0) this.i).w0().set(step);
    }

    @Override // rz7.l
    public final efm.r f0() {
        return this.f220462h.f0();
    }

    @Override // rz7.n
    public final efm.r g0() {
        return this.f220459b.g0();
    }

    @Override // ym.c
    public final d0 g3(ym.b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        if (loadingData.f314823a instanceof tx7.a) {
            return new pfm.h(new ne0.o(this, loadingData, 6), 2).f(d0.m(Boolean.TRUE));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // ori.b
    public final Object getStep() {
        return (e) te0.w.O(((a0) this.i).w0());
    }

    @Override // ori.a, nri.a
    public final void i3() {
        efm.b bVarFlatMapCompletable = ((a0) this.i).f220447b.h0().a().flatMapCompletable(new noi.l(27, new h(this, 5)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        pfm.a aVar = new pfm.a(te0.w.g0(bVarFlatMapCompletable), new lhi.b(11, new ne0.e(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new m3l.d(5, k.f220456a), j.f220455a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f220465m, hVarW);
    }

    public final efm.r j3(e step) {
        Intrinsics.checkNotNullParameter(step, "step");
        a5h.g gVar = this.f220464l;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(step, "step");
        int i = lx7.a.f200534a[step.ordinal()];
        if (i == 1) {
            return te0.w.h(Boolean.TRUE);
        }
        if (i == 2) {
            efm.r map = te0.w.l(((rz7.j) gVar.f1406b).D2(), ((rz7.h) gVar.f1407c).O()).map(new lr9.m(new lv9.c(14), 28));
            Intrinsics.checkNotNullExpressionValue(map, "validateBaseDetails(...)");
            return map;
        }
        if (i != 3) {
            if (i == 4) {
                return ((rz7.f) gVar.e).S();
            }
            throw new NoWhenBranchMatchedException();
        }
        efm.r map2 = te0.w.l(((rz7.d) gVar.d).D(), ((rz7.b) gVar.f).K()).map(new lr9.m(new lv9.c(13), 27));
        Intrinsics.checkNotNullExpressionValue(map2, "validateBreedSelection(...)");
        return map2;
    }

    @Override // rz7.d
    public final efm.r o() {
        return this.f220461g.o();
    }

    @Override // rz7.j
    public final efm.b r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f220460c.r(name);
    }

    @Override // rz7.d
    public final efm.b r2(zw7.h type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.f220461g.r2(type);
    }

    @Override // rz7.d
    public final efm.r t2() {
        return this.f220461g.t2();
    }

    @Override // rz7.f
    public final efm.b u(DOBInputData date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return this.e.u(date);
    }

    @Override // rz7.h
    public final efm.r v() {
        return this.d.v();
    }

    @Override // rz7.b
    public final efm.b w2(AmountData amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return this.f.w2(amount);
    }
}
