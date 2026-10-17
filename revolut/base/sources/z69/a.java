package z69;

import boh.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kg.o;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.Instant;
import s69.m;
import s69.p;
import s69.q;
import s69.r;
import s69.s;
import s69.t;
import s69.v;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f79.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f319711b;

    public a(o gson, int i) {
        this.f319710a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(gson, "gson");
                this.f319711b = gson;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(gson, "gson");
                this.f319711b = gson;
                break;
            default:
                Intrinsics.checkNotNullParameter(gson, "gson");
                this.f319711b = gson;
                break;
        }
    }

    public static t g(u uVar) {
        String strJ = f.j("id", uVar);
        String strI = f.i("name", uVar);
        String str = "";
        if (strI == null) {
            m70.a.c(t0.f186434a);
            strI = "";
        }
        u uVarI = uVar.c().i("admin");
        Intrinsics.checkNotNullExpressionValue(uVarI, "get(...)");
        String strI2 = f.i("id", uVarI);
        if (strI2 == null) {
            m70.a.c(t0.f186434a);
            strI2 = "";
        }
        String strI3 = f.i("fullName", uVarI);
        if (strI3 == null) {
            m70.a.c(t0.f186434a);
        } else {
            str = strI3;
        }
        return new t(strJ, strI, new s69.u(strI2, str));
    }

    @Override // f79.a
    public final t69.c a(m item) {
        switch (this.f319710a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                if (!b(item)) {
                    return null;
                }
                String strA = s69.o.BACKOFFICE.a();
                String strK = this.f319711b.k(item);
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                return new a79.o(strA, strK);
            case 1:
                Intrinsics.checkNotNullParameter(item, "item");
                if (!b(item)) {
                    return null;
                }
                String strA2 = s69.o.REFERRALS.a();
                String strK2 = this.f319711b.k(item);
                Intrinsics.checkNotNullExpressionValue(strK2, "toJson(...)");
                return new a79.o(strA2, strK2);
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                if (!b(item)) {
                    return null;
                }
                String strA3 = s69.o.VAULT.a();
                String strK3 = this.f319711b.k(item);
                Intrinsics.checkNotNullExpressionValue(strK3, "toJson(...)");
                return new a79.o(strA3, strK3);
        }
    }

    @Override // f79.a
    public final boolean b(m item) {
        switch (this.f319710a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof s69.c;
            case 1:
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof r;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof v;
        }
    }

    @Override // f79.a
    public final boolean c(String type) {
        switch (this.f319710a) {
            case 0:
                Intrinsics.checkNotNullParameter(type, "type");
                return Intrinsics.f(type, s69.o.BACKOFFICE.a());
            case 1:
                Intrinsics.checkNotNullParameter(type, "type");
                return Intrinsics.f(type, s69.o.REFERRALS.a());
            default:
                Intrinsics.checkNotNullParameter(type, "type");
                return Intrinsics.f(type, s69.o.VAULT.a());
        }
    }

    @Override // f79.a
    public final boolean d(t69.c pref) {
        switch (this.f319710a) {
            case 0:
                Intrinsics.checkNotNullParameter(pref, "pref");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(pref, "pref");
                break;
            default:
                Intrinsics.checkNotNullParameter(pref, "pref");
                break;
        }
        return c(pref.getType());
    }

    @Override // f79.a
    public final m e(c79.a pref) {
        switch (this.f319710a) {
            case 0:
                Intrinsics.checkNotNullParameter(pref, "pref");
                if (!d(pref)) {
                    return null;
                }
                return (m) this.f319711b.c(pref.getData(), s69.c.class);
            case 1:
                Intrinsics.checkNotNullParameter(pref, "pref");
                if (!d(pref)) {
                    return null;
                }
                return (m) this.f319711b.c(pref.getData(), r.class);
            default:
                Intrinsics.checkNotNullParameter(pref, "pref");
                if (!d(pref)) {
                    return null;
                }
                return (m) this.f319711b.c(pref.getData(), v.class);
        }
    }

    @Override // f79.a
    public final m f(u json) {
        s sVar;
        int i = this.f319710a;
        String str = "";
        Intrinsics.checkNotNullParameter(json, "json");
        switch (i) {
            case 0:
                try {
                    String strJ = f.j("id", json);
                    String strI = f.i("title", json);
                    if (strI == null) {
                        strI = "";
                    }
                    String strI2 = f.i("description", json);
                    if (strI2 == null) {
                        strI2 = "";
                    }
                    Long lH = f.h("timestamp", json);
                    Instant instant = lH != null ? new Instant(lH.longValue()) : new Instant();
                    String strI3 = f.i("detailsDeepLink", json);
                    if (strI3 != null) {
                        str = strI3;
                    }
                    u uVarI = json.c().i("icon");
                    return new s69.c(strJ, strI, strI2, instant, str, uVarI != null ? new s69.b(f.j("url", uVarI)) : null);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 1:
                try {
                    String strJ2 = f.j("id", json);
                    String strJ3 = f.j("title", json);
                    String strJ4 = f.j("description", json);
                    Long lH2 = f.h("timestamp", json);
                    if (lH2 == null) {
                        throw new NullPointerException("timestamp should not be null");
                    }
                    Instant instant2 = new Instant(lH2.longValue());
                    String strJ5 = f.j("detailsDeepLink", json);
                    u uVarI2 = json.c().i("icon");
                    p pVar = uVarI2 != null ? new p(f.j("url", uVarI2)) : null;
                    u uVarI3 = json.c().i("timeframe");
                    return new r(strJ2, strJ3, strJ4, instant2, strJ5, pVar, uVarI3 != null ? new q(new Instant(f.h("startDate", uVarI3)), new Instant(f.h("endDate", uVarI3))) : null);
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                    return null;
                }
            default:
                try {
                    String strJ6 = f.j("id", json);
                    String strJ7 = f.j("title", json);
                    String strJ8 = f.j("description", json);
                    String strJ9 = f.j("detailsDeepLink", json);
                    u uVarI4 = json.c().i("icon");
                    if (uVarI4 != null) {
                        String strI4 = f.i("userId", uVarI4);
                        if (strI4 == null) {
                            m70.a.c(t0.f186434a);
                            strI4 = "";
                        }
                        String strI5 = f.i("name", uVarI4);
                        if (strI5 == null) {
                            m70.a.c(t0.f186434a);
                        } else {
                            str = strI5;
                        }
                        sVar = new s(strI4, str);
                    } else {
                        sVar = null;
                    }
                    Long lH3 = f.h("timestamp", json);
                    if (lH3 == null) {
                        throw new NullPointerException("timestamp should not be null");
                    }
                    Instant instant3 = new Instant(lH3.longValue());
                    u uVarI5 = json.c().i("invitation");
                    if (uVarI5 != null) {
                        return new v(strJ6, strJ7, strJ8, instant3, strJ9, sVar, g(uVarI5), f.j("state", json));
                    }
                    throw new NullPointerException("invitation should not be null");
                } catch (Exception e4) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var3);
                    return null;
                }
        }
    }
}
