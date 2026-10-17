package a64;

import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f1541p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, BirthCountryScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f1541p = new d(inputData.f67183a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f1541p;
    }
}
