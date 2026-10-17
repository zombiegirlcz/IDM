package rl7;

import kl7.w1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f254922b;

    public b(String policyId, w1 questionnaireType) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(questionnaireType, "questionnaireType");
        this.f254921a = policyId;
        this.f254922b = questionnaireType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f254921a, bVar.f254921a) && this.f254922b == bVar.f254922b;
    }

    public final int hashCode() {
        return this.f254922b.hashCode() + (this.f254921a.hashCode() * 31);
    }
}
