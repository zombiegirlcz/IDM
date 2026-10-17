package wf6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.api.navigation.LinkSuccessDestination;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ke6.j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296987a;

    public g(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f296987a = navigator;
    }

    public static LinkSuccessDestination b(jf0.c cVar) {
        boolean z;
        String strE = cVar.e(4);
        HashMap map = cVar.d;
        String str = (String) map.get("institutionName");
        boolean zF = Intrinsics.f(map.get("success"), "true");
        boolean zF2 = Intrinsics.f(cVar.e(3), "completed");
        String strE2 = cVar.e(2);
        if (Intrinsics.f(strE2, "link")) {
            z = zF && zF2;
            if (str == null) {
                str = "";
            }
            return new LinkSuccessDestination(strE, z, false, new ExternalAccountsFeatureConfig.LinkSuccess.UseCase.EgiroLink(str, (String) map.get("errorCode"), zF2, zF));
        }
        if (!Intrinsics.f(strE2, "unlink")) {
            return null;
        }
        z = zF && zF2;
        if (str == null) {
            str = "";
        }
        return new LinkSuccessDestination(strE, z, false, new ExternalAccountsFeatureConfig.LinkSuccess.UseCase.EgiroUnlink(str, (String) map.get("errorCode"), zF2, zF));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "institution-auth-egiro");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        LinkSuccessDestination linkSuccessDestinationB = b(cVar);
        if (linkSuccessDestinationB != null) {
            return new q06.h(linkSuccessDestinationB, null);
        }
        return null;
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        pfm.z zVarD = new pfm.h(new v3e.t(this, deeplink, 18), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
