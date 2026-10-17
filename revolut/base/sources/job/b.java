package job;

import elm.f;
import ipa.h;
import ipa.j;
import ipa.k;
import java.util.concurrent.CopyOnWriteArrayList;
import jec.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rnb.w;
import skm.e0;
import skm.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f176920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f176921b;

    public b(w savingsVaultInteractor, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f176920a = savingsVaultInteractor;
        this.f176921b = scope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        h hVarL = k.l(message);
        String strM = k.m(message);
        int i = a.f176919a[hVarL.ordinal()];
        if (i != 1 && i != 2) {
            return false;
        }
        if (strM != null) {
            p0 p0Var = p0.f264001a;
            e0.C(this.f176921b, f.f127540b, null, new p(this, strM, null, 22), 2);
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SavingsAccountId is not found in push message category=" + hVarL);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return false;
    }
}
