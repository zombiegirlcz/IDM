package dtc;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f117406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd0.d f117407b;

    public f(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f117406a = countryInteractor;
        this.f117407b = new fd0.d(50);
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        String str;
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        wi0.b bVar = instance.M;
        if (bVar == null || (str = bVar.f297794a) == null) {
            return;
        }
        fd0.d dVar = this.f117407b;
        String strB = (String) dVar.c(str);
        if (strB == null) {
            strB = ((o8b.c) this.f117406a).b(str);
            dVar.d(str, strB);
        }
        targetCollection.add(str);
        targetCollection.add(strB);
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f117406a, ((f) obj2).f117406a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117406a.hashCode();
    }
}
