package com.revolut.feature.alipay_plus.mpm.interception;

import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "", "<init>", "()V", "None", "Load", "Decode", "OAuth", "OpenExternal", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$Decode;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$Load;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$None;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$OAuth;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$OpenExternal;", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class APMPMURLHook {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$Load;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Load extends APMPMURLHook {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Load(@NotNull String url2) {
            super(null);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.url = url2;
        }

        public static /* synthetic */ Load copy$default(Load load, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = load.url;
            }
            return load.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Load copy(@NotNull String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            return new Load(url2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Load) && Intrinsics.f(this.url, ((Load) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$None;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class None extends APMPMURLHook {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return -31381922;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$OAuth;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "authUrl", "", "<init>", "(Ljava/lang/String;)V", "getAuthUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OAuth extends APMPMURLHook {

        @NotNull
        private final String authUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuth(@NotNull String authUrl) {
            super(null);
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            this.authUrl = authUrl;
        }

        public static /* synthetic */ OAuth copy$default(OAuth oAuth, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = oAuth.authUrl;
            }
            return oAuth.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAuthUrl() {
            return this.authUrl;
        }

        @NotNull
        public final OAuth copy(@NotNull String authUrl) {
            Intrinsics.checkNotNullParameter(authUrl, "authUrl");
            return new OAuth(authUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OAuth) && Intrinsics.f(this.authUrl, ((OAuth) other).authUrl);
        }

        @NotNull
        public final String getAuthUrl() {
            return this.authUrl;
        }

        public int hashCode() {
            return this.authUrl.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$OpenExternal;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenExternal extends APMPMURLHook {

        @NotNull
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenExternal(@NotNull String url2) {
            super(null);
            Intrinsics.checkNotNullParameter(url2, "url");
            this.url = url2;
        }

        public static /* synthetic */ OpenExternal copy$default(OpenExternal openExternal, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = openExternal.url;
            }
            return openExternal.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final OpenExternal copy(@NotNull String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            return new OpenExternal(url2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenExternal) && Intrinsics.f(this.url, ((OpenExternal) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }
    }

    public /* synthetic */ APMPMURLHook(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private APMPMURLHook() {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook$Decode;", "Lcom/revolut/feature/alipay_plus/mpm/interception/APMPMURLHook;", "request", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeRequest;", "loadingUrl", "", "metadata", "", "<init>", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeRequest;Ljava/lang/String;Ljava/util/Map;)V", "getRequest", "()Lcom/revolut/feature/alipay_plus/mpm/model/APMPMDecodeRequest;", "getLoadingUrl", "()Ljava/lang/String;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Decode extends APMPMURLHook {
        private final String loadingUrl;

        @NotNull
        private final Map<String, String> metadata;

        @NotNull
        private final APMPMDecodeRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decode(@NotNull APMPMDecodeRequest request, String str, @NotNull Map<String, String> metadata) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.request = request;
            this.loadingUrl = str;
            this.metadata = metadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Decode copy$default(Decode decode, APMPMDecodeRequest aPMPMDecodeRequest, String str, Map map, int i, Object obj2) {
            if ((i & 1) != 0) {
                aPMPMDecodeRequest = decode.request;
            }
            if ((i & 2) != 0) {
                str = decode.loadingUrl;
            }
            if ((i & 4) != 0) {
                map = decode.metadata;
            }
            return decode.copy(aPMPMDecodeRequest, str, map);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final APMPMDecodeRequest getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLoadingUrl() {
            return this.loadingUrl;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.metadata;
        }

        @NotNull
        public final Decode copy(@NotNull APMPMDecodeRequest request, String loadingUrl, @NotNull Map<String, String> metadata) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return new Decode(request, loadingUrl, metadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Decode)) {
                return false;
            }
            Decode decode = (Decode) other;
            return Intrinsics.f(this.request, decode.request) && Intrinsics.f(this.loadingUrl, decode.loadingUrl) && Intrinsics.f(this.metadata, decode.metadata);
        }

        public final String getLoadingUrl() {
            return this.loadingUrl;
        }

        @NotNull
        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final APMPMDecodeRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            int iHashCode = this.request.hashCode() * 31;
            String str = this.loadingUrl;
            return this.metadata.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public /* synthetic */ Decode(APMPMDecodeRequest aPMPMDecodeRequest, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aPMPMDecodeRequest, (i & 2) != 0 ? null : str, (i & 4) != 0 ? r0.g() : map);
        }
    }
}
