package nx7;

import android.os.Bundle;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends iri.a implements d, wx7.b, ux7.c, rx7.d, px7.b, tx7.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f220446j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wx7.b f220447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ux7.c f220448c;
    public final rx7.d d;
    public final px7.b e;
    public final tx7.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f220449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f220450h;
    public final Sequence i;

    static {
        h0 h0Var = new h0(a0.class, "step", "getStep()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f220446j = new KProperty[]{p0Var.j(h0Var), p.a.y(a0.class, "policyStartDate", "getPolicyStartDate()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public a0(wx7.b petTypeSelectionState, ux7.c petBaseDetailsState, rx7.d petBreedDetailsState, px7.b petAgeState, tx7.b petCreationState, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(petTypeSelectionState, "petTypeSelectionState");
        Intrinsics.checkNotNullParameter(petBaseDetailsState, "petBaseDetailsState");
        Intrinsics.checkNotNullParameter(petBreedDetailsState, "petBreedDetailsState");
        Intrinsics.checkNotNullParameter(petAgeState, "petAgeState");
        Intrinsics.checkNotNullParameter(petCreationState, "petCreationState");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f220447b = petTypeSelectionState;
        this.f220448c = petBaseDetailsState;
        this.d = petBreedDetailsState;
        this.e = petAgeState;
        this.f = petCreationState;
        this.f220449g = new te0.j();
        Date date = ((l80.f) dateProvider).g().toDate();
        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
        te0.j jVar = new te0.j(date);
        this.f220450h = jVar;
        te0.e[] elements = {w0(), jVar.getValue(this, f220446j[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.i = kotlin.collections.d.E(elements);
    }

    @Override // rz7.e
    public final te0.v A() {
        return this.d.A();
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f220447b.D(bundle);
        this.f220448c.D(bundle);
        this.d.D(bundle);
        this.e.D(bundle);
        this.f.D(bundle);
    }

    @Override // rz7.i
    public final te0.v c0() {
        return this.f220448c.c0();
    }

    @Override // tx7.b
    public final te0.v d() {
        return this.f.d();
    }

    @Override // rz7.c
    public final te0.v f() {
        return this.d.f();
    }

    @Override // rz7.g
    public final te0.v getDateOfBirth() {
        return this.e.getDateOfBirth();
    }

    @Override // rz7.k
    public final te0.v getName() {
        return this.f220448c.getName();
    }

    @Override // rz7.o
    public final te0.v h0() {
        return this.f220447b.h0();
    }

    @Override // rz7.e
    public final te0.v q0() {
        return this.d.q0();
    }

    @Override // nx7.b0
    public final efm.b reset() {
        efm.b bVarP = efm.b.p(this.f220448c.reset(), this.d.reset(), this.e.reset(), this.f.reset());
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        return bVarP;
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f220447b.s(bundle);
        this.f220448c.s(bundle);
        this.d.s(bundle);
        this.e.s(bundle);
        this.f.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.i;
    }

    public final te0.e w0() {
        return this.f220449g.getValue(this, f220446j[0]);
    }

    @Override // rz7.m
    public final te0.v y() {
        return this.d.y();
    }
}
