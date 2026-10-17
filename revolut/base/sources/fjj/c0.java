package fjj;

import com.google.crypto.tink.shaded.protobuf.t1;
import fg8.i0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjj.d f135655a;

    public c0(hjj.d payWithItemMapper, hjj.h topSectionItemsMapper, hjj.g payWithRevPointsItemMapper, hjj.i planChangePlanItemMapper, hjj.b cancelPlanItemMapper) {
        Intrinsics.checkNotNullParameter(payWithItemMapper, "payWithItemMapper");
        Intrinsics.checkNotNullParameter(topSectionItemsMapper, "topSectionItemsMapper");
        Intrinsics.checkNotNullParameter(payWithRevPointsItemMapper, "payWithRevPointsItemMapper");
        Intrinsics.checkNotNullParameter(planChangePlanItemMapper, "planChangePlanItemMapper");
        Intrinsics.checkNotNullParameter(cancelPlanItemMapper, "cancelPlanItemMapper");
        this.f135655a = payWithItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new r((List) iii.c.f(t1.v(domainState.f135657a, domainState.f135658b, domainState.d, domainState.e), new fj5.e(this, 23), new i0(28), new f0e.i(this, domainState, 12)));
    }
}
