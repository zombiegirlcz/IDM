package oc9;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsScreenContract$InputData f224142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f224143b;

    public e0(d0 itemsProvider, QesTermsScreenContract$InputData inputData, m qesTermsHelper) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qesTermsHelper, "qesTermsHelper");
        this.f224142a = inputData;
        this.f224143b = qesTermsHelper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        v domainState = (v) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (y) iii.c.f(t1.v(domainState.f224158a, domainState.f224159b, domainState.f224160c, domainState.e), new o9h.b(this, 12), new oa4.c(this, 11), new c1(this, domainState, 18));
    }
}
