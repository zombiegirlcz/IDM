package pjl;

import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.impl.domain.models.SessionToken;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
public final class o0 extends gim.i implements Function2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final /* synthetic */ z0 F;
    public final /* synthetic */ cjl.b G;
    public z0 u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f236834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RevolutAccount f236835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SessionToken f236836y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(z0 z0Var, cjl.b bVar, Continuation continuation) {
        super(2, continuation);
        this.F = z0Var;
        this.G = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o0(this.F, this.G, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r2 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0156, code lost:
    
        r3 = r10;
        r10 = r9;
        r9 = r3;
        r11 = r2;
        r6 = r12;
        r2 = r14;
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0130 -> B:37:0x0135). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjl.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
