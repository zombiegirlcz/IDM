package tz3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Ltz3/i;", "", "", "toString", "()Ljava/lang/String;", "Ltz3/h;", "a", "Ltz3/h;", "()Ltz3/h;", "introScreen", "", "Ltz3/g;", "b", "Ljava/util/List;", "()Ljava/util/List;", "referralFlags", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("introScreen")
    private final h introScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("referralFlags")
    @NotNull
    private final List<g> referralFlags;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getIntroScreen() {
        return this.introScreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getReferralFlags() {
        return this.referralFlags;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.introScreen, iVar.introScreen) && Intrinsics.f(this.referralFlags, iVar.referralFlags);
    }

    public final int hashCode() {
        h hVar = this.introScreen;
        return this.referralFlags.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31);
    }
}
