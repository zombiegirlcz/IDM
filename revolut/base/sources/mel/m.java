package mel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f204764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f204765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f204766c;

    public m(q sentiment, k chart, o description) {
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f204764a = sentiment;
        this.f204765b = chart;
        this.f204766c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f204764a == mVar.f204764a && Intrinsics.f(this.f204765b, mVar.f204765b) && Intrinsics.f(this.f204766c, mVar.f204766c);
    }

    public final int hashCode() {
        return this.f204766c.hashCode() + ((this.f204765b.hashCode() + (this.f204764a.hashCode() * 31)) * 31);
    }
}
