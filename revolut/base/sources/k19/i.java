package k19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new k16.d(3)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f180153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180155c;

    public /* synthetic */ i(int i, h hVar, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(f.f180152a.getDescriptor(), i, 7);
            throw null;
        }
        this.f180153a = hVar;
        this.f180154b = str;
        this.f180155c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f180153a == iVar.f180153a && Intrinsics.f(this.f180154b, iVar.f180154b) && Intrinsics.f(this.f180155c, iVar.f180155c);
    }

    public final int hashCode() {
        return this.f180155c.hashCode() + p.a.c(this.f180153a.hashCode() * 31, 31, this.f180154b);
    }
}
