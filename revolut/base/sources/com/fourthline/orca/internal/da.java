package com.fourthline.orca.internal;

import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.tp0;
import com.fourthline.orca.internal.yp0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class da implements aq0, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fq0 f27674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg0 f27675c;
    private final CoroutineScope d;
    private final List e;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27676a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ gq0 f27678c;
        final /* synthetic */ hq0 d;
        final /* synthetic */ Function0 e;
        final /* synthetic */ Function0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f27679g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gq0 gq0Var, hq0 hq0Var, Function0 function0, Function0 function02, Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f27678c = gq0Var;
            this.d = hq0Var;
            this.e = function0;
            this.f = function02;
            this.f27679g = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return da.this.new a(this.f27678c, this.d, this.e, this.f, this.f27679g, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27676a;
            if (i == 0) {
                yhm.o.b(obj2);
                fq0 fq0Var = da.this.f27674b;
                zp0 state = this.f27678c.getState();
                this.f27676a = 1;
                obj2 = fq0Var.a(state, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            yp0 yp0Var = (yp0) obj2;
            if (yp0Var instanceof yp0.c) {
                da.this.a(this.f27678c, this.d, ((yp0.c) yp0Var).a(), this.e);
            } else if (yp0Var instanceof yp0.d) {
                da.this.b(this.f27678c, this.d, ((yp0.d) yp0Var).a(), this.f);
            } else if (yp0Var instanceof yp0.b) {
                da.this.a(this.f27678c, ((yp0.b) yp0Var).a(), this.f27679g);
            } else if (!(yp0Var instanceof yp0.e) && !(yp0Var instanceof yp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f186387a;
        }
    }

    public da(List initialProviders, fq0 presenter, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(initialProviders, "initialProviders");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27673a = initialProviders;
        this.f27674b = presenter;
        this.f27675c = analytics;
        this.d = coroutineScope;
        this.e = zhm.d0.f1(initialProviders);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.d.getCoroutineContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(gq0 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        String simpleName = it8.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(gq0 gq0Var, hq0 hq0Var, kd1 kd1Var, Function0 function0) {
        this.f27675c.track(new tp0.a.c(hq0Var, kd1Var));
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if ((gq0Var instanceof gq0.a) && (hq0Var instanceof hq0.c)) {
            ((gq0.a) gq0Var).b((hq0.c) hq0Var);
        } else if (gq0Var instanceof gq0.b) {
            ((gq0.b) gq0Var).a();
        }
    }

    public final void a(gq0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.e.add(provider);
    }

    @Override // com.fourthline.orca.internal.aq0
    public void a(hq0 popupType) throws IOException {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        a(popupType, (Function0) null, (Function0) null);
    }

    @Override // com.fourthline.orca.internal.aq0
    public void a(hq0 popupType, Function0 function0, Function0 function02) throws IOException {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        a(popupType, function0, function02, (Function1) null);
    }

    @Override // com.fourthline.orca.internal.aq0
    public void a(hq0 popupType, Function0 function0, Function0 function02, Function1 function1) throws IOException {
        Object next;
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        Iterator it8 = this.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (a((gq0) next, popupType)) {
                    break;
                }
            }
        }
        gq0 gq0Var = (gq0) next;
        if (gq0Var != null) {
            this.f27675c.track(new tp0.a.C0286a(popupType));
            skm.e0.C(this, null, null, new a(gq0Var, popupType, function0, function02, function1, null), 3);
            return;
        }
        wz.a("No provider was found for the popup type " + popupType + ". Registered providers are: " + zhm.d0.k0(this.e, null, null, null, 0, new bi1(17), 31));
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(gq0 gq0Var, hq0 hq0Var, kd1 kd1Var, Function0 function0) {
        this.f27675c.track(new tp0.a.b(hq0Var, kd1Var));
        if (function0 != null) {
            function0.invoke();
            return;
        }
        if ((gq0Var instanceof gq0.a) && (hq0Var instanceof hq0.c)) {
            ((gq0.a) gq0Var).a((hq0.c) hq0Var);
        } else if (gq0Var instanceof gq0.b) {
            ((gq0.b) gq0Var).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(gq0 gq0Var, int i, Function1 function1) {
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        } else if (gq0Var instanceof gq0.b) {
            ((gq0.b) gq0Var).a(i);
        }
    }

    private final boolean a(gq0 gq0Var, hq0 hq0Var) {
        if (gq0Var instanceof gq0.a) {
            if (hq0Var instanceof hq0.c) {
                return ((hq0.c) hq0Var).c().getClass().equals(((gq0.a) gq0Var).b().getClass());
            }
            return false;
        }
        if (gq0Var instanceof gq0.b) {
            return Intrinsics.f(hq0Var, ((gq0.b) gq0Var).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
