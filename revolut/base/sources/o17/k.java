package o17;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f221324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f221325b;

    public k() {
        this(0);
    }

    public static k a(k kVar, Data actionsInfoData, Data saleInfoData, int i) {
        if ((i & 1) != 0) {
            actionsInfoData = kVar.f221324a;
        }
        if ((i & 2) != 0) {
            saleInfoData = kVar.f221325b;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(actionsInfoData, "actionsInfoData");
        Intrinsics.checkNotNullParameter(saleInfoData, "saleInfoData");
        return new k(actionsInfoData, saleInfoData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f221324a, kVar.f221324a) && Intrinsics.f(this.f221325b, kVar.f221325b);
    }

    public final int hashCode() {
        return this.f221325b.hashCode() + (this.f221324a.hashCode() * 31);
    }

    public k(Data actionsInfoData, Data saleInfoData) {
        Intrinsics.checkNotNullParameter(actionsInfoData, "actionsInfoData");
        Intrinsics.checkNotNullParameter(saleInfoData, "saleInfoData");
        this.f221324a = actionsInfoData;
        this.f221325b = saleInfoData;
    }

    public /* synthetic */ k(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
