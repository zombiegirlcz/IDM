package h4g;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pjl.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public int A;
    public int B;
    public String C;
    public Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public Object G;
    public final /* synthetic */ int u = 0;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f149357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f149358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f149359y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.E = eVar;
        this.F = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((e) this.E, (String) this.F, continuation);
                dVar.v = obj2;
                return dVar;
            default:
                return new d((z0) this.F, (cjl.b) this.G, this.C, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c3, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ab -> B:25:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01b1 -> B:58:0x01b6). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4g.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z0 z0Var, cjl.b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.F = z0Var;
        this.G = bVar;
        this.C = str;
    }
}
