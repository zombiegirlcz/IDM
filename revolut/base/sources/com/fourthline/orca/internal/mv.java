package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import com.fourthline.orca.internal.e40;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class mv implements e40.e, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vt f31270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bs f31271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f31272c;
    private final EidServiceProvider d;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31275c;
        private /* synthetic */ Object d;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = mv.this.new a(continuation);
            aVar.d = obj2;
            return aVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            Object objMo3654startProcessgIAlus;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f31275c;
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    mv mvVar = mv.this;
                    m.Companion companion = yhm.m.INSTANCE;
                    EidServiceProvider eidServiceProvider = mvVar.d;
                    boolean zD = mvVar.f31271b.d();
                    this.d = null;
                    this.f31273a = null;
                    this.f31274b = 0;
                    this.f31275c = 1;
                    objMo3654startProcessgIAlus = eidServiceProvider.mo3654startProcessgIAlus(zD, this);
                    if (objMo3654startProcessgIAlus == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objMo3654startProcessgIAlus = ((yhm.m) obj2).f314193a;
                }
                yhm.o.b(objMo3654startProcessgIAlus);
                objA = Unit.f186387a;
                m.Companion companion2 = yhm.m.INSTANCE;
            } catch (Throwable th10) {
                m.Companion companion3 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            return new yhm.m(objA);
        }
    }

    public mv(vt repository, bs bundle, CoroutineScope coroutineScope, EidServiceProvider eidServiceProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eidServiceProvider, "eidServiceProvider");
        this.f31270a = repository;
        this.f31271b = bundle;
        this.f31272c = coroutineScope;
        this.d = eidServiceProvider;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f31272c.getF74819h();
    }

    @Override // com.fourthline.orca.internal.e40.e
    public void a(e40 e40Var) {
        Intrinsics.checkNotNullParameter(e40Var, "<this>");
        if (this.d.isAvailable()) {
            if (this.f31270a.a()) {
                this.f31271b.a(true);
            }
            if (this.f31271b.g() == null) {
                this.f31271b.a(skm.e0.g(this, null, null, new a(null), 3));
            }
        }
    }
}
