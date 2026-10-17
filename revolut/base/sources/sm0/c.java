package sm0;

import hn0.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm0.e0;
import rm0.u;
import rm0.v;
import yhm.j;
import z9h.n;

/* JADX INFO: loaded from: classes.dex */
public final class c implements yk0.a {

    @NotNull
    public static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f264302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm0.b f264303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f264304c;
    public final e0 d;
    public final Lazy e;

    public c(v cryptoInteractor, nm0.b idGenerator, ue0.c storage, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f264302a = cryptoInteractor;
        this.f264303b = idGenerator;
        this.f264304c = storage;
        this.d = securityFeatureToggles;
        this.e = j.b(new sii.a(this, 3));
    }

    public final String a() {
        Object objE = skm.e0.E(g.f186406a, new s64.a(this, null, 27));
        Intrinsics.h(objE);
        String str = (String) objE;
        u uVarA = v.a(this.f264302a, d.f154015a, str);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "DatabaseSessionProvider", "Saving encrypted token to storage", null, null, 16);
        n.l(String.class, this.f264304c, "DEFAULT_T_V1", uVarA.b());
        return str;
    }

    @Override // yk0.a
    public final String getToken() {
        return (String) this.e.getValue();
    }
}
