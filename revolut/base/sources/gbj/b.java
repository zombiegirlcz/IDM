package gbj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f142270b;

    public b(String meshLinkToken, List managedTokens) {
        Intrinsics.checkNotNullParameter(meshLinkToken, "meshLinkToken");
        Intrinsics.checkNotNullParameter(managedTokens, "managedTokens");
        this.f142269a = meshLinkToken;
        this.f142270b = managedTokens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f142269a, bVar.f142269a) && Intrinsics.f(this.f142270b, bVar.f142270b);
    }

    public final int hashCode() {
        return this.f142270b.hashCode() + (this.f142269a.hashCode() * 31);
    }
}
