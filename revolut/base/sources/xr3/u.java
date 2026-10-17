package xr3;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.credit.application.impl.network.CreditLimitIncreaseService;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import xo8.i0;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements bq3.a {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f308239g = new TypeToken<tr3.b>() { // from class: com.revolut.feature.credit.application.impl.repositories.CreditLimitIncreaseApplicationRepositoryImpl$Companion$CREDIT_LIMIT_INCREASE_OFFER_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.p f308240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditLimitIncreaseService f308241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f308242c;
    public final ve0.c d;
    public final w4l.f e;
    public final x4l.c f;

    public u(mp.p creditApplicationDtoMapper, CreditLimitIncreaseService api2, ne0.d memoryCache, ve0.c storage) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f308240a = creditApplicationDtoMapper;
        this.f308241b = api2;
        this.f308242c = memoryCache;
        this.d = storage;
        final int i = 2;
        Function2 function2 = new Function2(this) { // from class: xr3.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f308234b;

            {
                this.f308234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ve0.c cVar = this.f308234b.d;
                        od0.i value = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        xp3.b bVar = (xp3.b) value.f224257a;
                        if (bVar == null) {
                            cVar.I0("CREDIT_LIMIT_INCREASE_OFFER_KEY");
                        } else {
                            cVar.G(bVar, "CREDIT_LIMIT_INCREASE_OFFER_KEY", wim.z.d(o0.b(xp3.b.class)));
                        }
                        return Unit.f186387a;
                    case 1:
                        t cacheKey = (t) obj2;
                        xp3.c preference = (xp3.c) obj3;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        Intrinsics.checkNotNullParameter(preference, "preference");
                        this.f308234b.f308242c.f(cacheKey.f308238b, preference);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<er3.b> creditLimitIncreasePreQualificationOffer = this.f308234b.f308241b.getCreditLimitIncreasePreQualificationOffer();
                        xo8.u uVar = new xo8.u(8, new i0(21));
                        creditLimitIncreasePreQualificationOffer.getClass();
                        ufm.i iVar = new ufm.i(creditLimitIncreasePreQualificationOffer, uVar, 1);
                        od0.i.Companion.getClass();
                        pfm.z zVarO = iVar.o(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                        return zVarO;
                    default:
                        od0.i offer = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f308234b.f308242c.f("CREDIT_LIMIT_INCREASE_OFFER_KEY", offer);
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 3;
        final int i3 = 0;
        this.e = new w4l.f(function2, new r(this, i2), new Function2(this) { // from class: xr3.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f308234b;

            {
                this.f308234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ve0.c cVar = this.f308234b.d;
                        od0.i value = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        xp3.b bVar = (xp3.b) value.f224257a;
                        if (bVar == null) {
                            cVar.I0("CREDIT_LIMIT_INCREASE_OFFER_KEY");
                        } else {
                            cVar.G(bVar, "CREDIT_LIMIT_INCREASE_OFFER_KEY", wim.z.d(o0.b(xp3.b.class)));
                        }
                        return Unit.f186387a;
                    case 1:
                        t cacheKey = (t) obj2;
                        xp3.c preference = (xp3.c) obj3;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        Intrinsics.checkNotNullParameter(preference, "preference");
                        this.f308234b.f308242c.f(cacheKey.f308238b, preference);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<er3.b> creditLimitIncreasePreQualificationOffer = this.f308234b.f308241b.getCreditLimitIncreasePreQualificationOffer();
                        xo8.u uVar = new xo8.u(8, new i0(21));
                        creditLimitIncreasePreQualificationOffer.getClass();
                        ufm.i iVar = new ufm.i(creditLimitIncreasePreQualificationOffer, uVar, 1);
                        od0.i.Companion.getClass();
                        pfm.z zVarO = iVar.o(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                        return zVarO;
                    default:
                        od0.i offer = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f308234b.f308242c.f("CREDIT_LIMIT_INCREASE_OFFER_KEY", offer);
                        return Unit.f186387a;
                }
            }
        }, new r(this, 4), new Function2(this) { // from class: xr3.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f308234b;

            {
                this.f308234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        ve0.c cVar = this.f308234b.d;
                        od0.i value = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        xp3.b bVar = (xp3.b) value.f224257a;
                        if (bVar == null) {
                            cVar.I0("CREDIT_LIMIT_INCREASE_OFFER_KEY");
                        } else {
                            cVar.G(bVar, "CREDIT_LIMIT_INCREASE_OFFER_KEY", wim.z.d(o0.b(xp3.b.class)));
                        }
                        return Unit.f186387a;
                    case 1:
                        t cacheKey = (t) obj2;
                        xp3.c preference = (xp3.c) obj3;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        Intrinsics.checkNotNullParameter(preference, "preference");
                        this.f308234b.f308242c.f(cacheKey.f308238b, preference);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<er3.b> creditLimitIncreasePreQualificationOffer = this.f308234b.f308241b.getCreditLimitIncreasePreQualificationOffer();
                        xo8.u uVar = new xo8.u(8, new i0(21));
                        creditLimitIncreasePreQualificationOffer.getClass();
                        ufm.i iVar = new ufm.i(creditLimitIncreasePreQualificationOffer, uVar, 1);
                        od0.i.Companion.getClass();
                        pfm.z zVarO = iVar.o(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                        return zVarO;
                    default:
                        od0.i offer = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f308234b.f308242c.f("CREDIT_LIMIT_INCREASE_OFFER_KEY", offer);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        final int i5 = 1;
        this.f = new x4l.c(new wqj.g(this, continuation, 10), new r(this, 0), new Function2(this) { // from class: xr3.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f308234b;

            {
                this.f308234b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        ve0.c cVar = this.f308234b.d;
                        od0.i value = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        xp3.b bVar = (xp3.b) value.f224257a;
                        if (bVar == null) {
                            cVar.I0("CREDIT_LIMIT_INCREASE_OFFER_KEY");
                        } else {
                            cVar.G(bVar, "CREDIT_LIMIT_INCREASE_OFFER_KEY", wim.z.d(o0.b(xp3.b.class)));
                        }
                        return Unit.f186387a;
                    case 1:
                        t cacheKey = (t) obj2;
                        xp3.c preference = (xp3.c) obj3;
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        Intrinsics.checkNotNullParameter(preference, "preference");
                        this.f308234b.f308242c.f(cacheKey.f308238b, preference);
                        return Unit.f186387a;
                    case 2:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<er3.b> creditLimitIncreasePreQualificationOffer = this.f308234b.f308241b.getCreditLimitIncreasePreQualificationOffer();
                        xo8.u uVar = new xo8.u(8, new i0(21));
                        creditLimitIncreasePreQualificationOffer.getClass();
                        ufm.i iVar = new ufm.i(creditLimitIncreasePreQualificationOffer, uVar, 1);
                        od0.i.Companion.getClass();
                        pfm.z zVarO = iVar.o(od0.i.f224256b);
                        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
                        return zVarO;
                    default:
                        od0.i offer = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f308234b.f308242c.f("CREDIT_LIMIT_INCREASE_OFFER_KEY", offer);
                        return Unit.f186387a;
                }
            }
        }, new xjl.g(this, continuation, 18), new wvg.i(this, continuation, 19));
    }
}
