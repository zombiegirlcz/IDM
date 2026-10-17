package d1;

import android.content.Context;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.content.compose.DialogHostKt;
import androidx.content.compose.NavBackStackEntryProviderKt;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Collection;
import java.util.List;
import koi.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f110471c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj2, int i, Object obj3, int i2) {
        this.f110469a = i2;
        this.d = obj2;
        this.f110471c = i;
        this.f110470b = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f110469a;
        int i2 = this.f110471c;
        Object obj4 = this.f110470b;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                return Transition.animateTo$lambda$3((Transition) obj5, obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return ComposableLambdaImpl.invoke$lambda$0((ComposableLambdaImpl) obj5, obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return CanvasKt.Canvas$lambda$0((Modifier) obj5, (Function1) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                SpinnerPickerView spinnerPickerView = (SpinnerPickerView) obj5;
                RecyclerView recyclerView = (RecyclerView) obj4;
                j listItem = (j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i3 = SpinnerPickerView.f59693p;
                Intrinsics.checkNotNullParameter(listItem, "listItem");
                if (iIntValue == 0) {
                    SpinnerPickerItemDelegateModel spinnerPickerItemDelegateModel = listItem instanceof SpinnerPickerItemDelegateModel ? (SpinnerPickerItemDelegateModel) listItem : null;
                    if (spinnerPickerItemDelegateModel == null) {
                        return Unit.f186387a;
                    }
                    SpinnerPickerItemDelegateModel[] spinnerPickerItemDelegateModelArr = spinnerPickerView.f59696c;
                    spinnerPickerItemDelegateModelArr[i2] = spinnerPickerItemDelegateModel;
                    int length = spinnerPickerItemDelegateModelArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            spinnerPickerView.d.onNext(kotlin.collections.d.L(spinnerPickerView.f59696c));
                        } else if (spinnerPickerItemDelegateModelArr[i5] != null) {
                            i5++;
                        }
                    }
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.uikit_spinner_picker_column_accessibility_label, u.c(spinnerPickerItemDelegateModel.f58154b), null, 12);
                    ty0.c cVarB0 = or0.u.k(recyclerView).b0();
                    Context context = recyclerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    m.c(recyclerView, ty0.c.a(cVarB0, textLocalisedClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                }
                return Unit.f186387a;
            case 4:
                return ContextMenuScope.Content$lambda$1((ContextMenuScope) obj5, (ContextMenuColors) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$0((LazyLayoutItemProvider) obj5, i2, obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AnnotatedStringResolveInlineContentKt.InlineChildren$lambda$1((AnnotatedString) obj5, (List) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$1((TextContextMenuSession) obj5, (TextContextMenuData) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return DialogHostKt.PopulateVisibleList$lambda$13((List) obj5, (Collection) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return NavBackStackEntryProviderKt.SaveableStateProvider$lambda$3((SaveableStateHolder) obj5, (Function2) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return CompositionLocalKt.CompositionLocalProvider$lambda$1((ProvidedValue) obj5, (Function2) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return CompositionLocalKt.CompositionLocalProvider$lambda$0((ProvidedValue[]) obj5, (Function2) obj4, i2, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ g(Object obj2, Object obj3, int i, int i2) {
        this.f110469a = i2;
        this.d = obj2;
        this.f110470b = obj3;
        this.f110471c = i;
    }
}
