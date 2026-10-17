package e1d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f121964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f121965b;

    public d(Data supervisionConfig, Data guardianInvitation) {
        Intrinsics.checkNotNullParameter(supervisionConfig, "supervisionConfig");
        Intrinsics.checkNotNullParameter(guardianInvitation, "guardianInvitation");
        this.f121964a = supervisionConfig;
        this.f121965b = guardianInvitation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121964a, dVar.f121964a) && Intrinsics.f(this.f121965b, dVar.f121965b);
    }

    public final int hashCode() {
        return this.f121965b.hashCode() + (this.f121964a.hashCode() * 31);
    }
}
