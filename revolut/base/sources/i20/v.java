package i20;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Li20/v;", "Li20/o0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "experience", "asset", "c", "message", "", "d", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "tags", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("experience")
    @NotNull
    private final String experience;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("asset")
    private final String asset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("tags")
    @NotNull
    private final List<String> tags;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExperience() {
        return this.experience;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.experience, vVar.experience) && Intrinsics.f(this.asset, vVar.asset) && Intrinsics.f(this.message, vVar.message) && Intrinsics.f(this.tags, vVar.tags);
    }

    public final int hashCode() {
        int iHashCode = this.experience.hashCode() * 31;
        String str = this.asset;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return this.tags.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
