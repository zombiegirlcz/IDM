package c2d;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f20760y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Drawable drawable, Drawable drawable2, qo0.c cVar, int i, int i2, int i3, Integer num, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f20760y = drawable;
        this.z = drawable2;
        this.A = cVar;
        this.v = i;
        this.f20758w = i2;
        this.f20759x = i3;
        this.B = num;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y((z) this.B, continuation, 0);
                yVar.A = obj2;
                return yVar;
            case 1:
                return new y((gsh.n) this.B, continuation, 1);
            default:
                return new y((Drawable) this.f20760y, (Drawable) this.z, (qo0.c) this.A, this.v, this.f20758w, this.f20759x, (Integer) this.B, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0388 A[Catch: all -> 0x027d, CancellationException -> 0x0280, TryCatch #8 {CancellationException -> 0x0280, all -> 0x027d, blocks: (B:91:0x0276, B:153:0x03a3, B:155:0x03ab, B:148:0x0384, B:150:0x0388), top: B:192:0x0234 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf A[Catch: all -> 0x01de, TRY_LEAVE, TryCatch #7 {all -> 0x01de, blocks: (B:56:0x01bb, B:58:0x01bf), top: B:190:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e6 A[Catch: Exception -> 0x010d, WidgetRemoteRepository$ContentNotModifiedException -> 0x0221, TryCatch #7 {WidgetRemoteRepository$ContentNotModifiedException -> 0x0221, Exception -> 0x010d, blocks: (B:25:0x0108, B:65:0x01e1, B:67:0x01e6, B:70:0x0201, B:71:0x0208, B:72:0x020b, B:37:0x0138, B:40:0x0144, B:52:0x019b, B:43:0x014c, B:49:0x017b, B:46:0x0155), top: B:194:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0201 A[Catch: Exception -> 0x010d, WidgetRemoteRepository$ContentNotModifiedException -> 0x0221, TryCatch #7 {WidgetRemoteRepository$ContentNotModifiedException -> 0x0221, Exception -> 0x010d, blocks: (B:25:0x0108, B:65:0x01e1, B:67:0x01e6, B:70:0x0201, B:71:0x0208, B:72:0x020b, B:37:0x0138, B:40:0x0144, B:52:0x019b, B:43:0x014c, B:49:0x017b, B:46:0x0155), top: B:194:0x00fc }] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2d.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.B = obj2;
    }
}
