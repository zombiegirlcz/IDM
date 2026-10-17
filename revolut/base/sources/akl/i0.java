package akl;

import com.revolut.sso.impl.domain.models.AuthResult;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i0 {

    @NotNull
    public static final g0 Companion = new g0();
    public static final Set d;
    public static final Set e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm0.a f6031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f6032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f6033c;

    static {
        String[] elements = {"AUTHENTICATION_TYPE", "FOUND_EXISTING_IDENTITY", "REJECTED_CLAIMS", "REJECTED_CLAIM_NAMES", "REJECTED_METHODS", "SECURITY_PROFILES", "SESSION_TOKEN", "ROUTING_CONTEXT", "SINGLE_IDENTITY", "STATE"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
        String[] elements2 = {"ID", "CODE_VERIFIER", "AUTH_RESULT", "EVIDENCES"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        e = kotlin.collections.d.y0(elements2);
    }

    public i0(xm0.a secureSsoAuthenticationSessionController, ue0.c ssoAuthenticationSessionStorage, ne0.j ssoAuthenticationSessionMemoryCache) {
        Intrinsics.checkNotNullParameter(secureSsoAuthenticationSessionController, "secureSsoAuthenticationSessionController");
        Intrinsics.checkNotNullParameter(ssoAuthenticationSessionStorage, "ssoAuthenticationSessionStorage");
        Intrinsics.checkNotNullParameter(ssoAuthenticationSessionMemoryCache, "ssoAuthenticationSessionMemoryCache");
        this.f6031a = secureSsoAuthenticationSessionController;
        this.f6032b = ssoAuthenticationSessionStorage;
        this.f6033c = ssoAuthenticationSessionMemoryCache;
    }

    public final void a() {
        this.f6031a.clear();
        this.f6032b.clear();
    }

    public final gkl.j b() {
        String strC;
        String str;
        j0 j0Var = k0.Companion;
        String str2 = (String) j6.a.k(String.class, this.f6032b, "TYPE");
        j0Var.getClass();
        k0 k0VarA = j0.a(str2);
        int i = k0VarA == null ? -1 : h0.f6024a[k0VarA.ordinal()];
        if (i == -1 || i == 1) {
            return null;
        }
        if (i == 2) {
            String strC2 = c("CODE_VERIFIER");
            if (strC2 == null || (strC = c("ID")) == null) {
                return null;
            }
            return new gkl.j(strC2, strC);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ne0.j jVar = this.f6033c;
        String str3 = (String) jVar.get("CODE_VERIFIER");
        if (str3 == null || (str = (String) jVar.get("ID")) == null) {
            return null;
        }
        return new gkl.j(str3, str);
    }

    public final String c(String str) {
        try {
            return this.f6031a.a(str);
        } catch (Exception e2) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v2, types: [zhm.h0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.HashSet] */
    public final gkl.v0 d() {
        cjl.s sVarA;
        ?? hashSet;
        AuthResult authResult;
        j0 j0Var = k0.Companion;
        ue0.c cVar = this.f6032b;
        String str = (String) j6.a.k(String.class, cVar, "TYPE");
        j0Var.getClass();
        k0 k0VarA = j0.a(str);
        int i = k0VarA == null ? -1 : h0.f6024a[k0VarA.ordinal()];
        if (i == -1 || i == 1) {
            return null;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ne0.j jVar = this.f6033c;
            String str2 = (String) jVar.get("ID");
            if (str2 == null) {
                return null;
            }
            ebm.a.f(str2);
            List list = (List) jVar.get("EVIDENCES");
            if (list == null || (authResult = (AuthResult) jVar.get("AUTH_RESULT")) == null) {
                return null;
            }
            return new gkl.s0(str2, list, authResult);
        }
        String strC = c("ID");
        if (strC == null) {
            return null;
        }
        ebm.a.f(strC);
        String str3 = (String) cVar.T2("AUTHENTICATION_TYPE", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
        if (str3 == null) {
            return null;
        }
        gkl.u0.Companion.getClass();
        gkl.u0 u0VarA = gkl.t0.a(str3);
        String str4 = (String) j6.a.k(String.class, cVar, "SESSION_TOKEN");
        if (str4 == null) {
            return null;
        }
        String str5 = (String) j6.a.k(String.class, cVar, "ROUTING_CONTEXT");
        if (str5 != null) {
            cjl.s.Companion.getClass();
            sVarA = cjl.r.a(str5);
        } else {
            sVarA = cjl.s.GLOBAL;
        }
        List list2 = (List) p.a.j(String.class, KTypeProjection.INSTANCE, List.class, cVar, "SECURITY_PROFILES");
        String str6 = (String) j6.a.k(String.class, cVar, "STATE");
        Set set = (Set) cVar.T2("REJECTED_CLAIM_NAMES", wim.z.d(kotlin.jvm.internal.o0.c(Set.class, KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class)))));
        if (set != null) {
            hashSet = new HashSet();
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                hashSet.add(yjl.h.c(yjl.h.a(jkl.b0.INSTANCE, (String) it8.next())));
            }
        } else {
            Set set2 = (Set) cVar.T2("REJECTED_CLAIMS", wim.z.d(kotlin.jvm.internal.o0.c(Set.class, KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(jkl.i0.class)))));
            if (set2 != null) {
                hashSet = new HashSet();
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    hashSet.add(yjl.h.c(((jkl.i0) it9.next()).getName()));
                }
            } else {
                hashSet = zhm.h0.f322473a;
            }
        }
        Set set3 = (Set) p.a.j(jkl.i.class, KTypeProjection.INSTANCE, Set.class, cVar, "REJECTED_METHODS");
        if (set3 == null) {
            set3 = zhm.h0.f322473a;
        }
        Class cls = Boolean.TYPE;
        Boolean bool = (Boolean) j6.a.k(cls, cVar, "SINGLE_IDENTITY");
        String strC2 = c("PASSCODE");
        String strC3 = c("PASSWORD");
        Boolean bool2 = (Boolean) j6.a.k(cls, cVar, "FOUND_EXISTING_IDENTITY");
        return new gkl.r0(strC, u0VarA, str4, sVarA, list2, str6, hashSet, set3, bool, strC2, strC3, bool2 != null ? bool2.booleanValue() : false);
    }

    public final void e(k0 k0Var) {
        z9h.n.l(String.class, this.f6032b, "TYPE", k0Var.a());
    }

    public final void f() {
        Iterator it8 = d.iterator();
        while (it8.hasNext()) {
            this.f6032b.I0((String) it8.next());
        }
        Iterator it9 = e.iterator();
        while (it9.hasNext()) {
            this.f6033c.remove((String) it9.next());
        }
        e(k0.INITIATED);
    }

    public final void g(String str, gkl.v0 authentication) {
        ne0.j jVar = this.f6033c;
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-sso-impl-domain-models-PendingAuthentication-Id$-id$0");
        Intrinsics.checkNotNullParameter(authentication, "authentication");
        gkl.v0 v0VarD = d();
        String strA = v0VarD != null ? v0VarD.a() : null;
        if (!(strA == null ? false : ebm.a.k(strA, str)) && strA != null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", v0.a.i(v0.a.m("Failed to set ", kotlin.jvm.internal.o0.f186429a.b(authentication.getClass()).m(), " session with id=", str, ":\nThere is already a stored session for "), v0VarD.a(), "\nIf this call was intentional, make sure you call clear() and restart the affected logic properly before"), null, h0Var);
            return;
        }
        try {
            boolean z = authentication instanceof gkl.r0;
            ue0.c cVar = this.f6032b;
            if (!z) {
                if (!(authentication instanceof gkl.s0)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(k0.SIGN_IN_WITH_ACCOUNT);
                cVar.G(((gkl.s0) authentication).d().a(), "AUTHENTICATION_TYPE", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
                jVar.f("EVIDENCES", ((gkl.s0) authentication).c());
                jVar.f("AUTH_RESULT", ((gkl.s0) authentication).b());
                Unit unit = Unit.f186387a;
                return;
            }
            e(k0.AWAITING_REVIEW);
            cVar.G(((gkl.r0) authentication).l().a(), "AUTHENTICATION_TYPE", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
            cVar.G(((gkl.r0) authentication).i(), "SESSION_TOKEN", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
            cVar.G(((gkl.r0) authentication).g().a(), "ROUTING_CONTEXT", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
            List listH = ((gkl.r0) authentication).h();
            if (listH != null) {
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(String.class);
                companion.getClass();
                cVar.G(listH, "SECURITY_PROFILES", wim.z.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
            }
            String strK = ((gkl.r0) authentication).k();
            if (strK != null) {
                cVar.G(strK, "STATE", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
            }
            Set setE = ((gkl.r0) authentication).e();
            HashSet hashSet = new HashSet();
            Iterator it8 = setE.iterator();
            while (it8.hasNext()) {
                hashSet.add(yjl.h.d((gkl.m) it8.next()).getValue());
            }
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KType kTypeB2 = kotlin.jvm.internal.o0.b(String.class);
            companion2.getClass();
            cVar.G(hashSet, "REJECTED_CLAIM_NAMES", wim.z.d(kotlin.jvm.internal.o0.c(HashSet.class, KTypeProjection.Companion.a(kTypeB2))));
            cVar.G(((gkl.r0) authentication).f(), "REJECTED_METHODS", wim.z.d(kotlin.jvm.internal.o0.c(Set.class, KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(jkl.i.class)))));
            Boolean boolJ = ((gkl.r0) authentication).j();
            Class cls = Boolean.TYPE;
            if (boolJ != null) {
                cVar.G(boolJ, "SINGLE_IDENTITY", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
            }
            cVar.G(Boolean.valueOf(((gkl.r0) authentication).b()), "FOUND_EXISTING_IDENTITY", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
            String strC = ((gkl.r0) authentication).c();
            xm0.a aVar = this.f6031a;
            if (strC != null) {
                aVar.b("PASSCODE", strC);
            }
            String strD = ((gkl.r0) authentication).d();
            if (strD != null) {
                aVar.b("PASSWORD", strD);
                Unit unit2 = Unit.f186387a;
            }
        } catch (Exception e2) {
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
        }
    }
}
