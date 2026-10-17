package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ke;
import com.fourthline.orca.workflow.WorkflowResults;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public final class fa0 implements ry, ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y90 f28390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie f28391b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28393b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28393b = obj2;
            this.d |= Integer.MIN_VALUE;
            return fa0.this.a((WorkflowResults.IDV) null, this);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f28397c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f28398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28399h;
        /* synthetic */ Object i;
        int k;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.i = obj2;
            this.k |= Integer.MIN_VALUE;
            Object objA = fa0.this.a((h10) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28403c;
        /* synthetic */ Object d;
        final /* synthetic */ List e;
        final /* synthetic */ Map f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f28404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f28405h;
        final /* synthetic */ fa0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, Map map, List list2, List list3, fa0 fa0Var, Continuation continuation) {
            super(2, continuation);
            this.e = list;
            this.f = map;
            this.f28404g = list2;
            this.f28405h = list3;
            this.i = fa0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ne neVar, Continuation continuation) {
            return ((c) create(neVar, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            c cVar = new c(this.e, this.f, this.f28404g, this.f28405h, this.i, continuation);
            cVar.d = obj2;
            return cVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            ne neVar = (ne) this.d;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f28403c;
            boolean z = false;
            if (i == 0) {
                yhm.o.b(obj2);
                neVar.a();
                Objects.toString(neVar.b());
                ke.a aVarB = neVar.b();
                if (!(aVarB instanceof ke.a.d)) {
                    if (aVarB instanceof ke.a.b) {
                        this.f28405h.add(new Pair(neVar.a(), ((ke.a.b) neVar.b()).a()));
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                this.e.add(neVar.a());
                WorkflowResults.IDV idv = (WorkflowResults.IDV) this.f.get(neVar.a());
                if (idv != null) {
                    fa0 fa0Var = this.i;
                    this.d = null;
                    this.f28401a = null;
                    this.f28402b = 0;
                    this.f28403c = 1;
                    if (fa0Var.a(idv, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            if (this.e.size() == this.f28404g.size()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public fa0(y90 delegate, ie dataListener) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(dataListener, "dataListener");
        this.f28390a = delegate;
        this.f28391b = dataListener;
    }

    @Override // com.fourthline.orca.internal.ke
    public void a(le request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f28390a.a(request);
    }

    public ke.a b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.f28390a.c(identifier);
    }

    public boolean c(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.f28390a.d(identifier);
    }

    private final boolean b(le leVar) {
        if (!c(leVar.a())) {
            return true;
        }
        ke.a aVarB = b(leVar.a());
        if ((aVarB instanceof ke.a.c) || (aVarB instanceof ke.a.C0235a) || (aVarB instanceof ke.a.d)) {
            return false;
        }
        if ((aVarB instanceof ke.a.b) || aVarB == null) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.ke
    public Flow a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.f28390a.a(identifier);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.fourthline.orca.internal.ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.h10 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.fa0.a(com.fourthline.orca.internal.h10, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.workflow.WorkflowResults.IDV r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.fa0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.fa0$a r0 = (com.fourthline.orca.internal.fa0.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.fa0$a r0 = new com.fourthline.orca.internal.fa0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f28393b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f28392a
            com.fourthline.orca.workflow.WorkflowResults$IDV r5 = (com.fourthline.orca.workflow.WorkflowResults.IDV) r5
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L49
        L2b:
            r5 = move-exception
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r6)
            com.fourthline.orca.internal.ie r6 = r4.f28391b     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            r0.f28392a = r2     // Catch: java.lang.Throwable -> L2b
            r0.d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L49
            return r1
        L46:
            r5.toString()
        L49:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.fa0.a(com.fourthline.orca.workflow.WorkflowResults$IDV, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
