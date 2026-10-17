package mti;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ bti.i A;
    public long u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f208847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f208848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f208849y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, bti.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f208849y = gVar;
        this.z = str;
        this.A = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f208849y, this.z, this.A, continuation);
        eVar.f208848x = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (r2.emit(r0, r11) == r9) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d1, blocks: (B:23:0x006a, B:25:0x0070, B:30:0x0088, B:35:0x009a, B:34:0x0092, B:29:0x0080, B:20:0x004a), top: B:71:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:41:0x00b0, B:43:0x00b8, B:37:0x00a6, B:50:0x00d4, B:52:0x00dd, B:55:0x00eb, B:57:0x00ef, B:60:0x0104, B:61:0x0109), top: B:70:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:41:0x00b0, B:43:0x00b8, B:37:0x00a6, B:50:0x00d4, B:52:0x00dd, B:55:0x00eb, B:57:0x00ef, B:60:0x0104, B:61:0x0109), top: B:70:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mti.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
