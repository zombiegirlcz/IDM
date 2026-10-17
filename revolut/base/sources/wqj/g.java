package wqj;

import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsBillingService;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlanAdditionalValueService;
import com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionParams;
import dfl.i0;
import dfl.r0;
import ft3.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import w5b.v0;
import w5b.z6;
import wvg.k;
import wvg.r;
import wvg.s;
import xr3.b0;
import xr3.c0;
import xr3.f0;
import xr3.t;
import y20.b1;
import y20.f1;
import y20.q;
import y3f.v;
import y5b.p;
import y5b.u;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f299468x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f299468x = obj2;
    }

    private final Object b(Object obj2) {
        r0 r0Var = (r0) this.f299467w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            j3f.f fVar = ((v) this.f299468x).e;
            List list = r0Var.f114450a;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(u3f.d.f((i0) it8.next()));
            }
            this.f299467w = null;
            this.v = 1;
            if (fVar.k(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        Pair pair = (Pair) this.f299467w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            CobrandedCardsBillingService cobrandedCardsBillingService = ((p) this.f299468x).f311057a;
            this.f299467w = null;
            this.v = 1;
            obj2 = cobrandedCardsBillingService.getValueReminder(str, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return yh5.b.F((z6) obj2);
    }

    private final Object n(Object obj2) {
        Pair pair = (Pair) this.f299467w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = (String) pair.f186385a;
            String str2 = (String) pair.f186386b;
            CobrandedCardsPlanAdditionalValueService cobrandedCardsPlanAdditionalValueService = ((u) this.f299468x).f311064a;
            this.f299467w = null;
            this.v = 1;
            obj2 = cobrandedCardsPlanAdditionalValueService.getPlanBenefits(str, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return x5b.b.a((v0) obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                g gVar = new g((j) this.f299468x, (Continuation) obj4, 0);
                gVar.f299467w = (d) obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g((wvg.j) this.f299468x, (Continuation) obj4, 1);
                gVar2.f299467w = (wvg.c) obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
            case 2:
                g gVar3 = new g((k) this.f299468x, (Continuation) obj4, 2);
                gVar3.f299467w = (wvg.d) obj3;
                return gVar3.invokeSuspend(Unit.f186387a);
            case 3:
                g gVar4 = new g((s) this.f299468x, (Continuation) obj4, 3);
                gVar4.f299467w = (r) obj3;
                return gVar4.invokeSuspend(Unit.f186387a);
            case 4:
                g gVar5 = new g((x46.b) this.f299468x, (Continuation) obj4, 4);
                gVar5.f299467w = (Set) obj3;
                return gVar5.invokeSuspend(Unit.f186387a);
            case 5:
                g gVar6 = new g((xgb.a) this.f299468x, (Continuation) obj4, 5);
                gVar6.f299467w = (SalaryPromotionParams) obj3;
                return gVar6.invokeSuspend(Unit.f186387a);
            case 6:
                g gVar7 = new g((xif.o) this.f299468x, (Continuation) obj4, 6);
                gVar7.f299467w = (wif.b) obj3;
                return gVar7.invokeSuspend(Unit.f186387a);
            case 7:
                String str = ((RegisteredIdentityId) obj3).f74764a;
                g gVar8 = new g((xjl.u) this.f299468x, (Continuation) obj4, 7);
                gVar8.f299467w = str;
                return gVar8.invokeSuspend(Unit.f186387a);
            case 8:
                g gVar9 = new g((yld.d) this.f299468x, (Continuation) obj4, 8);
                gVar9.f299467w = (FlowCollector) obj2;
                return gVar9.invokeSuspend(Unit.f186387a);
            case 9:
                g gVar10 = new g((xr3.k) this.f299468x, (Continuation) obj4, 9);
                gVar10.f299467w = (xr3.c) obj3;
                return gVar10.invokeSuspend(Unit.f186387a);
            case 10:
                g gVar11 = new g((xr3.u) this.f299468x, (Continuation) obj4, 10);
                gVar11.f299467w = (t) obj3;
                return gVar11.invokeSuspend(Unit.f186387a);
            case 11:
                g gVar12 = new g((xr3.w) this.f299468x, (Continuation) obj4, 11);
                gVar12.f299467w = (d1) obj3;
                return gVar12.invokeSuspend(Unit.f186387a);
            case 12:
                g gVar13 = new g((f0) this.f299468x, (Continuation) obj4, 12);
                gVar13.f299467w = (b0) obj3;
                return gVar13.invokeSuspend(Unit.f186387a);
            case 13:
                g gVar14 = new g((f0) this.f299468x, (Continuation) obj4, 13);
                gVar14.f299467w = (c0) obj3;
                return gVar14.invokeSuspend(Unit.f186387a);
            case 14:
                g gVar15 = new g((y1e.b) this.f299468x, (Continuation) obj4, 14);
                gVar15.f299467w = (String) obj3;
                return gVar15.invokeSuspend(Unit.f186387a);
            case 15:
                g gVar16 = new g((y1e.d) this.f299468x, (Continuation) obj4, 15);
                gVar16.f299467w = (v1e.c) obj3;
                return gVar16.invokeSuspend(Unit.f186387a);
            case 16:
                g gVar17 = new g((b1) this.f299468x, (Continuation) obj4, 16);
                gVar17.f299467w = (y20.r) obj3;
                return gVar17.invokeSuspend(Unit.f186387a);
            case 17:
                g gVar18 = new g((b1) this.f299468x, (Continuation) obj4, 17);
                gVar18.f299467w = (v30.c0) obj3;
                return gVar18.invokeSuspend(Unit.f186387a);
            case 18:
                g gVar19 = new g((b1) this.f299468x, (Continuation) obj4, 18);
                gVar19.f299467w = (q) obj3;
                return gVar19.invokeSuspend(Unit.f186387a);
            case 19:
                g gVar20 = new g((b1) this.f299468x, (Continuation) obj4, 19);
                gVar20.f299467w = (y20.s) obj3;
                return gVar20.invokeSuspend(Unit.f186387a);
            case 20:
                g gVar21 = new g((b1) this.f299468x, (Continuation) obj4, 20);
                gVar21.f299467w = (f1) obj3;
                return gVar21.invokeSuspend(Unit.f186387a);
            case 21:
                g gVar22 = new g((y2c.c) this.f299468x, (Continuation) obj4, 21);
                gVar22.f299467w = (String) obj3;
                return gVar22.invokeSuspend(Unit.f186387a);
            case 22:
                g gVar23 = new g((v) this.f299468x, (Continuation) obj4, 22);
                gVar23.f299467w = (z2f.c) obj3;
                return gVar23.invokeSuspend(Unit.f186387a);
            case 23:
                g gVar24 = new g((v) this.f299468x, (Continuation) obj4, 23);
                gVar24.f299467w = (i0) obj3;
                return gVar24.invokeSuspend(Unit.f186387a);
            case 24:
                g gVar25 = new g((v) this.f299468x, (Continuation) obj4, 24);
                gVar25.f299467w = (z2f.g) obj3;
                return gVar25.invokeSuspend(Unit.f186387a);
            case 25:
                g gVar26 = new g((v) this.f299468x, (Continuation) obj4, 25);
                gVar26.f299467w = (r0) obj3;
                return gVar26.invokeSuspend(Unit.f186387a);
            case 26:
                g gVar27 = new g((p) this.f299468x, (Continuation) obj4, 26);
                gVar27.f299467w = (String) obj3;
                return gVar27.invokeSuspend(Unit.f186387a);
            case 27:
                g gVar28 = new g((p) this.f299468x, (Continuation) obj4, 27);
                gVar28.f299467w = (Pair) obj3;
                return gVar28.invokeSuspend(Unit.f186387a);
            case 28:
                g gVar29 = new g((u) this.f299468x, (Continuation) obj4, 28);
                gVar29.f299467w = (Pair) obj3;
                return gVar29.invokeSuspend(Unit.f186387a);
            default:
                g gVar30 = new g((y5b.c0) this.f299468x, (Continuation) obj4, 29);
                gVar30.f299467w = (String) obj3;
                return gVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0403  */
    /* JADX WARN: Type inference failed for: r12v12, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v21, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v39, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v17, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wqj.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
