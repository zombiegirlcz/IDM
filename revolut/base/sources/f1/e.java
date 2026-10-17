package f1;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f131152c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj2, int i, Object obj3, int i2) {
        this.f131150a = 2;
        this.f131152c = lazyLayoutItemProvider;
        this.f131151b = obj2;
        this.d = i;
        this.f = obj3;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f131150a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$1((Modifier) this.f131152c, (ContextMenuColors) this.f131151b, (Function1) this.f, this.d, this.e, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return ContextMenuUiKt.ContextMenuColumn$lambda$0((ContextMenuColors) this.f131151b, (Modifier) this.f131152c, (Function3) this.f, this.d, this.e, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$1((LazyLayoutItemProvider) this.f131152c, this.f131151b, this.d, this.f, this.e, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$2(this.f131152c, this.d, (LazyLayoutPinnedItemList) this.f131151b, (Function2) this.f, this.e, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$6((Modifier) this.f131152c, (Function1) this.f, (Function2) this.f131151b, this.d, this.e, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return SnackbarHostKt.SnackbarHost$lambda$1((SnackbarHostState) this.f131151b, (Modifier) this.f131152c, (Function3) this.f, this.d, this.e, (Composer) obj2, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj3).intValue();
                return androidx.compose.material3.SnackbarHostKt.SnackbarHost$lambda$1((androidx.compose.material3.SnackbarHostState) this.f131151b, (Modifier) this.f131152c, (Function3) this.f, this.d, this.e, (Composer) obj2, iIntValue7);
        }
    }

    public /* synthetic */ e(Modifier modifier, ContextMenuColors contextMenuColors, Function1 function1, int i, int i2) {
        this.f131150a = 0;
        this.f131152c = modifier;
        this.f131151b = contextMenuColors;
        this.f = function1;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ e(Modifier modifier, Function1 function1, Function2 function2, int i, int i2) {
        this.f131150a = 4;
        this.f131152c = modifier;
        this.f = function1;
        this.f131151b = function2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ e(Object obj2, int i, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, Function2 function2, int i2) {
        this.f131150a = 3;
        this.f131152c = obj2;
        this.d = i;
        this.f131151b = lazyLayoutPinnedItemList;
        this.f = function2;
        this.e = i2;
    }

    public /* synthetic */ e(Object obj2, Modifier modifier, Function3 function3, int i, int i2, int i3) {
        this.f131150a = i3;
        this.f131151b = obj2;
        this.f131152c = modifier;
        this.f = function3;
        this.d = i;
        this.e = i2;
    }
}
