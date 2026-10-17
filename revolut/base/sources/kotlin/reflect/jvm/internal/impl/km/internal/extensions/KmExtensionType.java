package kotlin.reflect.jvm.internal.impl.km.internal.extensions;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import nim.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmExtensionType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f186834a;

    public KmExtensionType(@NotNull KClass klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f186834a = klass;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof KmExtensionType) {
            return Intrinsics.f(this.f186834a, ((KmExtensionType) obj2).f186834a);
        }
        return false;
    }

    public int hashCode() {
        return this.f186834a.hashCode();
    }

    @NotNull
    public String toString() {
        String name = a.o(this.f186834a).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
