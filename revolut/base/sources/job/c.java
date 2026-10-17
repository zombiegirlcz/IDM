package job;

import elm.f;
import ipa.h;
import ipa.j;
import jec.p;
import ji1.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rnb.w;
import skd.i;
import skm.e0;
import skm.p0;
import ybl.k;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f176922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f176923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f176924c;
    public final CoroutineScope d;

    public c(k tradingAccountsInteractor, w savingsVaultInteractor, i slotManagerInteractor, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f176922a = tradingAccountsInteractor;
        this.f176923b = savingsVaultInteractor;
        this.f176924c = slotManagerInteractor;
        this.d = scope;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (ipa.k.l(message) != h.SAVINGS_ONBOARDING_UPDATED) {
            return false;
        }
        p0 p0Var = p0.f264001a;
        f fVar = f.f127540b;
        m mVar = new m(this, null, 9);
        CoroutineScope coroutineScope = this.d;
        e0.C(coroutineScope, fVar, null, mVar, 2);
        String strM = ipa.k.m(message);
        if (strM == null) {
            return true;
        }
        e0.C(coroutineScope, fVar, null, new p(this, strM, null, 23), 2);
        return true;
    }
}
