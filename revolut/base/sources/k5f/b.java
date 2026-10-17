package k5f;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f181500b;

    public b(String portfolioId, Template selectedTemplate) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        this.f181499a = portfolioId;
        this.f181500b = selectedTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f181499a, bVar.f181499a) && Intrinsics.f(this.f181500b, bVar.f181500b);
    }

    public final int hashCode() {
        return this.f181500b.hashCode() + (this.f181499a.hashCode() * 31);
    }
}
