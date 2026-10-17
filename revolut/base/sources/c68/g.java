package c68;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function1 {
    public FeatureCommand u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21703w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, Continuation continuation) {
        super(1, continuation);
        this.f21703w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f21703w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.I2(r1, r18) == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.I2(r1, r18) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c68.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
