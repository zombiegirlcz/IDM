package o8i;

import al4.n;
import dr2.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n8i.v;
import n8i.z;
import vkm.h;
import vkm.q;
import w4l.j;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f223034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f223035b;

    public d(n creditCardInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f223034a = creditCardInteractor;
        this.f223035b = userInteractor;
    }

    @Override // n8i.z
    public final Flow a(h contentFlow) {
        Intrinsics.checkNotNullParameter(contentFlow, "contentFlow");
        return q.q(nim.a.v(u0.i(new l(contentFlow, 5), q.Q(q.P(new l(contentFlow, 6), 1), new ns9.h(null, this, 16)), nim.a.v(this.f223035b.j(j.f294644c), c.f)), new o69.b(28)));
    }

    @Override // n8i.z
    public final Class getType() {
        return v.class;
    }
}
