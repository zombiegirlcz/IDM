package w10;

import java.lang.reflect.Type;
import kg.u;
import kg.w;
import kg.x;
import kg.y;
import kg.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v20.a2;
import v20.b2;
import v20.c2;
import v20.d2;
import v20.e2;
import v20.f2;
import v20.g2;
import v20.h2;
import v20.i2;
import v20.j2;
import v20.k2;
import v20.l2;
import v20.m1;
import v20.n1;
import v20.o1;
import v20.p1;
import v20.q1;
import v20.r1;
import v20.s1;
import v20.t1;
import v20.u1;
import v20.v1;
import v20.w1;
import v20.x1;
import v20.y1;
import v20.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y yVar) {
        l2 src2 = (l2) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        if (src2 instanceof u1) {
            w wVar = new w();
            wVar.h("type", "deleted");
            wVar.h("messageId", ((u1) src2).f285578a.toString());
            return wVar;
        }
        if (Intrinsics.f(src2, m1.f285470a)) {
            return new x("assigned");
        }
        if (Intrinsics.f(src2, n1.f285487a)) {
            return new x("callCompleted");
        }
        if (Intrinsics.f(src2, o1.f285500a)) {
            return new x("callInitialized");
        }
        if (Intrinsics.f(src2, p1.f285521a)) {
            return new x("canceled");
        }
        if (Intrinsics.f(src2, q1.f285526a)) {
            return new x("callRequestOfferCommunicated");
        }
        if (Intrinsics.f(src2, r1.f285539a)) {
            return new x("callStarted");
        }
        if (Intrinsics.f(src2, s1.f285560a)) {
            return new x("closed");
        }
        if (Intrinsics.f(src2, t1.f285571a)) {
            return new x("contentUploaded");
        }
        if (Intrinsics.f(src2, v1.f285582a)) {
            return new x("dropped");
        }
        if (Intrinsics.f(src2, w1.f285592a)) {
            return new x("escalated");
        }
        if (Intrinsics.f(src2, x1.f285604a)) {
            return new x("escalatedToLiveAgent");
        }
        if (Intrinsics.f(src2, y1.f285613a)) {
            return new x("inboxUpdated");
        }
        if (Intrinsics.f(src2, z1.f285617a)) {
            return new x("initialized");
        }
        if (Intrinsics.f(src2, a2.f285331a)) {
            return new x("opened");
        }
        if (Intrinsics.f(src2, b2.f285338a)) {
            return new x("pending");
        }
        if (Intrinsics.f(src2, c2.f285356a)) {
            return new x("pickup");
        }
        if (Intrinsics.f(src2, d2.f285362a)) {
            return new x("rated");
        }
        if (Intrinsics.f(src2, e2.f285372a)) {
            return new x("reopened");
        }
        if (Intrinsics.f(src2, f2.f285402a)) {
            return new x("resolved");
        }
        if (Intrinsics.f(src2, g2.f285418a)) {
            return new x("snoozed");
        }
        if (Intrinsics.f(src2, h2.f285427a)) {
            return new x("transcriptReady");
        }
        if (Intrinsics.f(src2, j2.f285445a)) {
            return new x("unsnoozed");
        }
        if (Intrinsics.f(src2, k2.f285454a)) {
            return new x("updated");
        }
        if (src2 instanceof i2) {
            return new x(((i2) src2).f285434a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
