package com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ay7.b;
import bu7.y;
import by7.i;
import by7.j;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration;
import hpi.c;
import hpi.h;
import hpi.k;
import iqi.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import pri.e;
import te0.w;
import xoi.d;
import xpi.f;
import zx7.l;
import zx7.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackActivity;", "Lhpi/h;", "Lby7/i;", "Lby7/j;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancellationFeedbackActivity extends h implements j {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f76246w0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ay7.a f76247s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76248t0 = "PET_CANCELLATION_FLOW";
    public final Object u0 = w.y0(new y(18));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Object f76249v0 = w.y0(new bvb.a(this, 3));

    @Override // nri.b
    public final e F0() {
        ay7.a aVar = this.f76247s0;
        if (aVar != null) {
            return (i) aVar.B.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF71175s0() {
        return this.f76248t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        ay7.a aVar = this.f76247s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new k(56.0f, R$attr.uikit_windowBackground, LDSFile.EF_DG2_TAG));
        f.Companion.getClass();
        f configuration = f.f307976c;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        g.Companion.getClass();
        g configuration2 = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.i = configuration2;
        cVar.e = true;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b bVar = ((b) com.bumptech.glide.c.l(this).b(null, this.f76248t0)).d;
        d dVarG = rd0.e.g(this, bundle, null);
        f.Companion.getClass();
        g.Companion.getClass();
        this.f76247s0 = new ay7.a(bVar, dVarG, (CancellationFeedbackScreenContract$Configuration) G0());
        CancellationFeedbackScreenContract$Configuration cancellationFeedbackScreenContract$Configuration = (CancellationFeedbackScreenContract$Configuration) I0();
        if (cancellationFeedbackScreenContract$Configuration != null) {
            ay7.a aVar = this.f76247s0;
            if (aVar == null) {
                Intrinsics.r("activityComponent");
                throw null;
            }
            s sVar = (s) ((l) aVar.f11076c.f11094g.get());
            sVar.x0().set(cancellationFeedbackScreenContract$Configuration.getF76255c());
            sVar.d().set(cancellationFeedbackScreenContract$Configuration.getF76253a());
            if (cancellationFeedbackScreenContract$Configuration instanceof CancellationFeedbackScreenContract$Configuration.CancelPolicy) {
                sVar.e.getValue(sVar, s.f326088g[3]).set(((CancellationFeedbackScreenContract$Configuration.CancelPolicy) cancellationFeedbackScreenContract$Configuration).d);
            } else if (!(cancellationFeedbackScreenContract$Configuration instanceof CancellationFeedbackScreenContract$Configuration.RejectRenewal)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        super.onCreate(bundle);
        RecyclerView recyclerViewZ0 = Z0();
        yp0.y.h(recyclerViewZ0, (koi.h) this.f76249v0.getValue(), new LinearLayoutManager(recyclerViewZ0.getContext()));
    }
}
