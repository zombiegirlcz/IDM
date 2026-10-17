package bn2;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends gim.i implements Function3 {
    public Collection A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Data I;
    public /* synthetic */ ThemeCustomisationSandboxInteractorImpl$SandboxState J;
    public final /* synthetic */ e0 K;
    public Data u;
    public e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f16994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f16995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f16996y;
    public em2.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, Continuation continuation) {
        super(3, continuation);
        this.K = e0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a0 a0Var = new a0(this.K, (Continuation) obj4);
        a0Var.I = (Data) obj2;
        a0Var.J = (ThemeCustomisationSandboxInteractorImpl$SandboxState) obj3;
        return a0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:34:0x0110, B:36:0x0122, B:37:0x013e, B:38:0x0149, B:17:0x0096, B:19:0x009c, B:22:0x00a6, B:30:0x00c2, B:39:0x0153, B:41:0x015b, B:13:0x005b, B:15:0x0061), top: B:45:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:34:0x0110, B:36:0x0122, B:37:0x013e, B:38:0x0149, B:17:0x0096, B:19:0x009c, B:22:0x00a6, B:30:0x00c2, B:39:0x0153, B:41:0x015b, B:13:0x005b, B:15:0x0061), top: B:45:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:34:0x0110, B:36:0x0122, B:37:0x013e, B:38:0x0149, B:17:0x0096, B:19:0x009c, B:22:0x00a6, B:30:0x00c2, B:39:0x0153, B:41:0x015b, B:13:0x005b, B:15:0x0061), top: B:45:0x005b }] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x010a -> B:34:0x0110). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn2.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
