package z85;

import kotlin.jvm.internal.Intrinsics;
import sri.m;
import y45.i;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f320044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f320045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f320046c;

    public f(i loanProductInteractor, g loanInterestRateWidgetMapper, m navigator) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanInterestRateWidgetMapper, "loanInterestRateWidgetMapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f320044a = loanProductInteractor;
        this.f320045b = loanInterestRateWidgetMapper;
        this.f320046c = navigator;
    }
}
