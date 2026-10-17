package com.revolut.feature.subscriptions.impl.subscriptiondetails;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cce.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsGifDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPhotoDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsActivity;
import com.revolut.retail.common.ui.R$id;
import cqi.j;
import hpi.h;
import hpi.k;
import java.util.List;
import k3l.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xoi.d;
import xpi.f;
import yp0.y;
import z8k.i;
import zae.q;
import zae.r;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/subscriptiondetails/SubscriptionDetailsActivity;", "Lhpi/h;", "Lzae/q;", "Lzae/r;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubscriptionDetailsActivity extends h implements r {
    public static final /* synthetic */ int W0 = 0;
    public final Object I0;
    public final Object J0;
    public final Object V0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f89234s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public j f89235t0;
    public c u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public a f89237w0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final String f89236v0 = "SUBSCRIPTION_DETAILS_FLOW";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f89238x0 = w.y0(new i(6));
    public final Object y0 = w.y0(new i(8));
    public final Object z0 = w.y0(new i(13));
    public final Object A0 = w.y0(new i(14));
    public final Object B0 = w.y0(new i(15));
    public final Object C0 = w.y0(new i(17));
    public final Object D0 = w.y0(new i(18));
    public final Object E0 = w.y0(new i(19));
    public final Object F0 = w.y0(new i(20));
    public final Object G0 = w.y0(new i(21));
    public final Object H0 = w.y0(new i(16));
    public final Object K0 = w.y0(new i(22));
    public final Object L0 = w.y0(new i(23));
    public final Object M0 = w.y0(new i(24));
    public final Object N0 = w.y0(new i(25));
    public final Object O0 = w.y0(new i(26));
    public final Object P0 = w.y0(new i(27));
    public final Object Q0 = w.y0(new i(7));
    public final Object R0 = w.y0(new i(9));
    public final Object S0 = w.y0(new i(10));
    public final Object T0 = w.y0(new i(11));
    public final Object U0 = w.y0(new i(12));

    public SubscriptionDetailsActivity() {
        final int i = 1;
        this.I0 = w.y0(new Function0(this) { // from class: zae.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsActivity f320659b;

            {
                this.f320659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SubscriptionDetailsActivity subscriptionDetailsActivity = this.f320659b;
                switch (i2) {
                    case 0:
                        return new z4l.j(7, v.k((CellDetailsGifDelegate) subscriptionDetailsActivity.C0.getValue(), (ActionsDelegate) subscriptionDetailsActivity.E0.getValue(), (CellDetailsActionDelegate) subscriptionDetailsActivity.y0.getValue(), (CellDetailsDelegate) subscriptionDetailsActivity.D0.getValue(), (CellDetailsNoteDelegate) subscriptionDetailsActivity.z0.getValue(), (CellDetailsPhotoDelegate) subscriptionDetailsActivity.J0.getValue(), (CellDetailsChevronDelegate) subscriptionDetailsActivity.A0.getValue(), (CellDetailsSwitcherDelegate) subscriptionDetailsActivity.B0.getValue(), (ListSubheaderDelegate) subscriptionDetailsActivity.f89238x0.getValue(), (CellDetailsActionableIconDelegate) subscriptionDetailsActivity.K0.getValue(), (RowDelegate) subscriptionDetailsActivity.F0.getValue(), (PlainTextDelegate) subscriptionDetailsActivity.H0.getValue(), (PlainTextWarningDelegate) subscriptionDetailsActivity.L0.getValue(), (SwipeToActionDelegate) subscriptionDetailsActivity.I0.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (ErrorDelegate) subscriptionDetailsActivity.M0.getValue(), (LargeActionButtonDelegate) subscriptionDetailsActivity.O0.getValue(), new IconDelegate(), (CellDetailsAccountDelegate) subscriptionDetailsActivity.P0.getValue(), (ActionWidgetDelegate) subscriptionDetailsActivity.U0.getValue()), false);
                    case 1:
                        int i3 = SubscriptionDetailsActivity.W0;
                        return new SwipeToActionDelegate((RowDelegate) subscriptionDetailsActivity.F0.getValue(), false);
                    default:
                        int i5 = SubscriptionDetailsActivity.W0;
                        yy0.f imageLoader = subscriptionDetailsActivity.Q();
                        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                        return new CellDetailsPhotoDelegate();
                }
            }
        });
        final int i2 = 2;
        this.J0 = w.y0(new Function0(this) { // from class: zae.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsActivity f320659b;

            {
                this.f320659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SubscriptionDetailsActivity subscriptionDetailsActivity = this.f320659b;
                switch (i22) {
                    case 0:
                        return new z4l.j(7, v.k((CellDetailsGifDelegate) subscriptionDetailsActivity.C0.getValue(), (ActionsDelegate) subscriptionDetailsActivity.E0.getValue(), (CellDetailsActionDelegate) subscriptionDetailsActivity.y0.getValue(), (CellDetailsDelegate) subscriptionDetailsActivity.D0.getValue(), (CellDetailsNoteDelegate) subscriptionDetailsActivity.z0.getValue(), (CellDetailsPhotoDelegate) subscriptionDetailsActivity.J0.getValue(), (CellDetailsChevronDelegate) subscriptionDetailsActivity.A0.getValue(), (CellDetailsSwitcherDelegate) subscriptionDetailsActivity.B0.getValue(), (ListSubheaderDelegate) subscriptionDetailsActivity.f89238x0.getValue(), (CellDetailsActionableIconDelegate) subscriptionDetailsActivity.K0.getValue(), (RowDelegate) subscriptionDetailsActivity.F0.getValue(), (PlainTextDelegate) subscriptionDetailsActivity.H0.getValue(), (PlainTextWarningDelegate) subscriptionDetailsActivity.L0.getValue(), (SwipeToActionDelegate) subscriptionDetailsActivity.I0.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (ErrorDelegate) subscriptionDetailsActivity.M0.getValue(), (LargeActionButtonDelegate) subscriptionDetailsActivity.O0.getValue(), new IconDelegate(), (CellDetailsAccountDelegate) subscriptionDetailsActivity.P0.getValue(), (ActionWidgetDelegate) subscriptionDetailsActivity.U0.getValue()), false);
                    case 1:
                        int i3 = SubscriptionDetailsActivity.W0;
                        return new SwipeToActionDelegate((RowDelegate) subscriptionDetailsActivity.F0.getValue(), false);
                    default:
                        int i5 = SubscriptionDetailsActivity.W0;
                        yy0.f imageLoader = subscriptionDetailsActivity.Q();
                        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                        return new CellDetailsPhotoDelegate();
                }
            }
        });
        final int i3 = 0;
        this.V0 = w.y0(new Function0(this) { // from class: zae.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubscriptionDetailsActivity f320659b;

            {
                this.f320659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SubscriptionDetailsActivity subscriptionDetailsActivity = this.f320659b;
                switch (i22) {
                    case 0:
                        return new z4l.j(7, v.k((CellDetailsGifDelegate) subscriptionDetailsActivity.C0.getValue(), (ActionsDelegate) subscriptionDetailsActivity.E0.getValue(), (CellDetailsActionDelegate) subscriptionDetailsActivity.y0.getValue(), (CellDetailsDelegate) subscriptionDetailsActivity.D0.getValue(), (CellDetailsNoteDelegate) subscriptionDetailsActivity.z0.getValue(), (CellDetailsPhotoDelegate) subscriptionDetailsActivity.J0.getValue(), (CellDetailsChevronDelegate) subscriptionDetailsActivity.A0.getValue(), (CellDetailsSwitcherDelegate) subscriptionDetailsActivity.B0.getValue(), (ListSubheaderDelegate) subscriptionDetailsActivity.f89238x0.getValue(), (CellDetailsActionableIconDelegate) subscriptionDetailsActivity.K0.getValue(), (RowDelegate) subscriptionDetailsActivity.F0.getValue(), (PlainTextDelegate) subscriptionDetailsActivity.H0.getValue(), (PlainTextWarningDelegate) subscriptionDetailsActivity.L0.getValue(), (SwipeToActionDelegate) subscriptionDetailsActivity.I0.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (ErrorDelegate) subscriptionDetailsActivity.M0.getValue(), (LargeActionButtonDelegate) subscriptionDetailsActivity.O0.getValue(), new IconDelegate(), (CellDetailsAccountDelegate) subscriptionDetailsActivity.P0.getValue(), (ActionWidgetDelegate) subscriptionDetailsActivity.U0.getValue()), false);
                    case 1:
                        int i32 = SubscriptionDetailsActivity.W0;
                        return new SwipeToActionDelegate((RowDelegate) subscriptionDetailsActivity.F0.getValue(), false);
                    default:
                        int i5 = SubscriptionDetailsActivity.W0;
                        yy0.f imageLoader = subscriptionDetailsActivity.Q();
                        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
                        return new CellDetailsPhotoDelegate();
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f89237w0;
        if (aVar != null) {
            return (q) aVar.m0.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF81363s0() {
        return this.f89236v0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f89237w0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        cce.b bVar = ((cce.b) com.bumptech.glide.c.l(this).b(null, this.f89236v0)).C;
        d dVarG = rd0.e.g(this, bundle, null);
        f fVar = new f(R$id.navBarWithToolbar, false);
        SubscriptionDetailsScreenContract$Configuration subscriptionDetailsScreenContract$Configuration = (SubscriptionDetailsScreenContract$Configuration) G0();
        phm.a aVar = (phm.a) ue0.e.j(this).a().get(kde.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", kde.a.class, " is not found"));
        }
        a aVar3 = new a(bVar, dVarG, fVar, subscriptionDetailsScreenContract$Configuration, ((kde.a) aVar2.b()).c());
        Intrinsics.checkNotNullParameter(aVar3, "<set-?>");
        this.f89237w0 = aVar3;
        this.f89234s0 = (b) aVar3.f23041n.get();
        this.f89235t0 = (j) aVar3.z.get();
        this.u0 = (c) aVar3.A.get();
        super.onCreate(bundle);
        jpi.a aVar4 = this.f154555r0;
        aVar4.b().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        aVar4.b().setToolbarBackgroundColor(R$attr.uikit_windowBackground);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.V0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar2 = this.f89234s0;
        if (bVar2 != null) {
            bVar2.Y("SUBSCRIPTION_ACTIONS_DELEGATES_KEY", v.k((LargeActionButtonDelegate) this.Q0.getValue(), (SingleChoiceDelegate) this.R0.getValue(), (InputChecklistDelegate) this.S0.getValue(), (TwinHorizontalButtonDelegate) this.T0.getValue(), (RowDelegate) this.F0.getValue(), (AccountCellItemDelegate) this.G0.getValue(), new RowLoadingDelegate(), new PlainTextDelegate(), new CellDetailsNoteDelegate()));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.V0.getValue()).c(items);
    }
}
