package hr;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154745a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f154745a = str;
        } else {
            j1.f(a.f154744a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f154745a, ((c) obj2).f154745a);
    }

    public final int hashCode() {
        return this.f154745a.hashCode();
    }
}
