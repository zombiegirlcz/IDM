package gkl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f144477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f144478b;

    public o0(n0 n0Var, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(n0Var, "default");
        this.f144477a = n0Var;
        this.f144478b = linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f144477a, o0Var.f144477a) && Intrinsics.f(this.f144478b, o0Var.f144478b);
    }

    public final int hashCode() {
        int iHashCode = this.f144477a.hashCode() * 31;
        Map map = this.f144478b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
