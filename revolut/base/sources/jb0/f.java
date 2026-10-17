package jb0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb0.p;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FormScreen f172541b;

    public /* synthetic */ f(FormScreen formScreen, int i) {
        this.f172540a = i;
        this.f172541b = formScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172540a) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d.a(update, this.f172541b, null, null, 6);
            case 1:
                p update2 = (p) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return p.a(update2, this.f172541b, null, null, 6);
            case 2:
                BackendScreen updatedScreen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(updatedScreen, "updatedScreen");
                return Boolean.valueOf(!Intrinsics.f(this.f172541b, updatedScreen));
            default:
                yb0.d update3 = (yb0.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return yb0.d.a(update3, this.f172541b, null, null, null, 14);
        }
    }
}
