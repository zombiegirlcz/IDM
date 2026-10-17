package s5;

import androidx.content.NavDeepLink;
import androidx.content.internal.NavDestinationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f259902b;

    public /* synthetic */ b(NavDeepLink navDeepLink, int i) {
        this.f259901a = i;
        this.f259902b = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean zAddDeepLink$lambda$4;
        switch (this.f259901a) {
            case 0:
                zAddDeepLink$lambda$4 = NavDestinationImpl.addDeepLink$lambda$4(this.f259902b, (String) obj2);
                break;
            default:
                zAddDeepLink$lambda$4 = NavDestinationImpl._set_route_$lambda$1(this.f259902b, (String) obj2);
                break;
        }
        return Boolean.valueOf(zAddDeepLink$lambda$4);
    }
}
