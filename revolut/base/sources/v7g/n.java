package v7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286647a;

    public /* synthetic */ n(int i, String str) {
        if (1 == (i & 1)) {
            this.f286647a = str;
        } else {
            j1.f(l.f286646a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f286647a, ((n) obj2).f286647a);
    }

    public final int hashCode() {
        return this.f286647a.hashCode();
    }

    public n(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f286647a = token;
    }
}
