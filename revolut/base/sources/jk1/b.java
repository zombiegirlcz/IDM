package jk1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Ljk1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getDeviceTokenId", "deviceTokenId", "b", "getCountry", "country", "", "c", "I", "getCodeQuantity", "()I", "codeQuantity", "Companion", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("deviceTokenId")
    @NotNull
    private final String deviceTokenId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("codeQuantity")
    private final int codeQuantity;

    public static final class a {
        private a() {
        }
    }

    public b(String deviceTokenId, String str) {
        Intrinsics.checkNotNullParameter(deviceTokenId, "deviceTokenId");
        this.deviceTokenId = deviceTokenId;
        this.country = str;
        this.codeQuantity = 1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.deviceTokenId, bVar.deviceTokenId) && Intrinsics.f(this.country, bVar.country) && this.codeQuantity == bVar.codeQuantity;
    }

    public final int hashCode() {
        int iHashCode = this.deviceTokenId.hashCode() * 31;
        String str = this.country;
        return Integer.hashCode(this.codeQuantity) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
