package n3j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f212154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f212155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f212156c;

    public s(List items, p pVar, m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f212154a = items;
        this.f212155b = pVar;
        this.f212156c = mVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f212154a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f212154a, sVar.f212154a) && Intrinsics.f(this.f212155b, sVar.f212155b) && Intrinsics.f(this.f212156c, sVar.f212156c);
    }

    public final int hashCode() {
        int iHashCode = this.f212154a.hashCode() * 31;
        p pVar = this.f212155b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        m mVar = this.f212156c;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }
}
