package mx0;

import com.revolut.core.ui_kit.views.KeypadView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeypadView f209840b;

    public /* synthetic */ m8(KeypadView keypadView, int i) {
        this.f209839a = i;
        this.f209840b = keypadView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f209839a) {
            case 0:
                return KeypadView.h0(this.f209840b);
            default:
                return KeypadView.g0(this.f209840b);
        }
    }
}
