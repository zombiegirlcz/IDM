package s6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0011"}, d2 = {"Ls6l/h;", "", "", "toString", "()Ljava/lang/String;", "Ls6l/a;", "a", "Ls6l/a;", "c", "()Ls6l/a;", "position", "b", "Ljava/lang/String;", "color", "d", "side", "defaultCardholderName", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("position")
    @NotNull
    private final a position;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("color")
    @NotNull
    private final String color;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("defaultCardholderName")
    private final String defaultCardholderName;

    public h(a position, String color, String side, String str) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(side, "side");
        this.position = position;
        this.color = color;
        this.side = side;
        this.defaultCardholderName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultCardholderName() {
        return this.defaultCardholderName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.position, hVar.position) && Intrinsics.f(this.color, hVar.color) && Intrinsics.f(this.side, hVar.side) && Intrinsics.f(this.defaultCardholderName, hVar.defaultCardholderName);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.position.hashCode() * 31, 31, this.color), 31, this.side);
        String str = this.defaultCardholderName;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
