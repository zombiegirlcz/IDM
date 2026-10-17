package a9h;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosurePreconditionsStatus;
import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import ehk.g;
import gim.i;
import huh.m;
import ikg.e;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kug.q;
import nii.n1;
import pkg.j;
import qg7.u;
import r10.r;
import re0.d;
import utk.f;
import w4l.k;
import zfk.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2657y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f2656x = obj2;
        this.f2655w = obj3;
        this.f2657y = obj4;
        this.z = obj5;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v21, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(0, (r) this.f2656x, (String) this.f2655w, (n9l.b) this.f2657y, (k) this.z, continuation);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((g) this.f2656x, (xfk.a) this.f2657y, (n) this.z, (String) this.f2655w, continuation);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(2, (m) this.f2656x, (String) this.f2655w, (String) this.f2657y, (List) this.z, continuation);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                return new c((ivh.c) this.v, (String) this.f2655w, (Function1) this.f2656x, (Function1) this.f2657y, (Function1) this.z, continuation);
            case 4:
                c cVar4 = new c((com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b) this.f2656x, (q) this.f2657y, (String) this.f2655w, (AccountClosurePreconditionsStatus) this.z, continuation, 4);
                cVar4.v = obj2;
                return cVar4;
            case 5:
                c cVar5 = new c((j) this.f2656x, (Comparator) this.f2657y, (String) this.f2655w, (e) this.z, continuation, 5);
                cVar5.v = obj2;
                return cVar5;
            case 6:
                c cVar6 = new c((Function0) this.f2656x, (u) this.f2657y, (String) this.f2655w, (String) this.z, continuation, 6);
                cVar6.v = obj2;
                return cVar6;
            case 7:
                c cVar7 = new c(7, (d) this.f2656x, (Function1) this.f2655w, (Type) this.f2657y, (Function2) this.z, continuation);
                cVar7.v = obj2;
                return cVar7;
            case 8:
                c cVar8 = new c(continuation, (rnb.r) this.f2656x, (LocalDate) this.f2655w, (LocalDate) this.f2657y, (xi0.b) this.z);
                cVar8.v = obj2;
                return cVar8;
            case 9:
                c cVar9 = new c(9, (u29.q) this.f2656x, (LocalDate) this.f2655w, (LocalDate) this.f2657y, (k) this.z, continuation);
                cVar9.v = obj2;
                return cVar9;
            case 10:
                c cVar10 = new c((Function1) this.f2656x, this.f2655w, (ue7.c) this.f2657y, (Function3) this.z, continuation);
                cVar10.v = obj2;
                return cVar10;
            default:
                c cVar11 = new c(11, (f) this.f2656x, (String) this.f2655w, (pdh.c) this.f2657y, (String) this.z, continuation);
                cVar11.v = obj2;
                return cVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((UploadState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0214 A[LOOP:1: B:26:0x015b->B:57:0x0214, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v8, types: [gim.i, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r4v7, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9h.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, xfk.a aVar, n nVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f2656x = gVar;
        this.f2657y = aVar;
        this.z = nVar;
        this.f2655w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(ivh.c cVar, String str, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.v = cVar;
        this.f2655w = str;
        this.f2656x = (i) function1;
        this.f2657y = function12;
        this.z = function13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, String str, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2656x = obj2;
        this.f2657y = obj3;
        this.f2655w = str;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, rnb.r rVar, LocalDate localDate, LocalDate localDate2, xi0.b bVar) {
        super(2, continuation);
        this.u = 8;
        this.f2656x = rVar;
        this.f2655w = localDate;
        this.f2657y = localDate2;
        this.z = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, Object obj2, ue7.c cVar, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f2656x = function1;
        this.f2655w = obj2;
        this.f2657y = cVar;
        this.z = (i) function3;
    }
}
