package ws7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299674a;

    public a(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f299674a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f299674a, ((a) obj2).f299674a);
    }

    public final int hashCode() {
        return this.f299674a.hashCode();
    }
}
