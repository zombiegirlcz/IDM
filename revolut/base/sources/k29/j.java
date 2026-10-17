package k29;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f180428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f180429c;

    public /* synthetic */ j(int i, String str, c cVar, s sVar) {
        if (7 != (i & 7)) {
            j1.f(h.f180426a.getDescriptor(), i, 7);
            throw null;
        }
        this.f180427a = str;
        this.f180428b = cVar;
        this.f180429c = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f180427a, jVar.f180427a) && Intrinsics.f(this.f180428b, jVar.f180428b) && Intrinsics.f(this.f180429c, jVar.f180429c);
    }

    public final int hashCode() {
        int iHashCode = (this.f180428b.hashCode() + (this.f180427a.hashCode() * 31)) * 31;
        s sVar = this.f180429c;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }
}
