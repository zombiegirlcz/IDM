package tk9;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ukm.z;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(2, 0, continuation);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(2, 1, continuation);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(2, 2, continuation);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(2, 3, continuation);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(2, 4, continuation);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i(2, 5, continuation);
                iVar6.v = ((z) obj2).f280843a;
                return iVar6;
            case 6:
                i iVar7 = new i(2, 6, continuation);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i(2, 7, continuation);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i(2, 8, continuation);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                i iVar10 = new i(2, 9, continuation);
                iVar10.v = obj2;
                return iVar10;
            case 10:
                i iVar11 = new i(2, 10, continuation);
                iVar11.v = obj2;
                return iVar11;
            case 11:
                i iVar12 = new i(2, 11, continuation);
                iVar12.v = obj2;
                return iVar12;
            case 12:
                i iVar13 = new i(2, 12, continuation);
                iVar13.v = obj2;
                return iVar13;
            case 13:
                i iVar14 = new i(2, 13, continuation);
                iVar14.v = obj2;
                return iVar14;
            case 14:
                i iVar15 = new i(2, 14, continuation);
                iVar15.v = obj2;
                return iVar15;
            case 15:
                i iVar16 = new i(2, 15, continuation);
                iVar16.v = obj2;
                return iVar16;
            case 16:
                i iVar17 = new i(2, 16, continuation);
                iVar17.v = obj2;
                return iVar17;
            case 17:
                i iVar18 = new i(2, 17, continuation);
                iVar18.v = obj2;
                return iVar18;
            case 18:
                i iVar19 = new i(2, 18, continuation);
                iVar19.v = obj2;
                return iVar19;
            case 19:
                i iVar20 = new i(2, 19, continuation);
                iVar20.v = obj2;
                return iVar20;
            case 20:
                i iVar21 = new i(2, 20, continuation);
                iVar21.v = obj2;
                return iVar21;
            case 21:
                i iVar22 = new i(2, 21, continuation);
                iVar22.v = obj2;
                return iVar22;
            case 22:
                i iVar23 = new i(2, 22, continuation);
                iVar23.v = obj2;
                return iVar23;
            case 23:
                i iVar24 = new i(2, 23, continuation);
                iVar24.v = obj2;
                return iVar24;
            case 24:
                i iVar25 = new i(2, 24, continuation);
                iVar25.v = obj2;
                return iVar25;
            case 25:
                i iVar26 = new i(2, 25, continuation);
                iVar26.v = obj2;
                return iVar26;
            case 26:
                i iVar27 = new i(2, 26, continuation);
                iVar27.v = obj2;
                return iVar27;
            case 27:
                i iVar28 = new i(2, 27, continuation);
                iVar28.v = obj2;
                return iVar28;
            case 28:
                i iVar29 = new i(2, 28, continuation);
                iVar29.v = obj2;
                return iVar29;
            default:
                i iVar30 = new i(2, 29, continuation);
                iVar30.v = obj2;
                return iVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 5:
                Object obj4 = ((z) obj2).f280843a;
                i iVar = new i(2, 5, (Continuation) obj3);
                iVar.v = obj4;
                break;
        }
        return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tk9.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
