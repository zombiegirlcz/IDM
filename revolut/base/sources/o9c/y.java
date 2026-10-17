package o9c;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f223249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PairedImage f223251c;

    public y(TextLocalisedClause title, TextLocalisedClause subtitle, PairedImage endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        this.f223249a = title;
        this.f223250b = subtitle;
        this.f223251c = endImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f223249a.equals(yVar.f223249a) && this.f223250b.equals(yVar.f223250b) && this.f223251c.equals(yVar.f223251c);
    }

    public final int hashCode() {
        return this.f223251c.hashCode() + t61.a.a(this.f223249a.hashCode() * 31, 31, this.f223250b);
    }
}
