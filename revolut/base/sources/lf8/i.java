package lf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializable {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194672a;

    static {
        new i("FREE_ATM");
        new i("FREE_FX");
        new i("FREE_CARD");
        new i("FREE_APP");
    }

    public i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f194672a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f194672a, ((i) obj2).f194672a);
    }

    public final int hashCode() {
        return this.f194672a.hashCode();
    }
}
