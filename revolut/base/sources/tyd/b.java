package tyd;

import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path;
import com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Root;
import com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import com.revolut.kompot.common.ParcelableDestination;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f275553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f275554b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f275553a = featureToggleInteractor;
        String[] elements = {"documents-hub", "documents-hub/{type}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f275554b = kotlin.collections.d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f275554b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        String value;
        DocumentsHubInitialConfiguration tab2;
        Object objA;
        LocalDate localDate;
        Object objA2;
        LocalDate localDate2;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        StatementsApi$FeatureToggles.DocumentsHub documentsHub = StatementsApi$FeatureToggles.DocumentsHub.f88209c;
        jte.d dVar = (jte.d) this.f275553a;
        StatementPeriod statementPeriod = null;
        if (dVar.c(documentsHub) || dVar.c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c)) {
            LinkedHashMap linkedHashMap = deeplink.f195040b;
            LinkedHashMap linkedHashMap2 = deeplink.f195041c;
            String value2 = (String) linkedHashMap.get("type");
            if (value2 == null) {
                return DocumentsHubDestination$Root.f88253a;
            }
            if (!d0.W(value2) && ((value = lg0.g.a("productId", linkedHashMap2)) == null || !d0.W(value))) {
                if (value != null) {
                    DocumentsHubProduct.Companion companion = DocumentsHubProduct.INSTANCE;
                    Intrinsics.checkNotNullParameter(value, "value");
                } else {
                    value = null;
                }
                String strA = lg0.g.a("tab", linkedHashMap2);
                if (strA == null || !d0.W(strA)) {
                    if (strA == null || strA.equals("default")) {
                        tab2 = DocumentsHubInitialConfiguration.Default.f88256a;
                    } else if (strA.equals("custom")) {
                        Intrinsics.checkNotNullParameter("itemId", "key");
                        Set set = (Set) linkedHashMap2.get("itemId");
                        if (set == null) {
                            set = h0.f322473a;
                        }
                        String strA2 = lg0.g.a("from", linkedHashMap2);
                        if (strA2 != null) {
                            try {
                                m.Companion companion2 = m.INSTANCE;
                                objA = LocalDate.parse(strA2);
                            } catch (Throwable th10) {
                                m.Companion companion3 = m.INSTANCE;
                                objA = o.a(th10);
                            }
                            if (objA instanceof n) {
                                objA = null;
                            }
                            localDate = (LocalDate) objA;
                        } else {
                            localDate = null;
                        }
                        String strA3 = lg0.g.a("to", linkedHashMap2);
                        if (strA3 != null) {
                            try {
                                m.Companion companion4 = m.INSTANCE;
                                objA2 = LocalDate.parse(strA3);
                            } catch (Throwable th11) {
                                m.Companion companion5 = m.INSTANCE;
                                objA2 = o.a(th11);
                            }
                            if (objA2 instanceof n) {
                                objA2 = null;
                            }
                            localDate2 = (LocalDate) objA2;
                        } else {
                            localDate2 = null;
                        }
                        if (localDate != null && localDate2 != null && localDate.compareTo((ChronoLocalDate) localDate2) <= 0) {
                            statementPeriod = new StatementPeriod(localDate, localDate2);
                        }
                        tab2 = new DocumentsHubInitialConfiguration.Custom(set, statementPeriod);
                    } else {
                        tab2 = new DocumentsHubInitialConfiguration.Tab(strA);
                    }
                    DocumentsHubType.Companion companion6 = DocumentsHubType.INSTANCE;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    return new DocumentsHubDestination$Path(value2, value, tab2);
                }
            }
        }
        return null;
    }
}
