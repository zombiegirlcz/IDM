package job;

import elm.f;
import ipa.j;
import ipa.k;
import ji1.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijb.a f176926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f176927b;

    public e(ijb.a savingsProductInteractor, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f176926a = savingsProductInteractor;
        this.f176927b = scope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (d.f176925a[k.l(message).ordinal()] != 1) {
            return false;
        }
        p0 p0Var = p0.f264001a;
        e0.C(this.f176927b, f.f127540b, null, new m(this, null, 10), 2);
        return true;
    }
}
