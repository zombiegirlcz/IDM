package k8k;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f182174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f182175c;

    public a(dj0.d dVar, String link, String str) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f182173a = link;
        this.f182174b = dVar;
        this.f182175c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f182173a, aVar.f182173a) && Intrinsics.f(this.f182174b, aVar.f182174b) && Intrinsics.f(this.f182175c, aVar.f182175c);
    }

    public final int hashCode() {
        int iHashCode = this.f182173a.hashCode() * 31;
        dj0.d dVar = this.f182174b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f182175c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
