package sdg;

import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReview;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyGuestReviewScore;
import ip0.jp;
import ip0.na0;
import ip0.oa0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jul.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f261874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f261875b;

    public c(o decimalFormat, c90.c uiResources, p8g.c featureInteractor) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f261874a = decimalFormat;
        this.f261875b = uiResources;
    }

    public static HotelsPropertyGuestReviewScore a(List list) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((HotelsPropertyGuestReviewScore) next).e == ufi.c.OVERALL) {
                break;
            }
        }
        return (HotelsPropertyGuestReviewScore) next;
    }

    public static jp b(HotelsPropertyGuestReview hotelsPropertyGuestReview, List list) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f((String) it8.next(), "REVIEW_CARD_ITEM_ID" + hotelsPropertyGuestReview.hashCode())) {
                    return oa0.f165646b;
                }
            }
        }
        return na0.f165478b;
    }
}
