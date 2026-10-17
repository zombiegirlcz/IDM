package sz7;

import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AmountData f266770b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f266771a;

    static {
        xi0.b.Companion.getClass();
        f266770b = new AmountData(0L, "", xi0.b.f306273h);
    }

    public b(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f266771a = amountFormatter;
    }
}
