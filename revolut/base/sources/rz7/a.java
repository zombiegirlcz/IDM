package rz7;

import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f258514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f258515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.f f258516c;

    public a(e state, o typeState, fx7.f petInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(typeState, "typeState");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        this.f258514a = state;
        this.f258515b = typeState;
        this.f258516c = petInteractor;
    }

    @Override // rz7.d
    public final efm.r D() {
        e eVar = this.f258514a;
        efm.r rVarCombineLatest = efm.r.combineLatest(eVar.q0().a(), eVar.A().a(), new ryd.j(new ryd.l(10), 14));
        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
        return rVarCombineLatest;
    }

    @Override // rz7.d
    public final efm.b E0(PetBreedDetailsContract$BreedParam breed) {
        Intrinsics.checkNotNullParameter(breed, "breed");
        return w.z0(this.f258514a.A(), breed);
    }

    @Override // rz7.d
    public final efm.r O1() {
        efm.r rVarSwitchMap = this.f258515b.h0().a().switchMap(new ryd.j(new ryd.i(this, 3), 13));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // rz7.d
    public final efm.r o() {
        return this.f258514a.A().a();
    }

    @Override // rz7.d
    public final efm.b r2(zw7.h type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return w.z0(this.f258514a.q0(), type);
    }

    @Override // rz7.d
    public final efm.r t2() {
        return this.f258514a.q0().a();
    }
}
