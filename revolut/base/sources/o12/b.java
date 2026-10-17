package o12;

import com.revolut.feature.apm.core.api.ApmToggles$ApmAliasClaim;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$InputData;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f221266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f221267b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f221266a = featureToggleInteractor;
        this.f221267b = y0.b("apm-alias/{apmType}/claim/{mode}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f221267b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Object next;
        String lowerCase;
        c12.a aVar;
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f221266a.a(ApmToggles$ApmAliasClaim.f61775c)) {
            return null;
        }
        String str = (String) linkedHashMap.get("apmType");
        if (str == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing APM Type");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalArgumentException, h0Var);
            return null;
        }
        ApmProduct.INSTANCE.getClass();
        Iterator it8 = v.k(ApmAani.f61807c, ApmBizum.f61808c, ApmBlik.f61809c, ApmBreb.f61810c, ApmIris.f61811c, ApmMultibanco.f61815c, ApmPayId.f61819c, ApmPix.f61820c, ApmQvik.f61823c, ApmSpin.f61827c, ApmUpi.f61828c, ApmWero.f61829c).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ApmProduct) next).getId().equalsIgnoreCase(str)) {
                break;
            }
        }
        ApmProduct apmProduct = (ApmProduct) next;
        if (apmProduct == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Invalid APM Type: ".concat(str));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, illegalArgumentException2, h0Var2);
            return null;
        }
        String str2 = (String) linkedHashMap.get("mode");
        if (str2 != null) {
            lowerCase = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.f(lowerCase, "link")) {
            aVar = c12.a.LINK;
        } else {
            if (!Intrinsics.f(lowerCase, "unlink")) {
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Missing link mode");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.WARNING, null, null, illegalArgumentException3, h0Var3);
                return null;
            }
            aVar = c12.a.UNLINK;
        }
        return new ApmAliasClaimNavigation$Destination(new ApmAliasClaimNavigation$InputData(apmProduct, aVar));
    }
}
