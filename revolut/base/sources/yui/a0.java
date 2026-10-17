package yui;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7i.i f317019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd7.d f317020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iii.d f317021c;

    public a0(c flightNumberValidator, k7i.i countryNameProvider, nd7.d termsClauseMapper) {
        Intrinsics.checkNotNullParameter(flightNumberValidator, "flightNumberValidator");
        Intrinsics.checkNotNullParameter(countryNameProvider, "countryNameProvider");
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        this.f317019a = countryNameProvider;
        this.f317020b = termsClauseMapper;
        this.f317021c = new iii.d(12, null, true, true, null);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(t1.v(domainState.f317028a, domainState.f317029b, domainState.f317030c, domainState.d), new ysk.a(this, 21), new yi3.d(this, 23), new y66.q(this, domainState, 15));
    }
}
