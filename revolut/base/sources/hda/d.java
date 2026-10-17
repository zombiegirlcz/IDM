package hda;

import aii.e;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f151400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f151401b;

    public d(wi0.b bVar, xi0.b bVar2) {
        PocketListType.Main pocketListType = PocketListType.Main.f80780a;
        Intrinsics.checkNotNullParameter(pocketListType, "pocketListType");
        this.f151400a = bVar2;
        this.f151401b = bVar;
    }

    public final wi0.b b() {
        return this.f151401b;
    }

    public final xi0.b c() {
        return this.f151400a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        Object obj3 = PocketListType.Main.f80780a;
        return obj3.equals(obj3) && Intrinsics.f(this.f151400a, dVar.f151400a) && Intrinsics.f(this.f151401b, dVar.f151401b);
    }

    public final int hashCode() {
        int iHashCode = PocketListType.Main.f80780a.hashCode() * 31;
        xi0.b bVar = this.f151400a;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wi0.b bVar2 = this.f151401b;
        return iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }
}
