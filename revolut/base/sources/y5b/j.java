package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsAccountsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsAccountsService f311048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f311050c;
    public final sf0.h d;
    public final x4l.c e;
    public final x4l.c f;

    public j(CobrandedCardsAccountsService service, ue0.c storage, ne0.j memoryCache, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f311048a = service;
        this.f311049b = storage;
        this.f311050c = memoryCache;
        this.d = serverErrorParser;
        Continuation continuation = null;
        f fVar = new f(this, continuation, 1);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: y5b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f311021b;

            {
                this.f311021b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.e) this.f311021b.f311050c.get("KEY_LINK_ACCOUNT");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.e) this.f311021b.f311050c.get("KEY_CREATE_ACCOUNT");
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: y5b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f311023b;

            {
                this.f311023b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                r5b.e domain = (r5b.e) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311023b.f311050c.f("KEY_LINK_ACCOUNT", domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311023b.f311050c.f("KEY_CREATE_ACCOUNT", domain);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i2 = 1;
        this.e = new x4l.c(fVar, function1, function2, new g(this, continuation, i2), new h(this, continuation, i2));
        f fVar2 = new f(this, continuation, 0);
        final int i3 = 1;
        Function1 function12 = new Function1(this) { // from class: y5b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f311021b;

            {
                this.f311021b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.e) this.f311021b.f311050c.get("KEY_LINK_ACCOUNT");
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (r5b.e) this.f311021b.f311050c.get("KEY_CREATE_ACCOUNT");
                }
            }
        };
        Function2 function22 = new Function2(this) { // from class: y5b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f311023b;

            {
                this.f311023b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                r5b.e domain = (r5b.e) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311023b.f311050c.f("KEY_LINK_ACCOUNT", domain);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f311023b.f311050c.f("KEY_CREATE_ACCOUNT", domain);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i5 = 0;
        this.f = new x4l.c(fVar2, function12, function22, new g(this, continuation, i5), new h(this, continuation, i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(y5b.j r4, kotlin.jvm.functions.Function1 r5, kotlin.jvm.functions.Function1 r6, gim.c r7) throws java.io.IOException {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof y5b.i
            if (r0 == 0) goto L16
            r0 = r7
            y5b.i r0 = (y5b.i) r0
            int r1 = r0.f311044x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f311044x = r1
            goto L1b
        L16:
            y5b.i r0 = new y5b.i
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311044x
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.jvm.functions.Function1 r5 = r0.u
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            yhm.o.b(r7)
            goto L48
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            yhm.o.b(r7)
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r0.u = r7
            r0.f311044x = r3
            java.lang.Object r7 = r5.invoke(r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            retrofit2.Response r7 = (retrofit2.Response) r7
            int r5 = r7.code()
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 != r0) goto L57
            java.lang.Object r4 = r6.invoke(r7)
            return r4
        L57:
            sf0.h r4 = r4.d
            retrofit2.HttpException r5 = new retrofit2.HttpException
            r5.<init>(r7)
            com.revolut.core.error.data.model.ServerError r4 = r4.c(r5)
            if (r4 == 0) goto L6c
            int r4 = r4.f51362a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            goto L6d
        L6c:
            r5 = 0
        L6d:
            if (r5 != 0) goto L70
            goto L79
        L70:
            int r4 = r5.intValue()
            r6 = 76501(0x12ad5, float:1.07201E-40)
            if (r4 == r6) goto L8b
        L79:
            if (r5 == 0) goto L85
            int r4 = r5.intValue()
            r5 = 76502(0x12ad6, float:1.07202E-40)
            if (r4 != r5) goto L85
            goto L8b
        L85:
            retrofit2.HttpException r4 = new retrofit2.HttpException
            r4.<init>(r7)
            throw r4
        L8b:
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedAccountCouldNotBeLinkedOrCreated r4 = new com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedAccountCouldNotBeLinkedOrCreated
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y5b.j.a(y5b.j, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
