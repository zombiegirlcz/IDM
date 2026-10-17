package q92;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f243634a;

    public a(Data enrollments) {
        Intrinsics.checkNotNullParameter(enrollments, "enrollments");
        this.f243634a = enrollments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f243634a, ((a) obj2).f243634a);
    }

    public final int hashCode() {
        return this.f243634a.hashCode();
    }
}
