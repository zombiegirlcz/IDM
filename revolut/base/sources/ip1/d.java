package ip1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yo1.g;
import yo1.h;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, d2 = {"Lip1/d;", "", "", "toString", "()Ljava/lang/String;", "", "Lip1/b;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "inputs", "Lyo1/h;", "b", "Lyo1/h;", "()Lyo1/h;", "header", "Lyo1/g;", "Lyo1/g;", "()Lyo1/g;", "footer", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("inputs")
    @NotNull
    private final List<b> inputs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    private final h header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("footer")
    private final g footer;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getInputs() {
        return this.inputs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.inputs, dVar.inputs) && Intrinsics.f(this.header, dVar.header) && Intrinsics.f(this.footer, dVar.footer);
    }

    public final int hashCode() {
        int iHashCode = this.inputs.hashCode() * 31;
        h hVar = this.header;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.footer;
        return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }
}
