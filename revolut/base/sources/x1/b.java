package x1;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301681a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f301682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function3 f301683c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f301684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f301685h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(int i, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i2) {
        this.f301682b = i;
        this.e = function2;
        this.f301683c = function3;
        this.f = function22;
        this.f301684g = function23;
        this.f301685h = windowInsets;
        this.i = function24;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f301681a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return CardKt.Card$lambda$0((Modifier) this.e, (Shape) this.f, (CardColors) this.f301684g, (CardElevation) this.f301685h, (BorderStroke) this.i, this.f301683c, this.f301682b, this.d, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$16(this.f301682b, (Function2) this.e, this.f301683c, (Function2) this.f, (Function2) this.f301684g, (WindowInsets) this.f301685h, (Function2) this.i, this.d, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ b(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, Function3 function3, int i, int i2) {
        this.e = modifier;
        this.f = shape;
        this.f301684g = cardColors;
        this.f301685h = cardElevation;
        this.i = borderStroke;
        this.f301683c = function3;
        this.f301682b = i;
        this.d = i2;
    }
}
