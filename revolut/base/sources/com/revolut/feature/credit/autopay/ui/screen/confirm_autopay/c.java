package com.revolut.feature.credit.autopay.ui.screen.confirm_autopay;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentData;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationFromStyle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import njf.d;
import njj.c1;
import nk4.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj4.b f68645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f90.b f68646b;

    public c(vj4.b autopaySourceMapper, f90.b pluralFormatter) {
        Intrinsics.checkNotNullParameter(autopaySourceMapper, "autopaySourceMapper");
        Intrinsics.checkNotNullParameter(pluralFormatter, "pluralFormatter");
        this.f68645a = autopaySourceMapper;
        this.f68646b = pluralFormatter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        boolean z;
        nk4.a domainState = (nk4.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AutoPayRepaymentData autoPayRepaymentData = (AutoPayRepaymentData) domainState.f216641a.getContent();
        RepresentationFromStyle representationFromStyle = autoPayRepaymentData != null ? autoPayRepaymentData.f68550c : null;
        ConfirmAutopayContract$ScreenConfig confirmAutopayContract$ScreenConfig = domainState.d;
        Clause clause = confirmAutopayContract$ScreenConfig.f68632a;
        Clause clause2 = confirmAutopayContract$ScreenConfig.f68633b;
        Clause clause3 = confirmAutopayContract$ScreenConfig.f68634c;
        List list = (List) iii.c.f(domainState.f216641a, new d(15), new nij.d(24), new c1(this, domainState, 1));
        if ((representationFromStyle instanceof RepresentationFromStyle.RevolutWallet) || (representationFromStyle instanceof RepresentationFromStyle.JointAccount)) {
            z = true;
        } else {
            if (!(representationFromStyle instanceof RepresentationFromStyle.ExternalAccount) && representationFromStyle != null) {
                throw new NoWhenBranchMatchedException();
            }
            z = domainState.f216642b;
        }
        return new nk4.c(clause, clause2, clause3, list, z);
    }
}
