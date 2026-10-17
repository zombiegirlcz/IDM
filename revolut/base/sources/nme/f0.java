package nme;

import ble.f1;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f f217300w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f217300w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(0, this.f217300w, continuation);
                f0Var.v = obj2;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(1, this.f217300w, continuation);
                f0Var2.v = obj2;
                return f0Var2;
            case 2:
                f0 f0Var3 = new f0(2, this.f217300w, continuation);
                f0Var3.v = obj2;
                return f0Var3;
            case 3:
                f0 f0Var4 = new f0(3, this.f217300w, continuation);
                f0Var4.v = obj2;
                return f0Var4;
            case 4:
                f0 f0Var5 = new f0(4, this.f217300w, continuation);
                f0Var5.v = obj2;
                return f0Var5;
            case 5:
                f0 f0Var6 = new f0(5, this.f217300w, continuation);
                f0Var6.v = obj2;
                return f0Var6;
            case 6:
                f0 f0Var7 = new f0(6, this.f217300w, continuation);
                f0Var7.v = obj2;
                return f0Var7;
            case 7:
                f0 f0Var8 = new f0(7, this.f217300w, continuation);
                f0Var8.v = obj2;
                return f0Var8;
            case 8:
                f0 f0Var9 = new f0(8, this.f217300w, continuation);
                f0Var9.v = obj2;
                return f0Var9;
            case 9:
                f0 f0Var10 = new f0(9, this.f217300w, continuation);
                f0Var10.v = obj2;
                return f0Var10;
            case 10:
                f0 f0Var11 = new f0(10, this.f217300w, continuation);
                f0Var11.v = obj2;
                return f0Var11;
            case 11:
                f0 f0Var12 = new f0(11, this.f217300w, continuation);
                f0Var12.v = obj2;
                return f0Var12;
            case 12:
                f0 f0Var13 = new f0(12, this.f217300w, continuation);
                f0Var13.v = obj2;
                return f0Var13;
            case 13:
                f0 f0Var14 = new f0(13, this.f217300w, continuation);
                f0Var14.v = obj2;
                return f0Var14;
            case 14:
                f0 f0Var15 = new f0(14, this.f217300w, continuation);
                f0Var15.v = obj2;
                return f0Var15;
            case 15:
                f0 f0Var16 = new f0(15, this.f217300w, continuation);
                f0Var16.v = obj2;
                return f0Var16;
            case 16:
                f0 f0Var17 = new f0(16, this.f217300w, continuation);
                f0Var17.v = obj2;
                return f0Var17;
            case 17:
                f0 f0Var18 = new f0(17, this.f217300w, continuation);
                f0Var18.v = obj2;
                return f0Var18;
            case 18:
                f0 f0Var19 = new f0(18, this.f217300w, continuation);
                f0Var19.v = obj2;
                return f0Var19;
            case 19:
                f0 f0Var20 = new f0(19, this.f217300w, continuation);
                f0Var20.v = obj2;
                return f0Var20;
            case 20:
                f0 f0Var21 = new f0(20, this.f217300w, continuation);
                f0Var21.v = obj2;
                return f0Var21;
            default:
                f0 f0Var22 = new f0(21, this.f217300w, continuation);
                f0Var22.v = obj2;
                return f0Var22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = this.f217300w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.g0, new nci.q(data, 22));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.g0, new nci.q(data2, 23));
                return Unit.f186387a;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.g0, new nci.q(data3, 24));
                return Unit.f186387a;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new nci.q(data4, 25));
                return Unit.f186387a;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Boolean bool = (Boolean) data5.getContent();
                if (bool != null) {
                    fVar.N2(new lph.c(bool.booleanValue(), 19));
                }
                return Unit.f186387a;
            case 5:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new nci.q(data6, 26));
                return Unit.f186387a;
            case 6:
                Data data7 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new nci.q(data7, 27));
                return Unit.f186387a;
            case 7:
                Data data8 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new nci.q(data8, 28));
                return Unit.f186387a;
            case 8:
                Data data9 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new nci.q(data9, 29));
                return Unit.f186387a;
            case 9:
                Data data10 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new j0(data10, 0));
                return Unit.f186387a;
            case 10:
                Data data11 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new j0(data11, 1));
                return Unit.f186387a;
            case 11:
                itb.b bVar = (itb.b) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new ble.t0(bVar, 3));
                return Unit.f186387a;
            case 12:
                Data data12 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.g0, new j0(data12, 2));
                return Unit.f186387a;
            case 13:
                Data data13 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new j0(data13, 3));
                return Unit.f186387a;
            case 14:
                Data data14 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.g0, new j0(data14, 4));
                return Unit.f186387a;
            case 15:
                g39.a aVar16 = (g39.a) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (aVar16 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar.C1(aVar16.f140240a);
                return Unit.f186387a;
            case 16:
                List list = (List) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new njf.e(list, 2));
                return Unit.f186387a;
            case 17:
                NavBarMessage navBarMessage = (NavBarMessage) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.g0, new f1(navBarMessage, 5));
                return Unit.f186387a;
            case 18:
                Data data15 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new j0(data15, 5));
                return Unit.f186387a;
            case 19:
                Data data16 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new nc1.j(data16, fVar, 18));
                return Unit.f186387a;
            case 20:
                Data data17 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new j0(data17, 6));
                return Unit.f186387a;
            default:
                Data data18 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.N2(new j0(data18, 7));
                return Unit.f186387a;
        }
    }
}
