package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements Serializable {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f232659c = new o(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f232661b;

    public o(String str, String str2) {
        this.f232660a = str;
        this.f232661b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f232660a, oVar.f232660a) && Intrinsics.f(this.f232661b, oVar.f232661b);
    }

    public final int hashCode() {
        String str = this.f232660a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f232661b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
