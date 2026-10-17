package dng;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0007\u000e\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldng/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "state", "Ldng/e$c;", "Ldng/e$c;", "d", "()Ldng/e$c;", "verification", "c", "e", "verifiedUntil", "Ldng/e$a;", "Ldng/e$a;", "()Ldng/e$a;", "eligibility", "Ldng/e$b;", "Ldng/e$b;", "()Ldng/e$b;", "university", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("verification")
    private final c verification;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("verifiedUntil")
    private final String verifiedUntil;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eligibility")
    private final a eligibility;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("university")
    private final b university;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Ldng/e$a;", "", "", "toString", "()Ljava/lang/String;", "Ldng/e$a$a;", "a", "Ldng/e$a$a;", "()Ldng/e$a$a;", "ageRange", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ageRange")
        @NotNull
        private final C0689a ageRange;

        /* JADX INFO: renamed from: dng.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Ldng/e$a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "start", "end", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0689a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("start")
            private final int start;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("end")
            private final int end;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0689a)) {
                    return false;
                }
                C0689a c0689a = (C0689a) obj2;
                return this.start == c0689a.start && this.end == c0689a.end;
            }

            public final int hashCode() {
                return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C0689a getAgeRange() {
            return this.ageRange;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.ageRange, ((a) obj2).ageRange);
        }

        public final int hashCode() {
            return this.ageRange.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ldng/e$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "name", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.name, ((b) obj2).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Ldng/e$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "state", "email", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("email")
        @NotNull
        private final String email;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.state, cVar.state) && Intrinsics.f(this.email, cVar.email);
        }

        public final int hashCode() {
            return this.email.hashCode() + (this.state.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getEligibility() {
        return this.eligibility;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getUniversity() {
        return this.university;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getVerification() {
        return this.verification;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVerifiedUntil() {
        return this.verifiedUntil;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.verification, eVar.verification) && Intrinsics.f(this.verifiedUntil, eVar.verifiedUntil) && Intrinsics.f(this.eligibility, eVar.eligibility) && Intrinsics.f(this.university, eVar.university);
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        c cVar = this.verification;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.verifiedUntil;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.eligibility;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.university;
        return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }
}
