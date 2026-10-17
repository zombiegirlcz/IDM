package p35;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Serializable {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f232652b = new k(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232653a;

    public k(boolean z) {
        this.f232653a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f232653a == ((k) obj2).f232653a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232653a);
    }
}
