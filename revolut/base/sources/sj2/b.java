package sj2;

import com.revolut.feature.atm.api.model.AtmBoundBox;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f263673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtmBoundBox f263674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f263675c;

    public b(List atms, AtmBoundBox boundBox, boolean z) {
        Intrinsics.checkNotNullParameter(atms, "atms");
        Intrinsics.checkNotNullParameter(boundBox, "boundBox");
        this.f263673a = atms;
        this.f263674b = boundBox;
        this.f263675c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f263673a, bVar.f263673a) && Intrinsics.f(this.f263674b, bVar.f263674b) && this.f263675c == bVar.f263675c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263675c) + ((this.f263674b.hashCode() + (this.f263673a.hashCode() * 31)) * 31);
    }
}
