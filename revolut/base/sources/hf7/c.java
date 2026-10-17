package hf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.k;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f151766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f151768c;
    public final String d;

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new h43.b(28)), yhm.j.c(kVar, new h43.b(29)), null};
    }

    public /* synthetic */ c(int i, j jVar, List list, List list2, String str) {
        if (15 != (i & 15)) {
            j1.f(a.f151765a.getDescriptor(), i, 15);
            throw null;
        }
        this.f151766a = jVar;
        this.f151767b = list;
        this.f151768c = list2;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f151766a, cVar.f151766a) && Intrinsics.f(this.f151767b, cVar.f151767b) && Intrinsics.f(this.f151768c, cVar.f151768c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f151766a.hashCode() * 31, 31, this.f151767b);
        List list = this.f151768c;
        return this.d.hashCode() + ((iD + (list == null ? 0 : list.hashCode())) * 31);
    }
}
