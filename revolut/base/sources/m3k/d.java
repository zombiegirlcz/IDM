package m3k;

import h2k.k;
import kotlin.jvm.internal.Intrinsics;
import o3k.g;
import opf.c0;
import r3k.f;
import wt9.e;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f202598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f202599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c0 f202600n;
    public final vo9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f202601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f202602q;

    public d(g interactor, f validatorExtension, c0 transferSuggestedAmountsInteractor, vo9.a pocketMapper, e balanceInteractor, k priceComparisonDelegate) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(balanceInteractor, "balanceInteractor");
        Intrinsics.checkNotNullParameter(priceComparisonDelegate, "priceComparisonDelegate");
        this.f202598l = interactor;
        this.f202599m = validatorExtension;
        this.f202600n = transferSuggestedAmountsInteractor;
        this.o = pocketMapper;
        this.f202601p = balanceInteractor;
        this.f202602q = priceComparisonDelegate;
    }
}
