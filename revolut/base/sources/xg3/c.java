package xg3;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import xda.z;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new z(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f305484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f305485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f305486c;

    public /* synthetic */ c(int i, f fVar, List list, m mVar) {
        if (7 != (i & 7)) {
            j1.f(a.f305483a.getDescriptor(), i, 7);
            throw null;
        }
        this.f305484a = fVar;
        this.f305485b = list;
        this.f305486c = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f305484a, cVar.f305484a) && Intrinsics.f(this.f305485b, cVar.f305485b) && Intrinsics.f(this.f305486c, cVar.f305486c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f305484a.hashCode() * 31, 31, this.f305485b);
        m mVar = this.f305486c;
        return iD + (mVar == null ? 0 : mVar.f305496a.hashCode());
    }
}
