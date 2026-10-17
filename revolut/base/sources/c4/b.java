package c4;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.content.NavBackStackEntry;
import androidx.content.compose.NavBackStackEntryProviderKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20969c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f20967a = i2;
        this.f20969c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f20968b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f20967a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$20((LifecycleOwner) this.f20969c, (LifecycleStartStopEffectScope) this.d, (Function1) this.e, this.f20968b, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ComposableLambdaImpl.invoke$lambda$1((ComposableLambdaImpl) this.f20969c, this.d, this.e, this.f20968b, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return CoreTextFieldKt.CoreTextFieldRootBox$lambda$1((Modifier) this.f20969c, (TextFieldSelectionManager) this.d, (Function2) this.e, this.f20968b, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return TextLinkScope.StyleAnnotation$lambda$1((TextLinkScope) this.f20969c, (Object[]) this.d, (Function1) this.e, this.f20968b, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$3((TextContextMenuSession) this.f20969c, (TextContextMenuDataProvider) this.d, (Function0) this.e, this.f20968b, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return NavBackStackEntryProviderKt.LocalOwnersProvider$lambda$0((NavBackStackEntry) this.f20969c, (SaveableStateHolder) this.d, (Function2) this.e, this.f20968b, (Composer) obj2, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj3).intValue();
                return AndroidSelectionHandles_androidKt.HandlePopup$lambda$1((OffsetProvider) this.f20969c, (Alignment) this.d, (Function2) this.e, this.f20968b, (Composer) obj2, iIntValue7);
        }
    }
}
