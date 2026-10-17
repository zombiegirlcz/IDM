package com.fourthline.orca.internal;

import android.net.Uri;
import com.fourthline.orca.internal.fb1;
import com.fourthline.orca.internal.jm0;
import com.fourthline.orca.internal.km0;
import com.fourthline.orca.internal.nx;
import com.fourthline.orca.internal.vo0;
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
public final class fp0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f28593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob1 f28594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f28595c;
    private final fe1 d;
    private final cp0 e;
    private final g8 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qx f28596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qg0 f28597h;
    private final aq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ox f28598j;
    private final mq0 k;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, fp0.class, obj2, "onPopupMenuItemClicked", "onPopupMenuItemClicked$fourthline_sdk_release(I)V");
        }

        public final void a(int i) {
            ((fp0) this.receiver).a(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a(((Number) obj2).intValue());
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ nx f28601c;
        final /* synthetic */ fp0 d;
        final /* synthetic */ Uri e;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ip0.values().length];
                try {
                    iArr[ip0.f29666b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ip0.f29665a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nx nxVar, fp0 fp0Var, Uri uri2, Continuation continuation) {
            super(2, continuation);
            this.f28601c = nxVar;
            this.d = fp0Var;
            this.e = uri2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return new b(this.f28601c, this.d, this.e, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r4.f28600b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r4.f28599a
                com.fourthline.orca.internal.cp0 r0 = (com.fourthline.orca.internal.cp0) r0
                yhm.o.b(r5)
                goto L52
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1c:
                yhm.o.b(r5)
                goto L6f
            L20:
                yhm.o.b(r5)
                com.fourthline.orca.internal.nx r5 = r4.f28601c
                com.fourthline.orca.internal.nx$c r5 = (com.fourthline.orca.internal.nx.c) r5
                com.fourthline.orca.internal.ip0 r5 = r5.a()
                int[] r1 = com.fourthline.orca.internal.fp0.b.a.$EnumSwitchMapping$0
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 == r3) goto L5e
                if (r5 != r2) goto L58
                com.fourthline.orca.internal.fp0 r5 = r4.d
                com.fourthline.orca.internal.cp0 r5 = com.fourthline.orca.internal.fp0.c(r5)
                com.fourthline.orca.internal.fp0 r1 = r4.d
                com.fourthline.orca.internal.g8 r1 = com.fourthline.orca.internal.fp0.a(r1)
                android.net.Uri r3 = r4.e
                r4.f28599a = r5
                r4.f28600b = r2
                java.lang.Object r1 = r1.a(r3, r4)
                if (r1 != r0) goto L50
                goto L6e
            L50:
                r0 = r5
                r5 = r1
            L52:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                r0.a(r5)
                goto L7a
            L58:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            L5e:
                com.fourthline.orca.internal.fp0 r5 = r4.d
                com.fourthline.orca.internal.qx r5 = com.fourthline.orca.internal.fp0.b(r5)
                android.net.Uri r1 = r4.e
                r4.f28600b = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L6f
            L6e:
                return r0
            L6f:
                java.net.URI r5 = (java.net.URI) r5
                com.fourthline.orca.internal.fp0 r0 = r4.d
                com.fourthline.orca.internal.cp0 r0 = com.fourthline.orca.internal.fp0.c(r0)
                r0.a(r5)
            L7a:
                com.fourthline.orca.internal.fp0 r5 = r4.d
                com.fourthline.orca.internal.fe1 r5 = r5.c()
                com.fourthline.orca.internal.jm0$a$a r0 = com.fourthline.orca.internal.jm0.a.C0228a.f29962a
                r5.b(r0)
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.fp0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public fp0(ob1 typeSelectViewModel, wr effectHandler, fe1 viewNavigator, cp0 resultRepository, g8 bitmapDecoderFromUri, qx fileWriterFromUri, qg0 analytics, aq0 popupHandler, ox fileValidator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(typeSelectViewModel, "typeSelectViewModel");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(bitmapDecoderFromUri, "bitmapDecoderFromUri");
        Intrinsics.checkNotNullParameter(fileWriterFromUri, "fileWriterFromUri");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(fileValidator, "fileValidator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f28593a = coroutineScope;
        this.f28594b = typeSelectViewModel;
        this.f28595c = effectHandler;
        this.d = viewNavigator;
        this.e = resultRepository;
        this.f = bitmapDecoderFromUri;
        this.f28596g = fileWriterFromUri;
        this.f28597h = analytics;
        this.i = popupHandler;
        this.f28598j = fileValidator;
        this.k = typeSelectViewModel.a();
    }

    private final void d() {
        this.f28597h.track(vo0.a.f.f34416b);
        this.f28595c.a(new dl1(11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jm0 e() {
        return jm0.b.f29965a;
    }

    private final void f() {
        this.f28597h.track(vo0.a.e.f34415b);
        this.f28595c.a(new dl1(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jm0 g() {
        return jm0.c.f29966a;
    }

    private final void h() {
        aq0.a(this.i, lm0.f30678a, null, null, new a(this), 6, null);
    }

    private final void i() {
        this.f28597h.track(vo0.a.d.f34414b);
        this.d.b(jm0.a.c.f29964a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f28593a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(fp0 fp0Var) {
        fp0Var.d();
        return Unit.f186387a;
    }

    public final mq0 b() {
        return this.k;
    }

    public final fe1 c() {
        return this.d;
    }

    private final void b(Uri uri2) {
        if (uri2 != null) {
            this.f28597h.track(vo0.a.c.f34413b);
            c(uri2);
        }
    }

    private final void c(Uri uri2) {
        nx nxVarA = this.f28598j.a(uri2);
        if (nxVarA instanceof nx.c) {
            skm.e0.C(this, null, null, new b(nxVarA, this, uri2, null), 3);
            return;
        }
        if (nxVarA instanceof nx.a) {
            final int i = 0;
            aq0.a(this.i, nm0.f31453a, new Function0(this) { // from class: com.fourthline.orca.internal.zl1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ fp0 f35636b;

                {
                    this.f35636b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return fp0.d(this.f35636b);
                        default:
                            return fp0.e(this.f35636b);
                    }
                }
            }, null, 4, null);
        } else {
            if (nxVarA instanceof nx.b) {
                final int i2 = 1;
                aq0.a(this.i, om0.f31693a, new Function0(this) { // from class: com.fourthline.orca.internal.zl1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ fp0 f35636b;

                    {
                        this.f35636b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return fp0.d(this.f35636b);
                            default:
                                return fp0.e(this.f35636b);
                        }
                    }
                }, null, 4, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(fp0 fp0Var) {
        fp0Var.f();
        return Unit.f186387a;
    }

    public final wr a() {
        return this.f28595c;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(km0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof km0.g) {
            this.f28594b.a((fb1) new fb1.d());
            return;
        }
        if (event instanceof km0.f) {
            this.f28594b.a((fb1) new fb1.e(((km0.f) event).a()));
            return;
        }
        if (event instanceof km0.e) {
            h();
            return;
        }
        if (event instanceof km0.a) {
            this.f28594b.a((fb1) new fb1.a());
            return;
        }
        if (event instanceof km0.b) {
            this.f28594b.a((fb1) new fb1.b());
        } else if (event instanceof km0.c) {
            a(((km0.c) event).a());
        } else {
            if (!(event instanceof km0.d)) {
                throw new NoWhenBranchMatchedException();
            }
            b(((km0.d) event).a());
        }
    }

    public final void a(int i) {
        if (i == 0) {
            f();
        } else {
            i();
        }
    }

    private final void a(Uri uri2) {
        if (uri2 != null) {
            this.f28597h.track(vo0.a.C0300a.f34411b);
            c(uri2);
        }
    }
}
