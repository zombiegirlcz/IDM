package th6;

import com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkExternalInstitutionsService f271291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f271292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f271293c;
    public final x4l.c d;
    public final x4l.c e;

    public q(LinkExternalInstitutionsService linkExternalInstitutionsService, ne0.j memoryCache, ue0.c linkedAccountsConsentStorage) {
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsService, "linkExternalInstitutionsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(linkedAccountsConsentStorage, "linkedAccountsConsentStorage");
        this.f271291a = linkExternalInstitutionsService;
        this.f271292b = memoryCache;
        this.f271293c = linkedAccountsConsentStorage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new pti.s(this, continuation, 15), new Function1(this) { // from class: th6.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f271286b;

            {
                this.f271286b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (ph6.f) this.f271286b.f271292b.get("LINKED_ACCOUNTS_CONSENT_MEMORY_CACHE_KEY");
                    default:
                        String consentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        return (ph6.b) v7.r("LINKED_ACCOUNT_CONSENT_DETAILS_MEMORY_CACHE_KEY_", consentId, this.f271286b.f271292b);
                }
            }
        }, new Function2(this) { // from class: th6.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f271288b;

            {
                this.f271288b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ph6.f linkedAccounts = (ph6.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
                        this.f271288b.f271292b.f("LINKED_ACCOUNTS_CONSENT_MEMORY_CACHE_KEY", linkedAccounts);
                        break;
                    default:
                        String consentId = (String) obj2;
                        ph6.b details = (ph6.b) obj3;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f271288b.f271292b.f("LINKED_ACCOUNT_CONSENT_DETAILS_MEMORY_CACHE_KEY_" + consentId, details);
                        break;
                }
                return Unit.f186387a;
            }
        }, new t05.m(this, continuation, 24), new ska.c(this, continuation, 6));
        final int i2 = 1;
        this.e = new x4l.c(new p(this, continuation, 0), new Function1(this) { // from class: th6.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f271286b;

            {
                this.f271286b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (ph6.f) this.f271286b.f271292b.get("LINKED_ACCOUNTS_CONSENT_MEMORY_CACHE_KEY");
                    default:
                        String consentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        return (ph6.b) v7.r("LINKED_ACCOUNT_CONSENT_DETAILS_MEMORY_CACHE_KEY_", consentId, this.f271286b.f271292b);
                }
            }
        }, new Function2(this) { // from class: th6.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f271288b;

            {
                this.f271288b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ph6.f linkedAccounts = (ph6.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
                        this.f271288b.f271292b.f("LINKED_ACCOUNTS_CONSENT_MEMORY_CACHE_KEY", linkedAccounts);
                        break;
                    default:
                        String consentId = (String) obj2;
                        ph6.b details = (ph6.b) obj3;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        Intrinsics.checkNotNullParameter(details, "details");
                        this.f271288b.f271292b.f("LINKED_ACCOUNT_CONSENT_DETAILS_MEMORY_CACHE_KEY_" + consentId, details);
                        break;
                }
                return Unit.f186387a;
            }
        }, new t9h.b(this, continuation, 16), new sne.e(this, continuation, 4));
    }
}
