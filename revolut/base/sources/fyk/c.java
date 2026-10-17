package fyk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139024a;

    public /* synthetic */ c(int i, String str) {
        if (1 == (i & 1)) {
            this.f139024a = str;
        } else {
            j1.f(a.f139022a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f139024a, ((c) obj2).f139024a);
    }

    public final int hashCode() {
        String str = this.f139024a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
