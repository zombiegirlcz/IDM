package iak;

import com.revolut.retail.feature.pda.impl.ui.SetUpPdaActivityContract$Step;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.e;
import te0.j;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends iri.a implements lak.d {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f160042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f160043c;
    public final Sequence d;

    static {
        h0 h0Var = new h0(a.class, "step", "getStep()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(a.class, "selectedBeneficiary", "getSelectedBeneficiary()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public a() {
        SetUpPdaActivityContract$Step.Intro intro = SetUpPdaActivityContract$Step.Intro.f102381a;
        Intrinsics.checkNotNullParameter(intro, "default");
        j jVar = new j(intro);
        this.f160042b = jVar;
        this.f160043c = new j();
        e[] elements = {jVar.getValue(this, e[0]), w0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.E(elements);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }

    public final e w0() {
        return this.f160043c.getValue(this, e[1]);
    }
}
