package l6;

import androidx.window.SafeWindowExtensionsProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SafeWindowExtensionsProvider f192343b;

    public /* synthetic */ a(SafeWindowExtensionsProvider safeWindowExtensionsProvider, int i) {
        this.f192342a = i;
        this.f192343b = safeWindowExtensionsProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f192342a) {
            case 0:
                return Boolean.valueOf(SafeWindowExtensionsProvider.isWindowExtensionsValid$lambda$0(this.f192343b));
            default:
                return SafeWindowExtensionsProvider.isWindowExtensionsPresent$lambda$1(this.f192343b);
        }
    }
}
