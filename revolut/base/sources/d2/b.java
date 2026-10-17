package d2;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110678a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110680c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f110681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f110682h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(WindowInsets windowInsets, Function2 function2, Function2 function22, Function2 function23, int i, Function2 function24, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function25) {
        this.f110680c = windowInsets;
        this.d = function2;
        this.e = function22;
        this.f = function23;
        this.f110679b = i;
        this.f110681g = function24;
        this.f110682h = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.i = function25;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f110678a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ComposableLambdaImpl.invoke$lambda$5((ComposableLambdaImpl) this.f110680c, this.d, this.e, this.f, this.f110681g, this.f110682h, this.i, this.f110679b, (Composer) obj2, iIntValue);
            default:
                return ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14((WindowInsets) this.f110680c, (Function2) this.d, (Function2) this.e, (Function2) this.f, this.f110679b, (Function2) this.f110681g, (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) this.f110682h, (Function2) this.i, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
        }
    }

    public /* synthetic */ b(ComposableLambdaImpl composableLambdaImpl, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f110680c = composableLambdaImpl;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.f110681g = obj5;
        this.f110682h = obj6;
        this.i = obj7;
        this.f110679b = i;
    }
}
