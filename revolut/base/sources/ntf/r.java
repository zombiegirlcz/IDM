package ntf;

import cli.y;
import com.revolut.feature.transfer_reasons.impl.ui.search.TransferReasonsSearchScreenContract$InputData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends oki.h implements dli.b {
    public final TransferReasonsSearchScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final csf.a f219037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final psf.a f219038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f219039r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Flow f219040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final isf.d f219041t;
    public final y u;

    public r(cli.n stateMapper, TransferReasonsSearchScreenContract$InputData inputData, csf.a additionalInfoInteractor, psf.a faqDestinationsProvider, a filter, Flow selectedReasonsFlow, isf.d dialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(additionalInfoInteractor, "additionalInfoInteractor");
        Intrinsics.checkNotNullParameter(faqDestinationsProvider, "faqDestinationsProvider");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(selectedReasonsFlow, "selectedReasonsFlow");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f219037p = additionalInfoInteractor;
        this.f219038q = faqDestinationsProvider;
        this.f219039r = filter;
        this.f219040s = selectedReasonsFlow;
        this.f219041t = dialogProvider;
        TransferReasonCategory transferReasonCategory = inputData.f92396b;
        ttf.b bVar = inputData.f92395a;
        List list = transferReasonCategory.d;
        h0 h0Var = h0.f322473a;
        m70.a.c(t0.f186434a);
        this.u = mra.d.b(this, new g(transferReasonCategory, bVar, list, h0Var, "", false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f219040s, null, null, new o(this, null, 0), 3);
    }

    public final boolean I2() {
        if (((g) ((j2) this.u.f22677a).getValue()).d.isEmpty()) {
            return false;
        }
        yji.l.a1(this, X1(isf.d.a(this.f219041t)), null, null, new o(this, null, 1), 3);
        return true;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
