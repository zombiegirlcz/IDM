package g03;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b f139277w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f139277w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f139277w, continuation, 0);
            case 1:
                return new t(this.f139277w, continuation, 1);
            case 2:
                return new t(this.f139277w, continuation, 2);
            case 3:
                return new t(this.f139277w, continuation, 3);
            case 4:
                return new t(this.f139277w, continuation, 4);
            case 5:
                return new t(this.f139277w, continuation, 5);
            default:
                return new t(this.f139277w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws com.revolut.feature.cards.models.exceptions.CardLimitReachedException.DailyLimitReached {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g03.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
