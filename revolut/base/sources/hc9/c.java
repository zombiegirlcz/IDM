package hc9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Lhc9/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "skipIntro", "Lhc9/b;", "b", "Lhc9/b;", "()Lhc9/b;", "screenDetails", "Lhc9/a;", "c", "Lhc9/a;", "()Lhc9/a;", "mainAction", "secondaryAction", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("skipIntro")
    private final boolean skipIntro;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenDetails")
    private final b screenDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mainAction")
    @NotNull
    private final a mainAction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("secondaryAction")
    private final a secondaryAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getMainAction() {
        return this.mainAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getScreenDetails() {
        return this.screenDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getSecondaryAction() {
        return this.secondaryAction;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSkipIntro() {
        return this.skipIntro;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.skipIntro == cVar.skipIntro && Intrinsics.f(this.screenDetails, cVar.screenDetails) && Intrinsics.f(this.mainAction, cVar.mainAction) && Intrinsics.f(this.secondaryAction, cVar.secondaryAction);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.skipIntro) * 31;
        b bVar = this.screenDetails;
        int iHashCode2 = (this.mainAction.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        a aVar = this.secondaryAction;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
