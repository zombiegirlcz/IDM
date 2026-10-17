package j53;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_personalisation.generation.impl.ui.generation.a f171487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f171488x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171487w = aVar;
        this.f171488x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f171487w, this.f171488x, continuation, 0);
            default:
                return new r(this.f171487w, this.f171488x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f A[Catch: Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:39:0x00b4, B:48:0x00c8, B:50:0x00d2, B:53:0x00f2, B:60:0x0108, B:63:0x0113, B:64:0x0118, B:65:0x0119, B:66:0x0124, B:67:0x012f, B:69:0x013c, B:70:0x013f, B:45:0x00c1), top: B:80:0x00ae }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0110 -> B:48:0x00c8). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j53.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
