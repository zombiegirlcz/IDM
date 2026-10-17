package akl;

import android.net.Uri;
import com.revolut.sso.impl.domain.models.SessionToken;
import com.revolut.sso.impl.domain.models.UserInfoPicture;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.f f6118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk0.e f6119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yil.b f6120c;
    public final bjl.p0 d;
    public final f1 e;

    public y1(r10.f networkUrlBuilder, bk0.e revolutHeadersProvider, yil.b revolutSsoConfiguration, bjl.p0 revolutSsoDependenciesProvider, f1 sessionTokenRepository) {
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        Intrinsics.checkNotNullParameter(revolutHeadersProvider, "revolutHeadersProvider");
        Intrinsics.checkNotNullParameter(revolutSsoConfiguration, "revolutSsoConfiguration");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        this.f6118a = networkUrlBuilder;
        this.f6119b = revolutHeadersProvider;
        this.f6120c = revolutSsoConfiguration;
        this.d = revolutSsoDependenciesProvider;
        this.e = sessionTokenRepository;
    }

    public final UserInfoPicture a(String str) {
        r10.f fVar = this.f6118a;
        String host = this.f6120c.getHostUrl();
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter("api/userinfo/picture", "path");
        Uri.Builder builderAppendQueryParameter = fVar.i(host, "api/userinfo/picture", false).buildUpon().appendQueryParameter("client_id", ((rqk.k) this.d).f256593p);
        if (str != null) {
            builderAppendQueryParameter.appendQueryParameter("account_id", str);
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Map mapA = this.f6119b.a(string);
        SessionToken sessionToken = ((n1) this.e).f6064j;
        String str2 = sessionToken != null ? sessionToken.f106160a : null;
        aim.f builder = new aim.f();
        builder.putAll(mapA);
        if (str2 != null) {
            builder.put("Authorization", str2);
        }
        zhm.r0.s(builder, new Pair[]{new Pair("X-Force-Global-Host-Routing", "true")});
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new UserInfoPicture(zhm.y0.b("X-Device-Id"), builder.b(), string);
    }
}
