package xm0;

import kotlin.jvm.internal.Intrinsics;
import od0.e;
import rm0.e0;
import rm0.s;
import rm0.u;
import rm0.v;
import rm0.y;
import ue0.c;
import z9h.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f307065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f307066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f307067c;
    public final hn0.c d;

    public a(e0 securityFeatureToggles, c storage, v cryptoInteractor, hn0.c certificateAlias) {
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
        Intrinsics.checkNotNullParameter(certificateAlias, "certificateAlias");
        this.f307065a = securityFeatureToggles;
        this.f307066b = storage;
        this.f307067c = cryptoInteractor;
        this.d = certificateAlias;
    }

    public final String a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        String str = (String) this.f307066b.T2(id10, String.class);
        if (str == null) {
            return null;
        }
        u.Companion.getClass();
        u uVarA = s.a(str);
        String strB = ((y) this.f307067c).b(this.d, uVarA);
        if (uVarA.c() && this.f307065a.b()) {
            b(id10, strB);
        }
        return strB;
    }

    public final void b(String id10, String value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        n.l(String.class, this.f307066b, id10, v.a(this.f307067c, this.d, value).b());
    }

    @Override // od0.e
    public final void clear() {
        this.f307066b.clear();
    }
}
