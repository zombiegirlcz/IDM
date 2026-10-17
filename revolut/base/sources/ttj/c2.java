package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c2 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274327a;

    public /* synthetic */ c2(int i, String str) {
        if (1 == (i & 1)) {
            this.f274327a = str;
        } else {
            qlm.j1.f(a2.f274321a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c2) && Intrinsics.f(this.f274327a, ((c2) obj2).f274327a);
    }

    public final int hashCode() {
        return this.f274327a.hashCode();
    }
}
