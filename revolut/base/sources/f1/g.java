package f1;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.CheckboxColors;
import androidx.compose.material.CheckboxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131156a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f131157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f131158c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f131159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f131160h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g(ToggleableState toggleableState, Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, int i, int i2) {
        this.f131159g = toggleableState;
        this.f131157b = function0;
        this.f131158c = modifier;
        this.d = z;
        this.f131160h = mutableInteractionSource;
        this.i = checkboxColors;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f131156a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ContextMenuUiKt.ContextMenuItem$lambda$2((String) this.f131159g, this.d, (ContextMenuColors) this.f131160h, this.f131158c, (Function3) this.i, this.f131157b, this.e, this.f, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return CheckboxKt.TriStateCheckbox$lambda$0((ToggleableState) this.f131159g, this.f131157b, this.f131158c, this.d, (MutableInteractionSource) this.f131160h, (CheckboxColors) this.i, this.e, this.f, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ g(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, int i, int i2) {
        this.f131159g = str;
        this.d = z;
        this.f131160h = contextMenuColors;
        this.f131158c = modifier;
        this.i = function3;
        this.f131157b = function0;
        this.e = i;
        this.f = i2;
    }
}
