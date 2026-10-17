package vg6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.api.model.PlaidConfig;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.flow.link_result.LinkResultFlowContract$Step;
import com.revolut.feature.external_accounts.impl.navigation.UsPlaidLinkAccountDestination;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements b {

    @NotNull
    public static final d Companion = new d();
    public final LinkResultFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xg6.l f288769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f288770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f288771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zfe.e f288772s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oe6.a f288773t;
    public final yki.a u;

    public k(LinkResultFlowContract$InputData inputData, xg6.l linkExternalInstitutionsInteractor, p linkResultHelper, q navigationHelper, zfe.e newAccountDestinationResolver, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(linkResultHelper, "linkResultHelper");
        Intrinsics.checkNotNullParameter(navigationHelper, "navigationHelper");
        Intrinsics.checkNotNullParameter(newAccountDestinationResolver, "newAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.o = inputData;
        this.f288769p = linkExternalInstitutionsInteractor;
        this.f288770q = linkResultHelper;
        this.f288771r = navigationHelper;
        this.f288772s = newAccountDestinationResolver;
        this.f288773t = externalInstitutionsInteractor;
        vea.b bVar = new vea.b(15);
        this.u = cp5.d.a(this, LinkResultFlowContract$Step.f72424a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final void I1() {
        LinkResultFlowContract$InputData linkResultFlowContract$InputData = this.o;
        boolean z = linkResultFlowContract$InputData.f72422b;
        ExternalAccountsFeatureConfig.LinkSuccess.UseCase useCase = linkResultFlowContract$InputData.d;
        yki.a aVar = this.u;
        if (!z) {
            if (linkResultFlowContract$InputData.e != null) {
                J2();
                return;
            }
            if ((useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.EgiroLink) || (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.EgiroUnlink)) {
                oki.h.D2(aVar);
                this.f288771r.getClass();
                C1(q.a(useCase));
                return;
            } else {
                if (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.OpenBanking) {
                    J2();
                    return;
                }
                if (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.UsPlaidLink) {
                    oki.h.D2(aVar);
                    return;
                } else if (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuLink) {
                    I2(((ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuLink) useCase).f72311b);
                    return;
                } else {
                    if (!(useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuUnlink)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    I2(((ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuUnlink) useCase).f72314b);
                    return;
                }
            }
        }
        Continuation continuation = null;
        if (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.EgiroUnlink) {
            l2(new h(this, null), new yi5.b(26));
            return;
        }
        if (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuLink) {
            ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuLink akahuLink = (ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuLink) useCase;
            String str = akahuLink.f72310a;
            String str2 = str == null ? "" : str;
            final int i = 0;
            l2(new g(this, str2, akahuLink.f72312c, continuation, 0), new Function1(this) { // from class: vg6.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f288760b;

                {
                    this.f288760b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    k kVar = this.f288760b;
                    Throwable it8 = (Throwable) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                            oki.h.D2(kVar.u);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var2);
                            oki.h.D2(kVar.u);
                            break;
                    }
                    return Boolean.TRUE;
                }
            });
            return;
        }
        if (useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuUnlink) {
            ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuUnlink akahuUnlink = (ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuUnlink) useCase;
            String str3 = akahuUnlink.f72313a;
            String str4 = str3 == null ? "" : str3;
            final int i2 = 1;
            l2(new g(this, str4, akahuUnlink.f72315c, continuation, 1), new Function1(this) { // from class: vg6.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f288760b;

                {
                    this.f288760b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i22 = i2;
                    k kVar = this.f288760b;
                    Throwable it8 = (Throwable) obj2;
                    switch (i22) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                            oki.h.D2(kVar.u);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var2);
                            oki.h.D2(kVar.u);
                            break;
                    }
                    return Boolean.TRUE;
                }
            });
            return;
        }
        if (!(useCase instanceof ExternalAccountsFeatureConfig.LinkSuccess.UseCase.UsPlaidLink)) {
            l2(new i(this, null), new yi5.b(26));
            return;
        }
        PlaidConfig plaidConfig = ((ExternalAccountsFeatureConfig.LinkSuccess.UseCase.UsPlaidLink) useCase).f72323a;
        oki.h.D2(aVar);
        C1(u0.b(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new UsPlaidLinkAccountDestination(new UsPlaidFlowContract$InputData(new ExternalAccountsFeatureConfig.Configuration.DirectLink(null, plaidConfig, null, linkResultFlowContract$InputData.e, null, LDSFile.EF_DG13_TAG))), false, (Integer) null, 0, 61))));
    }

    public final void I2(String str) {
        boolean zF = Intrinsics.f(str, "access_denied");
        yji.l.a1(this, X1(new y0(null, new z(zF ? new TextLocalisedClause(R$string.external_institutions_akahu_authorisation_error_rejected_consent_title, null, null, 14) : new TextLocalisedClause(R$string.external_institutions_akahu_authorisation_error_generic_title, null, null, 14), zF ? new TextLocalisedClause(R$string.external_institutions_akahu_authorisation_error_rejected_consent_description, null, null, 14) : new TextLocalisedClause(R$string.external_institutions_akahu_authorisation_error_generic_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new j(this, null, 0), 3);
    }

    public final void J2() {
        yji.l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.external_institutions_linking_error_new_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_linking_error_new_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new j(this, null, 1), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
