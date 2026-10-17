package c1m;

import androidx.core.util.Consumer;
import java.util.concurrent.TimeUnit;
import z0m.y;

/* JADX INFO: loaded from: classes23.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f20547a;

    public final j1m.c a() {
        g gVar = this.f20547a;
        j1m.c cVarA = gVar != null ? gVar.a() : null;
        if (cVarA != null) {
            return cVarA;
        }
        i1m.b bVar = y.f318686a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new j1m.c();
    }

    public final boolean b() {
        g gVar = this.f20547a;
        Boolean boolValueOf = gVar != null ? Boolean.valueOf(gVar.b()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        i1m.b bVar = y.f318686a;
        return false;
    }

    public final j1m.c c() {
        g gVar = this.f20547a;
        j1m.c cVarC = gVar != null ? gVar.c() : null;
        if (cVarC != null) {
            return cVarC;
        }
        i1m.b bVar = y.f318686a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new j1m.c();
    }

    public final Consumer d() {
        g gVar = this.f20547a;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public final boolean e() {
        g gVar = this.f20547a;
        Boolean boolValueOf = gVar != null ? Boolean.valueOf(gVar.e()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
