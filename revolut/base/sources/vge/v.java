package vge;

import com.revolut.feature.tab.accounts.api.model.AccountBackground;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public AccountBackground A;
    public Object B;
    public Collection C;
    public int D;
    public int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ArrayList I;
    public final /* synthetic */ x J;
    public x u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f289035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ProductId f289036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ProductAccount.ValueItem f289037y;
    public ld6.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList, x xVar, Continuation continuation) {
        super(2, continuation);
        this.I = arrayList;
        this.J = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v vVar = new v(this.I, this.J, continuation);
        vVar.H = obj2;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0161  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection, ld6.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0136 -> B:7:0x0040). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vge.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
