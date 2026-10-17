package k7c;

import com.revolut.feature.salary_switch.impl.models.v2.AccountIdentifier;
import com.revolut.feature.salary_switch.impl.models.v2.Employer;
import com.revolut.feature.salary_switch.impl.models.v2.Institution;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusDetails;
import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f182016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f182017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f182016w = obj2;
    }

    private final Object b(Object obj2) {
        Throwable th10 = (Throwable) this.f182017x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (th10 == null) {
                Function1 function1 = (Function1) this.f182016w;
                this.f182017x = null;
                this.v = 1;
                if (function1.invoke(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    private final Object c(Object obj2) {
        Throwable th10 = (Throwable) this.f182017x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (th10 == null) {
                ?? r56 = (gim.i) this.f182016w;
                this.f182017x = null;
                this.v = 1;
                if (r56.invoke(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        Throwable th10 = (Throwable) this.f182017x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Function2 function2 = (Function2) this.f182016w;
            this.f182017x = null;
            this.v = 1;
            if (function2.invoke(th10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        mqc.d dVar = (mqc.d) this.f182017x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            PayrollServiceV2 payrollServiceV2 = ((mqc.e) this.f182016w).f207954a;
            String str = dVar.f207951a;
            String str2 = dVar.f207952b;
            this.f182017x = null;
            this.v = 1;
            obj2 = payrollServiceV2.getDispute(str, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return d9.t0.s((fqc.i) obj2);
    }

    private final Object p(Object obj2) {
        String str = (String) this.f182017x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            PayrollServiceV2 payrollServiceV2 = ((mqc.e) this.f182016w).f207954a;
            this.f182017x = null;
            this.v = 1;
            obj2 = payrollServiceV2.getDisputes(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Iterable iterable = (Iterable) obj2;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(d9.t0.s((fqc.i) it8.next()));
        }
        return arrayList;
    }

    private final Object s(Object obj2) {
        Object payrollSwitch;
        kqc.h hVar;
        AccountIdentifier accountIdentifier;
        String str;
        kqc.g gVar;
        kqc.g gVar2;
        kqc.j jVar;
        String str2 = (String) this.f182017x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            PayrollServiceV2 payrollServiceV2 = ((mqc.r) this.f182016w).f207970a;
            this.f182017x = null;
            this.v = 1;
            payrollSwitch = payrollServiceV2.getPayrollSwitch(str2, this);
            if (payrollSwitch == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            payrollSwitch = obj2;
        }
        gqc.j0 j0Var = (gqc.j0) payrollSwitch;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        String str3 = j0Var.f145640a;
        kqc.h[] hVarArrValues = kqc.h.values();
        int length = hVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i2];
            if (kotlin.text.a0.z(hVar.name(), str3, true)) {
                break;
            }
            i2++;
        }
        if (hVar == null) {
            hVar = kqc.h.UNKNOWN;
        }
        kqc.h hVar2 = hVar;
        Institution institutionX = i2b.a.x(j0Var.f145641b);
        String str4 = j0Var.f145642c;
        String str5 = j0Var.d;
        gqc.f fVar = j0Var.e;
        if (fVar != null) {
            String str6 = fVar.f145627a;
            kqc.j[] jVarArrValues = kqc.j.values();
            int length2 = jVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i3];
                if (kotlin.text.a0.z(jVar.name(), str6, true)) {
                    break;
                }
                i3++;
            }
            if (jVar == null) {
                jVar = kqc.j.UNKNOWN;
            }
            accountIdentifier = new AccountIdentifier(jVar, fVar.f145628b);
        } else {
            accountIdentifier = null;
        }
        String str7 = j0Var.f;
        gqc.r rVar = j0Var.f145643g;
        Employer employerW = rVar != null ? i2b.a.w(rVar) : null;
        bqc.k kVarU = i2b.a.u(j0Var.f145644h);
        long j2 = j0Var.i;
        Long l2 = j0Var.f145645j;
        Long l3 = j0Var.k;
        Long l4 = j0Var.f145646l;
        Long l5 = j0Var.f145647m;
        String str8 = j0Var.f145648n;
        if (str8 != null) {
            kqc.g[] gVarArrValues = kqc.g.values();
            int length3 = gVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    str = str7;
                    gVar2 = null;
                    break;
                }
                kqc.g gVar3 = gVarArrValues[i5];
                int i6 = i5;
                str = str7;
                if (kotlin.text.a0.z(gVar3.name(), str8, true)) {
                    gVar2 = gVar3;
                    break;
                }
                i5 = i6 + 1;
                str7 = str;
            }
            gVar = gVar2 == null ? kqc.g.UNKNOWN : gVar2;
        } else {
            str = str7;
            gVar = null;
        }
        return new SalarySwitchV2StatusDetails(hVar2, institutionX, str4, str5, accountIdentifier, str, employerW, kVarU, j2, l2, l3, l4, l5, gVar);
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                String str = ((p) obj3).f181986a;
                x xVar = new x((z) this.f182016w, (Continuation) obj4, 0);
                xVar.f182017x = str;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x((z) this.f182016w, (Continuation) obj4, 1);
                xVar2.f182017x = (u6c.h0) obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            case 2:
                x xVar3 = new x((z) this.f182016w, (Continuation) obj4, 2);
                xVar3.f182017x = (u6c.n) obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
            case 3:
                x xVar4 = new x((b0) this.f182016w, (Continuation) obj4, 3);
                xVar4.f182017x = (t6c.g) obj3;
                return xVar4.invokeSuspend(Unit.f186387a);
            case 4:
                x xVar5 = new x((j0) this.f182016w, (Continuation) obj4, 4);
                xVar5.f182017x = (i0) obj3;
                return xVar5.invokeSuspend(Unit.f186387a);
            case 5:
                x xVar6 = new x((y0) this.f182016w, (Continuation) obj4, 5);
                xVar6.f182017x = (u0) obj3;
                return xVar6.invokeSuspend(Unit.f186387a);
            case 6:
                x xVar7 = new x((y0) this.f182016w, (Continuation) obj4, 6);
                xVar7.f182017x = (t0) obj3;
                return xVar7.invokeSuspend(Unit.f186387a);
            case 7:
                x xVar8 = new x((kf6.b) this.f182016w, (Continuation) obj4, 7);
                xVar8.f182017x = (ng6.b) obj3;
                return xVar8.invokeSuspend(Unit.f186387a);
            case 8:
                x xVar9 = new x((kjk.o) this.f182016w, (Continuation) obj4, 8);
                xVar9.f182017x = (kjk.k) obj3;
                return xVar9.invokeSuspend(Unit.f186387a);
            case 9:
                x xVar10 = new x((kjk.o) this.f182016w, (Continuation) obj4, 9);
                xVar10.f182017x = (kjk.l) obj3;
                return xVar10.invokeSuspend(Unit.f186387a);
            case 10:
                x xVar11 = new x((kjk.f0) this.f182016w, (Continuation) obj4, 10);
                xVar11.f182017x = (kjk.b0) obj3;
                return xVar11.invokeSuspend(Unit.f186387a);
            case 11:
                x xVar12 = new x((l05.g) this.f182016w, (Continuation) obj4, 11);
                xVar12.f182017x = (LocalDate) obj3;
                return xVar12.invokeSuspend(Unit.f186387a);
            case 12:
                x xVar13 = new x((l16.e) this.f182016w, (Continuation) obj4, 12);
                xVar13.f182017x = (l16.c) obj3;
                return xVar13.invokeSuspend(Unit.f186387a);
            case 13:
                x xVar14 = new x((l16.e) this.f182016w, (Continuation) obj4, 13);
                xVar14.f182017x = (xi0.b) obj3;
                return xVar14.invokeSuspend(Unit.f186387a);
            case 14:
                x xVar15 = new x((lf6.j) this.f182016w, (Continuation) obj4, 14);
                xVar15.f182017x = (String) obj3;
                return xVar15.invokeSuspend(Unit.f186387a);
            case 15:
                x xVar16 = new x((ll7.h) this.f182016w, (Continuation) obj4, 15);
                xVar16.f182017x = (String) obj3;
                return xVar16.invokeSuspend(Unit.f186387a);
            case 16:
                x xVar17 = new x((ll7.k) this.f182016w, (Continuation) obj4, 16);
                xVar17.f182017x = (String) obj3;
                return xVar17.invokeSuspend(Unit.f186387a);
            case 17:
                x xVar18 = new x((ll7.u) this.f182016w, (Continuation) obj4, 17);
                xVar18.f182017x = (String) obj3;
                return xVar18.invokeSuspend(Unit.f186387a);
            case 18:
                x xVar19 = new x((ll7.i0) this.f182016w, (Continuation) obj4, 18);
                xVar19.f182017x = (Pair) obj3;
                return xVar19.invokeSuspend(Unit.f186387a);
            case 19:
                x xVar20 = new x((lo9.e) this.f182016w, (Continuation) obj4, 19);
                xVar20.f182017x = (String) obj3;
                return xVar20.invokeSuspend(Unit.f186387a);
            case 20:
                x xVar21 = new x((lp6.m) this.f182016w, (Continuation) obj4, 20);
                xVar21.f182017x = (lp6.d) obj3;
                return xVar21.invokeSuspend(Unit.f186387a);
            case 21:
                x xVar22 = new x((lp6.m) this.f182016w, (Continuation) obj4, 21);
                xVar22.f182017x = (String) obj3;
                return xVar22.invokeSuspend(Unit.f186387a);
            case 22:
                x xVar23 = new x((Function1) this.f182016w, (Continuation) obj4, 22);
                xVar23.f182017x = (Throwable) obj3;
                return xVar23.invokeSuspend(Unit.f186387a);
            case 23:
                x xVar24 = new x((gim.i) this.f182016w, (Continuation) obj4);
                xVar24.f182017x = (Throwable) obj3;
                return xVar24.invokeSuspend(Unit.f186387a);
            case 24:
                x xVar25 = new x((Function2) this.f182016w, (Continuation) obj4, 24);
                xVar25.f182017x = (Throwable) obj3;
                return xVar25.invokeSuspend(Unit.f186387a);
            case 25:
                x xVar26 = new x((mqc.e) this.f182016w, (Continuation) obj4, 25);
                xVar26.f182017x = (mqc.d) obj3;
                return xVar26.invokeSuspend(Unit.f186387a);
            case 26:
                x xVar27 = new x((mqc.e) this.f182016w, (Continuation) obj4, 26);
                xVar27.f182017x = (String) obj3;
                return xVar27.invokeSuspend(Unit.f186387a);
            case 27:
                x xVar28 = new x((mqc.k) this.f182016w, (Continuation) obj4, 27);
                xVar28.f182017x = (String) obj3;
                return xVar28.invokeSuspend(Unit.f186387a);
            case 28:
                x xVar29 = new x((mqc.r) this.f182016w, (Continuation) obj4, 28);
                xVar29.f182017x = (String) obj3;
                return xVar29.invokeSuspend(Unit.f186387a);
            default:
                x xVar30 = new x((mtj.q) this.f182016w, (Continuation) obj4, 29);
                xVar30.f182017x = (RewardsHubChallengeDetailsParams) obj3;
                return xVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0b14  */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v7, types: [kl7.n2] */
    /* JADX WARN: Type inference failed for: r1v53, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v68, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v112, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v114, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v47, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v63, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v62, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v20, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v35, types: [hl7.pa] */
    /* JADX WARN: Type inference failed for: r9v42 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k7c.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(Function1 function1, Continuation continuation) {
        super(3, continuation);
        this.u = 23;
        this.f182016w = (gim.i) function1;
    }
}
