package hs3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u1 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f154954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154955c;
    public final w1 d;
    public final t1 e;
    public final v1 f;

    public u1(int i, long j2, List content, w1 popup, t1 insideFlowBehaviour, v1 outsideFlowBehaviour) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(popup, "popup");
        Intrinsics.checkNotNullParameter(insideFlowBehaviour, "insideFlowBehaviour");
        Intrinsics.checkNotNullParameter(outsideFlowBehaviour, "outsideFlowBehaviour");
        this.f154953a = i;
        this.f154954b = j2;
        this.f154955c = content;
        this.d = popup;
        this.e = insideFlowBehaviour;
        this.f = outsideFlowBehaviour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return this.f154953a == u1Var.f154953a && this.f154954b == u1Var.f154954b && Intrinsics.f(this.f154955c, u1Var.f154955c) && Intrinsics.f(this.d, u1Var.d) && this.e == u1Var.e && this.f == u1Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.d(a0.d.c(Integer.hashCode(this.f154953a) * 31, 31, this.f154954b), 31, this.f154955c)) * 31)) * 31);
    }
}
