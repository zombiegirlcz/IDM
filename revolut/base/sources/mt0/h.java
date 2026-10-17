package mt0;

import android.content.Context;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ro0.z;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f208700b;

    public /* synthetic */ h(j jVar, int i) {
        this.f208699a = i;
        this.f208700b = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f208699a;
        j jVar = this.f208700b;
        switch (i) {
            case 0:
                if (((Boolean) jo0.g.K.getValue()).booleanValue()) {
                    Context context = jVar.f208701a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (kli.a.q(context)) {
                        z zVar = z.f255796a;
                        return new ro0.l(new h(jVar, 1));
                    }
                }
                return new ro0.n(new h(jVar, 2), null, 5);
            case 1:
                return jVar.a();
            case 2:
                return jVar.a();
            default:
                FloatingBottomBarView.b bVar = FloatingBottomBarView.Companion;
                ro0.p pVar = jVar.d;
                if (pVar != null) {
                    pVar.b();
                }
                return Unit.f186387a;
        }
    }
}
