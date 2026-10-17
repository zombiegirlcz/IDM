package xkl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public String u;
    public jn0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f306881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f306882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f306883y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f306882x = iVar;
        this.f306883y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f306882x, this.f306883y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        if (r10.d3(r5, r8, r19) == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:16:0x0033, B:44:0x00f0, B:46:0x00f6, B:47:0x0107, B:49:0x010b, B:51:0x010f, B:54:0x0114, B:55:0x0119, B:56:0x011a), top: B:69:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:16:0x0033, B:44:0x00f0, B:46:0x00f6, B:47:0x0107, B:49:0x010b, B:51:0x010f, B:54:0x0114, B:55:0x0119, B:56:0x011a), top: B:69:0x0033 }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xkl.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
