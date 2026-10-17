package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f298809a;

    public o(Template selectedTemplate) {
        Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
        this.f298809a = selectedTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f298809a, ((o) obj2).f298809a);
    }

    public final int hashCode() {
        return this.f298809a.hashCode();
    }
}
