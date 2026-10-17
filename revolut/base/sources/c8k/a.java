package c8k;

import kotlin.jvm.internal.Intrinsics;
import m4k.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f22238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f22239b;

    public a(yof.d transferAmountMapper, gte.a featureToggleInteractor, int i) {
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f22238a = transferAmountMapper;
                this.f22239b = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f22238a = transferAmountMapper;
                this.f22239b = featureToggleInteractor;
                break;
        }
    }

    public a(gte.a featureToggleInteractor, yof.d transferAmountMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        this.f22239b = featureToggleInteractor;
        this.f22238a = transferAmountMapper;
    }

    public a(yof.d transferAmountMapper, gte.a featureToggleInteractor, h transferQuoteChargesMerger) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transferQuoteChargesMerger, "transferQuoteChargesMerger");
        this.f22238a = transferAmountMapper;
        this.f22239b = featureToggleInteractor;
    }
}
