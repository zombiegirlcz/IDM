package w7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import w5b.b6;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new b6(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295525c;

    public /* synthetic */ c(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(a.f295522a.getDescriptor(), i, 7);
            throw null;
        }
        this.f295523a = str;
        this.f295524b = str2;
        this.f295525c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f295523a, cVar.f295523a) && Intrinsics.f(this.f295524b, cVar.f295524b) && Intrinsics.f(this.f295525c, cVar.f295525c);
    }

    public final int hashCode() {
        return this.f295525c.hashCode() + p.a.c(this.f295523a.hashCode() * 31, 31, this.f295524b);
    }
}
