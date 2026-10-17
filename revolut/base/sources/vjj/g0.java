package vjj;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements cli.n {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xjj.e f289763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xjj.i f289764b;

    public g0(xjj.e mobilePlanDetailsActivePlanStateMapper, xjj.i mobilePlanDetailsExpiredPlanStateMapper) {
        Intrinsics.checkNotNullParameter(mobilePlanDetailsActivePlanStateMapper, "mobilePlanDetailsActivePlanStateMapper");
        Intrinsics.checkNotNullParameter(mobilePlanDetailsExpiredPlanStateMapper, "mobilePlanDetailsExpiredPlanStateMapper");
        this.f289763a = mobilePlanDetailsActivePlanStateMapper;
        this.f289764b = mobilePlanDetailsExpiredPlanStateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (w) iii.c.f(t1.w(domainState.f289765a, domainState.f289767c, domainState.d, domainState.e, domainState.f), new vgk.g(this, 29), new vgg.a0(this, 18), new vh2.o(this, domainState, 1));
    }
}
