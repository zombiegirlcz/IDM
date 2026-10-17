package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements Serializable {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f232639c = new g(z0.DEFAULT, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f232640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f232641b;

    public g(z0 totalMode, boolean z) {
        Intrinsics.checkNotNullParameter(totalMode, "totalMode");
        this.f232640a = totalMode;
        this.f232641b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f232640a == gVar.f232640a && this.f232641b == gVar.f232641b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232641b) + (this.f232640a.hashCode() * 31);
    }
}
