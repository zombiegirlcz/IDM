package lf6;

import com.revolut.feature.external_accounts.impl.data.open_banking_brazil.OpenBankingBrazilService;
import ip0.v7;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f194652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OpenBankingBrazilService f194653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f194654c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    public j(ne0.j memoryCache, OpenBankingBrazilService openBankingBrazilService, ue0.c consentsStorage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(openBankingBrazilService, "openBankingBrazilService");
        Intrinsics.checkNotNullParameter(consentsStorage, "consentsStorage");
        this.f194652a = memoryCache;
        this.f194653b = openBankingBrazilService;
        this.f194654c = consentsStorage;
        final int i = 0;
        Continuation continuation = null;
        this.d = new x4l.c(new e(this, continuation, i), new Function1(this) { // from class: lf6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f194637b;

            {
                this.f194637b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (og6.a) this.f194637b.f194652a.get("CONSENTS_MEMORY_CACHE_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (og6.g) this.f194637b.f194652a.get("LINKED_ACCOUNTS_MEMORY_CACHE_KEY");
                    default:
                        String consentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        return (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) v7.r("CONSENTS_MEMORY_CACHE_KEY", consentId, this.f194637b.f194652a);
                }
            }
        }, new Function2(this) { // from class: lf6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f194639b;

            {
                this.f194639b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        og6.a consents = (og6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        this.f194639b.f194652a.f("CONSENTS_MEMORY_CACHE_KEY", consents);
                        break;
                    case 1:
                        og6.g linkedAccounts = (og6.g) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
                        this.f194639b.f194652a.f("LINKED_ACCOUNTS_MEMORY_CACHE_KEY", linkedAccounts);
                        break;
                    default:
                        String consentId = (String) obj2;
                        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c consent = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) obj3;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        Intrinsics.checkNotNullParameter(consent, "consent");
                        this.f194639b.f194652a.f("CONSENTS_MEMORY_CACHE_KEY" + consentId, consent);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, i), new l05.b(this, continuation, 11));
        final int i2 = 1;
        this.e = new x4l.c(new e(this, continuation, i2), new Function1(this) { // from class: lf6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f194637b;

            {
                this.f194637b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (og6.a) this.f194637b.f194652a.get("CONSENTS_MEMORY_CACHE_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (og6.g) this.f194637b.f194652a.get("LINKED_ACCOUNTS_MEMORY_CACHE_KEY");
                    default:
                        String consentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        return (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) v7.r("CONSENTS_MEMORY_CACHE_KEY", consentId, this.f194637b.f194652a);
                }
            }
        }, new Function2(this) { // from class: lf6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f194639b;

            {
                this.f194639b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        og6.a consents = (og6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        this.f194639b.f194652a.f("CONSENTS_MEMORY_CACHE_KEY", consents);
                        break;
                    case 1:
                        og6.g linkedAccounts = (og6.g) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
                        this.f194639b.f194652a.f("LINKED_ACCOUNTS_MEMORY_CACHE_KEY", linkedAccounts);
                        break;
                    default:
                        String consentId = (String) obj2;
                        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c consent = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) obj3;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        Intrinsics.checkNotNullParameter(consent, "consent");
                        this.f194639b.f194652a.f("CONSENTS_MEMORY_CACHE_KEY" + consentId, consent);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, i2), new l05.b(this, continuation, 12));
        final int i3 = 2;
        this.f = new x4l.c(new x(this, continuation, 14), new Function1(this) { // from class: lf6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f194637b;

            {
                this.f194637b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (og6.a) this.f194637b.f194652a.get("CONSENTS_MEMORY_CACHE_KEY");
                    case 1:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        return (og6.g) this.f194637b.f194652a.get("LINKED_ACCOUNTS_MEMORY_CACHE_KEY");
                    default:
                        String consentId = (String) obj2;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        return (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) v7.r("CONSENTS_MEMORY_CACHE_KEY", consentId, this.f194637b.f194652a);
                }
            }
        }, new Function2(this) { // from class: lf6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f194639b;

            {
                this.f194639b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        og6.a consents = (og6.a) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(consents, "consents");
                        this.f194639b.f194652a.f("CONSENTS_MEMORY_CACHE_KEY", consents);
                        break;
                    case 1:
                        og6.g linkedAccounts = (og6.g) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
                        this.f194639b.f194652a.f("LINKED_ACCOUNTS_MEMORY_CACHE_KEY", linkedAccounts);
                        break;
                    default:
                        String consentId = (String) obj2;
                        com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c consent = (com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c) obj3;
                        Intrinsics.checkNotNullParameter(consentId, "consentId");
                        Intrinsics.checkNotNullParameter(consent, "consent");
                        this.f194639b.f194652a.f("CONSENTS_MEMORY_CACHE_KEY" + consentId, consent);
                        break;
                }
                return Unit.f186387a;
            }
        }, new le8.d(this, continuation, 1), new j40.d(this, continuation, 21));
    }
}
