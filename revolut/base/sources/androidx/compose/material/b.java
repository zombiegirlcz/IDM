package androidx.compose.material;

import androidx.compose.material.AnchoredDraggableState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7145b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f7144a = i;
        this.f7145b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7144a) {
            case 0:
                return ((AnchoredDraggableState) this.f7145b).getAnchors();
            case 1:
                return AnchoredDraggableState.AnonymousClass4.invokeSuspend$lambda$0((AnchoredDraggableState) this.f7145b);
            default:
                return SnackbarHostKt.FadeInFadeOutWithScale$lambda$2$0$0$0(null, (FadeInFadeOutState) this.f7145b);
        }
    }
}
