package n1;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f211105b;

    public /* synthetic */ g(MutableState mutableState, int i) {
        this.f211104a = i;
        this.f211105b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211104a) {
            case 0:
                return BasicTextKt.BasicText_CL7eQgs$lambda$5$0(this.f211105b, (TextAnnotatedStringNode.TextSubstitutionValue) obj2);
            case 1:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0(this.f211105b, (List) obj2);
            case 2:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5$0$0(this.f211105b, (LayoutCoordinates) obj2);
            case 3:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4$0$0(this.f211105b, (LayoutCoordinates) obj2);
            default:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$0$0(this.f211105b, (LayoutCoordinates) obj2);
        }
    }
}
