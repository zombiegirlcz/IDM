package com.fourthline.orca.internal;

import android.content.res.Resources;
import com.fourthline.orca.internal.ab0;
import com.fourthline.orca.internal.ke;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class y90 implements ke, CoroutineScope {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f35198l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f35199m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ib0 f35201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w70 f35202c;
    private final CoroutineDispatcher d;
    private final CoroutineDispatcher e;
    private final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f35203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f35204h;
    private le i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f35205j;
    private final Map k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35207b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f35207b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = y90.this.a((ab0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35211c;
        int d;
        final /* synthetic */ le f;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f35212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f35213b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f35214c;
            int d;
            int e;
            final /* synthetic */ Object f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ y90 f35215g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ le f35216h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj2, y90 y90Var, le leVar, Continuation continuation) {
                super(2, continuation);
                this.f = obj2;
                this.f35215g = y90Var;
                this.f35216h = leVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                return new a(this.f, this.f35215g, this.f35216h, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
            
                if (r1.a(r6, r2, r10) == r0) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
            
                if (r4.a(r3, r10) != r0) goto L32;
             */
            @Override // gim.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 203
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y90.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(le leVar, Continuation continuation) {
            super(2, continuation);
            this.f = leVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return y90.this.new c(this.f, continuation);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        
            if (r7 == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        
            if (skm.e0.J(r1, r3, r6) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
        
            if (r1.a(r3, r4, r6) == r0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[PHI: r7
          0x00af: PHI (r7v24 java.lang.Object) = (r7v16 java.lang.Object), (r7v19 java.lang.Object), (r7v28 java.lang.Object) binds: [B:20:0x006f, B:35:0x00ac, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y90.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f35219c;
        int e;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f35219c = obj2;
            this.e |= Integer.MIN_VALUE;
            return y90.this.a((le) null, this);
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35220a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ le f35222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(le leVar, Continuation continuation) {
            super(2, continuation);
            this.f35222c = leVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return y90.this.new e(this.f35222c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f35220a;
            if (i == 0) {
                yhm.o.b(obj2);
                y90 y90Var = y90.this;
                le leVar = this.f35222c;
                ke.a.c cVar = ke.a.c.f30246a;
                this.f35220a = 1;
                if (y90Var.a(leVar, cVar, this) == aVar) {
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

    public static final class f extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f35225c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f35226g;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f35226g |= Integer.MIN_VALUE;
            return y90.this.a((ab0.c) null, (String) null, this);
        }
    }

    public static final class g extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f35227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35228b;
        int d;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f35228b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = y90.this.a((ab0.c) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public y90(ib0 networkService, w70 mediaSigner, CoroutineDispatcher mainDispatcher, CoroutineDispatcher ioDispatcher, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(mediaSigner, "mediaSigner");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f35200a = coroutineScope;
        this.f35201b = networkService;
        this.f35202c = mediaSigner;
        this.d = mainDispatcher;
        this.e = ioDispatcher;
        this.f = new LinkedHashMap();
        this.f35203g = new LinkedHashMap();
        this.f35204h = new ArrayList();
        this.f35205j = new LinkedHashMap();
        this.k = new LinkedHashMap();
    }

    private final boolean c() {
        return !b();
    }

    public boolean d(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return this.f.containsKey(identifier);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f35200a.getF74819h();
    }

    public ke.a c(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return (ke.a) this.f.get(identifier);
    }

    private final boolean b() {
        return this.i != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(le leVar) {
        if (!leVar.d()) {
            return null;
        }
        if (leVar instanceof ty) {
            return ((ty) leVar).e();
        }
        if (leVar instanceof il) {
            return ((il) leVar).e();
        }
        return null;
    }

    public final List b(String prefix) {
        int i;
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Collection collectionValues = this.k.values();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collectionValues.iterator();
        while (true) {
            i = 0;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (kotlin.text.a0.H(((le) next).a(), prefix, false)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (c(((le) obj2).a()) instanceof ke.a.b) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // com.fourthline.orca.internal.ke
    public Flow a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.f35203g.get(identifier);
        return mutableSharedFlow != null ? mutableSharedFlow : new go.g(new ne(identifier, new ke.a.b(new Resources.NotFoundException())), 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y90(ib0 ib0Var, w70 w70Var, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            skm.p0 p0Var = skm.p0.f264001a;
            coroutineDispatcher = zkm.o.f323119a;
        }
        CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcher;
        if ((i & 8) != 0) {
            skm.p0 p0Var2 = skm.p0.f264001a;
            coroutineDispatcher2 = elm.f.f127540b;
        }
        this(ib0Var, w70Var, coroutineDispatcher3, coroutineDispatcher2, coroutineScope);
    }

    @Override // com.fourthline.orca.internal.ke
    public void a(le request) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.a();
        this.f35203g.put(request.a(), vkm.q.b(0, 6, null));
        this.f35205j.remove(request.a());
        this.f35204h.add(request);
        skm.e0.E(kotlin.coroutines.g.f186406a, new e(request, null));
        a();
    }

    private final void b(le leVar) {
        leVar.a();
        this.i = leVar;
        skm.e0.C(this, this.e, null, new c(leVar, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        le leVar;
        if (!c() || (leVar = (le) zhm.a0.G(this.f35204h)) == null) {
            return;
        }
        leVar.a();
        b(leVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.ab0.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.y90.b
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.y90$b r0 = (com.fourthline.orca.internal.y90.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.y90$b r0 = new com.fourthline.orca.internal.y90$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35207b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f35206a
            com.fourthline.orca.internal.ab0$a r5 = (com.fourthline.orca.internal.ab0.a) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.ib0 r6 = r4.f35201b
            r2 = 0
            r0.f35206a = r2
            r0.d = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y90.a(com.fourthline.orca.internal.ab0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.ab0.c r20, java.lang.String r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y90.a(com.fourthline.orca.internal.ab0$c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.ab0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.y90.g
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.y90$g r0 = (com.fourthline.orca.internal.y90.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.y90$g r0 = new com.fourthline.orca.internal.y90$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35228b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f35227a
            com.fourthline.orca.internal.ab0$c r5 = (com.fourthline.orca.internal.ab0.c) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.ib0 r6 = r4.f35201b
            r2 = 0
            r0.f35227a = r2
            r0.d = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y90.a(com.fourthline.orca.internal.ab0$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.le r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.fourthline.orca.internal.y90.d
            if (r0 == 0) goto L13
            r0 = r10
            com.fourthline.orca.internal.y90$d r0 = (com.fourthline.orca.internal.y90.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.y90$d r0 = new com.fourthline.orca.internal.y90$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f35219c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r9 = r0.f35217a
            com.fourthline.orca.internal.le r9 = (com.fourthline.orca.internal.le) r9
            yhm.o.b(r10)
            goto L70
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            yhm.o.b(r10)
            java.util.Map r10 = r8.f35205j
            java.lang.String r2 = r9.a()
            java.lang.Object r10 = r10.get(r2)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L4a
            int r10 = r10.intValue()
            goto L4b
        L4a:
            r10 = r3
        L4b:
            int r2 = r9.b()
            if (r10 >= r2) goto L75
            java.util.Map r2 = r8.f35205j
            java.lang.String r5 = r9.a()
            int r6 = r10 + 1
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r2.put(r5, r7)
            r0.f35217a = r9
            r0.f35218b = r10
            r0.e = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = skm.k0.b(r4, r0)
            if (r10 != r1) goto L70
            return r1
        L70:
            java.util.List r10 = r8.f35204h
            r10.add(r3, r9)
        L75:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.y90.a(com.fourthline.orca.internal.le, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final JsonObject a(JsonObject jsonObject, v70 v70Var) {
        Map mapK = zhm.r0.k(new Pair("signature", rlm.j.c(v70Var.b())), new Pair("nonce", rlm.j.c(v70Var.a())));
        JsonElement jsonElement = (JsonElement) jsonObject.get("kycFiles");
        kotlinx.serialization.json.a aVarJ = jsonElement != null ? rlm.j.j(jsonElement) : null;
        if (aVarJ != null) {
            ArrayList arrayList = new ArrayList(zhm.w.t(aVarJ, 10));
            Iterator it8 = aVarJ.f187952a.iterator();
            while (it8.hasNext()) {
                arrayList.add(new JsonObject(zhm.r0.p(rlm.j.k((JsonElement) it8.next()), mapK)));
            }
            return new JsonObject(zhm.r0.p(jsonObject, zhm.q0.c(new Pair("kycFiles", new kotlinx.serialization.json.a(arrayList)))));
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject.get("kycFile");
        JsonObject jsonObjectK = jsonElement2 != null ? rlm.j.k(jsonElement2) : null;
        return jsonObjectK != null ? new JsonObject(zhm.r0.p(jsonObject, zhm.q0.c(new Pair("kycFile", new JsonObject(zhm.r0.p(jsonObjectK, mapK)))))) : jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(le leVar, ke.a aVar, Continuation continuation) {
        leVar.a();
        Objects.toString(aVar);
        this.f.put(leVar.a(), aVar);
        if (aVar instanceof ke.a.b) {
            this.k.put(leVar.a(), leVar);
        } else if (aVar instanceof ke.a.d) {
            this.k.remove(leVar.a());
        }
        ne neVar = new ne(leVar.a(), aVar);
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.f35203g.get(leVar.a());
        if (mutableSharedFlow == null) {
            return Unit.f186387a;
        }
        Object objEmit = mutableSharedFlow.emit(neVar, continuation);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
