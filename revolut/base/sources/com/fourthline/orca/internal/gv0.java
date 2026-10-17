package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import com.fourthline.orca.internal.e40;
import com.fourthline.orca.internal.gv0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class gv0 implements e40.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f29022h = new a(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationProvider f29023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29025c;
    private final boolean d;
    private final fx0 e;
    private final CoroutineScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kw f29026g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29027a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e40 f29029c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e40 e40Var, Continuation continuation) {
            super(2, continuation);
            this.f29029c = e40Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return gv0.this.new b(this.f29029c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f29027a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            LocationProvider locationProvider = gv0.this.f29023a;
            final gv0 gv0Var = gv0.this;
            final e40 e40Var = this.f29029c;
            final int i = 0;
            final int i2 = 1;
            locationProvider.requestLocation(new Function1() { // from class: com.fourthline.orca.internal.pm1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i) {
                        case 0:
                            return gv0.b.a(gv0Var, e40Var, (Coordinate) obj3);
                        default:
                            return gv0.b.a(gv0Var, e40Var, (LocationProviderError) obj3);
                    }
                }
            }, new Function1() { // from class: com.fourthline.orca.internal.pm1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    switch (i2) {
                        case 0:
                            return gv0.b.a(gv0Var, e40Var, (Coordinate) obj3);
                        default:
                            return gv0.b.a(gv0Var, e40Var, (LocationProviderError) obj3);
                    }
                }
            });
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(gv0 gv0Var, e40 e40Var, Coordinate coordinate) {
            gv0Var.a(e40Var, coordinate);
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(gv0 gv0Var, e40 e40Var, LocationProviderError locationProviderError) {
            gv0Var.b(e40Var);
            return Unit.f186387a;
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29030a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e40 f29032c;
        final /* synthetic */ Coordinate d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e40 e40Var, Coordinate coordinate, Continuation continuation) {
            super(2, continuation);
            this.f29032c = e40Var;
            this.d = coordinate;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return gv0.this.new c(this.f29032c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f29030a;
            if (i == 0) {
                yhm.o.b(obj2);
                gv0 gv0Var = gv0.this;
                e40 e40Var = this.f29032c;
                Coordinate coordinate = this.d;
                this.f29030a = 1;
                if (gv0Var.a(e40Var, coordinate, this) == aVar) {
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
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29035c;
        int e;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29035c = obj2;
            this.e |= Integer.MIN_VALUE;
            return gv0.this.a((e40) null, (Coordinate) null, this);
        }
    }

    public gv0(LocationProvider locationProvider, String signatureId, String languageCode, boolean z, fx0 startSignatureWorker, CoroutineScope coroutineScope, kw errorHandler) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(signatureId, "signatureId");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(startSignatureWorker, "startSignatureWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.f29023a = locationProvider;
        this.f29024b = signatureId;
        this.f29025c = languageCode;
        this.d = z;
        this.e = startSignatureWorker;
        this.f = coroutineScope;
        this.f29026g = errorHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(gv0 gv0Var, e40 e40Var) {
        gv0Var.d(e40Var);
        return Unit.f186387a;
    }

    private final void d(e40 e40Var) {
        a(e40Var, new Coordinate(0.0d, 0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(e40 e40Var) {
        e40Var.b().a(e40Var.c().a(false));
        e40Var.d().b(x30.f34839a);
    }

    private final void c(e40 e40Var) {
        e40Var.b().a(e40Var.c().a(true));
        skm.e0.C(this.f, null, null, new b(e40Var, null), 3);
    }

    @Override // com.fourthline.orca.internal.e40.c
    public void a(e40 e40Var) {
        Intrinsics.checkNotNullParameter(e40Var, "<this>");
        if (this.d) {
            d(e40Var);
        } else if (this.f29023a.getAuthorizationStatus() == LocationProvider.AuthorizationStatus.AUTHORIZED && this.f29023a.getAccuracyAuthorization() == LocationProvider.AccuracyAuthorization.FULL && this.f29023a.getLocationServicesEnabled()) {
            c(e40Var);
        } else {
            e40Var.d().b(x30.f34839a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(e40 e40Var, Coordinate coordinate) {
        e40Var.b().a(e40Var.c().a(true));
        skm.e0.C(this.f, null, null, new c(e40Var, coordinate, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.e40 r7, com.fourthline.core.location.Coordinate r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.gv0.a(com.fourthline.orca.internal.e40, com.fourthline.core.location.Coordinate, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
