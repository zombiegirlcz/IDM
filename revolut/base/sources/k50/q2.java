package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v30.j f181217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f181218b;

    public q2(v30.j chat, boolean z) {
        Intrinsics.checkNotNullParameter(chat, "chat");
        this.f181217a = chat;
        this.f181218b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj2;
        return Intrinsics.f(this.f181217a, q2Var.f181217a) && this.f181218b == q2Var.f181218b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181218b) + (this.f181217a.hashCode() * 31);
    }
}
