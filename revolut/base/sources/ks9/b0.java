package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends yji.n implements g {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rr9.d f189321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zof.f f189322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f189323n;

    public b0(rr9.d settlementInteractor, zof.f transferFeatureScreensProvider) {
        Intrinsics.checkNotNullParameter(settlementInteractor, "settlementInteractor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        this.f189321l = settlementInteractor;
        this.f189322m = transferFeatureScreensProvider;
        this.f189323n = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ks9.b0 r19, com.revolut.feature.payments.groups.api.models.PaymentGroup r20, com.revolut.feature.payments.groups.models.GroupMemberSettleInfo r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.b0.Z2(ks9.b0, com.revolut.feature.payments.groups.api.models.PaymentGroup, com.revolut.feature.payments.groups.models.GroupMemberSettleInfo, gim.c):java.lang.Object");
    }

    public final void b3(qq9.d method, PaymentGroup group, List members) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(members, "members");
        T2(new km2.n(8, this, method, members, group, (Continuation) null), new yi5.b(27));
    }

    public final Object c3(Function1 function1, gim.c cVar) {
        Object objB = pu7.a.B(this.e, "SETTLE_TASK_ID", new a0(this, function1, null, 1), cVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }
}
