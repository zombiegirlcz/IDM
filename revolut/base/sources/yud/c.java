package yud;

import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StakingProduct f317009b;

    public /* synthetic */ c(int i, StakingProduct stakingProduct) {
        this.f317008a = i;
        this.f317009b = stakingProduct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f317008a) {
            case 0:
                List pocketFacades = (List) obj2;
                Intrinsics.checkNotNullParameter(pocketFacades, "pocketFacades");
                for (Object obj3 : pocketFacades) {
                    String str = ((zvd.b) obj3).f325660b;
                    StakingProduct stakingProduct = this.f317009b;
                    if (Intrinsics.f(str, stakingProduct.f88086a)) {
                        return new Pair(obj3, stakingProduct);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 1:
                StakingPocket stakingPocket = (StakingPocket) obj2;
                Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
                return new StakingAvailability(this.f317009b, stakingPocket);
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new StakingAvailability(this.f317009b, null);
        }
    }
}
