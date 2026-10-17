package rn8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255519b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f255517a.getDescriptor(), i, 3);
            throw null;
        }
        this.f255518a = str;
        this.f255519b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f255518a, cVar.f255518a) && Intrinsics.f(this.f255519b, cVar.f255519b);
    }

    public final int hashCode() {
        return this.f255519b.hashCode() + (this.f255518a.hashCode() * 31);
    }

    public c(String id10, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f255518a = id10;
        this.f255519b = state;
    }
}
