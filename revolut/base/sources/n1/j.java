package n1;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f211118b;

    public /* synthetic */ j(TextLinkScope textLinkScope, int i) {
        this.f211117a = i;
        this.f211118b = textLinkScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0;
        switch (this.f211117a) {
            case 0:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0(this.f211118b);
                break;
            case 1:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$8$0(this.f211118b);
                break;
            default:
                zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0 = TextLinkScope._get_shouldMeasureLinks_$lambda$0(this.f211118b);
                break;
        }
        return Boolean.valueOf(zLayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0);
    }
}
