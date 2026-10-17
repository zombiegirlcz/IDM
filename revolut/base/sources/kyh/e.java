package kyh;

import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.staking.api.model.StakingPocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f190903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f190904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingPocket f190905c;
    public final boolean d;
    public final ImageTransformations e;

    public e(h cryptoOrderConfig, d dVar, StakingPocket stakingPocket, boolean z, ImageTransformations imageTransformations, int i) {
        z = (i & 8) != 0 ? false : z;
        imageTransformations = (i & 16) != 0 ? null : imageTransformations;
        Intrinsics.checkNotNullParameter(cryptoOrderConfig, "cryptoOrderConfig");
        this.f190903a = cryptoOrderConfig;
        this.f190904b = dVar;
        this.f190905c = stakingPocket;
        this.d = z;
        this.e = imageTransformations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f190903a, eVar.f190903a) && Intrinsics.f(this.f190904b, eVar.f190904b) && Intrinsics.f(this.f190905c, eVar.f190905c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f190903a.hashCode() * 31;
        d dVar = this.f190904b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        StakingPocket stakingPocket = this.f190905c;
        int iC = j6.a.c((iHashCode2 + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31, 31, this.d);
        ImageTransformations imageTransformations = this.e;
        return iC + (imageTransformations != null ? imageTransformations.hashCode() : 0);
    }
}
