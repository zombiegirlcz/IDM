package v1;

import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f285199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f285200c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ z(PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, Object obj2, int i2) {
        this.f285198a = 2;
        this.f285199b = pagerLazyLayoutItemProvider;
        this.d = i;
        this.f285200c = obj2;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f285198a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return SnackbarHostKt.FadeInFadeOutWithScale$lambda$4(null, (Modifier) this.f285199b, (Function3) this.f285200c, this.d, this.e, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return androidx.compose.material3.SnackbarHostKt.FadeInFadeOutWithScale$lambda$7(null, (Modifier) this.f285199b, (Function3) this.f285200c, this.d, this.e, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return PagerLazyLayoutItemProvider.Item$lambda$1((PagerLazyLayoutItemProvider) this.f285199b, this.d, this.f285200c, this.e, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ z(Modifier modifier, Function3 function3, int i, int i2, int i3) {
        this.f285198a = i3;
        this.f285199b = modifier;
        this.f285200c = function3;
        this.d = i;
        this.e = i2;
    }
}
