package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a4;
import com.fourthline.orca.internal.g6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class x6 implements jb1, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f34892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f34893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g6 f34894c;
    private final aq0 d;
    private final d3 e;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ob1 f34897c;
        final /* synthetic */ t5 d;
        final /* synthetic */ x6 e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.x6$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0307a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[v6.values().length];
                try {
                    iArr[v6.f34254b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v6.f34255c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ob1 ob1Var, t5 t5Var, x6 x6Var, Continuation continuation) {
            super(2, continuation);
            this.f34897c = ob1Var;
            this.d = t5Var;
            this.e = x6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(this.f34897c, this.d, this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            g6.b aVar;
            Object objA;
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34896b;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f34897c.a().a(this.f34897c.b().a(true));
                int i2 = C0307a.$EnumSwitchMapping$0[this.d.getName().ordinal()];
                if (i2 == 1) {
                    aVar = new g6.b.a((String) this.e.f34893b.invoke(), this.e.e.d());
                } else {
                    if (i2 != 2) {
                        return Unit.f186387a;
                    }
                    aVar = new g6.b.C0202b((String) this.e.f34893b.invoke());
                }
                g6 g6Var = this.e.f34894c;
                this.f34895a = null;
                this.f34896b = 1;
                objA = g6Var.a(aVar, this);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objA = ((yhm.m) obj2).f314193a;
            }
            x6 x6Var = this.e;
            ob1 ob1Var = this.f34897c;
            t5 t5Var = this.d;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                x6Var.a(ob1Var, t5Var, ((g6.c) objA).a());
            } else {
                x6Var.a(ob1Var, t5Var, se1.a(thA));
            }
            return Unit.f186387a;
        }
    }

    public x6(Function0 workflowIdProvider, g6 startPaymentWorker, aq0 popupHandler, d3 dataBundle, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(startPaymentWorker, "startPaymentWorker");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f34892a = coroutineScope;
        this.f34893b = workflowIdProvider;
        this.f34894c = startPaymentWorker;
        this.d = popupHandler;
        this.e = dataBundle;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f34892a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(ob1 ob1Var) {
        ob1Var.c().b(new y6(a4.c.f26701a));
        return Unit.f186387a;
    }

    @Override // com.fourthline.orca.internal.jb1
    public void a(ob1 ob1Var, t5 selectedType) {
        Intrinsics.checkNotNullParameter(ob1Var, "<this>");
        Intrinsics.checkNotNullParameter(selectedType, "selectedType");
        skm.e0.C(ob1Var, null, null, new a(ob1Var, selectedType, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ob1 ob1Var, t5 t5Var, g6.a aVar) {
        ob1Var.a().a(ob1Var.b().a(false));
        this.e.a(aVar.getValues());
        if (t5Var.getName() == v6.f34255c) {
            ob1Var.c().b(new y6(a4.a.f26699a));
        } else {
            a(ob1Var);
        }
    }

    private final void a(ob1 ob1Var) {
        aq0.a(this.d, q5.f32200a, new ht1(ob1Var, 1), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ob1 ob1Var, t5 t5Var, re1 re1Var) {
        ob1Var.a().a(ob1Var.b().a(false));
    }
}
