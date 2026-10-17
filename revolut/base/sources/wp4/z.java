package wp4;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDirectDebitMandate f299093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f299094b;

    public z(CreditCardDirectDebitMandate mandate, Image accountImage) {
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(accountImage, "accountImage");
        this.f299093a = mandate;
        this.f299094b = accountImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f299093a, zVar.f299093a) && Intrinsics.f(this.f299094b, zVar.f299094b);
    }

    public final int hashCode() {
        return this.f299094b.hashCode() + (this.f299093a.hashCode() * 31);
    }
}
