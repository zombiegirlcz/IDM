package dy5;

import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import cqh.m;
import kotlin.jvm.internal.Intrinsics;
import x8h.g;
import xzg.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f121058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CryptoCollectionDetailsControllerContract$InputData f121059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f121060n;

    public e(g collectionsInteractor, CryptoCollectionDetailsControllerContract$InputData inputData, a mapper) {
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f121058l = collectionsInteractor;
        this.f121059m = inputData;
        this.f121060n = mapper;
    }

    @Override // dy5.b
    public final m Z2() {
        return new m(mo3.a.g(rd0.e.b(this.f121058l.b(this.f121059m.f71594a, o.CRYPTO)), null, new dug.d(16), 1), this, 16);
    }
}
