package sak;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.pending_payments.api.models.PendingPaymentInfo$TimerInfo;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f261445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f261446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f261447c;
    public final xi0.b d;
    public final Image e;
    public final TextClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f261448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingPaymentInfo$TimerInfo f261449h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f261450j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(TextLocalisedClause title, Image schemeIcon, dj0.d money, Image merchantIcon, TextClause merchantName, TextClause textClause, PendingPaymentInfo$TimerInfo pendingPaymentInfo$TimerInfo, Object paymentModel, f extraInfo) {
        this(title, schemeIcon, money, money.f115083b, merchantIcon, merchantName, textClause, pendingPaymentInfo$TimerInfo, paymentModel, extraInfo);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(schemeIcon, "schemeIcon");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(merchantIcon, "merchantIcon");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(paymentModel, "paymentModel");
        Intrinsics.checkNotNullParameter(extraInfo, "extraInfo");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f261445a, gVar.f261445a) && Intrinsics.f(this.f261446b, gVar.f261446b) && Intrinsics.f(this.f261447c, gVar.f261447c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f261448g, gVar.f261448g) && Intrinsics.f(this.f261449h, gVar.f261449h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f261450j, gVar.f261450j);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f261446b, this.f261445a.hashCode() * 31, 31);
        dj0.d dVar = this.f261447c;
        int iB = v7.b(a10.b.c(this.e, l.j(this.d, (iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31, this.f);
        Clause clause = this.f261448g;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        PendingPaymentInfo$TimerInfo pendingPaymentInfo$TimerInfo = this.f261449h;
        return this.f261450j.hashCode() + p.a.b((iHashCode + (pendingPaymentInfo$TimerInfo != null ? pendingPaymentInfo$TimerInfo.hashCode() : 0)) * 31, 31, this.i);
    }

    public g(TextLocalisedClause title, Image schemeIcon, dj0.d dVar, xi0.b targetCurrency, Image merchantIcon, TextClause merchantName, Clause clause, PendingPaymentInfo$TimerInfo pendingPaymentInfo$TimerInfo, Object paymentModel, f extraInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(schemeIcon, "schemeIcon");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(merchantIcon, "merchantIcon");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(paymentModel, "paymentModel");
        Intrinsics.checkNotNullParameter(extraInfo, "extraInfo");
        this.f261445a = title;
        this.f261446b = schemeIcon;
        this.f261447c = dVar;
        this.d = targetCurrency;
        this.e = merchantIcon;
        this.f = merchantName;
        this.f261448g = clause;
        this.f261449h = pendingPaymentInfo$TimerInfo;
        this.i = paymentModel;
        this.f261450j = extraInfo;
    }
}
