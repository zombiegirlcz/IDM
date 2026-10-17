package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q80;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final MutableStateFlow f35559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final StateFlow f35560b;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f35563c;
        final /* synthetic */ q70 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q70 q70Var, Continuation continuation) {
            super(2, continuation);
            this.d = q70Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ukm.b bVar, Continuation continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = new a(this.d, continuation);
            aVar.f35563c = obj2;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f35563c
                ukm.b r0 = (ukm.b) r0
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r4.f35562b
                r3 = 1
                if (r2 == 0) goto L1d
                if (r2 != r3) goto L15
                java.lang.Object r0 = r4.f35561a
                ukm.g r0 = (ukm.g) r0
                yhm.o.b(r5)
                goto L3d
            L15:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1d:
                yhm.o.b(r5)
                ukm.v r0 = (ukm.v) r0
                r0.getClass()
                ukm.q r5 = r0.d
                r5.getClass()
                ukm.g r0 = new ukm.g
                r0.<init>(r5)
            L2f:
                r5 = 0
                r4.f35563c = r5
                r4.f35561a = r0
                r4.f35562b = r3
                java.lang.Object r5 = r0.a(r4)
                if (r5 != r1) goto L3d
                return r1
            L3d:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L54
                java.lang.Object r5 = r0.c()
                com.fourthline.orca.internal.q80 r5 = (com.fourthline.orca.internal.q80) r5
                java.util.Objects.toString(r5)
                com.fourthline.orca.internal.q70 r2 = r4.d
                r2.a(r5)
                goto L2f
            L54:
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.zc.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        vkm.j2 j2VarC = vkm.q.c(new q80.o(null, 1, null));
        f35559a = j2VarC;
        f35560b = j2VarC;
    }

    public static final ukm.j0 a(CoroutineScope coroutineScope, q70 coordinator) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        return ukm.e.a(coroutineScope, Integer.MAX_VALUE, skm.d0.LAZY, null, new a(coordinator, null), 9);
    }
}
