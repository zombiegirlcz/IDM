package n38;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g implements p {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211950b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f211944a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211949a = str;
        this.f211950b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f211949a, gVar.f211949a) && Intrinsics.f(this.f211950b, gVar.f211950b);
    }

    public final int hashCode() {
        return this.f211950b.hashCode() + (this.f211949a.hashCode() * 31);
    }

    public g(String id10, String walletId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f211949a = id10;
        this.f211950b = walletId;
    }
}
