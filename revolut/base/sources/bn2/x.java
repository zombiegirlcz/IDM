package bn2;

import android.content.Context;
import android.net.Uri;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ int u = 2;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f17048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17049y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hlm.i iVar, nx1.u uVar, List list, n02.b bVar, Continuation continuation) {
        super(2, continuation);
        this.C = iVar;
        this.D = uVar;
        this.f17048x = list;
        this.f17047w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x((List) this.E, (e0) this.C, continuation);
                xVar.f17047w = obj2;
                return xVar;
            case 1:
                x xVar2 = new x((skm.r) this.A, (jnd.t) this.B, (String) this.f17048x, (LocalDate) this.C, (LocalDate) this.D, this.f17049y, (MutableStateFlow) this.E, continuation);
                xVar2.f17047w = obj2;
                return xVar2;
            case 2:
                return new x((hlm.i) this.C, (nx1.u) this.D, (List) this.f17048x, (n02.b) this.f17047w, continuation);
            default:
                return new x((hlm.i) this.D, (t80.v) this.f17048x, (Context) this.f17047w, (Uri) this.E, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0346  */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0337 -> B:132:0x033e). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hlm.i iVar, t80.v vVar, Context context, Uri uri2, Continuation continuation) {
        super(2, continuation);
        this.D = iVar;
        this.f17048x = vVar;
        this.f17047w = context;
        this.E = uri2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List list, e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.E = list;
        this.C = e0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(skm.r rVar, jnd.t tVar, String str, LocalDate localDate, LocalDate localDate2, int i, MutableStateFlow mutableStateFlow, Continuation continuation) {
        super(2, continuation);
        this.A = rVar;
        this.B = tVar;
        this.f17048x = str;
        this.C = localDate;
        this.D = localDate2;
        this.f17049y = i;
        this.E = mutableStateFlow;
    }
}
