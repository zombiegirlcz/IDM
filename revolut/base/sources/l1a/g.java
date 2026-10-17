package l1a;

import fnc.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.m;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements w0a.h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv9.c f191505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f191506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.d f191507c;
    public final i d;

    public g(wv9.c moneyRequestResourcesMapper, s splitBillLinkInteractor, m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper, i splitBillQrStateProvider) {
        Intrinsics.checkNotNullParameter(moneyRequestResourcesMapper, "moneyRequestResourcesMapper");
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(splitBillQrStateProvider, "splitBillQrStateProvider");
        this.f191505a = moneyRequestResourcesMapper;
        this.f191506b = transactionTextResourcesMapper;
        this.f191507c = transactionIconResourcesMapper;
        this.d = splitBillQrStateProvider;
    }
}
