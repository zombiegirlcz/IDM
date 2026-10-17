package xg6;

import android.net.Uri;
import com.revolut.data.network.models.openbanking.ExternalInstitutionLinkingScopeRequestDto;
import com.revolut.data.network.models.openbanking.LinkTokenDto;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements oe6.h {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r71.a f305597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qsg.b f305598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th6.a0 f305599c;

    public q(r71.a externalInstitutionsRepository, qsg.b walletsRepository, th6.a0 storage) {
        Intrinsics.checkNotNullParameter(externalInstitutionsRepository, "externalInstitutionsRepository");
        Intrinsics.checkNotNullParameter(walletsRepository, "walletsRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f305597a = externalInstitutionsRepository;
        this.f305598b = walletsRepository;
        this.f305599c = storage;
    }

    public static String b(String str, String str2) {
        Uri.Builder builderAppendQueryParameter = Uri.parse("https://cdn.plaid.com/link/v2/stable/link.html").buildUpon().appendQueryParameter("isWebview", "true").appendQueryParameter("token", str);
        if (str2 != null) {
            builderAppendQueryParameter.appendQueryParameter("receivedRedirectUri", str2);
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (skm.k0.b(r11, r2) == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0086 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r18, long r19, long r21, gim.c r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof xg6.n
            if (r2 == 0) goto L17
            r2 = r1
            xg6.n r2 = (xg6.n) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.A = r3
            goto L1c
        L17:
            xg6.n r2 = new xg6.n
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f305593y
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.A
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4b
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L37
            long r7 = r2.f305592x
            long r9 = r2.f305591w
            long r11 = r2.v
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
        L35:
            r1 = r4
            goto L89
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            long r7 = r2.f305592x
            long r9 = r2.f305591w
            long r11 = r2.v
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            goto L73
        L4b:
            yhm.o.b(r1)
            r1 = r18
            r7 = r19
            r9 = r21
            r11 = r9
        L55:
            r13 = 0
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L91
            r2.u = r1
            r2.v = r7
            r2.f305591w = r11
            r2.f305592x = r9
            r2.A = r6
            java.lang.Object r4 = r0.f(r1, r2)
            if (r4 != r3) goto L6c
            goto L88
        L6c:
            r15 = r4
            r4 = r1
            r1 = r15
            r15 = r11
            r11 = r7
            r7 = r9
            r9 = r15
        L73:
            io3.d r1 = (io3.d) r1
            if (r1 == 0) goto L78
            return r1
        L78:
            r2.u = r4
            r2.v = r11
            r2.f305591w = r9
            r2.f305592x = r7
            r2.A = r5
            java.lang.Object r1 = skm.k0.b(r11, r2)
            if (r1 != r3) goto L35
        L88:
            return r3
        L89:
            r13 = -1
            long r7 = r7 + r13
            r15 = r9
            r9 = r7
            r7 = r11
            r11 = r15
            goto L55
        L91:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Pocket with institution id: "
            java.lang.String r4 = " not found"
            java.lang.String r1 = p.a.p(r3, r1, r4)
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xg6.q.a(java.lang.String, long, long, gim.c):java.io.Serializable");
    }

    public final ufm.i c(x61.d linkingScope) {
        w21.o oVar = (w21.o) this.f305597a;
        Intrinsics.checkNotNullParameter(linkingScope, "linkingScope");
        d0<LinkTokenDto> linkToken = oVar.f293931a.getLinkToken(ExternalInstitutionLinkingScopeRequestDto.INSTANCE.from(linkingScope));
        w21.j jVar = w21.j.f;
        vf0.q qVar = new vf0.q(18);
        linkToken.getClass();
        ufm.i iVar = new ufm.i(linkToken, qVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(new ufm.f(te0.w.i0(iVar), new k(new wma.e(1, this.f305599c, th6.a0.class, "saveToken", "saveToken(Ljava/lang/String;)V", 0, 24), 1), 3), new k(new xd2.n(this, 14), 2), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final d0 d(x61.d linkingScope, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(linkingScope, "linkingScope");
        if (str != null && (str2 = (String) j6.a.k(String.class, this.f305599c.f271262a, "PLAID_TOKEN_KEY")) != null) {
            return te0.w.j(b(str2, str));
        }
        return c(linkingScope);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.external_accounts.api.model.PlaidConfig r7, x61.d r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof xg6.o
            if (r0 == 0) goto L13
            r0 = r9
            xg6.o r0 = (xg6.o) r0
            int r1 = r0.f305594w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305594w = r1
            goto L18
        L13:
            xg6.o r0 = new xg6.o
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305594w
            java.lang.String r3 = "await(...)"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            goto L6f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r9)
            goto L59
        L38:
            yhm.o.b(r9)
            boolean r9 = r7 instanceof com.revolut.feature.external_accounts.api.model.PlaidConfig.Url
            if (r9 == 0) goto L44
            com.revolut.feature.external_accounts.api.model.PlaidConfig$Url r7 = (com.revolut.feature.external_accounts.api.model.PlaidConfig.Url) r7
            java.lang.String r7 = r7.f72231a
            return r7
        L44:
            boolean r9 = r7 instanceof com.revolut.feature.external_accounts.api.model.PlaidConfig.Redirect
            if (r9 == 0) goto L5f
            com.revolut.feature.external_accounts.api.model.PlaidConfig$Redirect r7 = (com.revolut.feature.external_accounts.api.model.PlaidConfig.Redirect) r7
            java.lang.String r7 = r7.f72230a
            efm.d0 r7 = r6.d(r8, r7)
            r0.f305594w = r5
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L59
            goto L6e
        L59:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L5f:
            if (r7 != 0) goto L75
            r7 = 0
            efm.d0 r7 = r6.d(r8, r7)
            r0.f305594w = r4
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L75:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xg6.q.e(com.revolut.feature.external_accounts.api.model.PlaidConfig, x61.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof xg6.p
            if (r0 == 0) goto L13
            r0 = r9
            xg6.p r0 = (xg6.p) r0
            int r1 = r0.f305596x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305596x = r1
            goto L18
        L13:
            xg6.p r0 = new xg6.p
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305596x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L69
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            qsg.b r9 = r7.f305598b
            w4l.i r2 = w4l.i.f294643c
            efm.r r9 = qsg.b.a(r9, r2)
            xd2.n r2 = new xd2.n
            r5 = 15
            r2.<init>(r5)
            xg6.k r5 = new xg6.k
            r6 = 3
            r5.<init>(r2, r6)
            efm.r r9 = r9.filter(r5)
            java.lang.String r2 = "filter(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r2 = 3
            efm.r r9 = m70.a.g(r9, r4, r4, r2)
            zhm.f0 r2 = zhm.f0.f322471a
            efm.r r9 = ue0.e.E(r9, r2)
            r0.u = r8
            r0.f305596x = r3
            java.lang.Object r9 = nim.a.e(r9, r0)
            if (r9 != r1) goto L69
            return r1
        L69:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L6f
            zhm.f0 r9 = zhm.f0.f322471a
        L6f:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L75:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r9.next()
            r1 = r0
            io3.d r1 = (io3.d) r1
            java.lang.String r1 = r1.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r8)
            if (r1 == 0) goto L75
            return r0
        L8b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xg6.q.f(java.lang.String, gim.c):java.lang.Object");
    }
}
