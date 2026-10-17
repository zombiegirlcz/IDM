package t70;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.text.PluralRules;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import no.h1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m implements g {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f268394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f90.a f268395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f268396c;
    public final d d;
    public final t e;

    public m(h localizedContext, f90.a stringOperations, n pluralRulesProvider, f dynamicStringsValidator, d dynamicStringsListenerProvider, t textsCache) {
        Intrinsics.checkNotNullParameter(localizedContext, "localizedContext");
        Intrinsics.checkNotNullParameter(stringOperations, "stringOperations");
        Intrinsics.checkNotNullParameter(pluralRulesProvider, "pluralRulesProvider");
        Intrinsics.checkNotNullParameter(dynamicStringsValidator, "dynamicStringsValidator");
        Intrinsics.checkNotNullParameter(dynamicStringsListenerProvider, "dynamicStringsListenerProvider");
        Intrinsics.checkNotNullParameter(textsCache, "textsCache");
        this.f268394a = localizedContext;
        this.f268395b = stringOperations;
        this.f268396c = pluralRulesProvider;
        this.d = dynamicStringsListenerProvider;
        this.e = textsCache;
    }

    public static void x(String str, Throwable th10) {
        gom.c cVar = gom.e.f145194a;
        cVar.f("LocalizationImpl");
        cVar.e(new Throwable(j6.a.q("Can't parse string: ", str), th10));
    }

    public final String A(int i, String str) {
        return a0.d.r(this.f268394a.getResources().getResourceName(i), str);
    }

    public final int B(String str) {
        f.a(str);
        h1 h1VarA = ((e) this.d).a();
        c cVar = c.STRING;
        h1VarA.a(str, cVar.a());
        h hVar = this.f268394a;
        return hVar.getResources().getIdentifier(str, cVar.a(), hVar.getPackageName());
    }

    @Override // t70.g
    public final String a(bj0.b gender, int i, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return h(y(i, gender), quantity, Arrays.copyOf(params, params.length));
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String b(String str) {
        return e(str);
    }

    @Override // t70.g
    public final void c() {
        this.e.i(-1);
    }

    @Override // t70.g
    public final CharSequence d(bj0.b gender, int i, Number quantity) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        try {
            return k(y(i, gender), quantity).toString();
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String e(String str) {
        if (str == null || d0.W(str)) {
            m70.a.c(t0.f186434a);
            return "";
        }
        try {
            return v(B(str), null, new Object[0]);
        } catch (Throwable th10) {
            x(str, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String f(int i, String locale, Object... params) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(params, "params");
        return v(i, locale, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final CharSequence g(String key, Object... args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return w(B(key), Arrays.copyOf(args, args.length)).toString();
        } catch (Throwable th10) {
            x(key, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String getString(int i) {
        return v(i, null, new Object[0]);
    }

    @Override // t70.g
    public final String h(int i, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            String quantityString = this.f268394a.getResources().getQuantityString(i, u(quantity), Arrays.copyOf(params, params.length));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String i(int i, Object... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return v(i, null, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final CharSequence j(String pluralKey, Number quantity) {
        Intrinsics.checkNotNullParameter(pluralKey, "pluralKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        try {
            return this.f268394a.getResources().getQuantityText(z(pluralKey), u(quantity)).toString();
        } catch (Throwable th10) {
            x(pluralKey, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final CharSequence k(int i, Number quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        try {
            return this.f268394a.getResources().getQuantityText(i, u(quantity)).toString();
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String l(String key, Object... params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return v(B(key), null, Arrays.copyOf(params, params.length));
        } catch (Throwable th10) {
            x(key, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final CharSequence m(bj0.b gender, String resourceKey, Number quantity) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        try {
            return k(y(z(resourceKey), gender), quantity).toString();
        } catch (Throwable th10) {
            x(resourceKey, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String n(bj0.b gender, String resourceKey, Object... params) {
        String str;
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            int iB = B(resourceKey);
            int i = l.f268393a[gender.ordinal()];
            if (i == 1) {
                str = ".male";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ".female";
            }
            int iB2 = B(A(iB, str));
            Integer numValueOf = Integer.valueOf(iB2);
            if (iB2 == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iB = numValueOf.intValue();
            }
            return v(iB, null, Arrays.copyOf(params, params.length));
        } catch (Throwable th10) {
            x(resourceKey, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String o(String pluralKey, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(pluralKey, "pluralKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return h(z(pluralKey), quantity, Arrays.copyOf(params, params.length));
        } catch (Throwable th10) {
            x(pluralKey, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String p(bj0.b gender, String resourceKey, Number quantity, Object... params) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(resourceKey, "resourceKey");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return h(y(z(resourceKey), gender), quantity, Arrays.copyOf(params, params.length));
        } catch (Throwable th10) {
            x(resourceKey, th10);
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String q(bj0.b gender, int i, Object... params) {
        String str;
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            int i2 = l.f268393a[gender.ordinal()];
            if (i2 == 1) {
                str = ".male";
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ".female";
            }
            int iB = B(A(i, str));
            Integer numValueOf = Integer.valueOf(iB);
            if (iB == 0) {
                numValueOf = null;
            }
            return v(numValueOf != null ? numValueOf.intValue() : i, null, Arrays.copyOf(params, params.length));
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    @Override // t70.g
    public final String r(String key, String locale, Object... params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(params, "params");
        return v(B(key), locale, Arrays.copyOf(params, params.length));
    }

    @Override // t70.g
    public final String s(int i, int i2, Integer quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        try {
            String quantityString = this.f268394a.getResources().getQuantityString(i, u(quantity), Integer.valueOf(i2));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    public final String t(int i, String str, Object... objArr) {
        try {
            Context contextCreateConfigurationContext = this.f268394a;
            if (str != null) {
                Configuration configuration = new Configuration(contextCreateConfigurationContext.getResources().getConfiguration());
                configuration.setLocale(new Locale(str));
                contextCreateConfigurationContext = contextCreateConfigurationContext.createConfigurationContext(configuration);
            }
            Resources resources = contextCreateConfigurationContext.getResources();
            if (objArr.length == 0) {
                String string = resources.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            String string2 = resources.getString(i, Arrays.copyOf(objArr, objArr.length));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        } catch (Throwable th10) {
            if (i <= 0) {
                gom.c cVar = gom.e.f145194a;
                cVar.f("LocalizationImpl");
                cVar.e(new Throwable(a0.d.n("Wrong resource key provided: ", i), th10));
            } else {
                try {
                    x(A(i, ""), th10);
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                    gom.c cVar2 = gom.e.f145194a;
                    cVar2.f("LocalizationImpl");
                    cVar2.e(new Throwable(a0.d.n("Can't get resource name: ", i), th10));
                }
            }
            m70.a.c(t0.f186434a);
            return "";
        }
    }

    public final int u(Number quantity) {
        Double d;
        Locale locale = jh.d.e(this.f268394a);
        this.f268396c.getClass();
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        PluralRules pluralRulesForLocale = PluralRules.forLocale(locale, PluralRules.PluralType.CARDINAL);
        Collection<Double> samples = pluralRulesForLocale.getSamples(pluralRulesForLocale.select(quantity.doubleValue()));
        return (samples == null || (d = (Double) zhm.d0.c0(samples)) == null) ? quantity.intValue() : (int) d.doubleValue();
    }

    public final String v(int i, String str, Object... objArr) {
        if (i == 0) {
            m70.a.c(t0.f186434a);
            return "";
        }
        if (str != null) {
            return t(i, str, Arrays.copyOf(objArr, objArr.length));
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        s sVar = new s(i, objArrCopyOf);
        t tVar = this.e;
        String str2 = (String) tVar.c(sVar);
        if (str2 != null) {
            return str2;
        }
        String strT = t(i, null, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        tVar.d(sVar, strT);
        return strT;
    }

    public final e80.j w(int i, Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList(args.length);
        for (Object objHtmlEncode : args) {
            if (objHtmlEncode instanceof String) {
                objHtmlEncode = TextUtils.htmlEncode((String) objHtmlEncode);
            }
            arrayList.add(objHtmlEncode);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        String string = this.f268394a.getText(i).toString();
        Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
        String source = a0.d.v(objArrCopyOf, objArrCopyOf.length, string, "format(...)");
        this.f268395b.getClass();
        Intrinsics.checkNotNullParameter(source, "source");
        return new e80.j(m70.a.i(source));
    }

    public final int y(int i, bj0.b bVar) {
        String str;
        int i2 = l.f268393a[bVar.ordinal()];
        if (i2 == 1) {
            str = ".male";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = ".female";
        }
        int iZ = z(A(i, str));
        Integer numValueOf = Integer.valueOf(iZ);
        if (iZ == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i;
    }

    public final int z(String str) {
        f.a(str);
        h1 h1VarA = ((e) this.d).a();
        c cVar = c.PLURALS;
        h1VarA.a(str, cVar.a());
        h hVar = this.f268394a;
        return hVar.getResources().getIdentifier(str, cVar.a(), hVar.getPackageName());
    }
}
