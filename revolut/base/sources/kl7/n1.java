package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f185363b;

    public n1(int i, p1 question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.f185362a = i;
        this.f185363b = question;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return this.f185362a == n1Var.f185362a && this.f185363b == n1Var.f185363b;
    }

    public final int hashCode() {
        return this.f185363b.hashCode() + (Integer.hashCode(this.f185362a) * 31);
    }
}
