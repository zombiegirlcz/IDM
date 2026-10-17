package y4k;

import kotlin.jvm.internal.Intrinsics;
import m3j.h;
import yof.k;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f310961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f310962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f310963c;
    public final l80.e d;
    public final vrf.h e;

    public e(h accountFieldsMapper, k transferReviewMapper, d commonMapper, l80.e dateProvider, vrf.h sectionFactory) {
        Intrinsics.checkNotNullParameter(accountFieldsMapper, "accountFieldsMapper");
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        this.f310961a = accountFieldsMapper;
        this.f310962b = transferReviewMapper;
        this.f310963c = commonMapper;
        this.d = dateProvider;
        this.e = sectionFactory;
    }
}
