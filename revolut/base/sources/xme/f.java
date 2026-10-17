package xme;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f307234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f307235c;

    public f(String str, a exemptions, ArrayList datapoints) {
        Intrinsics.checkNotNullParameter(exemptions, "exemptions");
        Intrinsics.checkNotNullParameter(datapoints, "datapoints");
        this.f307233a = str;
        this.f307234b = exemptions;
        this.f307235c = datapoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f307233a, fVar.f307233a) && this.f307234b.equals(fVar.f307234b) && this.f307235c.equals(fVar.f307235c);
    }

    public final int hashCode() {
        String str = this.f307233a;
        return this.f307235c.hashCode() + ((this.f307234b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }
}
