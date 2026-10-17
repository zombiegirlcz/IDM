package l8f;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f192975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192977c;

    public b(Data data, String str, String recommendedTemplateId) {
        Intrinsics.checkNotNullParameter(recommendedTemplateId, "recommendedTemplateId");
        this.f192975a = data;
        this.f192976b = str;
        this.f192977c = recommendedTemplateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f192975a, bVar.f192975a) && Intrinsics.f(this.f192976b, bVar.f192976b) && Intrinsics.f(this.f192977c, bVar.f192977c);
    }

    public final int hashCode() {
        Data data = this.f192975a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.f192976b;
        return this.f192977c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
