package nrh;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.wealth_protection.sso.impl.ui.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f218645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f218646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f218647y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.wealth_protection.sso.impl.ui.a aVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f218645w = str;
        this.f218646x = str2;
        this.f218647y = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f218645w, this.f218646x, this.f218647y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ba, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        if (r10 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nrh.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
