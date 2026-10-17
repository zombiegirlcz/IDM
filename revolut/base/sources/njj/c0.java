package njj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f216548a;

    public c0(TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f216548a = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f216548a.equals(((c0) obj2).f216548a);
    }

    public final int hashCode() {
        return this.f216548a.hashCode();
    }
}
