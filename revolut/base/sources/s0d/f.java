package s0d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f258941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f258942b;

    public f(Data highlights, Data invitation) {
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        this.f258941a = highlights;
        this.f258942b = invitation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f258941a, fVar.f258941a) && Intrinsics.f(this.f258942b, fVar.f258942b);
    }

    public final int hashCode() {
        return this.f258942b.hashCode() + (this.f258941a.hashCode() * 31);
    }
}
