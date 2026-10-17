package ly0;

import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi0.a f200629a;

    public e(CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f200629a = widgetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f200629a, ((e) obj2).f200629a);
    }

    public final int hashCode() {
        return this.f200629a.hashCode();
    }
}
