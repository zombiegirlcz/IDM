package ku2;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends i implements Function2 {
    public FlowCollector u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f189638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f189639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f189640y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f189640y = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f189640y, continuation);
        gVar.f189639x = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0109 -> B:17:0x003b). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws com.revolut.feature.captcha.api.models.CaptchaError.Timeout {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
