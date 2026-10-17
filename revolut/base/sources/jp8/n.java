package jp8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f177230c = {null, yhm.j.c(yhm.k.PUBLICATION, new jj9.b(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f177231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f177232b;

    public /* synthetic */ n(int i, List list, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(l.f177229a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177231a = aVar;
        this.f177232b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f177231a, nVar.f177231a) && Intrinsics.f(this.f177232b, nVar.f177232b);
    }

    public final int hashCode() {
        return this.f177232b.hashCode() + (this.f177231a.hashCode() * 31);
    }
}
