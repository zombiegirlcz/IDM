package je9;

import com.revolut.core.ui_kit.views.pin.PinCodeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {
    @Override // je9.d
    public final void a(PinCodeView pinCodeView) {
        Intrinsics.checkNotNullParameter(pinCodeView, "pinCodeView");
        pinCodeView.setFilterTouchesWhenObscured(true);
    }
}
