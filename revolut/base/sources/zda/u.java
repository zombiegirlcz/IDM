package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321418b;

    public /* synthetic */ u(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(s.f321412a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321417a = str;
        this.f321418b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f321417a, uVar.f321417a) && Intrinsics.f(this.f321418b, uVar.f321418b);
    }

    public final int hashCode() {
        return this.f321418b.hashCode() + (this.f321417a.hashCode() * 31);
    }

    public u(String provider, String qrCode) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f321417a = provider;
        this.f321418b = qrCode;
    }
}
