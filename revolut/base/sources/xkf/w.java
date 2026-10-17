package xkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f306787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fnc.s f306788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge3.e f306789c;
    public final thf.d d;

    public w(klf.h0 commonDataSource, fnc.s splitBillLinkInteractor, ge3.e transactionCategorisationInteractor, thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f306787a = commonDataSource;
        this.f306788b = splitBillLinkInteractor;
        this.f306789c = transactionCategorisationInteractor;
        this.d = transactionIconResourcesMapper;
    }
}
