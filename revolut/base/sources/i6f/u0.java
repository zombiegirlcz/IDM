package i6f;

import ble.o1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public abstract class u0 extends yji.n implements v0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z1 f158984l;

    public u0() {
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f158984l = z1VarB;
    }

    public final wkm.l Z2(Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        return vkm.q.Q(this.f158984l, new o1(1, null, flow));
    }
}
