package b09;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;
import u09.y;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f11623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Response f11624c;

    public a(String courseId, y progress, Response response) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f11622a = courseId;
        this.f11623b = progress;
        this.f11624c = response;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11622a, aVar.f11622a) && this.f11623b == aVar.f11623b && Intrinsics.f(this.f11624c, aVar.f11624c);
    }

    public final int hashCode() {
        return this.f11624c.hashCode() + ((this.f11623b.hashCode() + (this.f11622a.hashCode() * 31)) * 31);
    }
}
