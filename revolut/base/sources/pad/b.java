package pad;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0005R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\f\u0010\u0005¨\u0006\u0010"}, d2 = {"Lpad/b;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "accessCode", "", "b", "J", "()J", "expiryDate", "c", "d", "refreshCode", "ownerId", "feature_shared_network_authentication_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessCode")
    @NotNull
    private final String accessCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryDate")
    private final long expiryDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("refreshCode")
    @NotNull
    private final String refreshCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ownerId")
    @NotNull
    private final String ownerId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessCode() {
        return this.accessCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefreshCode() {
        return this.refreshCode;
    }
}
