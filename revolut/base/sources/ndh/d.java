package ndh;

import cu8.r0;
import java.util.List;
import k25.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n8a.r;
import p5d.e;
import vkm.q;
import vkm.v1;
import wsg.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f214371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f214372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f214373c;

    public d(fk3.a configurationInteractor, r0 kycRequiredActionTransformer, n walletInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f214371a = configurationInteractor;
        this.f214372b = kycRequiredActionTransformer;
        this.f214373c = walletInteractor;
    }

    @Override // p5d.e
    public final Flow a(List swipeableAssets) {
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        return q.Q(new v1(new r(this, null, 5)), new o((Continuation) null, this, swipeableAssets));
    }
}
