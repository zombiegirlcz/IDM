package xl1;

import com.revolut.feature.apm.aani.impl.model.DataForRegistration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataForRegistration f306900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f306901b;

    public a(DataForRegistration dataForRegistration, boolean z) {
        Intrinsics.checkNotNullParameter(dataForRegistration, "dataForRegistration");
        this.f306900a = dataForRegistration;
        this.f306901b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f306900a, aVar.f306900a) && this.f306901b == aVar.f306901b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f306901b) + (this.f306900a.hashCode() * 31);
    }
}
