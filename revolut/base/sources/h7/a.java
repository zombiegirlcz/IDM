package h7;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ u B;
    public final /* synthetic */ r C;
    public final /* synthetic */ MutableState D;
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f149758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f149759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d7.j f149760y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z, boolean z3, b bVar, d7.j jVar, int i, float f, u uVar, r rVar, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f149758w = z3;
        this.f149759x = bVar;
        this.f149760y = jVar;
        this.z = i;
        this.A = f;
        this.B = uVar;
        this.C = rVar;
        this.D = mutableState;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f149758w, this.f149759x, this.f149760y, this.z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        if (a1m.e.e(r0, r17.f149760y, r17.z, r17.A, r17.B, r5, r17.C, r17, ch.qos.logback.core.net.SyslogConstants.SYSLOG_PORT) == r9) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
