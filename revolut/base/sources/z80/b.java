package z80;

import android.content.Context;
import android.os.LocaleList;
import androidx.core.text.BidiFormatter;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import rd0.c;
import rd0.d;
import yem.e;
import yem.h;
import yem.o;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f320032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f320033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g90.a f320034c;
    public final h d;
    public final BidiFormatter e;

    public b(Context context, qd0.b languageProvider, g90.a telephonyProvider, h phoneNumberUtil) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(telephonyProvider, "telephonyProvider");
        Intrinsics.checkNotNullParameter(phoneNumberUtil, "phoneNumberUtil");
        this.f320032a = context;
        this.f320033b = languageProvider;
        this.f320034c = telephonyProvider;
        this.d = phoneNumberUtil;
        this.e = BidiFormatter.getInstance(((s80.b) languageProvider).b());
    }

    public static /* synthetic */ String b(b bVar, String str, String str2, yk0.b bVar2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bVar2 = yk0.b.INTERNATIONAL;
        }
        return bVar.a(str, str2, bVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r7, java.lang.String r8) {
        /*
            android.net.Uri r0 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI
            java.lang.String r8 = android.net.Uri.encode(r8)
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r0, r8)
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r7 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r7}
            r5 = 0
            r6 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            r0 = 0
            if (r8 == 0) goto L33
            int r1 = r8.getCount()     // Catch: java.lang.Throwable -> L30
            if (r1 <= 0) goto L33
            r8.moveToNext()     // Catch: java.lang.Throwable -> L30
            int r7 = r8.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = r8.getString(r7)     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r0 = move-exception
            r7 = r0
            goto L3a
        L33:
            r7 = r0
        L34:
            kotlin.Unit r1 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L30
            com.bumptech.glide.d.e(r8, r0)
            return r7
        L3a:
            throw r7     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            com.bumptech.glide.d.e(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.b.c(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void n(String phoneNumber, String str, Throwable th10) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        String strReplace = new Regex("[0-9]").replace(phoneNumber, "*");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, j6.a.r(str, " [", strReplace, "]"), th10, h0Var);
    }

    public final String a(String unformattedNumber, String str, yk0.b format) {
        e eVar;
        h hVar = this.d;
        Intrinsics.checkNotNullParameter(unformattedNumber, "unformattedNumber");
        Intrinsics.checkNotNullParameter(format, "format");
        if (!k(unformattedNumber, str)) {
            return unformattedNumber;
        }
        try {
            o oVarT = hVar.t(unformattedNumber, str);
            BidiFormatter bidiFormatter = this.e;
            int i = a.f320031a[format.ordinal()];
            if (i == 1) {
                eVar = e.INTERNATIONAL;
            } else if (i == 2) {
                eVar = e.E164;
            } else if (i == 3) {
                eVar = e.NATIONAL;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = e.RFC3966;
            }
            String strUnicodeWrap = bidiFormatter.unicodeWrap(hVar.e(oVarT, eVar));
            Intrinsics.checkNotNullExpressionValue(strUnicodeWrap, "unicodeWrap(...)");
            return strUnicodeWrap;
        } catch (Throwable th10) {
            n(unformattedNumber, "Error formatting phone number ", th10);
            return unformattedNumber;
        }
    }

    public final wi0.b d(int i) {
        String strL = this.d.l(i);
        Intrinsics.checkNotNullExpressionValue(strL, "getRegionCodeForCountryCode(...)");
        return com.bumptech.glide.d.c(strL);
    }

    public final wi0.b e(String str) {
        h hVar = this.d;
        try {
            String strM = hVar.m(hVar.t(str, ((s80.b) this.f320033b).a().getCountry()));
            wi0.a aVar = wi0.b.Companion;
            Intrinsics.h(strM);
            aVar.getClass();
            return wi0.a.a(strM);
        } catch (NumberParseException e) {
            if (str == null) {
                str = "";
            }
            n(str, "can't parse phone and get country code", e);
            return null;
        }
    }

    public final wi0.b f() {
        wi0.b bVarA;
        Locale locale;
        String simCountryIso = this.f320034c.f141426a.getSimCountryIso();
        if (simCountryIso == null || d0.W(simCountryIso)) {
            bVarA = null;
        } else {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(simCountryIso);
        }
        if (bVarA != null) {
            return bVarA;
        }
        LocaleList locales = this.f320032a.getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            locales = null;
        }
        String country = (locales == null || (locale = locales.get(0)) == null) ? null : locale.getCountry();
        if (country == null) {
            return null;
        }
        wi0.b.Companion.getClass();
        return wi0.a.a(country);
    }

    public final String g(String phoneNumber, wi0.b bVar) {
        String country;
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        try {
            h hVar = this.d;
            if (bVar == null || (country = bVar.f297794a) == null) {
                country = ((s80.b) this.f320033b).a().getCountry();
            }
            return String.valueOf(hVar.t(phoneNumber, country).c());
        } catch (NumberParseException e) {
            n(phoneNumber, "can't parse phone and get number without code", e);
            return null;
        }
    }

    public final String i(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        try {
            return String.valueOf(this.d.t(phoneNumber, ((s80.b) this.f320033b).a().getCountry()).a());
        } catch (NumberParseException e) {
            n(phoneNumber, "can't parse phone and get phone code", e);
            return null;
        }
    }

    public final String j(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return String.valueOf(this.d.f(countryCode.f297794a));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:7:0x000e, B:9:0x0020, B:12:0x002b, B:14:0x0031, B:16:0x0037, B:19:0x003e, B:20:0x0051, B:21:0x0052, B:10:0x0025), top: B:30:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "001"
            yem.h r1 = r9.d
            r2 = 0
            if (r10 == 0) goto L71
            boolean r3 = kotlin.text.d0.W(r10)
            if (r3 == 0) goto Le
            goto L71
        Le:
            yem.o r10 = r1.t(r10, r11)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r1.m(r10)     // Catch: java.lang.Throwable -> L62
            int r3 = r10.a()     // Catch: java.lang.Throwable -> L62
            boolean r4 = r0.equals(r11)     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L25
            yem.k r4 = r1.g(r3)     // Catch: java.lang.Throwable -> L62
            goto L29
        L25:
            yem.k r4 = r1.h(r11)     // Catch: java.lang.Throwable -> L62
        L29:
            if (r4 == 0) goto L71
            boolean r0 = r0.equals(r11)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L52
            yem.k r0 = r1.h(r11)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L3e
            int r11 = r0.a()     // Catch: java.lang.Throwable -> L62
            if (r3 == r11) goto L52
            goto L71
        L3e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "Invalid region code: "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r0.append(r11)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L62
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L62
            throw r10     // Catch: java.lang.Throwable -> L62
        L52:
            java.lang.String r10 = yem.h.i(r10)     // Catch: java.lang.Throwable -> L62
            yem.f r10 = r1.k(r10, r4)     // Catch: java.lang.Throwable -> L62
            yem.f r11 = yem.f.UNKNOWN     // Catch: java.lang.Throwable -> L62
            if (r10 == r11) goto L71
            r10 = 1
            return r10
        L60:
            r6 = r10
            goto L65
        L62:
            r0 = move-exception
            r10 = r0
            goto L60
        L65:
            java.util.concurrent.CopyOnWriteArrayList r10 = rd0.d.f253311a
            rd0.c r3 = rd0.c.VERBOSE
            r7 = 0
            r8 = 16
            r4 = 0
            r5 = 0
            rd0.d.b(r3, r4, r5, r6, r7, r8)
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z80.b.k(java.lang.String, java.lang.String):boolean");
    }

    public final fj0.c m(String unformattedNumber, String str) {
        h hVar = this.d;
        Intrinsics.checkNotNullParameter(unformattedNumber, "unformattedNumber");
        try {
            o oVarT = hVar.t(unformattedNumber, str);
            String strI = h.i(oVarT);
            int iA = oVarT.a();
            Intrinsics.h(strI);
            return new fj0.c(iA, strI);
        } catch (Throwable th10) {
            n(unformattedNumber, "Error formatting phone number ", th10);
            return null;
        }
    }
}
