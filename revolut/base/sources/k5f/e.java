package k5f;

import aii.r;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f181502a;

    public e(Template selectedTemplate) {
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        this.f181502a = selectedTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f181502a, ((e) obj2).f181502a);
    }

    public final int hashCode() {
        return this.f181502a.hashCode();
    }
}
