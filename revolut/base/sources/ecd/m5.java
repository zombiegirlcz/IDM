package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m5 {

    @NotNull
    public static final l5 Companion = new l5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124621a;

    public /* synthetic */ m5(int i, String str) {
        if (1 == (i & 1)) {
            this.f124621a = str;
        } else {
            qlm.j1.f(k5.f124604a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m5) && Intrinsics.f(this.f124621a, ((m5) obj2).f124621a);
    }

    public final int hashCode() {
        return this.f124621a.hashCode();
    }

    public m5(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f124621a = name;
    }
}
