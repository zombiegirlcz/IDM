package v0f;

import com.revolut.feature.address.models.Address;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.screens.card_details.b f284801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(com.revolut.feature.topup_screen.impl.screens.card_details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284801w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f284801w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(this.f284801w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(this.f284801w, continuation, 2);
                d0Var3.v = obj2;
                return d0Var3;
            case 3:
                d0 d0Var4 = new d0(this.f284801w, continuation, 3);
                d0Var4.v = obj2;
                return d0Var4;
            default:
                d0 d0Var5 = new d0(this.f284801w, continuation, 4);
                d0Var5.v = obj2;
                return d0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d0) create((t61.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
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
        t tVar;
        String postcode;
        int i = this.u;
        boolean z = false;
        int i2 = 5;
        com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = this.f284801w;
        switch (i) {
            case 0:
                rpi.j jVar = bVar.v;
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar2 = (t) pair.f186385a;
                if (((Boolean) pair.f186386b).booleanValue()) {
                    jVar.y();
                    return Unit.f186387a;
                }
                n60.a aVar2 = bVar.f91096w;
                int i3 = b0.f284797a[tVar2.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    aVar2.R();
                    jVar.r(350L);
                } else if (i3 == 4) {
                    aVar2.S(false);
                    jVar.y();
                } else {
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.R();
                    jVar.y();
                }
                return Unit.f186387a;
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar3 = (t) pair2.f186385a;
                Boolean bool = (Boolean) pair2.f186386b;
                int i5 = e0.f284804a[tVar3.ordinal()];
                if (i5 == 1) {
                    tVar = t.EXPIRE_DATE;
                } else if (i5 == 2) {
                    tVar = t.CVV;
                } else {
                    if (i5 != 3) {
                        IllegalStateException illegalStateException = new IllegalStateException("Secure keyboard next button can't be clicked for " + tVar3 + " focus");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        return Unit.f186387a;
                    }
                    if (!Intrinsics.f(bool, Boolean.TRUE)) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Secure keyboard next button can't be clicked with CVV focus and no postal code");
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        return Unit.f186387a;
                    }
                    tVar = t.POSTCODE;
                }
                bVar.H2(bVar.G, new z(tVar, 1));
                return Unit.f186387a;
            case 2:
                Pair pair3 = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar4 = (t) pair3.f186385a;
                boolean zBooleanValue = ((Boolean) pair3.f186386b).booleanValue();
                if (tVar4 == t.CARD || tVar4 == t.EXPIRE_DATE || (tVar4 == t.CVV && zBooleanValue)) {
                    z = true;
                }
                bVar.v.m(z ? c01.a.NEXT : null);
                return Unit.f186387a;
            case 3:
                t61.j jVar2 = (t61.j) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = bVar.G;
                do3.n nVar = ((u) ((j2) yVar.f22677a).getValue()).f284827g;
                Address address = nVar != null ? nVar.k : null;
                if (jVar2 == null || address == null || !jVar2.f268165m || !kotlin.text.a0.z(address.getCountry(), jVar2.i, true) || (postcode = address.getPostcode()) == null || postcode.length() == 0) {
                    bVar.H2(yVar, new uu9.b(jVar2, 23));
                } else {
                    bVar.H2(yVar, new uyh.k0(jVar2, address, i2));
                }
                return Unit.f186387a;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    bVar.J2(null);
                } else if (!(n1Var instanceof k1) && !(n1Var instanceof m1) && !(n1Var instanceof j1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
