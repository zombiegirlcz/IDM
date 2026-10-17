package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberCancellationPreview;
import com.revolut.retail.feature.esim.impl.network.EsimPhoneNumberService;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.List;
import kfj.a4;
import kfj.y3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 implements k0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Type f215050j;
    public static final Type k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Type f215051l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberService f215052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f215053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215054c;
    public final ynj.i d;
    public final sf0.h e;
    public final tsk.t f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f215055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f215056h;
    public final x4l.c i;

    static {
        Type type = new TypeToken<List<? extends kfj.d2>>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimPhoneNumberRepositoryImpl$Companion$phoneNumberSelectionsDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f215050j = type;
        Type type2 = new TypeToken<y3>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimPhoneNumberRepositoryImpl$Companion$phoneNumberCancellationPreviewDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        k = type2;
        Type type3 = new TypeToken<a4>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimPhoneNumberRepositoryImpl$Companion$phoneNumberDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        f215051l = type3;
    }

    public u0(EsimPhoneNumberService service, ne0.j memoryCache, ue0.c storage, ynj.i defaultPollingDurationProvider, ffj.a subscriptionRequestTermsEntryMapper, sf0.h serverErrorParser, tsk.t esimUsernameHasher) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(defaultPollingDurationProvider, "defaultPollingDurationProvider");
        Intrinsics.checkNotNullParameter(subscriptionRequestTermsEntryMapper, "subscriptionRequestTermsEntryMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(esimUsernameHasher, "esimUsernameHasher");
        this.f215052a = service;
        this.f215053b = memoryCache;
        this.f215054c = storage;
        this.d = defaultPollingDurationProvider;
        this.e = serverErrorParser;
        this.f = esimUsernameHasher;
        Continuation continuation = null;
        final int i = 0;
        this.f215055g = new x4l.c(new mtj.k(this, continuation, 15), new Function1(this) { // from class: nfj.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f214979b;

            {
                this.f214979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        q0 param = (q0) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        u0 u0Var = this.f214979b;
                        return (List) u0Var.f215053b.get(u0Var.a(param));
                    case 1:
                        String phoneNumberId = (String) obj2;
                        Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                        return (EsimSubscriptionPhoneNumberCancellationPreview) v7.r("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY", phoneNumberId, this.f214979b.f215053b);
                    default:
                        String phoneNumberId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(phoneNumberId2, "phoneNumberId");
                        return (EsimSubscriptionPhoneNumber) v7.r("PHONE_NUMBER_KEY", phoneNumberId2, this.f214979b.f215053b);
                }
            }
        }, new Function2(this) { // from class: nfj.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f214986b;

            {
                this.f214986b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        q0 param = (q0) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(data, "data");
                        u0 u0Var = this.f214986b;
                        u0Var.f215053b.f(u0Var.a(param), data);
                        break;
                    case 1:
                        String phoneNumberId = (String) obj2;
                        EsimSubscriptionPhoneNumberCancellationPreview data2 = (EsimSubscriptionPhoneNumberCancellationPreview) obj3;
                        Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f214986b.f215053b.f("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY" + phoneNumberId, data2);
                        break;
                    default:
                        String phoneNumberId2 = (String) obj2;
                        EsimSubscriptionPhoneNumber data3 = (EsimSubscriptionPhoneNumber) obj3;
                        Intrinsics.checkNotNullParameter(phoneNumberId2, "phoneNumberId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214986b.f215053b.f("PHONE_NUMBER_KEY" + phoneNumberId2, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new t0(this, continuation, 2), new lp6.g(this, continuation, 27));
        final int i2 = 1;
        this.f215056h = new x4l.c(new s0(this, continuation, 0), new Function1(this) { // from class: nfj.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f214979b;

            {
                this.f214979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        q0 param = (q0) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        u0 u0Var = this.f214979b;
                        return (List) u0Var.f215053b.get(u0Var.a(param));
                    case 1:
                        String phoneNumberId = (String) obj2;
                        Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                        return (EsimSubscriptionPhoneNumberCancellationPreview) v7.r("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY", phoneNumberId, this.f214979b.f215053b);
                    default:
                        String phoneNumberId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(phoneNumberId2, "phoneNumberId");
                        return (EsimSubscriptionPhoneNumber) v7.r("PHONE_NUMBER_KEY", phoneNumberId2, this.f214979b.f215053b);
                }
            }
        }, new Function2(this) { // from class: nfj.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f214986b;

            {
                this.f214986b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        q0 param = (q0) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(data, "data");
                        u0 u0Var = this.f214986b;
                        u0Var.f215053b.f(u0Var.a(param), data);
                        break;
                    case 1:
                        String phoneNumberId = (String) obj2;
                        EsimSubscriptionPhoneNumberCancellationPreview data2 = (EsimSubscriptionPhoneNumberCancellationPreview) obj3;
                        Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f214986b.f215053b.f("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY" + phoneNumberId, data2);
                        break;
                    default:
                        String phoneNumberId2 = (String) obj2;
                        EsimSubscriptionPhoneNumber data3 = (EsimSubscriptionPhoneNumber) obj3;
                        Intrinsics.checkNotNullParameter(phoneNumberId2, "phoneNumberId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214986b.f215053b.f("PHONE_NUMBER_KEY" + phoneNumberId2, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new t0(this, continuation, 0), new lp6.g(this, continuation, 25));
        final int i3 = 2;
        this.i = new x4l.c(new s0(this, continuation, 1), new Function1(this) { // from class: nfj.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f214979b;

            {
                this.f214979b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        q0 param = (q0) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        u0 u0Var = this.f214979b;
                        return (List) u0Var.f215053b.get(u0Var.a(param));
                    case 1:
                        String phoneNumberId = (String) obj2;
                        Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                        return (EsimSubscriptionPhoneNumberCancellationPreview) v7.r("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY", phoneNumberId, this.f214979b.f215053b);
                    default:
                        String phoneNumberId2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(phoneNumberId2, "phoneNumberId");
                        return (EsimSubscriptionPhoneNumber) v7.r("PHONE_NUMBER_KEY", phoneNumberId2, this.f214979b.f215053b);
                }
            }
        }, new Function2(this) { // from class: nfj.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u0 f214986b;

            {
                this.f214986b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        q0 param = (q0) obj2;
                        List data = (List) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(data, "data");
                        u0 u0Var = this.f214986b;
                        u0Var.f215053b.f(u0Var.a(param), data);
                        break;
                    case 1:
                        String phoneNumberId = (String) obj2;
                        EsimSubscriptionPhoneNumberCancellationPreview data2 = (EsimSubscriptionPhoneNumberCancellationPreview) obj3;
                        Intrinsics.checkNotNullParameter(phoneNumberId, "phoneNumberId");
                        Intrinsics.checkNotNullParameter(data2, "data");
                        this.f214986b.f215053b.f("PHONE_NUMBER_CANCELLATION_PREVIEW_KEY" + phoneNumberId, data2);
                        break;
                    default:
                        String phoneNumberId2 = (String) obj2;
                        EsimSubscriptionPhoneNumber data3 = (EsimSubscriptionPhoneNumber) obj3;
                        Intrinsics.checkNotNullParameter(phoneNumberId2, "phoneNumberId");
                        Intrinsics.checkNotNullParameter(data3, "data");
                        this.f214986b.f215053b.f("PHONE_NUMBER_KEY" + phoneNumberId2, data3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new t0(this, continuation, 1), new lp6.g(this, continuation, 26));
    }

    public final String a(q0 q0Var) {
        if (q0Var instanceof p0) {
            return j6.a.q("PHONE_NUMBER_SELECTIONS_KEY_subscription:", ((p0) q0Var).f215016a);
        }
        if (!(q0Var instanceof o0)) {
            throw new NoWhenBranchMatchedException();
        }
        o0 o0Var = (o0) q0Var;
        String str = o0Var.f215006a;
        String str2 = o0Var.f215007b;
        return a0.d.s("PHONE_NUMBER_SELECTIONS_KEY_mobilePlanId:", str, "_recipientUserName:", str2 != null ? this.f.m(str2) : null);
    }
}
