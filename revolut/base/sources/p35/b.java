package p35;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f232604b = new b(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232605a;

    public b(boolean z) {
        this.f232605a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f232605a == ((b) obj2).f232605a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232605a);
    }
}
