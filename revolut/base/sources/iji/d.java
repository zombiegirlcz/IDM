package iji;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f161800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f161801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f161802y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = i;
        switch (i) {
            case 1:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
            case 2:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
            case 3:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
            case 4:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
            case 5:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
            case 6:
            default:
                this.f161802y = (i) function1;
                break;
            case 7:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
            case 8:
                this.f161802y = (i) function1;
                super(2, continuation);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r1v7, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(0, continuation, (Function1) this.f161802y);
                dVar.f161801x = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(1, continuation, (Function1) this.f161802y);
                dVar2.f161801x = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(2, continuation, (Function1) this.f161802y);
                dVar3.f161801x = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d(3, continuation, (Function1) this.f161802y);
                dVar4.f161801x = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d(4, continuation, (Function1) this.f161802y);
                dVar5.f161801x = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d(5, continuation, (Function1) this.f161802y);
                dVar6.f161801x = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((Function3) this.f161802y, this.v, continuation);
                dVar7.f161801x = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d(7, continuation, (Function1) this.f161802y);
                dVar8.f161801x = obj2;
                return dVar8;
            default:
                d dVar9 = new d(8, continuation, (Function1) this.f161802y);
                dVar9.f161801x = obj2;
                return dVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gim.i, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iji.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function3 function3, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.f161802y = (i) function3;
        this.v = flowCollector;
    }
}
