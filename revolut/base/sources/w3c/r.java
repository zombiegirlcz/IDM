package w3c;

import com.revolut.feature.address.models.Address;
import d3c.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function1 {
    public Address u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f0 f294292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolut_shop.ui.screen.checkout.a f294294y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f294294y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f294294y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
    
        if (((rv6.e) r4).collect(r6, r23) == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3c.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
