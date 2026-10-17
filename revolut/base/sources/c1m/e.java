package c1m;

import java.util.Map;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import ulm.e0;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f20544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g1m.d f20546c;
    public g1m.j d;

    public final String a() {
        e eVar = this.f20544a;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public final String b() {
        String str = this.f20545b;
        if (str != null) {
            return str;
        }
        e eVar = this.f20544a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public final g1m.d c() {
        g1m.d dVar = this.f20546c;
        if (dVar != null) {
            return dVar;
        }
        e eVar = this.f20544a;
        g1m.d dVarC = eVar != null ? eVar.c() : null;
        if (dVarC != null) {
            return dVarC;
        }
        g1m.d dVar2 = s0m.d.f259016a;
        return s0m.d.f259016a;
    }

    public final g1m.e d() {
        e eVar = this.f20544a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public final OkHttpClient e() {
        e eVar = this.f20544a;
        if (eVar != null) {
            return eVar.e();
        }
        return null;
    }

    public final e0 f() {
        e eVar = this.f20544a;
        if (eVar != null) {
            return eVar.f();
        }
        return null;
    }

    public final g1m.j h() {
        g1m.j jVar = this.d;
        if (jVar != null) {
            return jVar;
        }
        e eVar = this.f20544a;
        g1m.j jVarH = eVar != null ? eVar.h() : null;
        if (jVarH != null) {
            return jVarH;
        }
        g1m.d dVar = s0m.d.f259016a;
        return s0m.d.f259018c;
    }

    public final Map i() {
        e eVar = this.f20544a;
        if (eVar != null) {
            return eVar.i();
        }
        return null;
    }

    public final Integer k() {
        e eVar = this.f20544a;
        Integer numK = eVar != null ? eVar.k() : null;
        if (numK != null) {
            return numK;
        }
        g1m.d dVar = s0m.d.f259016a;
        return Integer.valueOf(s0m.d.f259021j);
    }
}
