package zmj;

import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimMigrationFromDataPlansOnly;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$ModalStep;
import dej.t1;
import dfj.s0;
import dfj.x0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a f323563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i, com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f323563w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(0, this.f323563w, continuation);
                k0Var.v = obj2;
                return k0Var;
            case 1:
                k0 k0Var2 = new k0(1, this.f323563w, continuation);
                k0Var2.v = obj2;
                return k0Var2;
            case 2:
                k0 k0Var3 = new k0(2, this.f323563w, continuation);
                k0Var3.v = obj2;
                return k0Var3;
            case 3:
                k0 k0Var4 = new k0(3, this.f323563w, continuation);
                k0Var4.v = obj2;
                return k0Var4;
            case 4:
                k0 k0Var5 = new k0(4, this.f323563w, continuation);
                k0Var5.v = obj2;
                return k0Var5;
            case 5:
                k0 k0Var6 = new k0(5, this.f323563w, continuation);
                k0Var6.v = obj2;
                return k0Var6;
            case 6:
                k0 k0Var7 = new k0(6, this.f323563w, continuation);
                k0Var7.v = obj2;
                return k0Var7;
            case 7:
                k0 k0Var8 = new k0(7, this.f323563w, continuation);
                k0Var8.v = obj2;
                return k0Var8;
            case 8:
                k0 k0Var9 = new k0(8, this.f323563w, continuation);
                k0Var9.v = obj2;
                return k0Var9;
            case 9:
                k0 k0Var10 = new k0(9, this.f323563w, continuation);
                k0Var10.v = obj2;
                return k0Var10;
            default:
                k0 k0Var11 = new k0(10, this.f323563w, continuation);
                k0Var11.v = obj2;
                return k0Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t1 t1Var;
        int i = this.u;
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar = this.f323563w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data, 22));
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data2.getContent() != null && !data2.getLoading()) {
                    aVar.H2(aVar.J, l0.f323565a);
                }
                return Unit.f186387a;
            case 2:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data3 = (Data) pair.f186385a;
                Data data4 = (Data) pair.f186386b;
                t1 t1Var2 = (t1) data3.getContent();
                dej.m mVar = t1Var2 != null ? t1Var2.f113653g : null;
                int i2 = mVar == null ? -1 : m0.f323567a[mVar.ordinal()];
                if (i2 == -1) {
                    aVar.H2(aVar.J, new yrk.e(data3, 20, data4, aVar));
                } else if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.H2(aVar.J, new yrk.e(data3, 20, data4, aVar));
                } else {
                    aVar.C2(new z(t1Var2.f113650a));
                }
                return Unit.f186387a;
            case 3:
                Data data5 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data5, 23));
                return Unit.f186387a;
            case 4:
                Data data6 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data6, 24));
                return Unit.f186387a;
            case 5:
                Data data7 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data7, 25));
                return Unit.f186387a;
            case 6:
                Data data8 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data8, 26));
                return Unit.f186387a;
            case 7:
                Data data9 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data9, 27));
                return Unit.f186387a;
            case 8:
                x0 x0Var = (x0) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((x0Var instanceof s0) && (t1Var = (t1) ((n) ((j2) aVar.J.f22677a).getValue()).f323568a.getContent()) != null) {
                    EsimProfileEntry esimProfileEntry = t1Var.e;
                    EsimProfileEntry esimProfileEntry2 = Intrinsics.f(esimProfileEntry.f100440a, ((s0) x0Var).f114099a) ? esimProfileEntry : null;
                    if (esimProfileEntry2 != null) {
                        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = esimProfileEntry2.f100443g;
                        if (esimMigrationFromDataPlansOnly != null) {
                            oki.h.v2(aVar.L, new EsimSubscriptionDetailsScreenContract$ModalStep.EsimMigration(esimMigrationFromDataPlansOnly.f100292a, esimProfileEntry2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else {
                            aVar.J2(esimProfileEntry2);
                        }
                    }
                }
                return Unit.f186387a;
            case 9:
                Data data10 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data10, 28));
                return Unit.f186387a;
            default:
                Data data11 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new zd3.h(data11, 29));
                return Unit.f186387a;
        }
    }
}
