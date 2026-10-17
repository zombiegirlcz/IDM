package c93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e93.f f22270b;

    public b(String cardId, e93.f cardDesign) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f22269a = cardId;
        this.f22270b = cardDesign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f22269a, bVar.f22269a) && Intrinsics.f(this.f22270b, bVar.f22270b);
    }

    public final int hashCode() {
        return this.f22270b.hashCode() + (this.f22269a.hashCode() * 31);
    }

    public /* synthetic */ b(e93.f fVar) {
        this("NO_ID", fVar);
    }
}
