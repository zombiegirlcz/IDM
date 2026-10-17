package s12;

import android.content.Context;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.apm.core.api.ApmToggles$ApmBackground;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.ui.impl.R$array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements a12.p {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f259049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f259050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f259051c;
    public final LinkedHashMap d;
    public final Lazy e;

    public l(gte.a featureToggleInteractor, Context context) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f259049a = featureToggleInteractor;
        this.f259050b = context;
        final int i = 0;
        this.f259051c = yhm.j.b(new Function0(this) { // from class: s12.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f259048b;

            {
                this.f259048b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((jte.d) this.f259048b.f259049a).c(ApmToggles$ApmBackground.f61776c));
                    default:
                        int[] intArray = this.f259048b.f259050b.getResources().getIntArray(R$array.apm_background_color_default);
                        Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
                        return l.b(kotlin.collections.d.t0(intArray));
                }
            }
        });
        this.d = new LinkedHashMap();
        final int i2 = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: s12.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f259048b;

            {
                this.f259048b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((jte.d) this.f259048b.f259049a).c(ApmToggles$ApmBackground.f61776c));
                    default:
                        int[] intArray = this.f259048b.f259050b.getResources().getIntArray(R$array.apm_background_color_default);
                        Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
                        return l.b(kotlin.collections.d.t0(intArray));
                }
            }
        });
    }

    public static AnimatedBackgroundType.Esim b(List list) {
        return new AnimatedBackgroundType.Esim(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue());
    }

    public final AnimatedBackgroundType.Esim a(ApmProduct apmProduct) {
        AnimatedBackgroundType.Esim esimB;
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        if (!((Boolean) this.f259051c.getValue()).booleanValue()) {
            return null;
        }
        LinkedHashMap linkedHashMap = this.d;
        Object obj2 = linkedHashMap.get(apmProduct);
        if (obj2 == null) {
            ArrayList arrayList = new ArrayList(3);
            int i = 0;
            while (true) {
                if (i >= 3) {
                    esimB = b(arrayList);
                    break;
                }
                String id10 = apmProduct.getId();
                Locale locale = Locale.ROOT;
                String strT = v1.c.t(i, "apm_background_color_", p.a.r(locale, "ROOT", id10, locale, "toLowerCase(...)"), "_");
                Context context = this.f259050b;
                int identifier = context.getResources().getIdentifier(strT, "color", context.getPackageName());
                if (identifier == 0) {
                    IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Color for APM ", apmProduct.getId(), " not found"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ApmCountryColorsBackgroundMapper", null, illegalStateException, h0Var);
                    esimB = (AnimatedBackgroundType.Esim) this.e.getValue();
                    break;
                }
                arrayList.add(Integer.valueOf(context.getColor(identifier)));
                i++;
            }
            obj2 = esimB;
            linkedHashMap.put(apmProduct, obj2);
        }
        return (AnimatedBackgroundType.Esim) obj2;
    }
}
