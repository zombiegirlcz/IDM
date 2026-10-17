package ngh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215166a;

    public f(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f215166a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f215166a, ((f) obj2).f215166a);
    }

    public final int hashCode() {
        return this.f215166a.hashCode();
    }
}
