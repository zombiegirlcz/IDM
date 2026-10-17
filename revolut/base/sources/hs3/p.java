package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154927a;

    public p(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154927a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f154927a, ((p) obj2).f154927a);
    }

    public final int hashCode() {
        return this.f154927a.hashCode();
    }
}
