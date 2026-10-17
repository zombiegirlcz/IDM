package nij;

import android.content.Context;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f216258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f216259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f216260c;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f216258a = context;
        this.f216259b = new LinkedHashMap();
        this.f216260c = yhm.j.b(new x8(this, 29));
    }

    public static AnimatedBackgroundType.Esim b(List list) {
        return new AnimatedBackgroundType.Esim(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue());
    }

    public final AnimatedBackgroundType.Esim a(EsimCoverage esimCoverage) {
        wi0.b bVar;
        AnimatedBackgroundType.Esim esimB;
        EsimCoverage.Country country = esimCoverage instanceof EsimCoverage.Country ? (EsimCoverage.Country) esimCoverage : null;
        Lazy lazy = this.f216260c;
        if (country != null && (bVar = country.f100204a) != null) {
            String str = bVar.f297794a;
            LinkedHashMap linkedHashMap = this.f216259b;
            Object obj2 = linkedHashMap.get(bVar);
            if (obj2 == null) {
                ArrayList arrayList = new ArrayList(3);
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        esimB = b(arrayList);
                        break;
                    }
                    Locale locale = Locale.ROOT;
                    String strT = v1.c.t(i, "esim_background_country_color_", p.a.r(locale, "ROOT", str, locale, "toLowerCase(...)"), "_");
                    Context context = this.f216258a;
                    int identifier = context.getResources().getIdentifier(strT, "color", context.getPackageName());
                    if (identifier == 0) {
                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Color for country code ", str, " not found"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimCountryColorsBackgroundMapper", null, illegalStateException, h0Var);
                        esimB = (AnimatedBackgroundType.Esim) lazy.getValue();
                        break;
                    }
                    arrayList.add(Integer.valueOf(context.getColor(identifier)));
                    i++;
                }
                obj2 = esimB;
                linkedHashMap.put(bVar, obj2);
            }
            AnimatedBackgroundType.Esim esim = (AnimatedBackgroundType.Esim) obj2;
            if (esim != null) {
                return esim;
            }
        }
        return (AnimatedBackgroundType.Esim) lazy.getValue();
    }
}
