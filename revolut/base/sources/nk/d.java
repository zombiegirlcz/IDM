package nk;

import com.meshconnect.link.entity.LinkEvent;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ String A;
    public hlm.a u;
    public f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f216609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinkEvent.Payload f216610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f216611y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.z = fVar;
        this.A = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return new d(this.z, this.A, (Continuation) obj3).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r2 == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:8:0x0018, B:38:0x00ba, B:40:0x00c8, B:42:0x00ce, B:45:0x00d4, B:13:0x0029, B:26:0x006f, B:28:0x0077, B:30:0x007e, B:33:0x00b0), top: B:52:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:8:0x0018, B:38:0x00ba, B:40:0x00c8, B:42:0x00ce, B:45:0x00d4, B:13:0x0029, B:26:0x006f, B:28:0x0077, B:30:0x007e, B:33:0x00b0), top: B:52:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:8:0x0018, B:38:0x00ba, B:40:0x00c8, B:42:0x00ce, B:45:0x00d4, B:13:0x0029, B:26:0x006f, B:28:0x0077, B:30:0x007e, B:33:0x00b0), top: B:52:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x002d, blocks: (B:8:0x0018, B:38:0x00ba, B:40:0x00c8, B:42:0x00ce, B:45:0x00d4, B:13:0x0029, B:26:0x006f, B:28:0x0077, B:30:0x007e, B:33:0x00b0), top: B:52:0x0008 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
