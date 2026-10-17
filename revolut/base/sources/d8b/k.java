package d8b;

import c6b.n;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements t5b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f112205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f112206b;

    public k(n cobrandedCardsWidgetInteractor, b smallWidgetItemsMapper, a mediumWidgetItemsMapper) {
        Intrinsics.checkNotNullParameter(cobrandedCardsWidgetInteractor, "cobrandedCardsWidgetInteractor");
        Intrinsics.checkNotNullParameter(smallWidgetItemsMapper, "smallWidgetItemsMapper");
        Intrinsics.checkNotNullParameter(mediumWidgetItemsMapper, "mediumWidgetItemsMapper");
        this.f112205a = cobrandedCardsWidgetInteractor;
        this.f112206b = mediumWidgetItemsMapper;
    }

    public static BaseDraggableWidgetDelegate.Model a(String str, Function0 function0, Function0 function02) {
        if (Intrinsics.f(str, "CobrandsSmall")) {
            return (BaseDraggableWidgetDelegate.Model) function0.invoke();
        }
        if (Intrinsics.f(str, "CobrandsMedium")) {
            return (BaseDraggableWidgetDelegate.Model) function02.invoke();
        }
        throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
    }
}
