package x23;

import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardPersonalisationController v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CardPersonalisationController cardPersonalisationController, gim.c cVar) {
        super(cVar);
        this.v = cardPersonalisationController;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f302466w |= Integer.MIN_VALUE;
        return this.v.f3(this);
    }
}
