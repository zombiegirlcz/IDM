package a0l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f429b;

    public c(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter("CONTINUE_BUTTON_LOADING_TAG", "tag");
        this.f428a = text;
        this.f429b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f428a.equals(cVar.f428a) && this.f429b == cVar.f429b;
    }

    public final int hashCode() {
        return ((Boolean.hashCode(this.f429b) + (this.f428a.hashCode() * 31)) * 31) + 1086698210;
    }
}
