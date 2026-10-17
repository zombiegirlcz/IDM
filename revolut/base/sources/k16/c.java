package k16;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180106a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f180106a = str;
        } else {
            j1.f(a.f180105a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f180106a, ((c) obj2).f180106a);
    }

    public final int hashCode() {
        return this.f180106a.hashCode();
    }

    public c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f180106a = name;
    }
}
