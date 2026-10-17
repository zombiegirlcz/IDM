package hk9;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f152869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx0.i f152870b;

    public a0(w80.b amountFormatter, rx0.i inputAmountFilter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(inputAmountFilter, "inputAmountFilter");
        this.f152869a = amountFormatter;
        this.f152870b = inputAmountFilter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(t1.t(domainState.f152877b, domainState.f152876a), new hg4.a(this, 12), new hb6.g(29), new hb4.n(this, domainState, 10));
    }
}
