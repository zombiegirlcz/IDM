package n6;

import androidx.window.layout.SafeWindowLayoutComponentProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SafeWindowLayoutComponentProvider f212660b;

    public /* synthetic */ a(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, int i) {
        this.f212659a = i;
        this.f212660b = safeWindowLayoutComponentProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean zIsWindowLayoutProviderValid$lambda$0;
        switch (this.f212659a) {
            case 0:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid$lambda$0(this.f212660b);
                break;
            case 1:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isFoldingFeatureValid$lambda$1(this.f212660b);
                break;
            case 2:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isSupportedWindowFeaturesValid$lambda$5(this.f212660b);
                break;
            case 3:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isDisplayFoldFeatureValid$lambda$4(this.f212660b);
                break;
            case 4:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isGetSupportedWindowFeaturesValid$lambda$6(this.f212660b);
                break;
            case 5:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerJavaConsumerValid$lambda$2(this.f212660b);
                break;
            default:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerWindowConsumerValid$lambda$3(this.f212660b);
                break;
        }
        return Boolean.valueOf(zIsWindowLayoutProviderValid$lambda$0);
    }
}
