package akl;

import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ cjl.g A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Boolean D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public int u;
    public final /* synthetic */ Claim v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f6037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f6038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ cjl.s f6039y;
    public final /* synthetic */ jkl.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Claim claim, k kVar, String str, cjl.s sVar, jkl.i iVar, cjl.g gVar, String str2, String str3, Boolean bool, String str4, String str5, Continuation continuation) {
        super(2, continuation);
        this.v = claim;
        this.f6037w = kVar;
        this.f6038x = str;
        this.f6039y = sVar;
        this.z = iVar;
        this.A = gVar;
        this.B = str2;
        this.C = str3;
        this.D = bool;
        this.E = str4;
        this.F = str5;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f6037w, this.f6038x, this.f6039y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r0 == r14) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r0 == r14) goto L33;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws com.revolut.sso.impl.domain.models.SsoServerError {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
