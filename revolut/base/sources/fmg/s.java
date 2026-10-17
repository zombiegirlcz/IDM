package fmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136449a;

    public /* synthetic */ s(int i, String str) {
        if (1 == (i & 1)) {
            this.f136449a = str;
        } else {
            j1.f(q.f136448a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f136449a, ((s) obj2).f136449a);
    }

    public final int hashCode() {
        return this.f136449a.hashCode();
    }

    public s(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f136449a = action;
    }
}
