package fa;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f133002b;

    public a(String formKey, Map formInputParams) {
        Intrinsics.checkNotNullParameter(formKey, "formKey");
        Intrinsics.checkNotNullParameter(formInputParams, "formInputParams");
        this.f133001a = formKey;
        this.f133002b = formInputParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f133001a, aVar.f133001a) && Intrinsics.f(this.f133002b, aVar.f133002b);
    }

    public final int hashCode() {
        return this.f133002b.hashCode() + (this.f133001a.hashCode() * 31);
    }

    public final String toString() {
        return "Form(formKey=" + this.f133001a + ", formInputParams=" + this.f133002b + ")";
    }
}
