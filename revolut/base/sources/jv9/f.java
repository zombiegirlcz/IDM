package jv9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178797b;

    public f(List messages, boolean z) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.f178796a = messages;
        this.f178797b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f178796a, fVar.f178796a) && this.f178797b == fVar.f178797b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178797b) + (this.f178796a.hashCode() * 31);
    }
}
