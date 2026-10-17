package wf6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.api.navigation.LinkSuccessDestination;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ke6.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f296974a;

    public b(sri.m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f296974a = navigator;
    }

    public static LinkSuccessDestination b(jf0.c cVar) {
        HashMap map = cVar.d;
        String str = (String) map.get("error");
        String str2 = (String) map.get("code");
        String str3 = (String) map.get("state");
        String strE = cVar.e(2);
        ExternalAccountsFeatureConfig.LinkSuccess.UseCase akahuLink = Intrinsics.f(strE, "link") ? new ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuLink(str2, str, str3) : Intrinsics.f(strE, "unlink") ? new ExternalAccountsFeatureConfig.LinkSuccess.UseCase.AkahuUnlink(str2, str, str3) : null;
        if (akahuLink != null) {
            return new LinkSuccessDestination("akahu", str == null && str2 != null, false, akahuLink);
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "institution-auth-akahu");
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
        pfm.z zVarD = new pfm.h(new v3e.t(this, deeplink, 16), 2).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}
