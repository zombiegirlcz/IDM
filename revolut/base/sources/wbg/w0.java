package wbg;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a f296212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296212w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w0 w0Var = new w0(this.f296212w, continuation, 0);
                w0Var.v = obj2;
                return w0Var;
            case 1:
                w0 w0Var2 = new w0(this.f296212w, continuation, 1);
                w0Var2.v = obj2;
                return w0Var2;
            case 2:
                w0 w0Var3 = new w0(this.f296212w, continuation, 2);
                w0Var3.v = obj2;
                return w0Var3;
            case 3:
                w0 w0Var4 = new w0(this.f296212w, continuation, 3);
                w0Var4.v = obj2;
                return w0Var4;
            case 4:
                w0 w0Var5 = new w0(this.f296212w, continuation, 4);
                w0Var5.v = obj2;
                return w0Var5;
            case 5:
                w0 w0Var6 = new w0(this.f296212w, continuation, 5);
                w0Var6.v = obj2;
                return w0Var6;
            case 6:
                w0 w0Var7 = new w0(this.f296212w, continuation, 6);
                w0Var7.v = obj2;
                return w0Var7;
            default:
                w0 w0Var8 = new w0(this.f296212w, continuation, 7);
                w0Var8.v = obj2;
                return w0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w0) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v57 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wbg.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
