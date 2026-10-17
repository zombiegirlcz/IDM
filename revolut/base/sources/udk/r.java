package udk;

import aw0.na;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na f279266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f279267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f279268c;

    public r(na rewardTitle, aw0.e actionFooter, boolean z) {
        Intrinsics.checkNotNullParameter(rewardTitle, "rewardTitle");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f279266a = rewardTitle;
        this.f279267b = actionFooter;
        this.f279268c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f279266a.equals(rVar.f279266a) && this.f279267b.equals(rVar.f279267b) && this.f279268c == rVar.f279268c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f279268c) + ehe.n.c(this.f279267b, this.f279266a.hashCode() * 31, 31);
    }
}
