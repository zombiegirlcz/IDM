package g24;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u001a"}, d2 = {"Lg24/i;", "", "", "toString", "()Ljava/lang/String;", "Lg24/k;", "a", "Lg24/k;", "b", "()Lg24/k;", "header", "Lg24/n;", "Lg24/n;", "d", "()Lg24/n;", "tile", "Lg24/m;", "c", "Lg24/m;", "()Lg24/m;", "stepsSection", "Lg24/b;", "Lg24/b;", "()Lg24/b;", "cancelSection", "g24/h", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    @NotNull
    private final k header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tile")
    @NotNull
    private final n tile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("stepsSection")
    @NotNull
    private final m stepsSection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cancelSection")
    private final b cancelSection;

    public i(k header, n tile, m stepsSection, b bVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(tile, "tile");
        Intrinsics.checkNotNullParameter(stepsSection, "stepsSection");
        this.header = header;
        this.tile = tile;
        this.stepsSection = stepsSection;
        this.cancelSection = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCancelSection() {
        return this.cancelSection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getStepsSection() {
        return this.stepsSection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final n getTile() {
        return this.tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.header, iVar.header) && Intrinsics.f(this.tile, iVar.tile) && Intrinsics.f(this.stepsSection, iVar.stepsSection) && Intrinsics.f(this.cancelSection, iVar.cancelSection);
    }

    public final int hashCode() {
        int iHashCode = (this.stepsSection.hashCode() + ((this.tile.hashCode() + (this.header.hashCode() * 31)) * 31)) * 31;
        b bVar = this.cancelSection;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
