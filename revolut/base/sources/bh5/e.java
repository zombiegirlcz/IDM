package bh5;

import au6.a3;
import cli.y;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetTransferInfoInputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements dli.b {
    public final CryptoGiftAssetTransferInfoInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mg5.a f15229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f15230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f15231r;

    public e(CryptoGiftAssetTransferInfoInputData inputData, mg5.a giftedAssetsRepository, c stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(giftedAssetsRepository, "giftedAssetsRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f15229p = giftedAssetsRepository;
        this.f15230q = new vii.b();
        this.f15231r = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f15230q, new a3(continuation, this, 19)), null, new b74.e(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f15231r;
    }
}
