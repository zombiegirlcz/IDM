package zbj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f320920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f320921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f320922c;
    public final od0.i d;
    public final od0.i e;
    public final CircleActionButtonsBarDelegate.CircleActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DisclaimerParams f320923g;

    public o(xi0.b currency, Data addressData, Data blockchains, od0.i selectedBlockchain, od0.i minimumDeposit, CircleActionButtonsBarDelegate.CircleActionButton circleActionButton, DisclaimerParams disclaimerParams) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        this.f320920a = currency;
        this.f320921b = addressData;
        this.f320922c = blockchains;
        this.d = selectedBlockchain;
        this.e = minimumDeposit;
        this.f = circleActionButton;
        this.f320923g = disclaimerParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f320920a, oVar.f320920a) && Intrinsics.f(this.f320921b, oVar.f320921b) && Intrinsics.f(this.f320922c, oVar.f320922c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f320923g, oVar.f320923g);
    }

    public final int hashCode() {
        int iF = r6.b.f(this.e, r6.b.f(this.d, kii.e.c(this.f320922c, kii.e.c(this.f320921b, this.f320920a.hashCode() * 31, 31), 31), 31), 31);
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton = this.f;
        int iHashCode = (iF + (circleActionButton == null ? 0 : circleActionButton.hashCode())) * 31;
        DisclaimerParams disclaimerParams = this.f320923g;
        return iHashCode + (disclaimerParams != null ? disclaimerParams.hashCode() : 0);
    }
}
