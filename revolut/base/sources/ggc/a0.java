package ggc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f143606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f143607c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143608a;

    static {
        new a0("DirectForPremium");
        f143606b = new a0("PromoCodeForPremium");
        f143607c = new a0("ClassPass");
    }

    public a0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f143608a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f143608a, ((a0) obj2).f143608a);
    }

    public final int hashCode() {
        return this.f143608a.hashCode();
    }
}
