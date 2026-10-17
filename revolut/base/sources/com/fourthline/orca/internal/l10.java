package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.internal.jz;
import com.fourthline.orca.internal.oc1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class l10 {

    public static final class a extends gim.i implements Function3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30501c;
        int d;
        /* synthetic */ Object e;
        /* synthetic */ Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ jz f30502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ t9 f30503h;
        final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jz jzVar, t9 t9Var, Context context, Continuation continuation) {
            super(3, continuation);
            this.f30502g = jzVar;
            this.f30503h = t9Var;
            this.i = context;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(jz.a aVar, ye1 ye1Var, Continuation continuation) {
            a aVar2 = new a(this.f30502g, this.f30503h, this.i, continuation);
            aVar2.e = aVar;
            aVar2.f = ye1Var;
            return aVar2.invokeSuspend(Unit.f186387a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (r5.a(r7) == r2) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.e
                com.fourthline.orca.internal.jz$a r0 = (com.fourthline.orca.internal.jz.a) r0
                java.lang.Object r1 = r7.f
                com.fourthline.orca.internal.ye1 r1 = (com.fourthline.orca.internal.ye1) r1
                fim.a r2 = fim.a.COROUTINE_SUSPENDED
                int r3 = r7.d
                r4 = 2
                r5 = 1
                r6 = 0
                if (r3 == 0) goto L32
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r7.f30499a
                yhm.m r0 = (yhm.m) r0
                yhm.o.b(r8)
                yhm.m r8 = (yhm.m) r8
                r8.getClass()
                goto L6a
            L22:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L2a:
                yhm.o.b(r8)
                yhm.m r8 = (yhm.m) r8
                java.lang.Object r8 = r8.f314193a
                goto L44
            L32:
                yhm.o.b(r8)
                com.fourthline.orca.internal.jz r8 = r7.f30502g
                r7.e = r6
                r7.f = r1
                r7.d = r5
                java.lang.Object r8 = r8.a(r0, r7)
                if (r8 != r2) goto L44
                goto L69
            L44:
                yhm.m r0 = new yhm.m
                r0.<init>(r8)
                com.fourthline.orca.internal.t9 r8 = r7.f30503h
                android.content.Context r3 = r7.i
                com.fourthline.orca.internal.ma0 r5 = new com.fourthline.orca.internal.ma0
                java.io.File r3 = com.fourthline.core.ContextExtensionsKt.getAssetsFourthlineDirectory(r3)
                r5.<init>(r8, r3, r1)
                r7.e = r6
                r7.f = r6
                r7.f30499a = r0
                r7.f30500b = r6
                r8 = 0
                r7.f30501c = r8
                r7.d = r4
                java.lang.Object r8 = r5.a(r7)
                if (r8 != r2) goto L6a
            L69:
                return r2
            L6a:
                kotlin.Unit r8 = kotlin.Unit.f186387a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.l10.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final tb0 a() {
        return new tb0();
    }

    public final wc1 a(Context context, r70 mainRepository, Function0 workflowIdProvider, ib0 networkService, sb1 collectDeviceDataWorker, phm.a completeOnboardingWorkerProvider, kh1 workflowStatusWorker, tb0 nextFlowStatusValidator, c6 bavRedirectUrlWorker, t9 downloadWorker, jz flowVariantWorker, jx featuresAnalyticsContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(collectDeviceDataWorker, "collectDeviceDataWorker");
        Intrinsics.checkNotNullParameter(completeOnboardingWorkerProvider, "completeOnboardingWorkerProvider");
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        Intrinsics.checkNotNullParameter(nextFlowStatusValidator, "nextFlowStatusValidator");
        Intrinsics.checkNotNullParameter(bavRedirectUrlWorker, "bavRedirectUrlWorker");
        Intrinsics.checkNotNullParameter(downloadWorker, "downloadWorker");
        Intrinsics.checkNotNullParameter(flowVariantWorker, "flowVariantWorker");
        Intrinsics.checkNotNullParameter(featuresAnalyticsContext, "featuresAnalyticsContext");
        ha0 ha0Var = new ha0(context, workflowIdProvider, networkService, featuresAnalyticsContext, new a(flowVariantWorker, downloadWorker, context, null));
        Object obj2 = completeOnboardingWorkerProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return new wc1(mainRepository, ha0Var, workflowIdProvider, workflowStatusWorker, nextFlowStatusValidator, collectDeviceDataWorker, bavRedirectUrlWorker, (oc1) obj2);
    }

    public final oc1 a(r70 mainRepository, ib0 onboardingNetworkService) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        if (mainRepository.c()) {
            m.Companion companion = yhm.m.INSTANCE;
            return new c71(oc1.b.a.f31643a, 0L, 2, null);
        }
        return new ob0(onboardingNetworkService);
    }
}
