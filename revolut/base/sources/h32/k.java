package h32;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    public static final f Companion = new f();
    public final ApmConsentNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oz1.c f149013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sri.m f149014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f149015r;

    public k(ApmConsentNavigation$InputData inputData, oz1.c apmConsentsInteractor, sri.m navigator, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmConsentsInteractor, "apmConsentsInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f149013p = apmConsentsInteractor;
        this.f149014q = navigator;
        this.f149015r = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Intrinsics.checkNotNullExpressionValue("k", "APM_TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "k", j6.a.q("APM Confirmation Screen: create: ", this.o.f62313a), null, null, 16);
        l2(new i(this, null, 1), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f149015r;
    }
}
