package o29;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import ip0.v7;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nfj.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Type f221565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Type f221566h;
    public static final Type i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifestyleHomeService f221567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f221568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f221569c;
    public final x4l.c d;
    public final x4l.c e;
    public final x4l.c f;

    static {
        Type type = new TypeToken<m29.d>() { // from class: com.revolut.feature.lifestyle.core.impl.data.repository.LifestyleSavingsRepositoryImpl$Companion$SAVINGS_SUMMARY_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f221565g = type;
        Type type2 = new TypeToken<m29.c>() { // from class: com.revolut.feature.lifestyle.core.impl.data.repository.LifestyleSavingsRepositoryImpl$Companion$SAVINGS_DETAILS_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f221566h = type2;
        Type type3 = new TypeToken<m29.b>() { // from class: com.revolut.feature.lifestyle.core.impl.data.repository.LifestyleSavingsRepositoryImpl$Companion$SAVINGS_BOTTOM_SHEET_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
        i = type3;
    }

    public m(LifestyleHomeService lifestyleHomeService, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(lifestyleHomeService, "lifestyleHomeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f221567a = lifestyleHomeService;
        this.f221568b = memoryCache;
        this.f221569c = storage;
        final int i2 = 0;
        Continuation continuation = null;
        this.d = new x4l.c(new l(this, continuation, i2), new Function1(this) { // from class: o29.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f221555b;

            {
                this.f221555b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y19.h) this.f221555b.f221568b.get("SAVINGS_SUMMARY_MEM_KEY");
                    case 1:
                        j params = (j) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f221555b.f221568b;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        return (y19.e) v7.r("SAVINGS_DETAILS_MEM_KEY_", params.f221560a.name(), jVar);
                    default:
                        i params2 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar2 = this.f221555b.f221568b;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        return (y19.d) v7.r("SAVINGS_BOTTOM_SHEET_MEM_KEY_", params2.f221558a, jVar2);
                }
            }
        }, new Function2(this) { // from class: o29.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f221557b;

            {
                this.f221557b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        y19.h savingsSummary = (y19.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsSummary, "savingsSummary");
                        this.f221557b.f221568b.f("SAVINGS_SUMMARY_MEM_KEY", savingsSummary);
                        break;
                    case 1:
                        j params = (j) obj2;
                        y19.e savingsDetails = (y19.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
                        ne0.j jVar = this.f221557b.f221568b;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        jVar.f("SAVINGS_DETAILS_MEM_KEY_" + params.f221560a.name(), savingsDetails);
                        break;
                    default:
                        i params2 = (i) obj2;
                        y19.d bottomSheet = (y19.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        ne0.j jVar2 = this.f221557b.f221568b;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        jVar2.f("SAVINGS_BOTTOM_SHEET_MEM_KEY_" + params2.f221558a, bottomSheet);
                        break;
                }
                return Unit.f186387a;
            }
        }, new nuh.j(this, continuation, 10), new l05.b(this, continuation, 25));
        final int i3 = 1;
        this.e = new x4l.c(new mtj.k(this, continuation, 29), new Function1(this) { // from class: o29.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f221555b;

            {
                this.f221555b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y19.h) this.f221555b.f221568b.get("SAVINGS_SUMMARY_MEM_KEY");
                    case 1:
                        j params = (j) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f221555b.f221568b;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        return (y19.e) v7.r("SAVINGS_DETAILS_MEM_KEY_", params.f221560a.name(), jVar);
                    default:
                        i params2 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar2 = this.f221555b.f221568b;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        return (y19.d) v7.r("SAVINGS_BOTTOM_SHEET_MEM_KEY_", params2.f221558a, jVar2);
                }
            }
        }, new Function2(this) { // from class: o29.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f221557b;

            {
                this.f221557b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        y19.h savingsSummary = (y19.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsSummary, "savingsSummary");
                        this.f221557b.f221568b.f("SAVINGS_SUMMARY_MEM_KEY", savingsSummary);
                        break;
                    case 1:
                        j params = (j) obj2;
                        y19.e savingsDetails = (y19.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
                        ne0.j jVar = this.f221557b.f221568b;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        jVar.f("SAVINGS_DETAILS_MEM_KEY_" + params.f221560a.name(), savingsDetails);
                        break;
                    default:
                        i params2 = (i) obj2;
                        y19.d bottomSheet = (y19.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        ne0.j jVar2 = this.f221557b.f221568b;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        jVar2.f("SAVINGS_BOTTOM_SHEET_MEM_KEY_" + params2.f221558a, bottomSheet);
                        break;
                }
                return Unit.f186387a;
            }
        }, new k(this, continuation, i3), new l1(this, continuation, 10));
        final int i5 = 2;
        this.f = new x4l.c(new mtj.k(this, continuation, 28), new Function1(this) { // from class: o29.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f221555b;

            {
                this.f221555b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String it8 = (String) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (y19.h) this.f221555b.f221568b.get("SAVINGS_SUMMARY_MEM_KEY");
                    case 1:
                        j params = (j) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        ne0.j jVar = this.f221555b.f221568b;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        return (y19.e) v7.r("SAVINGS_DETAILS_MEM_KEY_", params.f221560a.name(), jVar);
                    default:
                        i params2 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        ne0.j jVar2 = this.f221555b.f221568b;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        return (y19.d) v7.r("SAVINGS_BOTTOM_SHEET_MEM_KEY_", params2.f221558a, jVar2);
                }
            }
        }, new Function2(this) { // from class: o29.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f221557b;

            {
                this.f221557b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        y19.h savingsSummary = (y19.h) obj3;
                        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(savingsSummary, "savingsSummary");
                        this.f221557b.f221568b.f("SAVINGS_SUMMARY_MEM_KEY", savingsSummary);
                        break;
                    case 1:
                        j params = (j) obj2;
                        y19.e savingsDetails = (y19.e) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(savingsDetails, "savingsDetails");
                        ne0.j jVar = this.f221557b.f221568b;
                        Intrinsics.checkNotNullParameter(params, "<this>");
                        jVar.f("SAVINGS_DETAILS_MEM_KEY_" + params.f221560a.name(), savingsDetails);
                        break;
                    default:
                        i params2 = (i) obj2;
                        y19.d bottomSheet = (y19.d) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                        ne0.j jVar2 = this.f221557b.f221568b;
                        Intrinsics.checkNotNullParameter(params2, "<this>");
                        jVar2.f("SAVINGS_BOTTOM_SHEET_MEM_KEY_" + params2.f221558a, bottomSheet);
                        break;
                }
                return Unit.f186387a;
            }
        }, new k(this, continuation, 0), new l1(this, continuation, 9));
    }
}
