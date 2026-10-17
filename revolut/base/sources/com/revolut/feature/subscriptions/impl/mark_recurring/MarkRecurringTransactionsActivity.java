package com.revolut.feature.subscriptions.impl.mark_recurring;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsActivity;
import com.revolut.retail.common.ui.R$id;
import hpi.c;
import hpi.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nae.i;
import oae.a;
import opi.b;
import org.jmrtd.cbeff.ISO781611;
import pri.e;
import te0.w;
import xoi.d;
import xpi.f;
import yhm.j;
import yhm.k;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/mark_recurring/MarkRecurringTransactionsActivity;", "Lhpi/h;", "Lnae/h;", "Lnae/i;", "<init>", "()V", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarkRecurringTransactionsActivity extends h implements i {
    public static final /* synthetic */ int z0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f89210s0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f89212v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f89214x0;
    public b y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f89211t0 = "MARK_RECURRING_TRANSACTIONS_FLOW";
    public final Object u0 = w.y0(new n85.b(7));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f89213w0 = w.y0(new n85.b(8));

    public MarkRecurringTransactionsActivity() {
        final int i = 0;
        this.f89212v0 = w.y0(new Function0(this) { // from class: nae.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarkRecurringTransactionsActivity f213866b;

            {
                this.f213866b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MarkRecurringTransactionsActivity markRecurringTransactionsActivity = this.f213866b;
                switch (i2) {
                    case 0:
                        int i3 = MarkRecurringTransactionsActivity.z0;
                        return new SelectableDelegate((RowDelegate) markRecurringTransactionsActivity.u0.getValue());
                    default:
                        int i5 = MarkRecurringTransactionsActivity.z0;
                        return new z4l.j(4, v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (SelectableDelegate) markRecurringTransactionsActivity.f89212v0.getValue(), new FullScreenStateDelegate()), true);
                }
            }
        });
        final int i2 = 1;
        this.f89214x0 = j.c(k.NONE, new Function0(this) { // from class: nae.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MarkRecurringTransactionsActivity f213866b;

            {
                this.f213866b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MarkRecurringTransactionsActivity markRecurringTransactionsActivity = this.f213866b;
                switch (i22) {
                    case 0:
                        int i3 = MarkRecurringTransactionsActivity.z0;
                        return new SelectableDelegate((RowDelegate) markRecurringTransactionsActivity.u0.getValue());
                    default:
                        int i5 = MarkRecurringTransactionsActivity.z0;
                        return new z4l.j(4, v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (SelectableDelegate) markRecurringTransactionsActivity.f89212v0.getValue(), new FullScreenStateDelegate()), true);
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f89210s0;
        if (aVar != null) {
            return (nae.h) aVar.f223609t.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f89211t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f89210s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new hpi.k(BitmapDescriptorFactory.HUE_RED, R$attr.uikit_windowBackground, ISO781611.SMT_TAG));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        c.b(cVar);
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        MarkRecurringTransactionsContract$Configuration markRecurringTransactionsContract$Configuration = (MarkRecurringTransactionsContract$Configuration) G0();
        oae.b bVar = ((oae.b) com.bumptech.glide.c.l(this).b(null, this.f89211t0)).f;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        a aVar = new a(bVar, dVarG, new dqi.h(R$id.recycler_view), markRecurringTransactionsContract$Configuration);
        this.f89210s0 = aVar;
        this.y0 = (b) aVar.f.get();
        a aVar2 = this.f89210s0;
        if (aVar2 == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.f89214x0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
        b bVar2 = this.y0;
        if (bVar2 != null) {
            bVar2.Y("MARK_RECURRING_BOTTOM_DIALOG_DELEGATES_KEY", u.c((LargeActionButtonDelegate) this.f89213w0.getValue()));
        } else {
            Intrinsics.r("expandableDialogDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.f89214x0.getValue()).c(items);
    }
}
