package s5g;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.flights.api.R$string;
import dec.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f260075a;

    public i(q paymentMethodsCommonMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        this.f260075a = paymentMethodsCommonMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("FLIGHTS_CHECKOUT_PAY_WITH_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_checkout_payment_methods_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
