package com.revolut.feature.pix.impl.flow.transfer;

import com.revolut.feature.apm.core.api.ApmToggles$PixApmMigration;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.transfer.PixTransferFlowContract$Step;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import f5j.l;
import k3k.k;
import kca.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lca.f;
import oki.h;
import pca.d;
import x2k.e;
import yki.i;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final PixTransferNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f80754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kz9.a f80755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f80756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f80757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f80758t;
    public final tca.e u;
    public final i v;

    public a(PixTransferNavigation$InputData inputData, gte.a featureToggleInteractor, kz9.a chatNavigationProvider, e paymentsBankTransferNaviCommandProvider, d recipientListNavigationProvider, f apmTransferExtension, tca.e qrHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        Intrinsics.checkNotNullParameter(apmTransferExtension, "apmTransferExtension");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        this.o = inputData;
        this.f80754p = featureToggleInteractor;
        this.f80755q = chatNavigationProvider;
        this.f80756r = paymentsBankTransferNaviCommandProvider;
        this.f80757s = recipientListNavigationProvider;
        this.f80758t = apmTransferExtension;
        this.u = qrHandler;
        this.v = d8l.d.a(this, new k(this, 19));
    }

    public final void I2() {
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.A;
        xi0.b.Companion.getClass();
        C1(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotInputData.CreationConfiguration.LockedCountryCurrency(bVar, xi0.b.D, u2j.b.OTHER, y0.b(new BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext(l.INTERNATIONAL_BENEFICIARY)))));
    }

    @Override // yki.j
    public final void M0() {
        PixTransferNavigation$InputData pixTransferNavigation$InputData = this.o;
        boolean z = pixTransferNavigation$InputData instanceof PixTransferNavigation$InputData.Send;
        gte.a aVar = this.f80754p;
        i iVar = this.v;
        if (z) {
            h.u2(this, iVar, ((jte.d) aVar).c(ApmToggles$PixApmMigration.f61799c) ? PixTransferFlowContract$Step.Contacts.f80747a : PixTransferFlowContract$Step.Beneficiaries.f80746a, null, 6);
            return;
        }
        if (pixTransferNavigation$InputData instanceof PixTransferNavigation$InputData.NewContact) {
            h.u2(this, iVar, ((jte.d) aVar).c(ApmToggles$PixApmMigration.f61799c) ? new PixTransferFlowContract$Step.NewContact(new PixTransferNavigation$InputData.NewContact(((PixTransferNavigation$InputData.NewContact) pixTransferNavigation$InputData).f80529a)) : PixTransferFlowContract$Step.InputKey.f80748a, null, 6);
        } else {
            if (!(pixTransferNavigation$InputData instanceof PixTransferNavigation$InputData.ApmTransfer)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f80758t.Z2((PixTransferNavigation$InputData.ApmTransfer) pixTransferNavigation$InputData, new k5e.k(this, 24));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
