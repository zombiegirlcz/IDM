package ukh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.g f280751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f280752c;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data data, d1h.g gVar, Data legalEntityInformation, int i) {
        if ((i & 1) != 0) {
            data = cVar.f280750a;
        }
        if ((i & 2) != 0) {
            gVar = cVar.f280751b;
        }
        if ((i & 4) != 0) {
            legalEntityInformation = cVar.f280752c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(legalEntityInformation, "legalEntityInformation");
        return new c(data, legalEntityInformation, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f280750a, cVar.f280750a) && Intrinsics.f(this.f280751b, cVar.f280751b) && Intrinsics.f(this.f280752c, cVar.f280752c);
    }

    public final int hashCode() {
        Data data = this.f280750a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        d1h.g gVar = this.f280751b;
        return this.f280752c.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }

    public c(Data data, Data legalEntityInformation, d1h.g gVar) {
        Intrinsics.checkNotNullParameter(legalEntityInformation, "legalEntityInformation");
        this.f280750a = data;
        this.f280751b = gVar;
        this.f280752c = legalEntityInformation;
    }

    public /* synthetic */ c(int i) {
        this(null, new Data(null, null, true, 3, null), null);
    }
}
