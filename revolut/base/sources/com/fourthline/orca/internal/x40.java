package com.fourthline.orca.internal;

import android.os.Build;
import com.fourthline.orca.internal.ab0;
import io.ktor.client.engine.HttpClientEngine;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.slf4j.Logger;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class x40 implements ib0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mb.d f34844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ez0 f34845c;
    private final db0 d;
    private final Lazy e;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34847b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(hem.c cVar, Continuation continuation) {
            return ((a) create(cVar, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = x40.this.new a(continuation);
            aVar.f34847b = obj2;
            return aVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            hem.c cVar = (hem.c) this.f34847b;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f34846a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            if (!x40.this.a(cVar.a().c())) {
                cVar.toString();
            }
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f34849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f34850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34851c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f34852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f34853h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f34854j;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34853h = obj2;
            this.f34854j |= Integer.MIN_VALUE;
            Object objA = x40.this.a(0L, null, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34857c;
        /* synthetic */ Object d;
        int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws Throwable {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = x40.this.a((ab0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f34859b;
        final /* synthetic */ ab0.a d;

        public static final class a extends gim.i implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f34861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f34862b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f34863c;
            Object d;
            Object e;
            int f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f34864g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f34865h;
            int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ x40 f34866j;
            final /* synthetic */ ab0.a k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ String f34867l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x40 x40Var, ab0.a aVar, String str, Continuation continuation) {
                super(1, continuation);
                this.f34866j = x40Var;
                this.k = aVar;
                this.f34867l = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Continuation continuation) {
                return new a(this.f34866j, this.k, this.f34867l, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.i;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vdm.b bVarC = this.f34866j.c();
                String urlString = this.k.e();
                ab0.a aVar2 = this.k;
                String str = this.f34867l;
                fem.d dVar = new fem.d();
                oem.a aVar3 = fem.f.f134664a;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(urlString, "urlString");
                kem.l0.b(dVar.f134657a, urlString);
                v40.a(dVar, aVar2, str);
                g1m.c cVar = new g1m.c(dVar, bVarC);
                this.f34861a = null;
                this.f34862b = null;
                this.f34863c = null;
                this.d = null;
                this.e = null;
                this.f = 0;
                this.f34864g = 0;
                this.f34865h = 0;
                this.i = 1;
                Object objB = cVar.b(this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ab0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return x40.this.new d(this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34859b;
            if (i == 0) {
                yhm.o.b(obj2);
                String strD = x40.this.d();
                x40 x40Var = x40.this;
                long length = this.d.a().b().length;
                a aVar2 = new a(x40.this, this.d, strD, null);
                this.f34858a = null;
                this.f34859b = 1;
                objA = x40Var.a(length, strD, aVar2, this);
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
            return new yhm.m(objA);
        }
    }

    public static final class e extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34870c;
        /* synthetic */ Object d;
        int f;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws Throwable {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = x40.this.a((ab0.c) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f34872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34873c;
        final /* synthetic */ ab0.c e;

        public static final class a extends gim.i implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f34874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f34875b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f34876c;
            Object d;
            Object e;
            Object f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f34877g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f34878h;
            int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f34879j;
            int k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f34880l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f34881m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ x40 f34882n;
            final /* synthetic */ ab0.c o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ String f34883p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x40 x40Var, ab0.c cVar, String str, Continuation continuation) {
                super(1, continuation);
                this.f34882n = x40Var;
                this.o = cVar;
                this.f34883p = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Continuation continuation) {
                return new a(this.f34882n, this.o, this.f34883p, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f34881m;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vdm.b bVarC = this.f34882n.c();
                String urlString = this.o.d();
                List listA = v40.a(this.o);
                ab0.c cVar = this.o;
                String str = this.f34883p;
                fem.d dVar = new fem.d();
                kem.y.Companion.getClass();
                kem.y yVar = kem.y.f183241c;
                Intrinsics.checkNotNullParameter(yVar, "<set-?>");
                dVar.f134658b = yVar;
                gem.f fVar = new gem.f(listA);
                Intrinsics.checkNotNullParameter(fVar, "<set-?>");
                dVar.d = fVar;
                dVar.a(null);
                oem.a aVar2 = fem.f.f134664a;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(urlString, "urlString");
                kem.l0.b(dVar.f134657a, urlString);
                v40.a(dVar, cVar, str);
                g1m.c cVar2 = new g1m.c(dVar, bVarC);
                this.f34874a = null;
                this.f34875b = null;
                this.f34876c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.f34877g = null;
                this.f34878h = null;
                this.i = 0;
                this.f34879j = 0;
                this.k = 0;
                this.f34880l = 0;
                this.f34881m = 1;
                Object objB = cVar2.b(this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ab0.c cVar, Continuation continuation) {
            super(2, continuation);
            this.e = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return x40.this.new f(this.e, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34873c;
            if (i == 0) {
                yhm.o.b(obj2);
                String strD = x40.this.d();
                Iterator it8 = this.e.a().iterator();
                long length = 0;
                while (it8.hasNext()) {
                    length += (long) ((ab0.c.a) it8.next()).c().b().length;
                }
                x40 x40Var = x40.this;
                a aVar2 = new a(x40Var, this.e, strD, null);
                this.f34871a = null;
                this.f34872b = length;
                this.f34873c = 1;
                objA = x40Var.a(length, strD, aVar2, this);
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
            return new yhm.m(objA);
        }
    }

    public x40(String baseUrl, mb.d networkEnvironment) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        this.f34843a = baseUrl;
        this.f34844b = networkEnvironment;
        ez0 ez0VarA = fz0.a(baseUrl);
        this.f34845c = ez0VarA;
        this.d = ez0VarA.b();
        this.e = yhm.j.b(new ht1(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vdm.b c() {
        return (vdm.b) this.e.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        c().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vdm.b c(x40 x40Var) {
        HttpClientEngine engine = x40Var.f34845c.a();
        gt1 block = new gt1(x40Var, 1);
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(block, "block");
        vdm.e eVar = new vdm.e();
        block.invoke(eVar);
        return new vdm.b(engine, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        String strA;
        db0 db0Var = this.d;
        if (db0Var != null && (strA = db0Var.a()) != null) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.fourthline.orca.internal.ib0
    public mb.d b() {
        return this.f34844b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(aem.j1 install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        String str = Build.MANUFACTURER + " " + Build.MODEL;
        install.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        install.f3737a = str;
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(x40 x40Var, aem.h defaultRequest) {
        Intrinsics.checkNotNullParameter(defaultRequest, "$this$defaultRequest");
        String urlString = x40Var.f34843a;
        defaultRequest.getClass();
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        kem.l0.b(defaultRequest.f3726b, urlString);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(fem.b bVar) {
        return kotlin.text.a0.y((String) bVar.getUrl().f183231j.getValue(), "/newanalytics", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(x40 x40Var, vdm.e HttpClient) {
        Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        HttpClient.a(aem.m1.f3751b, new nq1(25));
        int i = 0;
        gt1 block = new gt1(x40Var, i);
        Logger logger = aem.k.f3738a;
        Intrinsics.checkNotNullParameter(HttpClient, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        HttpClient.a(aem.i.f3731b, new aem.j(i, block));
        a block2 = x40Var.new a(null);
        bem.c cVar = cem.h.f23516a;
        Intrinsics.checkNotNullParameter(HttpClient, "<this>");
        Intrinsics.checkNotNullParameter(block2, "block");
        HttpClient.a(cem.h.f23516a, new aem.q(block2, 4));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r18, java.lang.String r20, kotlin.jvm.functions.Function1 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.x40.a(long, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.a r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.x40.c
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.x40$c r0 = (com.fourthline.orca.internal.x40.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.x40$c r0 = new com.fourthline.orca.internal.x40$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f34856b
            com.fourthline.orca.internal.ab0$a r6 = (com.fourthline.orca.internal.ab0.a) r6
            java.lang.Object r6 = r0.f34855a
            com.fourthline.orca.internal.ab0$a r6 = (com.fourthline.orca.internal.ab0.a) r6
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2f
            goto L56
        L2f:
            r6 = move-exception
            goto L5b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            yhm.o.b(r7)
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L2f
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L2f
            com.fourthline.orca.internal.x40$d r2 = new com.fourthline.orca.internal.x40$d     // Catch: java.lang.Exception -> L2f
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.lang.Exception -> L2f
            r0.f34855a = r4     // Catch: java.lang.Exception -> L2f
            r0.f34856b = r4     // Catch: java.lang.Exception -> L2f
            r6 = 0
            r0.f34857c = r6     // Catch: java.lang.Exception -> L2f
            r0.f = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r1) goto L56
            return r1
        L56:
            yhm.m r7 = (yhm.m) r7     // Catch: java.lang.Exception -> L2f
            java.lang.Object r6 = r7.f314193a     // Catch: java.lang.Exception -> L2f
            return r6
        L5b:
            java.lang.Object r6 = r5.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.x40.a(com.fourthline.orca.internal.ab0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.c r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.x40.e
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.x40$e r0 = (com.fourthline.orca.internal.x40.e) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.x40$e r0 = new com.fourthline.orca.internal.x40$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f34869b
            com.fourthline.orca.internal.ab0$c r6 = (com.fourthline.orca.internal.ab0.c) r6
            java.lang.Object r6 = r0.f34868a
            com.fourthline.orca.internal.ab0$c r6 = (com.fourthline.orca.internal.ab0.c) r6
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L2f
            goto L56
        L2f:
            r6 = move-exception
            goto L5b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            yhm.o.b(r7)
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L2f
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L2f
            com.fourthline.orca.internal.x40$f r2 = new com.fourthline.orca.internal.x40$f     // Catch: java.lang.Exception -> L2f
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.lang.Exception -> L2f
            r0.f34868a = r4     // Catch: java.lang.Exception -> L2f
            r0.f34869b = r4     // Catch: java.lang.Exception -> L2f
            r6 = 0
            r0.f34870c = r6     // Catch: java.lang.Exception -> L2f
            r0.f = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r1) goto L56
            return r1
        L56:
            yhm.m r7 = (yhm.m) r7     // Catch: java.lang.Exception -> L2f
            java.lang.Object r6 = r7.f314193a     // Catch: java.lang.Exception -> L2f
            return r6
        L5b:
            java.lang.Object r6 = r5.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.x40.a(com.fourthline.orca.internal.ab0$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object a(Exception exc2) {
        m.Companion companion = yhm.m.INSTANCE;
        return yhm.o.a(new ea0(exc2));
    }
}
