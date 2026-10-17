package d4b;

import b4b.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements g {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f111263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f111264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f111265c;
    public final e d;
    public final vdf.d e;
    public final a4b.j f;

    public i(p inputData, j cfdFundingSourceDataMapper, b cfdCenterAmountMarginFeeMapper, e cfdCenterAmountExposureOrErrorMapper, vdf.d assetFormatter, a4b.j stateValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdFundingSourceDataMapper, "cfdFundingSourceDataMapper");
        Intrinsics.checkNotNullParameter(cfdCenterAmountMarginFeeMapper, "cfdCenterAmountMarginFeeMapper");
        Intrinsics.checkNotNullParameter(cfdCenterAmountExposureOrErrorMapper, "cfdCenterAmountExposureOrErrorMapper");
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(stateValidator, "stateValidator");
        this.f111263a = inputData;
        this.f111264b = cfdFundingSourceDataMapper;
        this.f111265c = cfdCenterAmountMarginFeeMapper;
        this.d = cfdCenterAmountExposureOrErrorMapper;
        this.e = assetFormatter;
        this.f = stateValidator;
    }
}
