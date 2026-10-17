package tm8;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f272161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f272162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f272163c;

    public f(Data rewardPreviews, Data juniorProfile, Data partnershipsProductState) {
        Intrinsics.checkNotNullParameter(rewardPreviews, "rewardPreviews");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(partnershipsProductState, "partnershipsProductState");
        this.f272161a = rewardPreviews;
        this.f272162b = juniorProfile;
        this.f272163c = partnershipsProductState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f272161a, fVar.f272161a) && Intrinsics.f(this.f272162b, fVar.f272162b) && Intrinsics.f(this.f272163c, fVar.f272163c);
    }

    public final int hashCode() {
        return this.f272163c.hashCode() + kii.e.c(this.f272162b, this.f272161a.hashCode() * 31, 31);
    }
}
