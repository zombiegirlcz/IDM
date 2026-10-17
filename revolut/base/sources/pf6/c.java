package pf6;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new pdg.d(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235475c;
    public final List d;
    public final qo6.s e;

    public /* synthetic */ c(int i, String str, String str2, String str3, List list, qo6.s sVar) {
        if (31 != (i & 31)) {
            j1.f(a.f235472a.getDescriptor(), i, 31);
            throw null;
        }
        this.f235473a = str;
        this.f235474b = str2;
        this.f235475c = str3;
        this.d = list;
        this.e = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f235473a, cVar.f235473a) && Intrinsics.f(this.f235474b, cVar.f235474b) && Intrinsics.f(this.f235475c, cVar.f235475c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.c(p.a.c(this.f235473a.hashCode() * 31, 31, this.f235474b), 31, this.f235475c), 31, this.d);
    }
}
