package kha;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f184081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184082b;

    public b(List terminatedCardsIds, boolean z) {
        Intrinsics.checkNotNullParameter(terminatedCardsIds, "terminatedCardsIds");
        this.f184081a = terminatedCardsIds;
        this.f184082b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f184081a, bVar.f184081a) && this.f184082b == bVar.f184082b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184082b) + (this.f184081a.hashCode() * 31);
    }
}
