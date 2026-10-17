package jf2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.upi.impl.provider.UpiAliasDialogProvider;
import jec.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends ve2.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hg2.e f173647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UpiAliasDialogProvider f173648m;

    public i(hg2.e upiInteractor, UpiAliasDialogProvider dialogProvider) {
        Intrinsics.checkNotNullParameter(upiInteractor, "upiInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.f173647l = upiInteractor;
        this.f173648m = dialogProvider;
    }

    @Override // ve2.a
    public final void Z2(ResolveAlias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        V2(new p(this, alias, null, 1), new je2.d(this, alias, 3));
    }
}
