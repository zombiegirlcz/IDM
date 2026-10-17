package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
final class zf0 implements EidServiceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zf0 f35578a = new zf0();

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35579a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new a(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35579a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            throw zf0.f35578a.a();
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35580a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35580a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            throw zf0.f35578a.a();
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35581a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f35581a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            throw zf0.f35578a.a();
        }
    }

    private zf0() {
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    /* JADX INFO: renamed from: acceptAccessRights-IoAF18A */
    public Object mo3652acceptAccessRightsIoAF18A(Continuation continuation) {
        m.Companion companion = yhm.m.INSTANCE;
        return yhm.o.a(a());
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public Object authenticateWithCan(String str, Continuation continuation) {
        return new vkm.v1(new a(null));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public Object authenticateWithPin(String str, Continuation continuation) {
        return new vkm.v1(new b(null));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public void disconnect() {
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    /* JADX INFO: renamed from: fetchAccessRights-gIAlu-s */
    public Object mo3653fetchAccessRightsgIAlus(String str, Continuation continuation) {
        m.Companion companion = yhm.m.INSTANCE;
        return yhm.o.a(a());
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public boolean isAvailable() {
        return false;
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    public Object retryAuthenticateWithPin(String str, Continuation continuation) {
        return new vkm.v1(new c(null));
    }

    @Override // com.fourthline.core.eid.EidServiceProvider
    /* JADX INFO: renamed from: startProcess-gIAlu-s */
    public Object mo3654startProcessgIAlus(boolean z, Continuation continuation) {
        m.Companion companion = yhm.m.INSTANCE;
        return yhm.o.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UnsupportedOperationException a() {
        return new UnsupportedOperationException("eID functionality is not available. Add ':fourthline-eid' to dependencies to enable it.");
    }
}
