package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a4;
import com.fourthline.orca.internal.e40;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class m5 implements e40.c, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d3 f30993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f30994c;
    private final Function0 d;
    private final g6 e;
    private final aq0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f30995g;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f30997b;
        final /* synthetic */ t5 d;
        final /* synthetic */ e40 e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.m5$a$a, reason: collision with other inner class name */
        public static final class C0248a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f30999a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e40 f31000b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ t5 f31001c;
            final /* synthetic */ m5 d;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.m5$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0249a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[v6.values().length];
                    try {
                        iArr[v6.f34255c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0248a(e40 e40Var, t5 t5Var, m5 m5Var, Continuation continuation) {
                super(2, continuation);
                this.f31000b = e40Var;
                this.f31001c = t5Var;
                this.d = m5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0248a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                return new C0248a(this.f31000b, this.f31001c, this.d, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f30999a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                this.f31000b.b().a(this.f31000b.c().a(false));
                if (C0249a.$EnumSwitchMapping$0[this.f31001c.getName().ordinal()] == 1) {
                    this.f31000b.d().b(new n5(a4.a.f26699a));
                } else {
                    this.d.b(this.f31000b);
                }
                return Unit.f186387a;
            }
        }

        public static final /* synthetic */ class b {
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
        public a(t5 t5Var, e40 e40Var, Continuation continuation) {
            super(2, continuation);
            this.d = t5Var;
            this.e = e40Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return m5.this.new a(this.d, this.e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
        
            if (skm.e0.J(r11, r1, r10) == r0) goto L26;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.m5.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m5(d3 dataBundle, List paymentMethods, Function0 workflowIdProvider, g6 startPaymentWorker, aq0 popupHandler, boolean z, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(startPaymentWorker, "startPaymentWorker");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f30992a = coroutineScope;
        this.f30993b = dataBundle;
        this.f30994c = paymentMethods;
        this.d = workflowIdProvider;
        this.e = startPaymentWorker;
        this.f = popupHandler;
        this.f30995g = z;
    }

    private final void e(e40 e40Var) {
        e40Var.d().b(new n5(a4.d.f26702a));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f30992a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(e40 e40Var) {
        e40Var.d().b(new n5(a4.c.f26701a));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(e40 e40Var) {
        Object next;
        if (this.f30995g) {
            Iterator it8 = this.f30994c.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (((t5) next).getName() == v6.f34254b) {
                        break;
                    }
                }
            }
            t5 t5Var = (t5) next;
            if (t5Var != null) {
                a(e40Var, t5Var);
                return;
            }
        }
        e40Var.d().b(new n5(a4.c.f26701a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(e40 e40Var) {
        aq0.a(this.f, q5.f32200a, new ko1(e40Var, 14), null, 4, null);
    }

    @Override // com.fourthline.orca.internal.e40.c
    public void a(e40 e40Var) {
        Intrinsics.checkNotNullParameter(e40Var, "<this>");
        if (!lh0.f30621a.d()) {
            d(e40Var);
            return;
        }
        if (this.f30994c.isEmpty()) {
            e(e40Var);
        } else if (this.f30994c.size() > 1) {
            e(e40Var);
        } else {
            a(e40Var, (t5) zhm.d0.b0(this.f30994c));
        }
    }

    private final void a(e40 e40Var, t5 t5Var) {
        skm.e0.C(this, null, null, new a(t5Var, e40Var, null), 3);
    }
}
