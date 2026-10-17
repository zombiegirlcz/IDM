package jd7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172987a;

    public e(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        this.f172987a = html;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f172987a, ((e) obj2).f172987a);
    }

    public final int hashCode() {
        return this.f172987a.hashCode();
    }
}
