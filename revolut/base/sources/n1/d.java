package n1;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f211075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f211076c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TextStyle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f211077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyboardActions f211078h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f211079j;
    public final /* synthetic */ int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f211080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f211081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f211082n;
    public final /* synthetic */ Brush o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function3 f211083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f211084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f211085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f211086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f211087t;

    public /* synthetic */ d(Object obj2, Function1 function1, Modifier modifier, boolean z, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, int i3, int i5, int i6, int i21) {
        this.f211074a = i21;
        this.f211087t = obj2;
        this.f211075b = function1;
        this.f211076c = modifier;
        this.d = z;
        this.e = z3;
        this.f = textStyle;
        this.f211077g = keyboardOptions;
        this.f211078h = keyboardActions;
        this.i = z4;
        this.f211079j = i;
        this.k = i2;
        this.f211080l = visualTransformation;
        this.f211081m = function12;
        this.f211082n = mutableInteractionSource;
        this.o = brush;
        this.f211083p = function3;
        this.f211084q = i3;
        this.f211085r = i5;
        this.f211086s = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f211074a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return BasicTextFieldKt.BasicTextField$lambda$28((TextFieldValue) this.f211087t, this.f211075b, this.f211076c, this.d, this.e, this.f, this.f211077g, this.f211078h, this.i, this.f211079j, this.k, this.f211080l, this.f211081m, this.f211082n, this.o, this.f211083p, this.f211084q, this.f211085r, this.f211086s, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return BasicTextFieldKt.BasicTextField$lambda$25((String) this.f211087t, this.f211075b, this.f211076c, this.d, this.e, this.f, this.f211077g, this.f211078h, this.i, this.f211079j, this.k, this.f211080l, this.f211081m, this.f211082n, this.o, this.f211083p, this.f211084q, this.f211085r, this.f211086s, (Composer) obj2, iIntValue2);
        }
    }
}
