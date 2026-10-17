package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v3 {

    @NotNull
    public static final u3 Companion = new u3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124692b;

    public /* synthetic */ v3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(t3.f124679a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124691a = str;
        this.f124692b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f124691a, v3Var.f124691a) && Intrinsics.f(this.f124692b, v3Var.f124692b);
    }

    public final int hashCode() {
        return this.f124692b.hashCode() + (this.f124691a.hashCode() * 31);
    }

    public v3(String type, String name) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f124691a = type;
        this.f124692b = name;
    }
}
