package zm5;

import android.content.Context;
import com.meshconnect.link.entity.IntegrationAccessToken;
import com.meshconnect.link.entity.LinkConfiguration;
import com.meshconnect.link.ui.LaunchLink;
import com.revolut.feature.crypto.tfr.validation.api.model.CryptoMeshAccessToken;
import com.revolut.kompot.common.ExternalDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements im5.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f323383c = j.b(new zj9.a(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f323384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LaunchLink f323385b;

    public e(Context context, LaunchLink launchLink, a linkEventsProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchLink, "launchLink");
        Intrinsics.checkNotNullParameter(linkEventsProvider, "linkEventsProvider");
        this.f323384a = context;
        this.f323385b = launchLink;
    }

    public final ExternalDestination.ByIntent a(String linkToken, List list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(linkToken, "linkToken");
        if (list != null) {
            List<CryptoMeshAccessToken> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (CryptoMeshAccessToken cryptoMeshAccessToken : list2) {
                String str = cryptoMeshAccessToken.f71001b;
                String str2 = cryptoMeshAccessToken.f71000a;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                arrayList.add(new IntegrationAccessToken("", "", str, str2, ""));
            }
        } else {
            arrayList = null;
        }
        return new ExternalDestination.ByIntent(this.f323385b.createIntent(this.f323384a, new LinkConfiguration(linkToken, arrayList, null, null, null, null, 60, null)), 54332);
    }
}
