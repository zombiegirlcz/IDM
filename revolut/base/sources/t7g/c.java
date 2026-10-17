package t7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new t73.h(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f268667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f268668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f268669c;
    public final int d;
    public final List e;

    public /* synthetic */ c(int i, i iVar, i iVar2, int i2, int i3, List list) {
        if (31 != (i & 31)) {
            j1.f(a.f268666a.getDescriptor(), i, 31);
            throw null;
        }
        this.f268667a = iVar;
        this.f268668b = iVar2;
        this.f268669c = i2;
        this.d = i3;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f268667a, cVar.f268667a) && Intrinsics.f(this.f268668b, cVar.f268668b) && this.f268669c == cVar.f268669c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f268669c, (this.f268668b.hashCode() + (this.f268667a.hashCode() * 31)) * 31, 31), 31);
    }
}
