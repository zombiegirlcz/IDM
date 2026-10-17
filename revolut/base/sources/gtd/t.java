package gtd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final itd.c f146601a;

    public t(itd.a travelLifestyleProductsMapper, itd.c travelToolMapper) {
        Intrinsics.checkNotNullParameter(travelLifestyleProductsMapper, "travelLifestyleProductsMapper");
        Intrinsics.checkNotNullParameter(travelToolMapper, "travelToolMapper");
        this.f146601a = travelToolMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f146577a, new gs2.t(this, 7), new gp3.n(this, 25), new gna.i(this, 9));
    }
}
