package a2g;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlainTextDelegate.Model f847b;

    public /* synthetic */ n(PlainTextDelegate.Model model, int i) {
        this.f846a = i;
        this.f847b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f846a) {
            case 0:
                g updateState = (g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return g.a(updateState, null, null, !(this.f847b.f instanceof u5), false, false, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            default:
                fnc.m update = (fnc.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return fnc.m.a(update, null, this.f847b.f instanceof s5, null, null, null, null, null, null, null, null, null, null, 4093);
        }
    }
}
