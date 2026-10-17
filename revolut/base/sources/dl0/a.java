package dl0;

import android.content.Context;
import fl0.c;
import java.util.List;
import jh.d;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import wi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f115688b;

    public a(Context context, c localeRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localeRepository, "localeRepository");
        this.f115687a = context;
        this.f115688b = localeRepository;
    }

    public final boolean a(String country) {
        Intrinsics.checkNotNullParameter(country, "country");
        b.Companion.getClass();
        if (!Intrinsics.f(country, "US")) {
            return false;
        }
        List languageCodes = u.c("en");
        Intrinsics.checkNotNullParameter(languageCodes, "languageCodes");
        c cVar = this.f115688b;
        Intrinsics.checkNotNullParameter(languageCodes, "languageCodes");
        cVar.f135878a.G(languageCodes, "locale.SUPPORTED_LANGUAGE_CODES_KEY", e.o(String.class, KTypeProjection.INSTANCE, List.class));
        return !languageCodes.contains(d.e(this.f115687a).getLanguage());
    }
}
