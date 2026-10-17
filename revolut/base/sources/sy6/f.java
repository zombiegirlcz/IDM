package sy6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr6.a f266631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sr6.a f266632c;
    public final sr6.b d;

    public f() {
        this(0);
    }

    public static f a(f fVar, sr6.a aVar, sr6.a aVar2, sr6.b bVar, int i) {
        Data invoiceSettings = fVar.f266630a;
        if ((i & 2) != 0) {
            aVar = fVar.f266631b;
        }
        if ((i & 4) != 0) {
            aVar2 = fVar.f266632c;
        }
        if ((i & 8) != 0) {
            bVar = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
        return new f(invoiceSettings, aVar, aVar2, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266630a, fVar.f266630a) && this.f266631b == fVar.f266631b && this.f266632c == fVar.f266632c && this.d == fVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f266630a.hashCode() * 31;
        sr6.a aVar = this.f266631b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        sr6.a aVar2 = this.f266632c;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        sr6.b bVar = this.d;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public f(Data invoiceSettings, sr6.a aVar, sr6.a aVar2, sr6.b bVar) {
        Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
        this.f266630a = invoiceSettings;
        this.f266631b = aVar;
        this.f266632c = aVar2;
        this.d = bVar;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), null, null, null);
    }
}
