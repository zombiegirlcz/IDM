package fr8;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorTransferAmountScreenContract$InputData f137441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f137442b;

    public t(JuniorTransferAmountScreenContract$InputData inputData, c juniorTransferAmountListFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorTransferAmountListFactory, "juniorTransferAmountListFactory");
        this.f137441a = inputData;
        this.f137442b = juniorTransferAmountListFactory;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        l domainState = (l) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(t1.v(domainState.f137419g, domainState.d, domainState.e, domainState.f), new fo9.a(18), new fq7.j(2), new f0e.i(this, domainState, 18));
    }
}
