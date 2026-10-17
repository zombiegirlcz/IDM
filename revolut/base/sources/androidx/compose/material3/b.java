package androidx.compose.material3;

import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7196a;

    public /* synthetic */ b(int i) {
        this.f7196a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7196a) {
            case 0:
                return OutlinedTextFieldKt.AnonymousClass3.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj2);
            case 1:
                return Boolean.valueOf(SnackbarHostKt$FadeInFadeOutWithScale$1$1.c((FadeInFadeOutAnimationItem) obj2));
            default:
                return SurfaceKt$Surface$1.invoke$lambda$2$lambda$1((SemanticsPropertyReceiver) obj2);
        }
    }
}
