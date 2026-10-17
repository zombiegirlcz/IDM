package evh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u000b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Levh/o;", "Levh/z;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "termsScope", "", "Levh/o$b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "explicitTerms", "Levh/o$a;", "Levh/o$a;", "()Levh/o$a;", "expiryCollection", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsScope")
    private final String termsScope = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("explicitTerms")
    private final List<b> explicitTerms = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryCollection")
    private final a expiryCollection = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Levh/o$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "approvedDefaultDays", "b", "rejectedDefaultDays", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("approvedDefaultDays")
        private final int approvedDefaultDays;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("rejectedDefaultDays")
        private final int rejectedDefaultDays;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getApprovedDefaultDays() {
            return this.approvedDefaultDays;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getRejectedDefaultDays() {
            return this.rejectedDefaultDays;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.approvedDefaultDays == aVar.approvedDefaultDays && this.rejectedDefaultDays == aVar.rejectedDefaultDays;
        }

        public final int hashCode() {
            return Integer.hashCode(this.rejectedDefaultDays) + (Integer.hashCode(this.approvedDefaultDays) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Levh/o$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "disclosure", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("disclosure")
        @NotNull
        private final String disclosure;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDisclosure() {
            return this.disclosure;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.disclosure, bVar.disclosure);
        }

        public final int hashCode() {
            return this.disclosure.hashCode() + (this.id.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getExpiryCollection() {
        return this.expiryCollection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getExplicitTerms() {
        return this.explicitTerms;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTermsScope() {
        return this.termsScope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.termsScope, oVar.termsScope) && Intrinsics.f(this.explicitTerms, oVar.explicitTerms) && Intrinsics.f(this.expiryCollection, oVar.expiryCollection);
    }

    public final int hashCode() {
        String str = this.termsScope;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<b> list = this.explicitTerms;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.expiryCollection;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
