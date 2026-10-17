package wa7;

import com.revolut.feature.hidden_accounts.api.HiddenAccountsApi$Toggles$SecretAccounts;
import ht0.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.y;
import vq5.w;
import vy5.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements pa7.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f295847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f295848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.a f295849c;
    public final zjh.c d;
    public final cge.h e;
    public final hlm.c f;

    static {
        Intrinsics.checkNotNullParameter("HIDDEN_ACCOUNTS", "id");
        Intrinsics.checkNotNullParameter("SECRET_ACCOUNTS", "id");
        Intrinsics.checkNotNullParameter("SECRET_ACCOUNTS_PHRASE", "id");
    }

    public m(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, mk0.a personalisationStorage, zjh.c hiddenAccountsRepository, cge.h productAccountsInfoProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(hiddenAccountsRepository, "hiddenAccountsRepository");
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        this.f295847a = featureToggleInteractor;
        this.f295848b = productCatalogueInteractor;
        this.f295849c = personalisationStorage;
        this.d = hiddenAccountsRepository;
        this.e = productAccountsInfoProvider;
        this.f = hlm.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r0.e(r7, r10, r1) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            mk0.a r0 = r9.f295849c
            boolean r1 = r12 instanceof wa7.c
            if (r1 == 0) goto L15
            r1 = r12
            wa7.c r1 = (wa7.c) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            wa7.c r1 = new wa7.c
            r1.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r1.f295828y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L4a
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            hlm.a r10 = r1.f295826w
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L30
            goto L9c
        L30:
            r11 = move-exception
            goto La4
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            int r10 = r1.f295827x
            hlm.a r11 = r1.f295826w
            java.lang.String r3 = r1.v
            java.lang.String r5 = r1.u
            yhm.o.b(r12)
            r12 = r3
            r3 = r10
            r10 = r5
            goto L64
        L4a:
            yhm.o.b(r12)
            r1.u = r10
            r1.v = r11
            hlm.c r12 = r9.f
            r1.f295826w = r12
            r3 = 0
            r1.f295827x = r3
            r1.A = r5
            java.lang.Object r5 = r12.lock(r6, r1)
            if (r5 != r2) goto L61
            goto L9a
        L61:
            r8 = r12
            r12 = r11
            r11 = r8
        L64:
            tk0.e r5 = new tk0.e     // Catch: java.lang.Throwable -> L74
            r5.<init>(r12)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r0.a(r5)     // Catch: java.lang.Throwable -> L74
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L79
            zhm.f0 r5 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L74
            goto L79
        L74:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto La4
        L79:
            boolean r7 = r5.contains(r10)     // Catch: java.lang.Throwable -> L74
            if (r7 != 0) goto L9b
            tk0.e r7 = new tk0.e     // Catch: java.lang.Throwable -> L74
            r7.<init>(r12)     // Catch: java.lang.Throwable -> L74
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L74
            java.util.ArrayList r10 = zhm.d0.F0(r10, r5)     // Catch: java.lang.Throwable -> L74
            r1.u = r6     // Catch: java.lang.Throwable -> L74
            r1.v = r6     // Catch: java.lang.Throwable -> L74
            r1.f295826w = r11     // Catch: java.lang.Throwable -> L74
            r1.f295827x = r3     // Catch: java.lang.Throwable -> L74
            r1.A = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r10 = r0.e(r7, r10, r1)     // Catch: java.lang.Throwable -> L74
            if (r10 != r2) goto L9b
        L9a:
            return r2
        L9b:
            r10 = r11
        L9c:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L30
            r10.unlock(r6)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La4:
            r10.unlock(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.m.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        if (r0.e(r7, r11, r1) == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r10, java.lang.String r11, java.util.Set r12) throws java.lang.Throwable {
        /*
            r9 = this;
            mk0.a r0 = r9.f295849c
            boolean r1 = r10 instanceof wa7.d
            if (r1 == 0) goto L15
            r1 = r10
            wa7.d r1 = (wa7.d) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            wa7.d r1 = new wa7.d
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.f295831y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L52
            if (r3 == r5) goto L3f
            if (r3 != r4) goto L37
            hlm.a r11 = r1.f295829w
            java.util.Set r12 = r1.u
            java.util.Set r12 = (java.util.Set) r12
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L34
            goto Lbc
        L34:
            r10 = move-exception
            goto Lc4
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            int r11 = r1.f295830x
            hlm.a r12 = r1.f295829w
            java.lang.String r3 = r1.v
            java.util.Set r5 = r1.u
            java.util.Set r5 = (java.util.Set) r5
            yhm.o.b(r10)
            r10 = r3
            r3 = r11
            r11 = r10
            r10 = r12
            r12 = r5
            goto L75
        L52:
            yhm.o.b(r10)
            boolean r10 = r12.isEmpty()
            if (r10 == 0) goto L5e
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L5e:
            r10 = r12
            java.util.Set r10 = (java.util.Set) r10
            r1.u = r10
            r1.v = r11
            hlm.c r10 = r9.f
            r1.f295829w = r10
            r3 = 0
            r1.f295830x = r3
            r1.A = r5
            java.lang.Object r5 = r10.lock(r6, r1)
            if (r5 != r2) goto L75
            goto Lba
        L75:
            tk0.e r5 = new tk0.e     // Catch: java.lang.Throwable -> L85
            r5.<init>(r11)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r5 = r0.a(r5)     // Catch: java.lang.Throwable -> L85
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L85
            if (r5 != 0) goto L8a
            zhm.f0 r5 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L85
            goto L8a
        L85:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto Lc4
        L8a:
            r7 = r5
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L85
            java.util.Set r7 = zhm.d0.i1(r7)     // Catch: java.lang.Throwable -> L85
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L85
            java.util.Set r12 = zhm.a1.k(r12, r7)     // Catch: java.lang.Throwable -> L85
            boolean r7 = r12.isEmpty()     // Catch: java.lang.Throwable -> L85
            if (r7 != 0) goto Lbb
            tk0.e r7 = new tk0.e     // Catch: java.lang.Throwable -> L85
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L85
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L85
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r11 = zhm.d0.E0(r12, r5)     // Catch: java.lang.Throwable -> L85
            r1.u = r6     // Catch: java.lang.Throwable -> L85
            r1.v = r6     // Catch: java.lang.Throwable -> L85
            r1.f295829w = r10     // Catch: java.lang.Throwable -> L85
            r1.f295830x = r3     // Catch: java.lang.Throwable -> L85
            r1.A = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r11 = r0.e(r7, r11, r1)     // Catch: java.lang.Throwable -> L85
            if (r11 != r2) goto Lbb
        Lba:
            return r2
        Lbb:
            r11 = r10
        Lbc:
            kotlin.Unit r10 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            r11.unlock(r6)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lc4:
            r11.unlock(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.m.b(gim.c, java.lang.String, java.util.Set):java.lang.Object");
    }

    public final boolean c() {
        return this.f295848b.d("security_hub.accounts_hiding", null) == bla.c.ENABLED;
    }

    public final boolean d() {
        return ((jte.d) this.f295847a).c(HiddenAccountsApi$Toggles$SecretAccounts.f74645c) && this.f295848b.d("security_hub.secret_accounts", null) == bla.c.ENABLED;
    }

    public final boolean e(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String str = (String) this.f295849c.a(new tk0.d("SECRET_ACCOUNTS_PHRASE"));
        return (str == null || str.length() == 0 || !Intrinsics.f(text, str)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (g("SECRET_ACCOUNTS", r6, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof wa7.e
            if (r0 == 0) goto L13
            r0 = r8
            wa7.e r0 = (wa7.e) r0
            int r1 = r0.f295834y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295834y = r1
            goto L18
        L13:
            wa7.e r0 = new wa7.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f295832w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295834y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L4c
        L3a:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f295834y = r4
            java.lang.String r8 = "HIDDEN_ACCOUNTS"
            java.lang.Object r8 = r5.g(r8, r6, r7, r0)
            if (r8 != r1) goto L4c
            goto L5b
        L4c:
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f295834y = r3
            java.lang.String r8 = "SECRET_ACCOUNTS"
            java.lang.Object r6 = r5.g(r8, r6, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.m.f(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
    
        if (r0.e(r14, r7, r1) == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r12, java.lang.String r13, java.lang.String r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.m.g(java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow h(String str, Function0 function0) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return new go.g(h0.f322473a, 2);
        }
        return new ahe.i(new y(new w(this, str, null, 23), this.f295849c.j(new tk0.e(str))), 18);
    }

    public final Flow i(na7.b accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        int i = b.f295825a[accountType.ordinal()];
        if (i == 1) {
            return h("HIDDEN_ACCOUNTS", new b0(0, this, m.class, "isHiddenAccountsFeatureEnabled", "isHiddenAccountsFeatureEnabled()Z", 0, 22));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return h("SECRET_ACCOUNTS", new b0(0, this, m.class, "isSecretAccountsFeatureEnabled", "isSecretAccountsFeatureEnabled()Z", 0, 23));
    }

    public final bo8.w j() {
        return new bo8.w(yh5.b.e(i(na7.b.HIDDEN), i(na7.b.SECRET), new d0(this.e.b(ibb.c.f160140a), 2)), 9);
    }

    public final t38.e k() {
        return new t38.e(i(na7.b.HIDDEN), 24, i(na7.b.SECRET), new j(3, 0, (Continuation) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r0.e(r7, r13, r1) == r2) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v4, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r12, java.lang.String r13, gim.c r14) {
        /*
            r11 = this;
            mk0.a r0 = r11.f295849c
            boolean r1 = r14 instanceof wa7.k
            if (r1 == 0) goto L15
            r1 = r14
            wa7.k r1 = (wa7.k) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            wa7.k r1 = new wa7.k
            r1.<init>(r11, r14)
        L1a:
            java.lang.Object r14 = r1.f295844y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L4b
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            hlm.a r12 = r1.f295842w
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L30
            goto Laa
        L30:
            r13 = move-exception
            goto Lb2
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            int r12 = r1.f295843x
            hlm.a r13 = r1.f295842w
            java.lang.String r3 = r1.v
            java.lang.String r5 = r1.u
            yhm.o.b(r14)
            r10 = r3
            r3 = r12
            r12 = r13
            r13 = r10
            goto L64
        L4b:
            yhm.o.b(r14)
            r1.u = r12
            r1.v = r13
            hlm.c r14 = r11.f
            r1.f295842w = r14
            r3 = 0
            r1.f295843x = r3
            r1.A = r5
            java.lang.Object r5 = r14.lock(r6, r1)
            if (r5 != r2) goto L62
            goto La9
        L62:
            r5 = r12
            r12 = r14
        L64:
            tk0.e r14 = new tk0.e     // Catch: java.lang.Throwable -> L30
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r14 = r0.a(r14)     // Catch: java.lang.Throwable -> L30
            java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Throwable -> L30
            if (r14 != 0) goto L72
            goto Laa
        L72:
            tk0.e r7 = new tk0.e     // Catch: java.lang.Throwable -> L30
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L30
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r13.<init>()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L30
        L82:
            boolean r8 = r14.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L99
            java.lang.Object r8 = r14.next()     // Catch: java.lang.Throwable -> L30
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L30
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r5)     // Catch: java.lang.Throwable -> L30
            if (r9 != 0) goto L82
            r13.add(r8)     // Catch: java.lang.Throwable -> L30
            goto L82
        L99:
            r1.u = r6     // Catch: java.lang.Throwable -> L30
            r1.v = r6     // Catch: java.lang.Throwable -> L30
            r1.f295842w = r12     // Catch: java.lang.Throwable -> L30
            r1.f295843x = r3     // Catch: java.lang.Throwable -> L30
            r1.A = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r13 = r0.e(r7, r13, r1)     // Catch: java.lang.Throwable -> L30
            if (r13 != r2) goto Laa
        La9:
            return r2
        Laa:
            kotlin.Unit r13 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L30
            r12.unlock(r6)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Lb2:
            r12.unlock(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.m.l(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (l(r6, "SECRET_ACCOUNTS", r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wa7.l
            if (r0 == 0) goto L13
            r0 = r7
            wa7.l r0 = (wa7.l) r0
            int r1 = r0.f295846x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f295846x = r1
            goto L18
        L13:
            wa7.l r0 = new wa7.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f295846x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f295846x = r4
            java.lang.String r7 = "HIDDEN_ACCOUNTS"
            java.lang.Object r7 = r5.l(r6, r7, r0)
            if (r7 != r1) goto L48
            goto L55
        L48:
            r7 = 0
            r0.u = r7
            r0.f295846x = r3
            java.lang.String r7 = "SECRET_ACCOUNTS"
            java.lang.Object r6 = r5.l(r6, r7, r0)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wa7.m.m(java.lang.String, gim.c):java.lang.Object");
    }
}
