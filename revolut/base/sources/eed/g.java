package eed;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ int u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f125183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f125184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f125185y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.D = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((h) this.D, continuation, 0);
                gVar.C = obj2;
                return gVar;
            case 1:
                g gVar2 = new g((h) this.D, continuation, 1);
                gVar2.C = obj2;
                return gVar2;
            default:
                g gVar3 = new g((jtj.k) this.f125183w, (String) this.f125185y, (String) this.f125184x, continuation);
                gVar3.C = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0141 -> B:55:0x0144). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01c9 -> B:71:0x01cc). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eed.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jtj.k kVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f125183w = kVar;
        this.f125185y = str;
        this.f125184x = str2;
    }
}
