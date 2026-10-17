package abd;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2937b;

    public /* synthetic */ c(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(a.f2935a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2936a = str;
        this.f2937b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f2936a, cVar.f2936a) && this.f2937b == cVar.f2937b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2937b) + (this.f2936a.hashCode() * 31);
    }

    public c(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2936a = name;
        this.f2937b = z;
    }
}
