package f1;

import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131135a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f131137c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function f131138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function f131139h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f131140j;

    public /* synthetic */ b(ContextMenuState contextMenuState, Function0 function0, Function1 function1, Modifier modifier, boolean z, Function0 function02, Function2 function2, int i, int i2) {
        this.f = contextMenuState;
        this.f131138g = function0;
        this.i = function1;
        this.f131140j = modifier;
        this.f131136b = z;
        this.f131139h = function02;
        this.d = function2;
        this.f131137c = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f131135a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ContextMenuAreaKt.ContextMenuArea$lambda$3((ContextMenuState) this.f, (Function0) this.f131138g, (Function1) this.i, (Modifier) this.f131140j, this.f131136b, (Function0) this.f131139h, this.d, this.f131137c, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$2(this.f131136b, this.f131137c, this.d, (Function3) this.f, (Function2) this.f131138g, (Function2) this.f131139h, (WindowInsets) this.i, (Function2) this.f131140j, this.e, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ b(boolean z, int i, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i2) {
        this.f131136b = z;
        this.f131137c = i;
        this.d = function2;
        this.f = function3;
        this.f131138g = function22;
        this.f131139h = function23;
        this.i = windowInsets;
        this.f131140j = function24;
        this.e = i2;
    }
}
