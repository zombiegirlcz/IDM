package d1;

import android.graphics.Bitmap;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.content.compose.DialogHostKt;
import androidx.content.compose.DialogNavigator;
import com.revolut.uicomponent.widgets.support_edit_text.MultipleDrawableMaterialEditText;
import hx5.b;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f110454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110455c;

    public /* synthetic */ a(int i, MultipleDrawableMaterialEditText multipleDrawableMaterialEditText) {
        this.f110453a = 1;
        this.f110454b = i;
        this.f110455c = multipleDrawableMaterialEditText;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f110453a;
        int i2 = this.f110454b;
        Object obj4 = this.f110455c;
        switch (i) {
            case 0:
                return InfiniteTransition.run$lambda$2((InfiniteTransition) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                Bitmap bmp = (Bitmap) obj3;
                MultipleDrawableMaterialEditText.Companion companion = MultipleDrawableMaterialEditText.INSTANCE;
                Intrinsics.checkNotNullParameter(bmp, "bmp");
                return new Pair(Integer.valueOf((i2 + ((MultipleDrawableMaterialEditText) obj4).f) * iIntValue), bmp);
            case 2:
                b.a aVar = hx5.b.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return hx5.b.a((hx5.b) obj4, i2);
            case 3:
                return BoxKt.Box$lambda$1((Modifier) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$2((Function3) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return PagerLazyLayoutItemProvider.Item$lambda$0((PagerLazyLayoutItemProvider) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return CoreTextFieldKt.TextFieldCursorHandle$lambda$4((TextFieldSelectionManager) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return TextLinkScope.LinksComposables$lambda$1((TextLinkScope) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return DialogHostKt.DialogHost$lambda$7((DialogNavigator) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f110453a = i2;
        this.f110455c = obj2;
        this.f110454b = i;
    }
}
