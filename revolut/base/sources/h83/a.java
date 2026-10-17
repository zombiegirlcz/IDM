package h83;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149939a;

    public a(String replacementCardId) {
        Intrinsics.checkNotNullParameter(replacementCardId, "replacementCardId");
        this.f149939a = replacementCardId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f149939a, ((a) obj2).f149939a);
    }

    public final int hashCode() {
        return this.f149939a.hashCode();
    }
}
