package sw4;

import al4.n;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import om4.n0;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f266106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl4.e f266107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f266108c;
    public final a0 d;
    public final n e;
    public final k0 f;

    public j(n0 feeWaiverInteractor, bl4.e feeWaiverMapper, m navigator, a0 widgetsUiInteractor, n creditCardInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(feeWaiverInteractor, "feeWaiverInteractor");
        Intrinsics.checkNotNullParameter(feeWaiverMapper, "feeWaiverMapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f266106a = feeWaiverInteractor;
        this.f266107b = feeWaiverMapper;
        this.f266108c = navigator;
        this.d = widgetsUiInteractor;
        this.e = creditCardInteractor;
        this.f = creditCardFeatureInteractor;
    }
}
