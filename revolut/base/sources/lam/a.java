package lam;

import ch.qos.logback.core.CoreConstants;
import ip0.jp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f193468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f193469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jp f193470c;
    public final boolean d;

    public a(int i, c lensPosition, jp cameraOrientation, boolean z) {
        Intrinsics.checkNotNullParameter(lensPosition, "lensPosition");
        Intrinsics.checkNotNullParameter(cameraOrientation, "cameraOrientation");
        this.f193468a = i;
        this.f193469b = lensPosition;
        this.f193470c = cameraOrientation;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f193468a == aVar.f193468a && Intrinsics.f(this.f193469b, aVar.f193469b) && Intrinsics.f(this.f193470c, aVar.f193470c) && this.d == aVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = (this.f193470c.hashCode() + ((this.f193469b.hashCode() + (Integer.hashCode(this.f193468a) * 31)) * 31)) * 31;
        boolean z = this.d;
        ?? r110 = z;
        if (z) {
            r110 = 1;
        }
        return iHashCode + r110;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Characteristics(cameraId=");
        sb6.append(this.f193468a);
        sb6.append(", lensPosition=");
        sb6.append(this.f193469b);
        sb6.append(", cameraOrientation=");
        sb6.append(this.f193470c);
        sb6.append(", isMirrored=");
        return j6.a.x(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
