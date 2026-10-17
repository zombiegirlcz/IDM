package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class h4 extends gim.i implements Function1 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f113990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f113991x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h4(long j2, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.f113990w = j2;
        this.f113991x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h4(this.f113990w, (Function1) this.f113991x, continuation);
            case 1:
                return new h4((kmk.f) this.f113991x, this.f113990w, continuation);
            default:
                return new h4((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.f113991x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h4) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001e, B:27:0x007e, B:29:0x0088, B:32:0x0099, B:31:0x0091, B:15:0x002d, B:24:0x006f, B:20:0x004f), top: B:65:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:8:0x001e, B:27:0x007e, B:29:0x0088, B:32:0x0099, B:31:0x0091, B:15:0x002d, B:24:0x006f, B:20:0x004f), top: B:65:0x0018 }] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.h4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar, Continuation continuation) {
        super(1, continuation);
        this.f113991x = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(kmk.f fVar, long j2, Continuation continuation) {
        super(1, continuation);
        this.f113991x = fVar;
        this.f113990w = j2;
    }
}
