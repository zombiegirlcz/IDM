package jl0;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.appsflyer.internal.j;
import com.appsflyer.internal.k;
import fl0.c;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import l21.d;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f175583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w70.a f175584b;

    public a(c localeRepository, w70.a androidVersion) {
        Intrinsics.checkNotNullParameter(localeRepository, "localeRepository");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f175583a = localeRepository;
        this.f175584b = androidVersion;
    }

    public final Context a(Context baseContext) {
        Context contextCreateConfigurationContext;
        LocaleManager localeManagerA;
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        ue0.c cVar = this.f175583a.f135878a;
        Type type = d.e;
        Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
        Boolean bool = (Boolean) cVar.T2("locale.REQUIRE_CHECK_LANGUAGE_KEY", type);
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (zBooleanValue) {
            Type type2 = d.f191612c;
            Intrinsics.checkNotNullExpressionValue(type2, "<get-LIST_OF_STRINGS_TYPE>(...)");
            List listK = (List) cVar.T2("locale.SUPPORTED_LANGUAGE_CODES_KEY", type2);
            if (listK == null) {
                listK = v.k("en", "es");
            }
            if (!listK.contains(jh.d.e(baseContext).getLanguage())) {
                z = true;
            }
        }
        Locale localeD = jh.d.d(baseContext);
        if (z) {
            Locale locale = new Locale("en");
            Locale.setDefault(locale);
            Configuration configuration = baseContext.getResources().getConfiguration();
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            contextCreateConfigurationContext = baseContext.createConfigurationContext(configuration);
            Intrinsics.h(contextCreateConfigurationContext);
        } else if (jh.d.j(localeD)) {
            Locale localeL = jh.d.l(localeD);
            Locale.setDefault(localeL);
            Configuration configuration2 = baseContext.getResources().getConfiguration();
            configuration2.setLocale(localeL);
            configuration2.setLayoutDirection(localeL);
            contextCreateConfigurationContext = baseContext.createConfigurationContext(configuration2);
            Intrinsics.h(contextCreateConfigurationContext);
        } else {
            contextCreateConfigurationContext = baseContext;
        }
        w70.a aVar = this.f175584b;
        if (aVar.a(34)) {
            if (zBooleanValue) {
                LocaleManager localeManagerA2 = k.a(baseContext.getSystemService(k.h()));
                if (localeManagerA2 != null) {
                    k.m();
                    localeManagerA2.setOverrideLocaleConfig(j.b(LocaleList.getEmptyLocaleList()));
                    return contextCreateConfigurationContext;
                }
            } else {
                LocaleManager localeManagerA3 = k.a(baseContext.getSystemService(k.h()));
                if (localeManagerA3 != null) {
                    localeManagerA3.setOverrideLocaleConfig(null);
                    return contextCreateConfigurationContext;
                }
            }
        } else if (aVar.a(33) && zBooleanValue && (localeManagerA = k.a(baseContext.getSystemService(k.h()))) != null) {
            localeManagerA.setApplicationLocales(LocaleList.getEmptyLocaleList());
        }
        return contextCreateConfigurationContext;
    }
}
