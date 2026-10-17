package lmg;

import fmg.u;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int u = 2;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f197066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f197067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f197068y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.shared.branding.impl.ui.settings.a aVar, File file, String str, Continuation continuation) {
        super(2, continuation);
        this.D = aVar;
        this.E = file;
        this.F = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((u) this.F, (k7i.i) this.B, continuation);
                qVar.E = obj2;
                return qVar;
            case 1:
                return new q((hlm.i) this.C, (nx1.u) this.D, (n02.b) this.E, this.f197068y, (List) this.F, continuation);
            case 2:
                return new q((com.revolut.feature.shared.branding.impl.ui.settings.a) this.D, (File) this.E, (String) this.F, continuation);
            default:
                q qVar2 = new q((List) this.A, (LocalDate) this.B, (wdb.n) this.C, (String) this.D, (LocalTime) this.F, this.f197068y, continuation);
                qVar2.E = obj2;
                return qVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cc  */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v46, types: [kotlin.coroutines.CoroutineContext, skm.d0] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0103 -> B:28:0x0106). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0229 -> B:64:0x022a). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lmg.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, k7i.i iVar, Continuation continuation) {
        super(2, continuation);
        this.F = uVar;
        this.B = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hlm.i iVar, nx1.u uVar, n02.b bVar, int i, List list, Continuation continuation) {
        super(2, continuation);
        this.C = iVar;
        this.D = uVar;
        this.E = bVar;
        this.f197068y = i;
        this.F = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, LocalDate localDate, wdb.n nVar, String str, LocalTime localTime, int i, Continuation continuation) {
        super(2, continuation);
        this.A = list;
        this.B = localDate;
        this.C = nVar;
        this.D = str;
        this.F = localTime;
        this.f197068y = i;
    }
}
