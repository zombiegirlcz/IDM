package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i implements k {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(4)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i19.g f170211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f170212c;
    public final h d;

    public /* synthetic */ i(int i, String str, i19.g gVar, a aVar, h hVar) {
        if (1 != (i & 1)) {
            qlm.j1.f(d.f170183a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170210a = str;
        if ((i & 2) == 0) {
            this.f170211b = null;
        } else {
            this.f170211b = gVar;
        }
        if ((i & 4) == 0) {
            this.f170212c = null;
        } else {
            this.f170212c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hVar;
        }
    }

    @Override // j19.k
    public final a a() {
        return this.f170212c;
    }

    @Override // j19.k
    public final i19.g b() {
        return this.f170211b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f170210a, iVar.f170210a) && Intrinsics.f(this.f170211b, iVar.f170211b) && this.f170212c == iVar.f170212c && Intrinsics.f(this.d, iVar.d);
    }

    @Override // j19.k
    public final c getContent() {
        return this.d;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170210a;
    }

    public final int hashCode() {
        int iHashCode = this.f170210a.hashCode() * 31;
        i19.g gVar = this.f170211b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        a aVar = this.f170212c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        h hVar = this.d;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }
}
