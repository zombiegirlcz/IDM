package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class b6 {

    @NotNull
    public static final a6 Companion = new a6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124501b;

    public /* synthetic */ b6(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(z5.f124723a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124500a = str;
        this.f124501b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj2;
        return Intrinsics.f(this.f124500a, b6Var.f124500a) && Intrinsics.f(this.f124501b, b6Var.f124501b);
    }

    public final int hashCode() {
        return this.f124501b.hashCode() + (this.f124500a.hashCode() * 31);
    }

    public b6(String period, String explanationDeeplink) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(explanationDeeplink, "explanationDeeplink");
        this.f124500a = period;
        this.f124501b = explanationDeeplink;
    }
}
