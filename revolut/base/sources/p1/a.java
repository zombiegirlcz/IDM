package p1;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidTextContextMenuToolbarProvider f231578b;

    public /* synthetic */ a(AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.f231577a = i;
        this.f231578b = androidTextContextMenuToolbarProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f231577a) {
            case 0:
                return AndroidTextContextMenuToolbarProvider.snapshotStateObserver$lambda$0(this.f231578b, (Function0) obj2);
            case 1:
                return AndroidTextContextMenuToolbarProvider.onDataChange$lambda$0(this.f231578b, obj2);
            case 2:
                return AndroidTextContextMenuToolbarProvider.onPositionChange$lambda$0(this.f231578b, obj2);
            default:
                return AndroidTextContextMenuToolbarProvider_androidKt.platformTextContextMenuToolbarProvider$lambda$1$0(this.f231578b, (DisposableEffectScope) obj2);
        }
    }
}
