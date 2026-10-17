package jma;

import com.revolut.feature.backgroundpicker.api.Preselection;
import com.revolut.feature.backgroundpicker.api.ThemeCustomisationDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f176492a = y0.b("appearance");

    @Override // xii.b
    public final Set a() {
        return this.f176492a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = lg0.g.a("theme", deeplink.f195041c);
        return new ThemeCustomisationDestination(strA != null ? new Preselection.ThemePreselection(strA, false) : null, 23);
    }
}
