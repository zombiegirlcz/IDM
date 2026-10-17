package zve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325672a;

    public e(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        this.f325672a = html;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f325672a, ((e) obj2).f325672a);
    }

    public final int hashCode() {
        return this.f325672a.hashCode();
    }
}
