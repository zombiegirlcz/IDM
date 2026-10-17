package qg8;

import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f245700a = y0.b("youth/graduation/assets-migration");

    @Override // xii.b
    public final Set a() {
        return this.f245700a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination.f76913a;
    }
}
