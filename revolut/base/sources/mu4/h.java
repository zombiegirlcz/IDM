package mu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f208960a;

    public h(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f208960a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f208960a, ((h) obj2).f208960a);
    }

    public final int hashCode() {
        return this.f208960a.hashCode();
    }
}
