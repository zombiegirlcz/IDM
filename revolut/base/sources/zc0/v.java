package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f321139b;

    public /* synthetic */ v(z zVar, int i) {
        this.f321138a = i;
        this.f321139b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f321138a) {
            case 0:
                FormScreen it8 = (FormScreen) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (Boolean) this.f321139b.invoke(it8);
            default:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                if (!(screen instanceof FormScreen)) {
                    return rfm.h.f253943a;
                }
                return new rfm.f(efm.k.g(screen), new n(new v(this.f321139b, 0), 11), 2);
        }
    }
}
