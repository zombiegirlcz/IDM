package tn8;

import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.feature.rev10_main_screen.api.AppStarterDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q78.e;
import rd0.d;
import skm.e0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f272335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f272336b;

    public c(e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f272335a = juniorAccountDestinationResolver;
        this.f272336b = y0.b("youth/accounts/{juniorId}/security");
    }

    @Override // xii.b
    public final Set a() {
        return this.f272336b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("juniorId");
        if (str == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot handle Junior settings deeplink. Junior id is absent");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            return null;
        }
        if (str.length() != 0) {
            return new AppStarterDestination((MainContainerScreenDestination.JustShow) e0.E(g.f186406a, new b(this, str, null)), new JuniorSettingsKompotFeatureConfig.DefaultDestination(str, JuniorSettingsKompotFeatureConfig.InitialStep.SecurityAndPrivacy.f77262a));
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Cannot handle Junior settings deeplink. Junior id is empty");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
        d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
        return null;
    }
}
