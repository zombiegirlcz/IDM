package sbb;

import android.net.Uri;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmProductIncomplete;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.payid.api.navigation.PayIdCreateContactDestination;
import com.revolut.feature.apm.qvik.api.navigation.QvikAppSelectorNavigation$InputData;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$Destination;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$StartType;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$Destination;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$StartType;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends yji.n implements etb.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uw1.c f261550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lx1.d f261551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final oy1.b f261552n;
    public final kz9.a o;

    public k(uw1.c apmFeatureChecker, lx1.d apmContactsInteractor, oy1.b apmNavigationProvider, kz9.a chatNavigationProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(chatNavigationProvider, "chatNavigationProvider");
        this.f261550l = apmFeatureChecker;
        this.f261551m = apmContactsInteractor;
        this.f261552n = apmNavigationProvider;
        this.o = chatNavigationProvider;
    }

    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        ParcelableDestination parcelableDestinationA;
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        Parcelable parcelable = actionData.f83422b;
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApmDeeplinkPayload apmDeeplinkPayload = (ApmDeeplinkPayload) parcelable;
        if (apmDeeplinkPayload instanceof ApmDeeplinkPayload.Chat) {
            T2(new i(this, (ApmDeeplinkPayload.Chat) apmDeeplinkPayload, null), new yi5.b(27));
            return;
        }
        if (apmDeeplinkPayload instanceof ApmDeeplinkPayload.Area) {
            Z2(((ApmDeeplinkPayload.Area) apmDeeplinkPayload).f82743a);
            return;
        }
        boolean z = apmDeeplinkPayload instanceof ApmDeeplinkPayload.PaymentArea;
        oy1.b bVar = this.f261552n;
        if (z) {
            ApmDeeplinkPayload.Apm apm = ((ApmDeeplinkPayload.PaymentArea) apmDeeplinkPayload).f82750a;
            if (apm instanceof ApmDeeplinkPayload.Apm.Product) {
                ApmDeeplinkPayload.Apm.Product product = (ApmDeeplinkPayload.Apm.Product) apm;
                d3(product, bVar.d(l.a(product)));
                return;
            } else {
                if (!(apm instanceof ApmDeeplinkPayload.Apm.SWISH)) {
                    throw new NoWhenBranchMatchedException();
                }
                e3();
                return;
            }
        }
        if (apmDeeplinkPayload instanceof ApmDeeplinkPayload.Settings) {
            ApmDeeplinkPayload.Apm apm2 = ((ApmDeeplinkPayload.Settings) apmDeeplinkPayload).f82751a;
            if (!(apm2 instanceof ApmDeeplinkPayload.Apm.Product)) {
                if (!(apm2 instanceof ApmDeeplinkPayload.Apm.SWISH)) {
                    throw new NoWhenBranchMatchedException();
                }
                e3();
                return;
            }
            ApmDeeplinkPayload.Apm.Product product2 = (ApmDeeplinkPayload.Apm.Product) apm2;
            Parcelable product3 = l.a(product2);
            bVar.getClass();
            Intrinsics.checkNotNullParameter(product3, "product");
            if (product3 instanceof dx1.a) {
                dx1.a aVar = (dx1.a) product3;
                parcelableDestinationA = bVar.f(aVar).a(aVar);
            } else {
                if (!(product3 instanceof ApmProductIncomplete)) {
                    throw new NoWhenBranchMatchedException();
                }
                ApmProductIncomplete apmProductIncomplete = (ApmProductIncomplete) product3;
                if (apmProductIncomplete.equals(ApmPayId.f61819c)) {
                    parcelableDestinationA = PayIdCreateContactDestination.f62692a;
                } else {
                    if (!apmProductIncomplete.equals(ApmUpi.f61828c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    parcelableDestinationA = UpiFeatureConfig.TransferInputIdOrMobile.f62954g.f98274b;
                }
            }
            d3(product2, parcelableDestinationA);
            return;
        }
        if (apmDeeplinkPayload instanceof ApmDeeplinkPayload.Deregister) {
            ApmDeeplinkPayload.Deregister deregister = (ApmDeeplinkPayload.Deregister) apmDeeplinkPayload;
            ApmDeeplinkPayload.Apm apm3 = deregister.f82745a;
            ApmDeeplinkPayload.Apm.SPIN spin = ApmDeeplinkPayload.Apm.SPIN.f82738b;
            if (Intrinsics.f(apm3, spin)) {
                b3(spin, new j(this, null, 7), new SpinNavigation$Destination(new SpinNavigation$StartType.Deregister(deregister.f82746b)));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Deregister not supported by ", apm3.getF82736a()));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            Z2(apm3);
            return;
        }
        if (apmDeeplinkPayload instanceof ApmDeeplinkPayload.DisableExtension) {
            ApmDeeplinkPayload.Apm apm4 = ((ApmDeeplinkPayload.DisableExtension) apmDeeplinkPayload).f82747a;
            ApmDeeplinkPayload.Apm.BREB breb = ApmDeeplinkPayload.Apm.BREB.f82732b;
            if (Intrinsics.f(apm4, breb)) {
                b3(breb, new j(this, null, 2), new BrebNavigation$Destination(BrebNavigation$StartType.BlockExtension.f61699a));
                return;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("Block extension not supported by ", apm4.getF82736a()));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            Z2(apm4);
            return;
        }
        if (apmDeeplinkPayload instanceof ApmDeeplinkPayload.Unavailable) {
            c3(((ApmDeeplinkPayload.Unavailable) apmDeeplinkPayload).f82752a);
            return;
        }
        if (!(apmDeeplinkPayload instanceof ApmDeeplinkPayload.Pay)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmDeeplinkPayload.Pay pay = (ApmDeeplinkPayload.Pay) apmDeeplinkPayload;
        ApmDeeplinkPayload.Apm apm5 = pay.f82748a;
        ApmDeeplinkPayload.Apm.Product product4 = apm5 instanceof ApmDeeplinkPayload.Apm.Product ? (ApmDeeplinkPayload.Apm.Product) apm5 : null;
        if (product4 != null && (product4 instanceof ApmDeeplinkPayload.Apm.QVIK)) {
            Uri uri2 = Uri.parse(pay.f82749b);
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            yji.n.P2(this, o2(new cc2.b(new QvikAppSelectorNavigation$InputData(uri2))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }

    public final void Z2(ApmDeeplinkPayload.Apm apm) {
        if (apm instanceof ApmDeeplinkPayload.Apm.Product) {
            ApmDeeplinkPayload.Apm.Product product = (ApmDeeplinkPayload.Apm.Product) apm;
            d3(product, this.f261552n.b(l.a(product)));
        } else {
            if (!(apm instanceof ApmDeeplinkPayload.Apm.SWISH)) {
                throw new NoWhenBranchMatchedException();
            }
            e3();
        }
    }

    public final void b3(ApmDeeplinkPayload.Apm apm, Function1 function1, ParcelableDestination parcelableDestination) {
        T2(new g(apm, parcelableDestination, null, function1, this), new yi5.b(27));
    }

    public final void c3(ApmDeeplinkPayload.Apm apm) {
        ApmProduct apmProductA;
        ApmDeeplinkPayload.Apm.Product product = apm instanceof ApmDeeplinkPayload.Apm.Product ? (ApmDeeplinkPayload.Apm.Product) apm : null;
        if (product == null || (apmProductA = l.a(product)) == null) {
            return;
        }
        yji.n.l2(this, L2(new y0("UNAVAILABLE_ID", new nii.z(new TextLocalisedClause(R$string.apm_error_unsupported, zhm.u.c(apmProductA.e()), null, 12), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, 7);
    }

    public final void d3(ApmDeeplinkPayload.Apm.Product product, ParcelableDestination parcelableDestination) {
        ApmDeeplinkPayload.Apm.BIZUM bizum = ApmDeeplinkPayload.Apm.BIZUM.f82730b;
        Continuation continuation = null;
        if (Intrinsics.f(product, bizum)) {
            b3(bizum, new j(this, null, 0), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.BLIK blik = ApmDeeplinkPayload.Apm.BLIK.f82731b;
        if (Intrinsics.f(product, blik)) {
            b3(blik, new j(this, null, 1), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.BREB breb = ApmDeeplinkPayload.Apm.BREB.f82732b;
        if (Intrinsics.f(product, breb)) {
            b3(breb, new j(this, null, 2), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.IRIS iris = ApmDeeplinkPayload.Apm.IRIS.f82733b;
        if (Intrinsics.f(product, iris)) {
            b3(iris, new j(this, null, 3), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.MBWAY mbway = ApmDeeplinkPayload.Apm.MBWAY.f82734b;
        if (Intrinsics.f(product, mbway)) {
            b3(mbway, new j(this, null, 4), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.PAYID payid = ApmDeeplinkPayload.Apm.PAYID.f82735b;
        if (Intrinsics.f(product, payid)) {
            b3(payid, new j(this, null, 5), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.QVIK qvik = ApmDeeplinkPayload.Apm.QVIK.f82737b;
        if (Intrinsics.f(product, qvik)) {
            b3(qvik, new j(this, null, 6), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.SPIN spin = ApmDeeplinkPayload.Apm.SPIN.f82738b;
        if (Intrinsics.f(product, spin)) {
            b3(spin, new j(this, null, 7), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.WERO wero = ApmDeeplinkPayload.Apm.WERO.f82741b;
        if (Intrinsics.f(product, wero)) {
            b3(wero, new j(this, null, 9), parcelableDestination);
            return;
        }
        ApmDeeplinkPayload.Apm.UPI upi2 = ApmDeeplinkPayload.Apm.UPI.f82740b;
        if (!Intrinsics.f(product, upi2)) {
            throw new NoWhenBranchMatchedException();
        }
        b3(upi2, new jmc.e(this, continuation, 17), parcelableDestination);
    }

    public final void e3() {
        b3(ApmDeeplinkPayload.Apm.SWISH.f82739a, new j(this, null, 8), new SwishNavigation$Destination(SwishNavigation$StartType.Area.f62897a));
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof ApmDeeplinkPayload;
    }
}
