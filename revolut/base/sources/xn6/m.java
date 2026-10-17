package xn6;

import com.revolut.feature.atm.api.model.SurchargeFreeState;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f307328b;

    public /* synthetic */ m(int i, Boolean bool) {
        this.f307327a = i;
        this.f307328b = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f307327a) {
            case 0:
                Boolean bool = this.f307328b;
                Intrinsics.h(bool);
                return e.a((e) obj2, bool.booleanValue(), null, null, 30);
            case 1:
                xpk.h hVar = (xpk.h) obj2;
                Boolean bool2 = this.f307328b;
                Intrinsics.h(bool2);
                return xpk.h.a(hVar, bool2.booleanValue(), false, false, null, null, null, false, 510);
            case 2:
                Boolean checked = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(checked, "checked");
                boolean zBooleanValue = checked.booleanValue();
                Boolean bool3 = this.f307328b;
                Intrinsics.h(bool3);
                return new SurchargeFreeState(zBooleanValue, bool3.booleanValue());
            case 3:
                yv2.f fVar = (yv2.f) obj2;
                Boolean bool4 = this.f307328b;
                Intrinsics.h(bool4);
                return yv2.f.a(fVar, 0, null, null, bool4.booleanValue(), null, false, false, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            default:
                Boolean bool5 = this.f307328b;
                Intrinsics.h(bool5);
                return zr2.c.a((zr2.c) obj2, null, bool5.booleanValue(), 1);
        }
    }
}
