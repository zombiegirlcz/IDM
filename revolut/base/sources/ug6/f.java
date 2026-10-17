package ug6;

import kotlin.jvm.internal.Intrinsics;
import wf6.e0;
import xg6.x;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pe6.a f279943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f279944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f279945c;
    public final gte.a d;
    public final rh6.b e;
    public final wj0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0 f279946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final sri.m f279947h;
    public final qg6.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f279948j;
    public final je6.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u51.a f279949l;

    public f(pe6.a openBankingTopupResultMapper, oe6.a externalInstitutionsInteractor, e directLinkPayloadProcessor, gte.a featureToggleInteractor, rh6.b institutionAvailabilityStringProvider, wj0.a idempotencyKeyHolder, e0 openBankingDeeplinkResolver, sri.m navigator, qg6.f brazilPixMandateResultInteractor, x mandateInteractor, je6.e brazilPixMandateStatusDialogConfigFactory, u51.a topUpMethodsInteractor) {
        Intrinsics.checkNotNullParameter(openBankingTopupResultMapper, "openBankingTopupResultMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(directLinkPayloadProcessor, "directLinkPayloadProcessor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(institutionAvailabilityStringProvider, "institutionAvailabilityStringProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(openBankingDeeplinkResolver, "openBankingDeeplinkResolver");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(brazilPixMandateResultInteractor, "brazilPixMandateResultInteractor");
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(brazilPixMandateStatusDialogConfigFactory, "brazilPixMandateStatusDialogConfigFactory");
        Intrinsics.checkNotNullParameter(topUpMethodsInteractor, "topUpMethodsInteractor");
        this.f279943a = openBankingTopupResultMapper;
        this.f279944b = externalInstitutionsInteractor;
        this.f279945c = directLinkPayloadProcessor;
        this.d = featureToggleInteractor;
        this.e = institutionAvailabilityStringProvider;
        this.f = idempotencyKeyHolder;
        this.f279946g = openBankingDeeplinkResolver;
        this.f279947h = navigator;
        this.i = brazilPixMandateResultInteractor;
        this.f279948j = mandateInteractor;
        this.k = brazilPixMandateStatusDialogConfigFactory;
        this.f279949l = topUpMethodsInteractor;
    }
}
