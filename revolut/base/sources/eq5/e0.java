package eq5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f128264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f128265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f128266c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f128267g;

    public e0(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f128264a = languageProvider;
        final int i = 0;
        this.f128265b = te0.w.y0(new Function0(this) { // from class: eq5.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f128258b;

            {
                this.f128258b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new u80.d(((s80.b) this.f128258b.f128264a).b());
                    default:
                        return new CenteredAmountDelegate(new eh3.s(this.f128258b, 18));
                }
            }
        });
        this.f128266c = v0.a.d("create(...)");
        this.d = te0.w.y0(new ekd.i0(7));
        this.e = te0.w.y0(new ekd.i0(8));
        this.f = te0.w.y0(new ekd.i0(9));
        final int i2 = 1;
        this.f128267g = te0.w.y0(new Function0(this) { // from class: eq5.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f128258b;

            {
                this.f128258b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new u80.d(((s80.b) this.f128258b.f128264a).b());
                    default:
                        return new CenteredAmountDelegate(new eh3.s(this.f128258b, 18));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final List a() {
        return zhm.v.k(b(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), (CellDetailsDelegate) this.d.getValue(), (CellDetailsActionDelegate) this.e.getValue(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) this.f.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CenteredAmountDelegate b() {
        return (CenteredAmountDelegate) this.f128267g.getValue();
    }
}
