package gq4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f145544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f145545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardModelAction.Contextual f145546c;

    public e(TextLocalisedClause text, LargeActionButton.ButtonStyle.DefaultFilledButton style, CreditCardModelAction.Contextual parcel) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f145544a = text;
        this.f145545b = style;
        this.f145546c = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f145544a.equals(eVar.f145544a) && Intrinsics.f(this.f145545b, eVar.f145545b) && this.f145546c.equals(eVar.f145546c);
    }

    public final int hashCode() {
        return this.f145546c.f68847a.hashCode() + j6.a.c(r6.b.d(this.f145545b, this.f145544a.hashCode() * 31, 31), 31, true);
    }
}
