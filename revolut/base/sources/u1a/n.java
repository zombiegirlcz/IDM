package u1a;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f276381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.d f276382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.m f276383c;

    public n(b splitBillQrProfileCardMapper, thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(splitBillQrProfileCardMapper, "splitBillQrProfileCardMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f276381a = splitBillQrProfileCardMapper;
        this.f276382b = transactionIconResourcesMapper;
        this.f276383c = transactionTextResourcesMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f276369a, new tyg.g(23), new tw8.g(this, 15), new tch.c(this, 16));
    }
}
