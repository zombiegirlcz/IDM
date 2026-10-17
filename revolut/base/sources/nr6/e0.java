package nr6;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218557c;

    public e0(String id10, String str, String str2) throws IOException {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f218555a = id10;
        this.f218556b = str;
        this.f218557c = str2;
        String[] elements = {(str == null || kotlin.text.d0.W(str)) ? null : str, (str2 == null || kotlin.text.d0.W(str2)) ? null : str2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        zhm.d0.k0(listL, " ", null, null, 0, null, 62);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f218555a, e0Var.f218555a) && Intrinsics.f(this.f218556b, e0Var.f218556b) && Intrinsics.f(this.f218557c, e0Var.f218557c);
    }

    public final int hashCode() {
        int iHashCode = this.f218555a.hashCode() * 31;
        String str = this.f218556b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f218557c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
