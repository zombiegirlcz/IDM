package p35;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f232609b = new d(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232610a;

    public d(boolean z) {
        this.f232610a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f232610a == ((d) obj2).f232610a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232610a);
    }
}
