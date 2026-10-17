package ybj;

import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MeshEvent.TransferCompleted.Success f312379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MeshEvent.IntegrationConnected f312380x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar, MeshEvent.TransferCompleted.Success success, MeshEvent.IntegrationConnected integrationConnected, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f312379w = success;
        this.f312380x = integrationConnected;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f312379w, this.f312380x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r2 != r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ybj.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
