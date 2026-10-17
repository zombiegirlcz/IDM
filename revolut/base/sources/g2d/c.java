package g2d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f139959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c() {
        super(2, null);
        this.u = 19;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(2, 0, continuation);
                cVar.f139959w = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(2, 1, continuation);
                cVar2.f139959w = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(2, 2, continuation);
                cVar3.f139959w = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(2, 3, continuation);
                cVar4.f139959w = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(2, 4, continuation);
                cVar5.f139959w = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c(2, 5, continuation);
                cVar6.f139959w = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c(2, 6, continuation);
                cVar7.f139959w = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c(2, 7, continuation);
                cVar8.f139959w = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c(2, 8, continuation);
                cVar9.f139959w = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c(2, 9, continuation);
                cVar10.f139959w = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c(2, 10, continuation);
                cVar11.f139959w = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c(2, 11, continuation);
                cVar12.f139959w = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c(2, 12, continuation);
                cVar13.f139959w = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c(2, 13, continuation);
                cVar14.f139959w = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c(2, 14, continuation);
                cVar15.f139959w = obj2;
                return cVar15;
            case 15:
                c cVar16 = new c(2, 15, continuation);
                cVar16.f139959w = obj2;
                return cVar16;
            case 16:
                c cVar17 = new c(2, 16, continuation);
                cVar17.f139959w = obj2;
                return cVar17;
            case 17:
                c cVar18 = new c(2, 17, continuation);
                cVar18.f139959w = obj2;
                return cVar18;
            case 18:
                c cVar19 = new c(2, 18, continuation);
                cVar19.f139959w = obj2;
                return cVar19;
            case 19:
                c cVar20 = new c(2, 19, continuation);
                cVar20.f139959w = obj2;
                return cVar20;
            case 20:
                c cVar21 = new c(2, 20, continuation);
                cVar21.f139959w = obj2;
                return cVar21;
            case 21:
                c cVar22 = new c(2, 21, continuation);
                cVar22.f139959w = obj2;
                return cVar22;
            case 22:
                c cVar23 = new c(2, 22, continuation);
                cVar23.f139959w = obj2;
                return cVar23;
            case 23:
                c cVar24 = new c(2, 23, continuation);
                cVar24.f139959w = obj2;
                return cVar24;
            case 24:
                c cVar25 = new c(2, 24, continuation);
                cVar25.f139959w = obj2;
                return cVar25;
            case 25:
                c cVar26 = new c(2, 25, continuation);
                cVar26.f139959w = obj2;
                return cVar26;
            case 26:
                c cVar27 = new c(2, 26, continuation);
                cVar27.f139959w = obj2;
                return cVar27;
            case 27:
                c cVar28 = new c(2, 27, continuation);
                cVar28.f139959w = obj2;
                return cVar28;
            case 28:
                c cVar29 = new c(2, 28, continuation);
                cVar29.f139959w = obj2;
                return cVar29;
            default:
                c cVar30 = new c(2, 29, continuation);
                cVar30.f139959w = obj2;
                return cVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:367:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x03b5 -> B:226:0x0396). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2d.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
