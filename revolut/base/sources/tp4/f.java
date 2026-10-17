package tp4;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDirectDebitMandate f273268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f273269b;

    public f(CreditCardDirectDebitMandate mandate, Image accountImage) {
        Intrinsics.checkNotNullParameter(mandate, "mandate");
        Intrinsics.checkNotNullParameter(accountImage, "accountImage");
        this.f273268a = mandate;
        this.f273269b = accountImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f273268a, fVar.f273268a) && Intrinsics.f(this.f273269b, fVar.f273269b);
    }

    public final int hashCode() {
        return this.f273269b.hashCode() + (this.f273268a.hashCode() * 31);
    }
}
