package jqg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177715a;

    public e(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        this.f177715a = html;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f177715a, ((e) obj2).f177715a);
    }

    public final int hashCode() {
        return this.f177715a.hashCode();
    }
}
