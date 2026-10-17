package mf6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qo6.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmf6/e;", "", "", "toString", "()Ljava/lang/String;", "Lqo6/s;", "a", "Lqo6/s;", "b", "()Lqo6/s;", "thirdParty", "", "Lmf6/e$a;", "Ljava/util/List;", "()Ljava/util/List;", "linkedAccountConsents", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("thirdParty")
    @NotNull
    private final s thirdParty;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    @NotNull
    private final List<a> linkedAccountConsents;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lmf6/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "consentId", "b", "description", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("consentId")
        @NotNull
        private final String consentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("paymentDescription")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConsentId() {
            return this.consentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.consentId, aVar.consentId) && Intrinsics.f(this.description, aVar.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.consentId.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getLinkedAccountConsents() {
        return this.linkedAccountConsents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getThirdParty() {
        return this.thirdParty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.thirdParty, eVar.thirdParty) && Intrinsics.f(this.linkedAccountConsents, eVar.linkedAccountConsents);
    }

    public final int hashCode() {
        return this.linkedAccountConsents.hashCode() + (this.thirdParty.hashCode() * 31);
    }
}
