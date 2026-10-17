package com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerContract$Configuration;
import hpi.c;
import hpi.h;
import hpi.k;
import ihm.f;
import iqi.g;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import p84.b;
import pri.e;
import te0.w;
import v0.a;
import x5a.d;
import yhm.j;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents/viewer/CreditApplicationDocumentViewerActivity;", "Lhpi/h;", "Lx94/d;", "Lx94/h;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationDocumentViewerActivity extends h implements x94.h {
    public static final /* synthetic */ int z0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f67560s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CreditApplicationDocumentViewerContract$Configuration f67561t0;
    public final f u0 = a.d("create(...)");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f67562v0 = w.y0(new d(13));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f67563w0 = w.y0(new d(14));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Lazy f67564x0;
    public final Lazy y0;

    public CreditApplicationDocumentViewerActivity() {
        final int i = 0;
        this.f67564x0 = j.b(new Function0(this) { // from class: x94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentViewerActivity f303546b;

            {
                this.f303546b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditApplicationDocumentViewerActivity creditApplicationDocumentViewerActivity = this.f303546b;
                switch (i2) {
                    case 0:
                        int i3 = CreditApplicationDocumentViewerActivity.z0;
                        return new z4l.j(7, v.k((WebViewDelegate) creditApplicationDocumentViewerActivity.f67562v0.getValue(), (LargeActionButtonDelegate) creditApplicationDocumentViewerActivity.f67563w0.getValue(), new TextDelegate()), false);
                    default:
                        int i5 = CreditApplicationDocumentViewerActivity.z0;
                        return ((CreditApplicationDocumentViewerContract$Configuration) creditApplicationDocumentViewerActivity.G0()).e;
                }
            }
        });
        final int i2 = 1;
        this.y0 = j.b(new Function0(this) { // from class: x94.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentViewerActivity f303546b;

            {
                this.f303546b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditApplicationDocumentViewerActivity creditApplicationDocumentViewerActivity = this.f303546b;
                switch (i22) {
                    case 0:
                        int i3 = CreditApplicationDocumentViewerActivity.z0;
                        return new z4l.j(7, v.k((WebViewDelegate) creditApplicationDocumentViewerActivity.f67562v0.getValue(), (LargeActionButtonDelegate) creditApplicationDocumentViewerActivity.f67563w0.getValue(), new TextDelegate()), false);
                    default:
                        int i5 = CreditApplicationDocumentViewerActivity.z0;
                        return ((CreditApplicationDocumentViewerContract$Configuration) creditApplicationDocumentViewerActivity.G0()).e;
                }
            }
        });
    }

    @Override // nri.b
    public final e F0() {
        b bVar = this.f67560s0;
        if (bVar != null) {
            return (x94.d) bVar.D.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71175s0() {
        return (String) this.y0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        b bVar = this.f67560s0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        int i;
        CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration = this.f67561t0;
        if (creditApplicationDocumentViewerContract$Configuration == null) {
            Intrinsics.r("configuration");
            throw null;
        }
        int i2 = x94.b.f303547a[creditApplicationDocumentViewerContract$Configuration.f67565a.f.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorGroupedBackground;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBackground;
        }
        hpi.b bVar = new hpi.b(new k(BitmapDescriptorFactory.HUE_RED, i, ISO781611.SMT_TAG));
        g.Companion.getClass();
        g configuration = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        bVar.i = configuration;
        bVar.e = true;
        xpi.f.Companion.getClass();
        xpi.f configuration2 = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        bVar.f = configuration2;
        return bVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration = (CreditApplicationDocumentViewerContract$Configuration) G0();
        p84.c cVar = (p84.c) com.bumptech.glide.c.l(this).b(null, getF71175s0());
        x94.f screen = creditApplicationDocumentViewerContract$Configuration.f67567c;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(screen, "screen");
        int i = z94.a.f320308a[screen.ordinal()];
        if (i == 1) {
            cVar.getClass();
            throw new ClassCastException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        p84.c cVar2 = cVar.f233848g;
        xoi.d dVarG = rd0.e.g(this, bundle, null);
        g.Companion.getClass();
        xpi.f.Companion.getClass();
        b bVar = new b(cVar2, dVarG, creditApplicationDocumentViewerContract$Configuration);
        this.f67560s0 = bVar;
        this.f67561t0 = bVar.f233829b;
        super.onCreate(bundle);
        new xv0.w(new x8i.h(1), new wma.e(1, this.u0, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 17)).b(Z0());
        RecyclerView recyclerViewZ0 = Z0();
        y.h(recyclerViewZ0, (z4l.j) this.f67564x0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }

    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((z4l.j) this.f67564x0.getValue()).c(items);
    }
}
