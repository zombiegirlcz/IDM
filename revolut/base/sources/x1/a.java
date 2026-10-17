package x1;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f301674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f301675c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Shape e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f301676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BorderStroke f301677h;
    public final /* synthetic */ PaddingValues i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f301678j;
    public final /* synthetic */ Function3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f301679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f301680m;

    public /* synthetic */ a(Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3 function3, int i, int i2) {
        this.f301673a = 2;
        this.f301674b = function0;
        this.f301675c = modifier;
        this.d = z;
        this.f301678j = mutableInteractionSource;
        this.f = buttonElevation;
        this.e = shape;
        this.f301677h = borderStroke;
        this.f301676g = buttonColors;
        this.i = paddingValues;
        this.k = function3;
        this.f301679l = i;
        this.f301680m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f301673a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ButtonKt.Button$lambda$3(this.f301674b, this.f301675c, this.d, this.e, (androidx.compose.material3.ButtonColors) this.f, (androidx.compose.material3.ButtonElevation) this.f301676g, this.f301677h, this.i, this.f301678j, this.k, this.f301679l, this.f301680m, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ButtonKt.TextButton$lambda$7(this.f301674b, this.f301675c, this.d, this.e, (androidx.compose.material3.ButtonColors) this.f, (androidx.compose.material3.ButtonElevation) this.f301676g, this.f301677h, this.i, this.f301678j, this.k, this.f301679l, this.f301680m, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return androidx.compose.material.ButtonKt.Button$lambda$4(this.f301674b, this.f301675c, this.d, this.f301678j, (ButtonElevation) this.f, this.e, this.f301677h, (ButtonColors) this.f301676g, this.i, this.k, this.f301679l, this.f301680m, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ a(Function0 function0, Modifier modifier, boolean z, Shape shape, androidx.compose.material3.ButtonColors buttonColors, androidx.compose.material3.ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2, int i3) {
        this.f301673a = i3;
        this.f301674b = function0;
        this.f301675c = modifier;
        this.d = z;
        this.e = shape;
        this.f = buttonColors;
        this.f301676g = buttonElevation;
        this.f301677h = borderStroke;
        this.i = paddingValues;
        this.f301678j = mutableInteractionSource;
        this.k = function3;
        this.f301679l = i;
        this.f301680m = i2;
    }
}
