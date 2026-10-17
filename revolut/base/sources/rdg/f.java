package rdg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jul.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f253454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f253455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8g.c f253456c;
    public final jag.a d;
    public final rag.c e;

    public f(o decimalFormat, c90.c uiResources, p8g.c travelHotelsFeatureInteractor, jag.a cancellationPolicyItemMapper, rag.c packageRatesBadgeMapper) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(cancellationPolicyItemMapper, "cancellationPolicyItemMapper");
        Intrinsics.checkNotNullParameter(packageRatesBadgeMapper, "packageRatesBadgeMapper");
        this.f253454a = decimalFormat;
        this.f253455b = uiResources;
        this.f253456c = travelHotelsFeatureInteractor;
        this.d = cancellationPolicyItemMapper;
        this.e = packageRatesBadgeMapper;
    }

    public static boolean a(HotelsProperty hotelsProperty, List list) {
        fgi.a aVar = hotelsProperty.u;
        if (aVar == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((fgi.b) it8.next()).f135075a == aVar) {
                return true;
            }
        }
        return false;
    }
}
