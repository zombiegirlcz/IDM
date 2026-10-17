package v1;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class s0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f285131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f285132c;
    public final /* synthetic */ int d;

    public /* synthetic */ s0(TextStyle textStyle, Function2 function2, int i, int i2) {
        this.f285130a = i2;
        this.f285131b = textStyle;
        this.f285132c = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f285130a;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return TextKt.ProvideTextStyle$lambda$0(this.f285131b, this.f285132c, this.d, composer, iIntValue);
            default:
                return androidx.compose.material3.TextKt.ProvideTextStyle$lambda$20(this.f285131b, this.f285132c, this.d, composer, iIntValue);
        }
    }
}
