package hbg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b f150725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150725w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f150725w, continuation, 0);
            case 1:
                return new z(this.f150725w, continuation, 1);
            case 2:
                return new z(this.f150725w, continuation, 2);
            case 3:
                return new z(this.f150725w, continuation, 3);
            case 4:
                return new z(this.f150725w, continuation, 4);
            case 5:
                return new z(this.f150725w, continuation, 5);
            case 6:
                return new z(this.f150725w, continuation, 6);
            case 7:
                return new z(this.f150725w, continuation, 7);
            default:
                return new z(this.f150725w, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hbg.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
