package cie;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeFeedWidgetContext f24488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24489b;

    public i0(HomeFeedWidgetContext context, List widgetItems) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetItems, "widgetItems");
        this.f24488a = context;
        this.f24489b = widgetItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f24488a, i0Var.f24488a) && Intrinsics.f(this.f24489b, i0Var.f24489b);
    }

    public final int hashCode() {
        return this.f24489b.hashCode() + (this.f24488a.hashCode() * 31);
    }
}
