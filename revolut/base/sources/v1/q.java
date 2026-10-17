package v1;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f285099c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285100g;

    public /* synthetic */ q(long j2, TextStyle textStyle, Float f, Function2 function2, int i, int i2) {
        this.f285097a = 2;
        this.e = j2;
        this.f285098b = textStyle;
        this.f285099c = f;
        this.d = function2;
        this.f = i;
        this.f285100g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f285097a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return IconKt.Icon_ww6aTOc$lambda$3((Painter) this.f285098b, (String) this.f285099c, (Modifier) this.d, this.e, this.f, this.f285100g, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return androidx.compose.material3.IconKt.Icon_ww6aTOc$lambda$6((Painter) this.f285098b, (String) this.f285099c, (Modifier) this.d, this.e, this.f, this.f285100g, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return TextFieldImplKt.Decoration_euL9pac$lambda$1(this.e, (TextStyle) this.f285098b, (Float) this.f285099c, (Function2) this.d, this.f, this.f285100g, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ q(Painter painter, String str, Modifier modifier, long j2, int i, int i2, int i3) {
        this.f285097a = i3;
        this.f285098b = painter;
        this.f285099c = str;
        this.d = modifier;
        this.e = j2;
        this.f = i;
        this.f285100g = i2;
    }
}
