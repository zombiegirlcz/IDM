package m84;

import com.revolut.data.model.Data;
import gim.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m9d.z;
import nii.n1;
import yhm.r;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i) {
        super(2, null);
        this.u = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(2, 0, continuation);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(2, 1, continuation);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(2, 2, continuation);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(2, 3, continuation);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(2, 4, continuation);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c(2, 5, continuation);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c(2, 6, continuation);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c(2, 7, continuation);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c(2, 8, continuation);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c(2, 9, continuation);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c(2, 10, continuation);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c(2, 11, continuation);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c(2, 12, continuation);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c(2, 13, continuation);
                cVar14.v = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c(2, 14, continuation);
                cVar15.v = obj2;
                return cVar15;
            case 15:
                c cVar16 = new c(2, 15, continuation);
                cVar16.v = obj2;
                return cVar16;
            case 16:
                c cVar17 = new c(2, 16, continuation);
                cVar17.v = obj2;
                return cVar17;
            case 17:
                c cVar18 = new c(2, 17, continuation);
                cVar18.v = obj2;
                return cVar18;
            case 18:
                c cVar19 = new c(2, 18, continuation);
                cVar19.v = obj2;
                return cVar19;
            case 19:
                c cVar20 = new c(2, 19, continuation);
                cVar20.v = obj2;
                return cVar20;
            case 20:
                c cVar21 = new c(2, 20, continuation);
                cVar21.v = obj2;
                return cVar21;
            case 21:
                c cVar22 = new c(2, 21, continuation);
                cVar22.v = obj2;
                return cVar22;
            case 22:
                c cVar23 = new c(2, 22, continuation);
                cVar23.v = obj2;
                return cVar23;
            case 23:
                c cVar24 = new c(2, 23, continuation);
                cVar24.v = obj2;
                return cVar24;
            case 24:
                c cVar25 = new c(2, 24, continuation);
                cVar25.v = obj2;
                return cVar25;
            case 25:
                c cVar26 = new c(2, 25, continuation);
                cVar26.v = obj2;
                return cVar26;
            case 26:
                c cVar27 = new c(2, 26, continuation);
                cVar27.v = obj2;
                return cVar27;
            case 27:
                c cVar28 = new c(2, 27, continuation);
                cVar28.v = obj2;
                return cVar28;
            case 28:
                c cVar29 = new c(2, 28, continuation);
                cVar29.v = obj2;
                return cVar29;
            default:
                c cVar30 = new c(2, 29, continuation);
                cVar30.v = obj2;
                return cVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                ((c) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 10:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((IllegalStateException) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m84.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
