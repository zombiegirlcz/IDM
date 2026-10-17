package zw7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f325837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f325838c;

    public r(String quotesRequestId, ArrayList quotes, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(quotesRequestId, "quotesRequestId");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        this.f325836a = quotesRequestId;
        this.f325837b = quotes;
        this.f325838c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f325836a.equals(rVar.f325836a) && this.f325837b.equals(rVar.f325837b) && Intrinsics.f(this.f325838c, rVar.f325838c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f325837b, this.f325836a.hashCode() * 31, 31);
        LocalDate localDate = this.f325838c;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}
