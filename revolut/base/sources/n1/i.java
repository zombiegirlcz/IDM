package n1;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f211115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f211116c;

    public /* synthetic */ i(TextLinkScope textLinkScope, Function1 function1, int i) {
        this.f211114a = i;
        this.f211115b = textLinkScope;
        this.f211116c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211114a) {
            case 0:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0(this.f211115b, this.f211116c, (TextLayoutResult) obj2);
            default:
                return TextLinkScope.StyleAnnotation$lambda$0$0(this.f211115b, this.f211116c, (DisposableEffectScope) obj2);
        }
    }
}
