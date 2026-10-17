package com.fourthline.orca.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ma0 implements pf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t9 f31124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f31125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ye1 f31126c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31129c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f31130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f31131h;
        Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f31132j;
        int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f31133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f31134m;
        int o;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31134m = obj2;
            this.o |= Integer.MIN_VALUE;
            Object objA = ma0.this.a(null, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f31137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31138c;
        int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31138c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = ma0.this.a(this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31141c;
        final /* synthetic */ String d;
        final /* synthetic */ ma0 e;

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f31142a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ma0 f31143b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f31144c;
            final /* synthetic */ wf0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ma0 ma0Var, List list, wf0 wf0Var, Continuation continuation) {
                super(2, continuation);
                this.f31143b = ma0Var;
                this.f31144c = list;
                this.d = wf0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                return new a(this.f31143b, this.f31144c, this.d, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                Object objA;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f31142a;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ma0 ma0Var = this.f31143b;
                    List list = this.f31144c;
                    wf0 wf0Var = this.d;
                    this.f31142a = 1;
                    objA = ma0Var.a(list, wf0Var, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = ((yhm.m) obj2).f314193a;
                }
                yhm.o.b(objA);
                return objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, ma0 ma0Var, Continuation continuation) {
            super(2, continuation);
            this.f31141c = str;
            this.d = str2;
            this.e = ma0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            c cVar = new c(this.f31141c, this.d, this.e, continuation);
            cVar.f31140b = obj2;
            return cVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f31140b;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f31139a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                return obj2;
            }
            yhm.o.b(obj2);
            EnumEntries<wf0> enumEntriesC = wf0.c();
            String str = this.f31141c;
            String str2 = this.d;
            ma0 ma0Var = this.e;
            ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesC, 10));
            for (wf0 wf0Var : enumEntriesC) {
                arrayList.add(skm.e0.g(coroutineScope, null, null, new a(ma0Var, zhm.v.k(str + "/" + str2 + "/videos/android/" + wf0Var.d(), str + "/default/videos/android/" + wf0Var.d()), wf0Var, null), 3));
            }
            this.f31140b = null;
            this.f31139a = 1;
            Object objH = skm.e0.h(arrayList, this);
            return objH == aVar ? aVar : objH;
        }
    }

    public ma0(t9 downloadWorker, File assetsFourthlineDirectory, ye1 tenantConfig) {
        Intrinsics.checkNotNullParameter(downloadWorker, "downloadWorker");
        Intrinsics.checkNotNullParameter(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        Intrinsics.checkNotNullParameter(tenantConfig, "tenantConfig");
        this.f31124a = downloadWorker;
        this.f31125b = assetsFourthlineDirectory;
        this.f31126c = tenantConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ae -> B:21:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r12, com.fourthline.orca.internal.wf0 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ma0.a(java.util.List, com.fourthline.orca.internal.wf0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.pf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.ma0.b
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.ma0$b r0 = (com.fourthline.orca.internal.ma0.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ma0$b r0 = new com.fourthline.orca.internal.ma0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31138c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f31137b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31136a
            java.lang.String r0 = (java.lang.String) r0
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2f
            goto L76
        L2f:
            r7 = move-exception
            goto L7b
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            yhm.o.b(r7)
            com.fourthline.orca.internal.ye1 r7 = r6.f31126c
            com.fourthline.orca.internal.af1 r7 = r7.getTenant()
            com.fourthline.orca.internal.ty0 r7 = r7.getRemoteAssets()
            boolean r7 = r7.getEnabled()
            if (r7 == 0) goto L85
            java.lang.String r7 = "android/3.4.29"
            com.fourthline.orca.internal.ye1 r2 = r6.f31126c
            com.fourthline.orca.internal.af1 r2 = r2.getTenant()
            java.lang.String r2 = r2.getName()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r4)
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            com.fourthline.orca.internal.ma0$c r4 = new com.fourthline.orca.internal.ma0$c     // Catch: java.lang.Exception -> L2f
            r5 = 0
            r4.<init>(r7, r2, r6, r5)     // Catch: java.lang.Exception -> L2f
            r0.f31136a = r5     // Catch: java.lang.Exception -> L2f
            r0.f31137b = r5     // Catch: java.lang.Exception -> L2f
            r0.e = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = skm.e0.o(r4, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r1) goto L76
            return r1
        L76:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L2f
            com.fourthline.orca.internal.pf0$a$a r7 = com.fourthline.orca.internal.pf0.a.C0263a.f31952a     // Catch: java.lang.Exception -> L2f
            return r7
        L7b:
            r7.printStackTrace()
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
            return r7
        L85:
            yhm.m$a r7 = yhm.m.INSTANCE
            com.fourthline.orca.internal.pf0$a$a r7 = com.fourthline.orca.internal.pf0.a.C0263a.f31952a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ma0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
