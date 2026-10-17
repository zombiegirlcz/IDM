package jnd;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f176713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressStyle f176714b;

    public i(TextLocalisedClause subtitle, ProgressStyle progressStyle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(progressStyle, "progressStyle");
        this.f176713a = subtitle;
        this.f176714b = progressStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f176713a.equals(iVar.f176713a) && this.f176714b.equals(iVar.f176714b);
    }

    public final int hashCode() {
        return this.f176714b.hashCode() + (this.f176713a.hashCode() * 31);
    }
}
