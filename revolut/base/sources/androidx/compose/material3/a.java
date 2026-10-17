package androidx.compose.material3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7195b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f7194a = i;
        this.f7195b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7194a) {
            case 0:
                return DelegatingThemeAwareRippleNode.updateConfiguration$lambda$0((DelegatingThemeAwareRippleNode) this.f7195b);
            case 1:
                return DelegatingThemeAwareRippleNode.attachNewRipple$lambda$1((DelegatingThemeAwareRippleNode) this.f7195b);
            default:
                return SnackbarHostKt$FadeInFadeOutWithScale$1$1.invoke$lambda$2$lambda$1(null, (FadeInFadeOutState) this.f7195b);
        }
    }
}
