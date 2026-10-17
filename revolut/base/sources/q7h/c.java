package q7h;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242860b;

    public /* synthetic */ c(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(a.f242858a.getDescriptor(), i, 3);
            throw null;
        }
        this.f242859a = str;
        this.f242860b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f242859a, cVar.f242859a) && Intrinsics.f(this.f242860b, cVar.f242860b);
    }

    public final int hashCode() {
        return this.f242860b.hashCode() + (this.f242859a.hashCode() * 31);
    }

    public c(String scope, String content) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f242859a = scope;
        this.f242860b = content;
    }
}
