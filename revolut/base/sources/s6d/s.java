package s6d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.branding.impl.ui.settings.a f260255w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.shared.branding.impl.ui.settings.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f260255w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f260255w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f260255w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            default:
                s sVar3 = new s(this.f260255w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                ((s) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 1:
                return ((s) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6d.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
