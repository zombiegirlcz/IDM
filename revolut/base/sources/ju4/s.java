package ju4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f178597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm4.c f178598b;

    public s(w80.b amountFormatter, dm4.c creditCardRepayAmountItemsMapper, dm4.f creditCardRepayHintMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(creditCardRepayAmountItemsMapper, "creditCardRepayAmountItemsMapper");
        Intrinsics.checkNotNullParameter(creditCardRepayHintMapper, "creditCardRepayHintMapper");
        this.f178597a = amountFormatter;
        this.f178598b = creditCardRepayAmountItemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f178577a, new jlh.g(this, 28), new jme.f(this, 25), new j75.i(this, 16));
    }
}
