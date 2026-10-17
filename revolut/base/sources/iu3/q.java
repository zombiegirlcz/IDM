package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f168499b;

    public q(String title, p details) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f168498a = title;
        this.f168499b = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f168498a, qVar.f168498a) && Intrinsics.f(this.f168499b, qVar.f168499b);
    }

    public final int hashCode() {
        return this.f168499b.hashCode() + (this.f168498a.hashCode() * 31);
    }
}
