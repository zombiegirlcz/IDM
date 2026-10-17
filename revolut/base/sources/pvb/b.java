package pvb;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f240043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f240044b;

    public b() {
        this(0);
    }

    public static b a(b bVar, Data productStatus, Data personalizedThirdPartyPromotion, int i) {
        if ((i & 1) != 0) {
            productStatus = bVar.f240043a;
        }
        if ((i & 2) != 0) {
            personalizedThirdPartyPromotion = bVar.f240044b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(productStatus, "productStatus");
        Intrinsics.checkNotNullParameter(personalizedThirdPartyPromotion, "personalizedThirdPartyPromotion");
        return new b(productStatus, personalizedThirdPartyPromotion);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f240043a, bVar.f240043a) && Intrinsics.f(this.f240044b, bVar.f240044b);
    }

    public final int hashCode() {
        return this.f240044b.hashCode() + (this.f240043a.hashCode() * 31);
    }

    public b(Data productStatus, Data personalizedThirdPartyPromotion) {
        Intrinsics.checkNotNullParameter(productStatus, "productStatus");
        Intrinsics.checkNotNullParameter(personalizedThirdPartyPromotion, "personalizedThirdPartyPromotion");
        this.f240043a = productStatus;
        this.f240044b = personalizedThirdPartyPromotion;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
