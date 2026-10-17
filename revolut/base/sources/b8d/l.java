package b8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13175b;

    public l(List faqSuggestedActions, List faqFormsToChat) {
        Intrinsics.checkNotNullParameter(faqSuggestedActions, "faqSuggestedActions");
        Intrinsics.checkNotNullParameter(faqFormsToChat, "faqFormsToChat");
        this.f13174a = faqSuggestedActions;
        this.f13175b = faqFormsToChat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f13174a, lVar.f13174a) && Intrinsics.f(this.f13175b, lVar.f13175b);
    }

    public final int hashCode() {
        return this.f13175b.hashCode() + (this.f13174a.hashCode() * 31);
    }
}
