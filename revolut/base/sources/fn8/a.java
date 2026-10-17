package fn8;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountDetails f136545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f136546b;

    public a(SavingsAccountDetails savingsAccountDetails, Image background) {
        Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f136545a = savingsAccountDetails;
        this.f136546b = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136545a, aVar.f136545a) && Intrinsics.f(this.f136546b, aVar.f136546b);
    }

    public final int hashCode() {
        return this.f136546b.hashCode() + (this.f136545a.hashCode() * 31);
    }
}
