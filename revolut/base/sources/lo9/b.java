package lo9;

import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f197421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f197422b;

    public b(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f197421a = memoryCache;
        this.f197422b = storage;
    }

    public final PaymentWidget a(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        a aVar = Companion;
        aVar.getClass();
        PaymentWidget paymentWidget = (PaymentWidget) this.f197421a.get(a.a(widgetId));
        if (paymentWidget != null) {
            return paymentWidget;
        }
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        aVar.getClass();
        return (PaymentWidget) j6.a.k(PaymentWidget.class, this.f197422b, a.a(widgetId));
    }
}
