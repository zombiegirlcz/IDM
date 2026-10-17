package xe3;

import com.revolut.feature.category_boost.api.CategoryBoostApi$Toggles$CategoryBoost;
import com.revolut.feature.category_boost.api.navigation.CategoryBoostDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f304526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f304527b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f304526a = featureToggleInteractor;
        this.f304527b = y0.b("category-boost");
    }

    @Override // xii.b
    public final Set a() {
        return this.f304527b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((d) this.f304526a).c(CategoryBoostApi$Toggles$CategoryBoost.f65755c)) {
            return CategoryBoostDestination.f65756a;
        }
        return null;
    }
}
