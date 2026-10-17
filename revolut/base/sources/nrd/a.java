package nrd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f218609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vzi.b f218610b;

    public a(Data categoriesData, vzi.b bVar) {
        Intrinsics.checkNotNullParameter(categoriesData, "categoriesData");
        this.f218609a = categoriesData;
        this.f218610b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f218609a, aVar.f218609a) && this.f218610b == aVar.f218610b;
    }

    public final int hashCode() {
        int iHashCode = this.f218609a.hashCode() * 31;
        vzi.b bVar = this.f218610b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
