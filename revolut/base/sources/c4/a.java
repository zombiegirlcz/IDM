package c4;

import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20965c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20966g;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.f20963a = i3;
        this.e = obj2;
        this.f = obj3;
        this.f20966g = obj4;
        this.f20964b = obj5;
        this.f20965c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f20963a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$9(this.e, this.f, (LifecycleOwner) this.f20966g, (Function1) this.f20964b, this.f20965c, this.d, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ContextMenuUiKt.ContextMenuPopup$lambda$0((PopupPositionProvider) this.e, (Function0) this.f, (Modifier) this.f20966g, (Function1) this.f20964b, this.f20965c, this.d, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return LazyLayoutKt.LazyLayout$lambda$2((Function0) this.e, (Modifier) this.f, (LazyLayoutPrefetchState) this.f20966g, (LazyLayoutMeasurePolicy) this.f20964b, this.f20965c, this.d, (Composer) obj2, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj3).intValue();
                return MaterialThemeKt.MaterialTheme$lambda$0((ColorScheme) this.e, (Shapes) this.f, (Typography) this.f20966g, (Function2) this.f20964b, this.f20965c, this.d, (Composer) obj2, iIntValue4);
        }
    }
}
