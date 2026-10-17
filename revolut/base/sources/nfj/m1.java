package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimConnectivityTroubleshootingInfo;
import com.revolut.retail.feature.esim.impl.network.EsimProfilesService;
import com.revolut.retail.feature.esim.impl.network.EsimProfilesServiceMock;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class m1 implements a1 {

    @NotNull
    public static final d1 Companion = new d1();
    public static final Type i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfilesService f214987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f214988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f214989c;
    public final gte.a d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f214990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f214991h;

    static {
        Type type = new TypeToken<List<? extends kfj.w2>>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimProfilesRepositoryImpl$Companion$profilesDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        i = type;
    }

    public m1(EsimProfilesService api2, ne0.j memoryCache, ue0.c storage, gte.a featureToggle) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        this.f214987a = api2;
        this.f214988b = memoryCache;
        this.f214989c = storage;
        this.d = featureToggle;
        final int i2 = 0;
        Continuation continuation = null;
        this.e = new x4l.c(new f1(this, continuation, i2), new Function1(this) { // from class: nfj.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214922b;

            {
                this.f214922b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f214922b.f214988b.get("PROFILES_KEY");
                    case 1:
                        dej.m params = (dej.m) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v7.r("PROFILES_KEY", params.name(), this.f214922b.f214988b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f214922b.f214988b.get("TROUBLESHOOTING_SCOPES_KEY");
                    default:
                        e1 simProfileId = (e1) obj2;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        ne0.j jVar = this.f214922b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        return (EsimConnectivityTroubleshootingInfo) jVar.get("TROUBLESHOOTING_KEY_".concat(str));
                }
            }
        }, new Function2(this) { // from class: nfj.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214928b;

            {
                this.f214928b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f214928b.f214988b.f("PROFILES_KEY", data);
                        break;
                    case 1:
                        dej.m params = (dej.m) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ehe.n.z("PROFILES_KEY", params.name(), this.f214928b.f214988b, data2);
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214928b.f214988b.f("TROUBLESHOOTING_SCOPES_KEY", data3);
                        break;
                    default:
                        e1 simProfileId = (e1) obj2;
                        EsimConnectivityTroubleshootingInfo data4 = (EsimConnectivityTroubleshootingInfo) obj3;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ne0.j jVar = this.f214928b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("TROUBLESHOOTING_KEY_".concat(str), data4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g1(this, continuation, i2), new h1(this, continuation, i2));
        final int i3 = 1;
        this.f = new x4l.c(new mtj.k(this, continuation, 17), new Function1(this) { // from class: nfj.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214922b;

            {
                this.f214922b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f214922b.f214988b.get("PROFILES_KEY");
                    case 1:
                        dej.m params = (dej.m) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v7.r("PROFILES_KEY", params.name(), this.f214922b.f214988b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f214922b.f214988b.get("TROUBLESHOOTING_SCOPES_KEY");
                    default:
                        e1 simProfileId = (e1) obj2;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        ne0.j jVar = this.f214922b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        return (EsimConnectivityTroubleshootingInfo) jVar.get("TROUBLESHOOTING_KEY_".concat(str));
                }
            }
        }, new Function2(this) { // from class: nfj.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214928b;

            {
                this.f214928b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f214928b.f214988b.f("PROFILES_KEY", data);
                        break;
                    case 1:
                        dej.m params = (dej.m) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ehe.n.z("PROFILES_KEY", params.name(), this.f214928b.f214988b, data2);
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214928b.f214988b.f("TROUBLESHOOTING_SCOPES_KEY", data3);
                        break;
                    default:
                        e1 simProfileId = (e1) obj2;
                        EsimConnectivityTroubleshootingInfo data4 = (EsimConnectivityTroubleshootingInfo) obj3;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ne0.j jVar = this.f214928b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("TROUBLESHOOTING_KEY_".concat(str), data4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i1(this, continuation, 0), new lp6.g(this, continuation, 29));
        f1 f1Var = new f1(this, continuation, 1);
        final int i5 = 2;
        Function1 function1 = new Function1(this) { // from class: nfj.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214922b;

            {
                this.f214922b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f214922b.f214988b.get("PROFILES_KEY");
                    case 1:
                        dej.m params = (dej.m) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v7.r("PROFILES_KEY", params.name(), this.f214922b.f214988b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f214922b.f214988b.get("TROUBLESHOOTING_SCOPES_KEY");
                    default:
                        e1 simProfileId = (e1) obj2;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        ne0.j jVar = this.f214922b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        return (EsimConnectivityTroubleshootingInfo) jVar.get("TROUBLESHOOTING_KEY_".concat(str));
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: nfj.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214928b;

            {
                this.f214928b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f214928b.f214988b.f("PROFILES_KEY", data);
                        break;
                    case 1:
                        dej.m params = (dej.m) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ehe.n.z("PROFILES_KEY", params.name(), this.f214928b.f214988b, data2);
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214928b.f214988b.f("TROUBLESHOOTING_SCOPES_KEY", data3);
                        break;
                    default:
                        e1 simProfileId = (e1) obj2;
                        EsimConnectivityTroubleshootingInfo data4 = (EsimConnectivityTroubleshootingInfo) obj3;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ne0.j jVar = this.f214928b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("TROUBLESHOOTING_KEY_".concat(str), data4);
                        break;
                }
                return Unit.f186387a;
            }
        };
        int i6 = 1;
        this.f214990g = new x4l.c(f1Var, function1, function2, new g1(this, continuation, i6), new h1(this, continuation, i6));
        final int i21 = 3;
        this.f214991h = new x4l.c(new mtj.k(this, continuation, 18), new Function1(this) { // from class: nfj.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214922b;

            {
                this.f214922b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f214922b.f214988b.get("PROFILES_KEY");
                    case 1:
                        dej.m params = (dej.m) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (List) v7.r("PROFILES_KEY", params.name(), this.f214922b.f214988b);
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (List) this.f214922b.f214988b.get("TROUBLESHOOTING_SCOPES_KEY");
                    default:
                        e1 simProfileId = (e1) obj2;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        ne0.j jVar = this.f214922b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        return (EsimConnectivityTroubleshootingInfo) jVar.get("TROUBLESHOOTING_KEY_".concat(str));
                }
            }
        }, new Function2(this) { // from class: nfj.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f214928b;

            {
                this.f214928b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i21) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f214928b.f214988b.f("PROFILES_KEY", data);
                        break;
                    case 1:
                        dej.m params = (dej.m) obj2;
                        List data2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        ehe.n.z("PROFILES_KEY", params.name(), this.f214928b.f214988b, data2);
                        break;
                    case 2:
                        List data3 = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214928b.f214988b.f("TROUBLESHOOTING_SCOPES_KEY", data3);
                        break;
                    default:
                        e1 simProfileId = (e1) obj2;
                        EsimConnectivityTroubleshootingInfo data4 = (EsimConnectivityTroubleshootingInfo) obj3;
                        Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
                        Intrinsics.checkNotNullParameter(data4, "data");
                        ne0.j jVar = this.f214928b.f214988b;
                        String str = simProfileId.f214938a;
                        if (str == null) {
                            str = "";
                        }
                        jVar.f("TROUBLESHOOTING_KEY_".concat(str), data4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new i1(this, continuation, 1), new l1(this, continuation, 0));
    }

    public static long a(Response response, String str, long j2) {
        Long lN;
        String strA = response.headers().a(str);
        if (strA == null || (lN = kotlin.text.z.n(strA)) == null) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            return kotlin.time.c.h(j2, pkm.e.SECONDS);
        }
        long jAbs = Math.abs(lN.longValue());
        b.Companion companion2 = kotlin.time.b.INSTANCE;
        return kotlin.time.c.h(jAbs, pkm.e.SECONDS);
    }

    public static dej.q1 d(Response response, String str) {
        if (response.code() != 202) {
            throw new HttpException(response);
        }
        return new dej.q1(str, a(response, "Retry-After", 1L), a(response, "X-Retry-Timeout", 5L));
    }

    public final EsimProfilesService b() {
        boolean zC = ((jte.d) this.d).c(EsimApi$Toggles.MockEsimApi.f100187a);
        if (zC) {
            return EsimProfilesServiceMock.f100569a;
        }
        if (zC) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f214987a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nfj.j1
            if (r0 == 0) goto L13
            r0 = r6
            nfj.j1 r0 = (nfj.j1) r0
            int r1 = r0.f214971y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214971y = r1
            goto L18
        L13:
            nfj.j1 r0 = new nfj.j1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f214969w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214971y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            nfj.m1 r5 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.revolut.retail.feature.esim.impl.network.EsimProfilesService r6 = r4.b()
            r0.u = r5
            r0.v = r4
            r0.f214971y = r3
            java.lang.Object r6 = r6.reissueProfile(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r5
            r5 = r4
        L49:
            retrofit2.Response r6 = (retrofit2.Response) r6
            r5.getClass()
            dej.q1 r5 = d(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.m1.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nfj.k1
            if (r0 == 0) goto L13
            r0 = r6
            nfj.k1 r0 = (nfj.k1) r0
            int r1 = r0.f214974y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214974y = r1
            goto L18
        L13:
            nfj.k1 r0 = new nfj.k1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f214972w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214974y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            nfj.m1 r5 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            com.revolut.retail.feature.esim.impl.network.EsimProfilesService r6 = r4.b()
            r0.u = r5
            r0.v = r4
            r0.f214974y = r3
            java.lang.Object r6 = r6.transferProfileToCurrentDevice(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r5
            r5 = r4
        L49:
            retrofit2.Response r6 = (retrofit2.Response) r6
            r5.getClass()
            dej.q1 r5 = d(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nfj.m1.e(java.lang.String, gim.c):java.lang.Object");
    }
}
