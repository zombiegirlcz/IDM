package xpe;

import android.content.Context;
import com.revolut.recyclerkit.AdaptiveGridLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f307937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f307938c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ d(int i, int i2, Object obj2, boolean z) {
        this.f307936a = i2;
        this.f307937b = obj2;
        this.f307938c = i;
        this.d = z;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f307936a) {
            case 0:
                ((com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f307937b).L2(this.f307938c, this.d);
                return Unit.f186387a;
            case 1:
                ((com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f307937b).L2(this.f307938c, this.d);
                return Unit.f186387a;
            case 2:
                ((com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f307937b).L2(this.f307938c, this.d);
                return Unit.f186387a;
            default:
                Context context = (Context) this.f307937b;
                AdaptiveGridLayoutManager.INSTANCE.getClass();
                int i = this.f307938c;
                if (this.d && ((Boolean) jo0.g.f176833q.getValue()).booleanValue() && ny0.i.d(context)) {
                    i++;
                }
                return Integer.valueOf(i);
        }
    }
}
