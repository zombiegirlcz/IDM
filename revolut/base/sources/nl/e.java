package nl;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.workflow.internal.ui.LoadingScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnfidoRemoteConfig f216899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Navigator f216900b;

    public e(OnfidoRemoteConfig remoteConfig, Navigator navigator) {
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f216899a = remoteConfig;
        this.f216900b = navigator;
    }

    public static final ArrayList a(e eVar, List list) {
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!(((Screen) obj2) instanceof LoadingScreen)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
