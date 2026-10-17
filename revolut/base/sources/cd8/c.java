package cd8;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23208a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f23208a = str;
        } else {
            j1.f(a.f23207a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f23208a, ((c) obj2).f23208a);
    }

    public final int hashCode() {
        return this.f23208a.hashCode();
    }

    public c(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f23208a = state;
    }
}
