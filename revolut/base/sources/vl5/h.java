package vl5;

import com.revolut.feature.crypto.spare.change.impl.ui.change_spare_change.ChangeSpareChangeScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f290297p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, ChangeSpareChangeScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f290297p = new f(inputData.f70996a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f290297p;
    }
}
