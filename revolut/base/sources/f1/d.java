package f1;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f131146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f131147c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f131148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function f131149h;

    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Object obj5, Function function, int i, int i2, int i3) {
        this.f131145a = i3;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.f131148g = obj5;
        this.f131149h = function;
        this.f131146b = i;
        this.f131147c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f131145a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ContextMenuUiKt.ContextMenuPopup$lambda$2((PopupPositionProvider) this.d, (Function0) this.e, (Modifier) this.f, (ContextMenuColors) this.f131148g, (Function1) this.f131149h, this.f131146b, this.f131147c, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return MaterialThemeKt.MaterialTheme$lambda$1((ColorScheme) this.d, (MotionScheme) this.e, (Shapes) this.f, (Typography) this.f131148g, (Function2) this.f131149h, this.f131146b, this.f131147c, (Composer) obj2, iIntValue2);
        }
    }
}
