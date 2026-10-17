package t6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268302c;

    public k(String str, List payLaterOffers, String str2) {
        Intrinsics.checkNotNullParameter(payLaterOffers, "payLaterOffers");
        this.f268300a = str;
        this.f268301b = payLaterOffers;
        this.f268302c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f268300a, kVar.f268300a) && Intrinsics.f(this.f268301b, kVar.f268301b) && Intrinsics.f(this.f268302c, kVar.f268302c);
    }

    public final int hashCode() {
        String str = this.f268300a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f268301b);
        String str2 = this.f268302c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
