package usf;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.transfer_reasons.api.TransferReasonsToggles$CoFxDeclarations;
import efm.r;
import j49.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import te0.w;
import thf.m;
import tof.za;
import urd.y;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements esf.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f282894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f282895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f282896c;
    public final thf.b d;
    public final thf.d e;
    public final m f;

    public d(gte.a featureToggleInteractor, g handler, whf.b transactionsContentProvider, thf.b transactionAmountMapper, thf.d transactionIconResourcesMapper, m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transactionAmountMapper, "transactionAmountMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f282894a = featureToggleInteractor;
        this.f282895b = handler;
        this.f282896c = transactionsContentProvider;
        this.d = transactionAmountMapper;
        this.e = transactionIconResourcesMapper;
        this.f = transactionTextResourcesMapper;
    }

    @Override // i49.c
    public final boolean a(t data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return a.a(data) != null;
    }

    @Override // i49.c
    public final Flow f(i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.f282894a.a(TransferReasonsToggles$CoFxDeclarations.f92312c)) {
            return new go.g(f0.f322471a, 2);
        }
        r rVarA = whf.b.a(this.f282896c, w.h(new za("purpose_declaration_required")), null, null, null, 14);
        y yVar = new y(13);
        h0 h0Var = h0.f322473a;
        return rd0.e.e(new tse.c(rd0.e.b(ue0.e.H(rVarA, h0Var, yVar)), this, 26), h0Var, new tc6.d(3, 24, null));
    }

    @Override // i49.c
    public final Object g(t tVar, Continuation continuation) {
        return this.f282895b.a(tVar, (gim.c) continuation);
    }
}
