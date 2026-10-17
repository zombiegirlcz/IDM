package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c4 {

    @NotNull
    public static final v3 Companion = new v3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4 f153047a;

    public /* synthetic */ c4(int i, b4 b4Var) {
        if (1 == (i & 1)) {
            this.f153047a = b4Var;
        } else {
            qlm.j1.f(u3.f153327a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c4) && Intrinsics.f(this.f153047a, ((c4) obj2).f153047a);
    }

    public final int hashCode() {
        return this.f153047a.hashCode();
    }
}
