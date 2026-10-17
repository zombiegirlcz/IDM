package akl;

import com.revolut.sso.impl.network.services.ConfigurationService;
import gkl.o;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class z {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfigurationService f6121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bjl.p0 f6122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f6123c;
    public final ue0.c d;
    public final x4l.c e;

    public z(ConfigurationService service, bjl.p0 revolutSsoDependenciesProvider, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f6121a = service;
        this.f6122b = revolutSsoDependenciesProvider;
        this.f6123c = memoryCache;
        this.d = storage;
        int i = 0;
        Continuation continuation = null;
        this.e = new x4l.c(new v(this, continuation, i), new s(this, i), new t(this, i), new w(this, continuation, i), new x(this, continuation, i));
    }

    public final List a() {
        Object objA;
        List signupCountries;
        gkl.o oVar = (gkl.o) this.f6123c.get("CONFIG");
        if (oVar != null && (signupCountries = oVar.getSignupCountries()) != null) {
            return signupCountries;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            gkl.o oVar2 = (gkl.o) this.d.T2("CONFIG", gkl.o.class);
            objA = oVar2 != null ? oVar2.getSignupCountries() : null;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
        }
        List list = (List) (objA instanceof yhm.n ? null : objA);
        if (list != null) {
            return list;
        }
        o.b.INSTANCE.getClass();
        return o.b.Companion.a();
    }
}
