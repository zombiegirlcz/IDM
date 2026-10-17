package d3i;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrderDraft f111158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f111159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qta.c f111160c;
    public final AnimationRequest d;

    public a(ExchangeOrderDraft draft, Data plot, qta.c cVar, AnimationRequest animationRequest) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(plot, "plot");
        this.f111158a = draft;
        this.f111159b = plot;
        this.f111160c = cVar;
        this.d = animationRequest;
    }

    public static a d(a aVar, ExchangeOrderDraft draft, Data plot, qta.c cVar, AnimationRequest animationRequest, int i) {
        if ((i & 1) != 0) {
            draft = aVar.f111158a;
        }
        if ((i & 2) != 0) {
            plot = aVar.f111159b;
        }
        if ((i & 4) != 0) {
            cVar = aVar.f111160c;
        }
        if ((i & 8) != 0) {
            animationRequest = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(plot, "plot");
        return new a(draft, plot, cVar, animationRequest);
    }

    @Override // d3i.c
    public final qta.c A() {
        return this.f111160c;
    }

    @Override // d3i.c
    public final xi0.b a() {
        return this.f111158a.f96879a.f96897a;
    }

    @Override // d3i.c
    public final xi0.b b() {
        return this.f111158a.f96880b.f96897a;
    }

    @Override // d3i.c
    public final Data c() {
        return this.f111159b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f111158a, aVar.f111158a) && Intrinsics.f(this.f111159b, aVar.f111159b) && Intrinsics.f(this.f111160c, aVar.f111160c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f111159b, this.f111158a.hashCode() * 31, 31);
        qta.c cVar = this.f111160c;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        AnimationRequest animationRequest = this.d;
        return iHashCode + (animationRequest != null ? animationRequest.hashCode() : 0);
    }
}
