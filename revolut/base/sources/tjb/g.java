package tjb;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import com.revolut.feature.retail.savings.impl.challenge.data.SavingsChallengeService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pti.s;
import qib.i;
import t05.m;
import ujb.z0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f271622g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsChallengeService f271623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f271624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f271625c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    static {
        Type type = new TypeToken<List<? extends z0>>() { // from class: com.revolut.feature.retail.savings.impl.challenge.data.SavingsChallengeRepository$Companion$CHALLENGES_ONBOARDING_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f271622g = type;
    }

    public g(SavingsChallengeService service, j memoryCache, ue0.c savingsStorage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(savingsStorage, "savingsStorage");
        this.f271623a = service;
        this.f271624b = memoryCache;
        this.f271625c = savingsStorage;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new s(this, continuation, 17), new Function1(this) { // from class: tjb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f271616b;

            {
                this.f271616b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f271616b.f271624b.get("challenges_onboarding_key");
                    case 1:
                        String challengeId = (String) obj2;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        return (SavingsChallenge) this.f271616b.f271624b.get(g.b(challengeId));
                    default:
                        String accountId = (String) obj2;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        return (i) this.f271616b.f271624b.get(g.a(accountId));
                }
            }
        }, new Function2(this) { // from class: tjb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f271618b;

            {
                this.f271618b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f271618b.f271624b.f("challenges_onboarding_key", data);
                        break;
                    case 1:
                        String challengeId = (String) obj2;
                        SavingsChallenge challenge = (SavingsChallenge) obj3;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        Intrinsics.checkNotNullParameter(challenge, "challenge");
                        this.f271618b.f271624b.f(g.b(challengeId), challenge);
                        break;
                    default:
                        String accountId = (String) obj2;
                        i account = (i) obj3;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(account, "account");
                        this.f271618b.f271624b.f(g.a(accountId), account);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 28), new ska.c(this, continuation, 8));
        final int i2 = 1;
        this.e = new x4l.c(new e(this, continuation, i2), new Function1(this) { // from class: tjb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f271616b;

            {
                this.f271616b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f271616b.f271624b.get("challenges_onboarding_key");
                    case 1:
                        String challengeId = (String) obj2;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        return (SavingsChallenge) this.f271616b.f271624b.get(g.b(challengeId));
                    default:
                        String accountId = (String) obj2;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        return (i) this.f271616b.f271624b.get(g.a(accountId));
                }
            }
        }, new Function2(this) { // from class: tjb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f271618b;

            {
                this.f271618b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f271618b.f271624b.f("challenges_onboarding_key", data);
                        break;
                    case 1:
                        String challengeId = (String) obj2;
                        SavingsChallenge challenge = (SavingsChallenge) obj3;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        Intrinsics.checkNotNullParameter(challenge, "challenge");
                        this.f271618b.f271624b.f(g.b(challengeId), challenge);
                        break;
                    default:
                        String accountId = (String) obj2;
                        i account = (i) obj3;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(account, "account");
                        this.f271618b.f271624b.f(g.a(accountId), account);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, i2), new sne.e(this, continuation, 6));
        final int i3 = 2;
        this.f = new x4l.c(new e(this, continuation, 0), new Function1(this) { // from class: tjb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f271616b;

            {
                this.f271616b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f271616b.f271624b.get("challenges_onboarding_key");
                    case 1:
                        String challengeId = (String) obj2;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        return (SavingsChallenge) this.f271616b.f271624b.get(g.b(challengeId));
                    default:
                        String accountId = (String) obj2;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        return (i) this.f271616b.f271624b.get(g.a(accountId));
                }
            }
        }, new Function2(this) { // from class: tjb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f271618b;

            {
                this.f271618b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f271618b.f271624b.f("challenges_onboarding_key", data);
                        break;
                    case 1:
                        String challengeId = (String) obj2;
                        SavingsChallenge challenge = (SavingsChallenge) obj3;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        Intrinsics.checkNotNullParameter(challenge, "challenge");
                        this.f271618b.f271624b.f(g.b(challengeId), challenge);
                        break;
                    default:
                        String accountId = (String) obj2;
                        i account = (i) obj3;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        Intrinsics.checkNotNullParameter(account, "account");
                        this.f271618b.f271624b.f(g.a(accountId), account);
                        break;
                }
                return Unit.f186387a;
            }
        }, new f(this, continuation, 0), new sne.e(this, continuation, 5));
    }

    public static String a(String str) {
        return j6.a.q("challenge_account_data_key_", str);
    }

    public static String b(String str) {
        return j6.a.q("challenge_account_key_", str);
    }
}
