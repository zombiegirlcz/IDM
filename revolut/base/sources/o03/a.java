package o03;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f221103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d71.a f221104b;

    public a(Data card, d71.a aVar) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f221103a = card;
        this.f221104b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221103a, aVar.f221103a) && Intrinsics.f(this.f221104b, aVar.f221104b);
    }

    public final int hashCode() {
        int iHashCode = this.f221103a.hashCode() * 31;
        d71.a aVar = this.f221104b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
