package g4c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f140476b;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data orders, Data cardReaderPaymentFeatureStatus, int i) {
        if ((i & 1) != 0) {
            orders = hVar.f140475a;
        }
        if ((i & 2) != 0) {
            cardReaderPaymentFeatureStatus = hVar.f140476b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        return new h(orders, cardReaderPaymentFeatureStatus);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f140475a, hVar.f140475a) && Intrinsics.f(this.f140476b, hVar.f140476b);
    }

    public final int hashCode() {
        return this.f140476b.hashCode() + (this.f140475a.hashCode() * 31);
    }

    public h(Data orders, Data cardReaderPaymentFeatureStatus) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(cardReaderPaymentFeatureStatus, "cardReaderPaymentFeatureStatus");
        this.f140475a = orders;
        this.f140476b = cardReaderPaymentFeatureStatus;
    }

    public /* synthetic */ h(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
