package j1;

import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.State;
import androidx.content.compose.NavHostKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ State f170078b;

    public /* synthetic */ c(State state, int i) {
        this.f170077a = i;
        this.f170078b = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f170077a) {
            case 0:
                return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$0(this.f170078b);
            case 1:
                return LazyLayoutKt.LazyLayout$lambda$1$0$0(this.f170078b);
            case 2:
                return NavHostKt.NavHost$lambda$52$lambda$51(this.f170078b);
            case 3:
                return SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0$1$0(this.f170078b);
            case 4:
                return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$7$lambda$6(this.f170078b));
            default:
                return Boolean.valueOf(TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$10$lambda$9(this.f170078b));
        }
    }
}
