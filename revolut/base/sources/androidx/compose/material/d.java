package androidx.compose.material;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f7150b;

    public /* synthetic */ d(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.f7149a = i;
        this.f7150b = delegatingThemeAwareRippleNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7149a) {
            case 0:
                return DelegatingThemeAwareRippleNode.updateConfiguration$lambda$0(this.f7150b);
            default:
                return DelegatingThemeAwareRippleNode.attachNewRipple$lambda$0(this.f7150b);
        }
    }
}
