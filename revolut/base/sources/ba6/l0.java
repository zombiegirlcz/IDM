package ba6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13951b;

    public l0(String quoteToken, ArrayList amounts) {
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(amounts, "amounts");
        this.f13950a = quoteToken;
        this.f13951b = amounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f13950a, l0Var.f13950a) && this.f13951b.equals(l0Var.f13951b);
    }

    public final int hashCode() {
        return this.f13951b.hashCode() + (this.f13950a.hashCode() * 31);
    }
}
