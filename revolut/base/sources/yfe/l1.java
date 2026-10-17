package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class l1 implements m1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313281a;

    public /* synthetic */ l1(int i, String str) {
        if (1 == (i & 1)) {
            this.f313281a = str;
        } else {
            qlm.j1.f(j1.f313271a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l1) && Intrinsics.f(this.f313281a, ((l1) obj2).f313281a);
    }

    public final int hashCode() {
        return this.f313281a.hashCode();
    }

    public l1(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f313281a = name;
    }
}
