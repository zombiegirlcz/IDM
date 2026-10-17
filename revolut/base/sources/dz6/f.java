package dz6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f121241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f121242b;

    public f(Data templatesData, k templatesListMode) {
        Intrinsics.checkNotNullParameter(templatesData, "templatesData");
        Intrinsics.checkNotNullParameter(templatesListMode, "templatesListMode");
        this.f121241a = templatesData;
        this.f121242b = templatesListMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f121241a, fVar.f121241a) && this.f121242b == fVar.f121242b;
    }

    public final int hashCode() {
        return this.f121242b.hashCode() + (this.f121241a.hashCode() * 31);
    }
}
