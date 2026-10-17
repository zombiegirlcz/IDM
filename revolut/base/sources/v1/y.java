package v1;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material.MutableWindowInsets;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285192a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f285193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f285194c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function3 f285195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f285196h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f285197j;

    public /* synthetic */ y(Function2 function2, Function2 function22, Function2 function23, int i, boolean z, WindowInsets windowInsets, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function24, Function3 function3) {
        this.f285193b = function2;
        this.f285194c = function22;
        this.d = function23;
        this.e = i;
        this.f = z;
        this.f285196h = windowInsets;
        this.i = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.f285197j = function24;
        this.f285195g = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f285192a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ScaffoldKt.Scaffold_u4IkXBM$lambda$1$1(this.f, this.e, this.f285193b, this.f285195g, this.f285194c, (MutableWindowInsets) this.i, this.d, (Function3) this.f285196h, (ScaffoldState) this.f285197j, (Composer) obj2, iIntValue);
            default:
                return ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$1$0(this.f285193b, this.f285194c, this.d, this.e, this.f, (WindowInsets) this.f285196h, (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) this.i, (Function2) this.f285197j, this.f285195g, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
        }
    }

    public /* synthetic */ y(boolean z, int i, Function2 function2, Function3 function3, Function2 function22, MutableWindowInsets mutableWindowInsets, Function2 function23, Function3 function32, ScaffoldState scaffoldState) {
        this.f = z;
        this.e = i;
        this.f285193b = function2;
        this.f285195g = function3;
        this.f285194c = function22;
        this.i = mutableWindowInsets;
        this.d = function23;
        this.f285196h = function32;
        this.f285197j = scaffoldState;
    }
}
