package a3h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f1132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1133b;

    public d(Data data, f selectedSection) {
        Intrinsics.checkNotNullParameter(selectedSection, "selectedSection");
        this.f1132a = data;
        this.f1133b = selectedSection;
    }

    public static d a(d dVar, Data data, f selectedSection, int i) {
        if ((i & 1) != 0) {
            data = dVar.f1132a;
        }
        if ((i & 2) != 0) {
            selectedSection = dVar.f1133b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(selectedSection, "selectedSection");
        return new d(data, selectedSection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f1132a, dVar.f1132a) && this.f1133b == dVar.f1133b;
    }

    public final int hashCode() {
        Data data = this.f1132a;
        return this.f1133b.hashCode() + ((data == null ? 0 : data.hashCode()) * 31);
    }
}
