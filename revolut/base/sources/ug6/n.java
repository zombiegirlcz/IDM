package ug6;

import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ ExternalAccountTopupPayload.LinkedAccountPayload v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f279959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f279960x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ExternalAccountTopupPayload.LinkedAccountPayload linkedAccountPayload, v vVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = linkedAccountPayload;
        this.f279959w = vVar;
        this.f279960x = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f279959w, this.f279960x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r2 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r2 != r1) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug6.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
