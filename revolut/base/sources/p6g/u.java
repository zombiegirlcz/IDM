package p6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f233303a;

    public u(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f233303a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f233303a, ((u) obj2).f233303a);
    }

    public final int hashCode() {
        return this.f233303a.hashCode();
    }
}
