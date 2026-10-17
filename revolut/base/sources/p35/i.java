package p35;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f232646c = new i(false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f232648b;

    public i(boolean z, boolean z3) {
        this.f232647a = z;
        this.f232648b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f232647a == iVar.f232647a && this.f232648b == iVar.f232648b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232648b) + (Boolean.hashCode(this.f232647a) * 31);
    }
}
