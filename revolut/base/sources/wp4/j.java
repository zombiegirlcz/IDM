package wp4;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDirectDebitMandate f299067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f299068b;

    public j(CreditCardDirectDebitMandate mandate, Image accountImage) {
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(accountImage, "accountImage");
        this.f299067a = mandate;
        this.f299068b = accountImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f299067a, jVar.f299067a) && Intrinsics.f(this.f299068b, jVar.f299068b);
    }

    public final int hashCode() {
        return this.f299068b.hashCode() + (this.f299067a.hashCode() * 31);
    }
}
