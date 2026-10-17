package vd4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocumentValidationResult f287783c;

    public g(String originalFilePath, String unlockedFilePath, DocumentValidationResult validationResult) {
        Intrinsics.checkNotNullParameter(originalFilePath, "originalFilePath");
        Intrinsics.checkNotNullParameter(unlockedFilePath, "unlockedFilePath");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        this.f287781a = originalFilePath;
        this.f287782b = unlockedFilePath;
        this.f287783c = validationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f287781a, gVar.f287781a) && Intrinsics.f(this.f287782b, gVar.f287782b) && Intrinsics.f(this.f287783c, gVar.f287783c);
    }

    public final int hashCode() {
        return this.f287783c.hashCode() + p.a.c(this.f287781a.hashCode() * 31, 31, this.f287782b);
    }
}
