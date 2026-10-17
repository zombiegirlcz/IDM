package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lot3/b;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "akahuLink", "Lst3/u;", "b", "Lst3/u;", "c", "()Lst3/u;", "intro", "Lnx4/s1;", "Lnx4/s1;", "()Lnx4/s1;", "infoPopup", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("akahuLink")
    @NotNull
    private final String akahuLink;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("intro")
    @NotNull
    private final st3.u intro;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("infoPopup")
    private final s1 infoPopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAkahuLink() {
        return this.akahuLink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s1 getInfoPopup() {
        return this.infoPopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final st3.u getIntro() {
        return this.intro;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.akahuLink, bVar.akahuLink) && Intrinsics.f(this.intro, bVar.intro) && Intrinsics.f(this.infoPopup, bVar.infoPopup);
    }

    public final int hashCode() {
        int iHashCode = (this.intro.hashCode() + (this.akahuLink.hashCode() * 31)) * 31;
        s1 s1Var = this.infoPopup;
        return iHashCode + (s1Var == null ? 0 : s1Var.hashCode());
    }
}
