package edd;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.shared.signin.api.models.SignInNotAllowedDueToAgeException;
import com.revolut.feature.shared.signin.impl.data.SigninService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import sf0.h;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SigninService f124980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f124982c;

    public d(SigninService service, h serverErrorParser, o gson) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f124980a = service;
        this.f124981b = serverErrorParser;
        this.f124982c = gson;
    }

    public final cdd.c a(Object obj2) throws Throwable {
        ResponseBody responseBodyErrorBody;
        Throwable thA = m.a(obj2);
        if (thA == null) {
            yhm.o.b(obj2);
            return (cdd.c) obj2;
        }
        ServerError serverErrorA = this.f124981b.a(thA);
        String strString = null;
        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
        if (numValueOf == null || numValueOf.intValue() != 9505) {
            throw thA;
        }
        Response<?> response = ((HttpException) thA).response();
        if (response != null && (responseBodyErrorBody = response.errorBody()) != null) {
            strString = responseBodyErrorBody.string();
        }
        throw new SignInNotAllowedDueToAgeException(((gdd.b) this.f124982c.c(strString, gdd.b.class)).getGraduationAge());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, boolean r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof edd.b
            if (r0 == 0) goto L13
            r0 = r8
            edd.b r0 = (edd.b) r0
            int r1 = r0.f124977x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124977x = r1
            goto L18
        L13:
            edd.b r0 = new edd.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124977x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            edd.d r5 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r6 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L54
            com.revolut.feature.shared.signin.impl.data.SigninService r8 = r4.f124980a     // Catch: java.lang.Throwable -> L54
            gdd.i r2 = new gdd.i     // Catch: java.lang.Throwable -> L54
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L54
            r0.u = r4     // Catch: java.lang.Throwable -> L54
            r0.f124977x = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r8 = r8.signIn(r2, r0)     // Catch: java.lang.Throwable -> L54
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            gdd.c r8 = (gdd.c) r8     // Catch: java.lang.Throwable -> L29
            cdd.c r6 = d9.e1.S(r8)     // Catch: java.lang.Throwable -> L29
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            goto L5c
        L54:
            r6 = move-exception
            r5 = r4
        L56:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L5c:
            cdd.c r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: edd.d.b(java.lang.String, java.lang.String, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(wi0.b r5, java.lang.String r6, boolean r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof edd.c
            if (r0 == 0) goto L13
            r0 = r8
            edd.c r0 = (edd.c) r0
            int r1 = r0.f124979x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124979x = r1
            goto L18
        L13:
            edd.c r0 = new edd.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124979x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            edd.d r5 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r6 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L41
            com.revolut.feature.shared.signin.impl.data.SigninService r8 = r4.f124980a     // Catch: java.lang.Throwable -> L41
            gdd.h r2 = new gdd.h     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L44
            java.lang.String r5 = r5.f297794a     // Catch: java.lang.Throwable -> L41
            goto L45
        L41:
            r6 = move-exception
            r5 = r4
            goto L5d
        L44:
            r5 = 0
        L45:
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L41
            r0.u = r4     // Catch: java.lang.Throwable -> L41
            r0.f124979x = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r8 = r8.signInWithAccessToken(r2, r0)     // Catch: java.lang.Throwable -> L41
            if (r8 != r1) goto L53
            return r1
        L53:
            r5 = r4
        L54:
            gdd.c r8 = (gdd.c) r8     // Catch: java.lang.Throwable -> L29
            cdd.c r6 = d9.e1.S(r8)     // Catch: java.lang.Throwable -> L29
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29
            goto L63
        L5d:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L63:
            cdd.c r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: edd.d.c(wi0.b, java.lang.String, boolean, gim.c):java.lang.Object");
    }
}
