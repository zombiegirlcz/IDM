package j7l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lj7l/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "customReasonAllowed", "", "Lj7l/n;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "predefinedReasons", "Ljava/lang/String;", "hint", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("customReasonAllowed")
    private final boolean customReasonAllowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("predefinedReasons")
    @NotNull
    private final List<n> predefinedReasons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCustomReasonAllowed() {
        return this.customReasonAllowed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPredefinedReasons() {
        return this.predefinedReasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.customReasonAllowed == mVar.customReasonAllowed && Intrinsics.f(this.predefinedReasons, mVar.predefinedReasons) && Intrinsics.f(this.hint, mVar.hint);
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.customReasonAllowed) * 31, 31, this.predefinedReasons);
        String str = this.hint;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
