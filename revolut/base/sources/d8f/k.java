package d8f;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f112249a;

    public k(Template selectedTemplate) {
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        this.f112249a = selectedTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f112249a, ((k) obj2).f112249a);
    }

    public final int hashCode() {
        return this.f112249a.hashCode();
    }
}
