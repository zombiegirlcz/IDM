package q09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241183b;

    public c0(String questionId, String optionId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        this.f241182a = questionId;
        this.f241183b = optionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f241182a, c0Var.f241182a) && Intrinsics.f(this.f241183b, c0Var.f241183b);
    }

    public final int hashCode() {
        return this.f241183b.hashCode() + (this.f241182a.hashCode() * 31);
    }
}
