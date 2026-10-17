package com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect;

import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.MerchantRedirectFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import eh3.s;
import ese.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final MerchantRedirectFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f90403p;

    public a(MerchantRedirectFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f90403p = d.a(this, new s(this, 26));
    }

    @Override // yki.j
    public final void M0() {
        h.z2(this.f90403p, new MerchantRedirectFlowContract$Step.MerchantRedirectDialog(this.o.f90401a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90403p;
    }
}
