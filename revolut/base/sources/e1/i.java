package e1;

import androidx.compose.foundation.ScrollKt;
import com.revolut.feature.wealth.options.ui.impl.ui.tab.OptionsTabController;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121783b;

    public /* synthetic */ i(int i, int i2) {
        this.f121782a = i2;
        this.f121783b = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f121782a;
        int i2 = this.f121783b;
        switch (i) {
            case 0:
                return ScrollKt.rememberScrollState$lambda$0$0(i2);
            default:
                KProperty[] kPropertyArr = OptionsTabController.S;
                return Integer.valueOf(i2);
        }
    }
}
