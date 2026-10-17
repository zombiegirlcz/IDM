package q22;

import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApmNewContactNavigation$Tab f241494b;

    public /* synthetic */ k(ApmNewContactNavigation$Tab apmNewContactNavigation$Tab, int i) {
        this.f241493a = i;
        this.f241494b = apmNewContactNavigation$Tab;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f241493a) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a.a(update, this.f241494b, null, null, null, null, null, null, false, false, 510);
            default:
                return a.a((a) obj2, this.f241494b, null, null, null, null, null, null, false, false, 510);
        }
    }
}
