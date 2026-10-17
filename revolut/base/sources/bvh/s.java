package bvh;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$a;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "Lbvh/b0;", "a", "Lbvh/b0;", "getAddress", "()Lbvh/b0;", "address", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("address")
        @NotNull
        private final b0 address;

        public a(b0 address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.address, ((a) obj2).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbvh/s$b;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "Lbvh/e;", "a", "Ljava/util/List;", "getUsers", "()Ljava/util/List;", "users", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("users")
        @NotNull
        private final List<bvh.e> users;

        public b(ArrayList users) {
            Intrinsics.checkNotNullParameter(users, "users");
            this.users = users;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.users, ((b) obj2).users);
        }

        public final int hashCode() {
            return this.users.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$c;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getAccepted", "()Z", "accepted", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("accepted")
        private final boolean accepted;

        public c(boolean z) {
            this.accepted = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.accepted == ((c) obj2).accepted;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.accepted);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lbvh/s$d;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSelectedCitizenship", "selectedCitizenship", "", "Lbvh/c0;", "b", "Ljava/util/List;", "getSelectedDocuments", "()Ljava/util/List;", "selectedDocuments", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("selectedCitizenship")
        @NotNull
        private final String selectedCitizenship;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("selectedDocuments")
        private final List<c0> selectedDocuments;

        public d(String selectedCitizenship, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
            this.selectedCitizenship = selectedCitizenship;
            this.selectedDocuments = arrayList;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.selectedCitizenship, dVar.selectedCitizenship) && Intrinsics.f(this.selectedDocuments, dVar.selectedDocuments);
        }

        public final int hashCode() {
            int iHashCode = this.selectedCitizenship.hashCode() * 31;
            List<c0> list = this.selectedDocuments;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lbvh/s$e;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getSelfEmployed", "()Z", "selfEmployed", "Lbvh/n;", "b", "Lbvh/n;", "getEmployer", "()Lbvh/n;", "employer", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("selfEmployed")
        private final boolean selfEmployed;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("employer")
        private final bvh.n employer;

        public e(boolean z, bvh.n nVar) {
            this.selfEmployed = z;
            this.employer = nVar;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return this.selfEmployed == eVar.selfEmployed && Intrinsics.f(this.employer, eVar.employer);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.selfEmployed) * 31;
            bvh.n nVar = this.employer;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbvh/s$f;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "Lbvh/t;", "a", "Ljava/util/List;", "getPepConnections", "()Ljava/util/List;", "pepConnections", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("connections")
        @NotNull
        private final List<t> pepConnections;

        public f(ArrayList pepConnections) {
            Intrinsics.checkNotNullParameter(pepConnections, "pepConnections");
            this.pepConnections = pepConnections;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.pepConnections, ((f) obj2).pepConnections);
        }

        public final int hashCode() {
            return this.pepConnections.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbvh/s$g;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "Lbvh/u;", "a", "Ljava/util/List;", "getBeneficiaries", "()Ljava/util/List;", "beneficiaries", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiaries")
        @NotNull
        private final List<u> beneficiaries;

        public g(ArrayList beneficiaries) {
            Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
            this.beneficiaries = beneficiaries;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.beneficiaries, ((g) obj2).beneficiaries);
        }

        public final int hashCode() {
            return this.beneficiaries.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$h;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getOfferAccepted", "()Z", "offerAccepted", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("offerAccepted")
        private final boolean offerAccepted;

        public h(boolean z) {
            this.offerAccepted = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof h) && this.offerAccepted == ((h) obj2).offerAccepted;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.offerAccepted);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbvh/s$i;", "Lbvh/s;", "<init>", "()V", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f19102a = new i();

        private i() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$j;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "Lbvh/b0;", "a", "Lbvh/b0;", "getResidentialAddress", "()Lbvh/b0;", "residentialAddress", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("residentialAddress")
        @NotNull
        private final b0 residentialAddress;

        public j(b0 residentialAddress) {
            Intrinsics.checkNotNullParameter(residentialAddress, "residentialAddress");
            this.residentialAddress = residentialAddress;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof j) && Intrinsics.f(this.residentialAddress, ((j) obj2).residentialAddress);
        }

        public final int hashCode() {
            return this.residentialAddress.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$k;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "getRisks", "()Ljava/util/List;", "risks", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("risks")
        @NotNull
        private final List<String> risks;

        public k(List risks) {
            Intrinsics.checkNotNullParameter(risks, "risks");
            this.risks = risks;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof k) && Intrinsics.f(this.risks, ((k) obj2).risks);
        }

        public final int hashCode() {
            return this.risks.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbvh/s$l;", "Lbvh/s;", "<init>", "()V", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class l extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f19105a = new l();

        private l() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lbvh/s$m;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "Lbvh/v;", "a", "Lbvh/v;", "getPrimaryCountryReplacement", "()Lbvh/v;", "primaryCountryReplacement", "", "b", "Ljava/util/List;", "getConfirmations", "()Ljava/util/List;", "confirmations", "Lbvh/e0;", "c", "Lbvh/e0;", "getSoleResidency", "()Lbvh/e0;", "soleResidency", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("primaryCountryReplacement")
        private final v primaryCountryReplacement;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("confirmations")
        private final List<String> confirmations;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("soleResidency")
        private final e0 soleResidency;

        public m(v vVar, ArrayList arrayList, e0 e0Var) {
            this.primaryCountryReplacement = vVar;
            this.confirmations = arrayList;
            this.soleResidency = e0Var;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof m)) {
                return false;
            }
            m mVar = (m) obj2;
            return Intrinsics.f(this.primaryCountryReplacement, mVar.primaryCountryReplacement) && Intrinsics.f(this.confirmations, mVar.confirmations) && Intrinsics.f(this.soleResidency, mVar.soleResidency);
        }

        public final int hashCode() {
            v vVar = this.primaryCountryReplacement;
            int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
            List<String> list = this.confirmations;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            e0 e0Var = this.soleResidency;
            return iHashCode2 + (e0Var != null ? e0Var.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$n;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "getTermsIds", "()Ljava/util/List;", "termsIds", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("termsIds")
        @NotNull
        private final List<String> termsIds;

        public n(List termsIds) {
            Intrinsics.checkNotNullParameter(termsIds, "termsIds");
            this.termsIds = termsIds;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof n) && Intrinsics.f(this.termsIds, ((n) obj2).termsIds);
        }

        public final int hashCode() {
            return this.termsIds.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lbvh/s$o;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getAccepted", "()Z", "accepted", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("accepted")
        private final boolean accepted;

        public o(boolean z) {
            this.accepted = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof o) && this.accepted == ((o) obj2).accepted;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.accepted);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lbvh/s$p;", "Lbvh/s;", "", "toString", "()Ljava/lang/String;", "", "Lbvh/f;", "a", "Ljava/util/List;", "getTransactionCountries", "()Ljava/util/List;", "transactionCountries", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionCountries")
        @NotNull
        private final List<bvh.f> transactionCountries;

        public p(ArrayList transactionCountries) {
            Intrinsics.checkNotNullParameter(transactionCountries, "transactionCountries");
            this.transactionCountries = transactionCountries;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof p) && Intrinsics.f(this.transactionCountries, ((p) obj2).transactionCountries);
        }

        public final int hashCode() {
            return this.transactionCountries.hashCode();
        }
    }

    private s() {
    }
}
