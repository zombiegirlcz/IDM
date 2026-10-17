package gsf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0014"}, d2 = {"Lgsf/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "catalogue", "Lgsf/q;", "b", "Lgsf/q;", "c", "()Lgsf/q;", "suggestion", "", "Lgsf/n;", "Ljava/util/List;", "()Ljava/util/List;", "data", "Companion", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("catalogue")
    private final String catalogue = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestion")
    private final q suggestion = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("data")
    private final List<n> data = null;

    /* JADX INFO: renamed from: gsf.p$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCatalogue() {
        return this.catalogue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getSuggestion() {
        return this.suggestion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.catalogue, pVar.catalogue) && Intrinsics.f(this.suggestion, pVar.suggestion) && Intrinsics.f(this.data, pVar.data);
    }

    public final int hashCode() {
        String str = this.catalogue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        q qVar = this.suggestion;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List<n> list = this.data;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
