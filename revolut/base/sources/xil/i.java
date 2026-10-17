package xil;

import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lxil/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "detectedCountryCode", "backgroundVideoUrl", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$CombinedAuthentication$b;", "c", "Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$CombinedAuthentication$b;", "()Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$CombinedAuthentication$b;", "mode", "d", "getType", "type", "Companion", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("detectedCountryCode")
    @NotNull
    private final String detectedCountryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundVideoUrl")
    private final String backgroundVideoUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final RevolutSsoApi$InputData$CombinedAuthentication.b mode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    public i(String detectedCountryCode, String str, RevolutSsoApi$InputData$CombinedAuthentication.b mode) {
        Intrinsics.checkNotNullParameter(detectedCountryCode, "detectedCountryCode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter("UNAUTHORISED_COMBINED_AUTHENTICATION", "type");
        this.detectedCountryCode = detectedCountryCode;
        this.backgroundVideoUrl = str;
        this.mode = mode;
        this.type = "UNAUTHORISED_COMBINED_AUTHENTICATION";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundVideoUrl() {
        return this.backgroundVideoUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDetectedCountryCode() {
        return this.detectedCountryCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final RevolutSsoApi$InputData$CombinedAuthentication.b getMode() {
        return this.mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.detectedCountryCode, iVar.detectedCountryCode) && Intrinsics.f(this.backgroundVideoUrl, iVar.backgroundVideoUrl) && this.mode == iVar.mode && Intrinsics.f(this.type, iVar.type);
    }

    public final int hashCode() {
        int iHashCode = this.detectedCountryCode.hashCode() * 31;
        String str = this.backgroundVideoUrl;
        return this.type.hashCode() + ((this.mode.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
