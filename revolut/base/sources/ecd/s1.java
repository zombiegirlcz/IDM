package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124664a;

    public /* synthetic */ s1(int i, String str) {
        if (1 == (i & 1)) {
            this.f124664a = str;
        } else {
            qlm.j1.f(q1.f124651a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s1) && Intrinsics.f(this.f124664a, ((s1) obj2).f124664a);
    }

    public final int hashCode() {
        String str = this.f124664a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public s1(String str) {
        this.f124664a = str;
    }
}
