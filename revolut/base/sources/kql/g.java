package kql;

import com.revolut.sso.api.models.SimBindingEvidence;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends i implements Function2 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public final /* synthetic */ hd.e E;
    public final /* synthetic */ h F;
    public final /* synthetic */ String G;
    public final /* synthetic */ SimBindingEvidence H;
    public final /* synthetic */ Function1 I;
    public hd.e u;
    public h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f188444w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SimBindingEvidence f188445x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f188446y;
    public Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hd.e eVar, h hVar, String str, SimBindingEvidence simBindingEvidence, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.E = eVar;
        this.F = hVar;
        this.G = str;
        this.H = simBindingEvidence;
        this.I = function1;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.E, this.F, this.G, this.H, this.I, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0206  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ce -> B:47:0x01da). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kql.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
