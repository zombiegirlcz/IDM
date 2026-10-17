package ou6;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu6.b f229846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qu6.b f229847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku6.b f229848c;

    public x(iu6.b orderListFactory, iu6.c noResultsFactory, qu6.b acquiringOrderMapper, ku6.b acquiringFilterChipsProvider) {
        Intrinsics.checkNotNullParameter(orderListFactory, "orderListFactory");
        Intrinsics.checkNotNullParameter(noResultsFactory, "noResultsFactory");
        Intrinsics.checkNotNullParameter(acquiringOrderMapper, "acquiringOrderMapper");
        Intrinsics.checkNotNullParameter(acquiringFilterChipsProvider, "acquiringFilterChipsProvider");
        this.f229846a = orderListFactory;
        this.f229847b = acquiringOrderMapper;
        this.f229848c = acquiringFilterChipsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(t1.t(domainState.f229829c, domainState.f229828b), new oqk.c(this, 18), new or4.i(this, 4), new c1(domainState, this, 26));
    }
}
