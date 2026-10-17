package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.res.Resources;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f29079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaLocalization f29080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed f29081c;
    private Locale d;
    private Resources e;
    private final Map f;

    public gz0(Activity activity, OrcaLocalization localization) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f29079a = activity;
        this.f29080b = localization;
        this.f29081c = new ed();
        Locale localeA = vc.a(activity, localization);
        this.d = localeA;
        this.e = b(localeA);
        this.f = new LinkedHashMap();
    }

    public final Locale a() {
        return this.d;
    }

    public final Resources b() {
        return this.e;
    }

    public final void c() {
        Locale localeA = vc.a(this.f29079a, this.f29080b);
        this.d = localeA;
        this.e = b(localeA);
    }

    public static /* synthetic */ List a(gz0 gz0Var, Locale locale, int i, Object obj2) {
        if ((i & 1) != 0) {
            locale = gz0Var.d;
        }
        return gz0Var.a(locale);
    }

    public final Resources b(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return vc.a(this.f29079a, locale);
    }

    public final List a(Locale targetLocale) {
        Intrinsics.checkNotNullParameter(targetLocale, "targetLocale");
        String country = this.d.getCountry();
        List list = (List) this.f.get(country);
        if (list != null) {
            return list;
        }
        List listA = this.f29081c.a(b(targetLocale));
        this.f.put(country, listA);
        return listA;
    }
}
