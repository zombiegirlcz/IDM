package lw2;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    public static CompositeClause a(SharedRevolutCardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        f0 f0Var = ((RetailCardWrapper) cardWrapper).f64444b;
        return v04.b.J(f0Var, f0Var.f150111b, null, null, 14);
    }
}
