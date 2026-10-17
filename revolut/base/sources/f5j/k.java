package f5j;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f132353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f132354b;

    public k(i suggestion, q requestParams) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f132353a = suggestion;
        this.f132354b = requestParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f132353a, kVar.f132353a) && Intrinsics.f(this.f132354b, kVar.f132354b);
    }

    public final int hashCode() {
        return this.f132354b.hashCode() + (this.f132353a.hashCode() * 31);
    }
}
