package x1;

import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.internal.FloatProducer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FloatProducer f301724b;

    public /* synthetic */ f(FloatProducer floatProducer, int i) {
        this.f301723a = i;
        this.f301724b = floatProducer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f301723a) {
            case 0:
                return OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15(this.f301724b);
            default:
                return TextFieldKt.TextFieldLayout$lambda$19$lambda$15$lambda$14(this.f301724b);
        }
    }
}
