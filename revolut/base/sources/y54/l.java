package y54;

import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.city.BirthCityScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f310990p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, BirthCityScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f310990p = new f(inputData.f67179a, inputData.f67180b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f310990p;
    }
}
