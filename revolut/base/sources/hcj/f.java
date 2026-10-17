package hcj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f150904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f150905b;

    public f(Data addressesData, xi0.b currency) {
        Intrinsics.checkNotNullParameter(addressesData, "addressesData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f150904a = addressesData;
        this.f150905b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f150904a, fVar.f150904a) && Intrinsics.f(this.f150905b, fVar.f150905b);
    }

    public final int hashCode() {
        return this.f150905b.hashCode() + (this.f150904a.hashCode() * 31);
    }
}
