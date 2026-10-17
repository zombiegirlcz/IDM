package ip0;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f164416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyClause f164417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f164418c;
    public final String d;
    public final CurrencyImage e;
    public final AnimationRequest f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f164419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsContext f164420h;

    public gg0(xi0.b currency, CurrencyClause label, String str, String amount, CurrencyImage image, AnimationRequest animationRequest, int i, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f164416a = currency;
        this.f164417b = label;
        this.f164418c = str;
        this.d = amount;
        this.e = image;
        this.f = animationRequest;
        this.f164419g = i;
        this.f164420h = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gg0)) {
            return false;
        }
        gg0 gg0Var = (gg0) obj2;
        return Intrinsics.f(this.f164416a, gg0Var.f164416a) && this.f164417b.equals(gg0Var.f164417b) && Intrinsics.f(this.f164418c, gg0Var.f164418c) && this.d.equals(gg0Var.d) && this.e.equals(gg0Var.e) && Intrinsics.f(this.f, gg0Var.f) && this.f164419g == gg0Var.f164419g && this.f164420h.equals(gg0Var.f164420h);
    }

    public final int hashCode() {
        int iHashCode = (this.f164417b.hashCode() + (this.f164416a.hashCode() * 31)) * 31;
        String str = this.f164418c;
        int iHashCode2 = (this.e.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
        AnimationRequest animationRequest = this.f;
        return AnalyticsContext.a(this.f164420h.f50296a) + j6.a.b(this.f164419g, (iHashCode2 + (animationRequest != null ? animationRequest.hashCode() : 0)) * 31, 31);
    }
}
