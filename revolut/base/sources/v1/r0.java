package v1;

import androidx.compose.material.TextKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLinkStyles;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextLinkStyles f285124b;

    public /* synthetic */ r0(TextLinkStyles textLinkStyles, int i) {
        this.f285123a = i;
        this.f285124b = textLinkStyles;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285123a) {
            case 0:
                return TextKt.createTextWithLinkStyles$lambda$0(this.f285124b, (AnnotatedString.Range) obj2);
            default:
                return androidx.compose.material3.TextKt.createTextWithLinkStyles$lambda$21(this.f285124b, (AnnotatedString.Range) obj2);
        }
    }
}
