package t27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw6.a f267445a;

    public u(fw6.a taxRateInputFilter) {
        Intrinsics.checkNotNullParameter(taxRateInputFilter, "taxRateInputFilter");
        this.f267445a = taxRateInputFilter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f267431a, new szb.g(24), new szb.f(10), new si5.c(this, domainState, 7));
        boolean z = true;
        if (domainState.f267432b != n.PRODUCT_TAX) {
            float f = domainState.d;
            if (!(0.01f <= f && f <= 100.0f)) {
                z = false;
            }
        }
        return new o(list, z);
    }
}
