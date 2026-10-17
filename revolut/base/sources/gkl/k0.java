package gkl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f144462a;

    public static final class a {
        private a() {
        }
    }

    public k0() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f144462a, ((k0) obj2).f144462a);
    }

    public final int hashCode() {
        Map map = this.f144462a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public k0(LinkedHashMap linkedHashMap) {
        this.f144462a = linkedHashMap;
    }
}
