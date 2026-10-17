package uz7;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends iri.a implements c, fy7.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f284617m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fy7.e f284618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f284619c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f284620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f284621h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f284622j;
    public final te0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f284623l;

    static {
        h0 h0Var = new h0(r.class, "petId", "getPetId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f284617m = new KProperty[]{p0Var.j(h0Var), p.a.y(r.class, "petName", "getPetName()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "petType", "getPetType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "petGender", "getPetGender()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "selectedPlanType", "getSelectedPlanType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "selectedExcessSelection", "getSelectedExcessSelection()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "selectedCoPaySelection", "getSelectedCoPaySelection()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "trackingData", "getTrackingData()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "selectedQuoteId", "getSelectedQuoteId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(r.class, "isRenewalOptedIn", "isRenewalOptedIn()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public r(fy7.e datePickerState) {
        Intrinsics.checkNotNullParameter(datePickerState, "datePickerState");
        this.f284618b = datePickerState;
        this.f284619c = new te0.j();
        this.d = new te0.j();
        this.e = new te0.j();
        this.f = new te0.j();
        this.f284620g = new te0.j();
        this.f284621h = new te0.j();
        this.i = new te0.j();
        this.f284622j = new te0.j();
        this.k = new te0.j();
        this.f284623l = new te0.j();
    }

    public final te0.e A0() {
        return this.i.getValue(this, f284617m[6]);
    }

    public final te0.e B0() {
        return this.f284621h.getValue(this, f284617m[5]);
    }

    public final te0.e C0() {
        return this.f284620g.getValue(this, f284617m[4]);
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f284618b.D(bundle);
    }

    public final te0.e D0() {
        return this.k.getValue(this, f284617m[8]);
    }

    @Override // fy7.e
    public final te0.v i0() {
        return this.f284618b.i0();
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f284618b.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarX0 = x0();
        te0.e eVarY0 = y0();
        te0.e eVarZ0 = z0();
        te0.e eVarW0 = w0();
        te0.e eVarC0 = C0();
        te0.e eVarB0 = B0();
        te0.e eVarA0 = A0();
        KProperty[] kPropertyArr = f284617m;
        te0.e[] elements = {eVarX0, eVarY0, eVarZ0, eVarW0, eVarC0, eVarB0, eVarA0, this.f284622j.getValue(this, kPropertyArr[7]), D0(), this.f284623l.getValue(this, kPropertyArr[9])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f.getValue(this, f284617m[3]);
    }

    public final te0.e x0() {
        return this.f284619c.getValue(this, f284617m[0]);
    }

    public final te0.e y0() {
        return this.d.getValue(this, f284617m[1]);
    }

    public final te0.e z0() {
        return this.e.getValue(this, f284617m[2]);
    }
}
