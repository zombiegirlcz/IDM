package pjl;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();
    public static final List e = zhm.v.k("com.revolut.invest", "com.revolut.revolutx", "com.revolut.business");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f236797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pn0.b f236798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f236799c;
    public volatile String d;

    public c(Context context, pn0.b revolutAppSignatureTrustedVerifier) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revolutAppSignatureTrustedVerifier, "revolutAppSignatureTrustedVerifier");
        this.f236797a = context;
        this.f236798b = revolutAppSignatureTrustedVerifier;
        this.f236799c = yhm.j.b(new ite.d(this, 24));
    }

    @Override // pjl.a
    public final Unit a(Account account, String str, String str2) {
        Uri uriI = i("1/tokens");
        if (uriI == null) {
            return Unit.f186387a;
        }
        j().insert(uriI, new t(account, str, str2).a());
        return Unit.f186387a;
    }

    @Override // pjl.a
    public final String b(Account account, String str) {
        List listA;
        Pair pair;
        Uri uriI = i("1/userData");
        if (uriI == null) {
            return null;
        }
        Cursor cursorQuery = j().query(uriI, new b0(zhm.u.c(str)).a(), new d0(account).a(), null, null);
        if (cursorQuery == null) {
            return null;
        }
        g0.Companion.getClass();
        g0 g0VarA = f0.a(cursorQuery);
        if (g0VarA == null || (listA = g0VarA.a()) == null || (pair = (Pair) zhm.d0.d0(listA)) == null) {
            return null;
        }
        return (String) pair.f186386b;
    }

    @Override // pjl.a
    public final Object c(String str) {
        List listA;
        Account[] accountArr;
        Uri uriI = i("accounts");
        if (uriI == null) {
            return new Account[0];
        }
        Cursor cursorQuery = j().query(uriI, null, null, new o(str).a(), null);
        if (cursorQuery == null) {
            return new Account[0];
        }
        r.Companion.getClass();
        r rVarA = q.a(cursorQuery);
        return (rVarA == null || (listA = rVarA.a()) == null || (accountArr = (Account[]) listA.toArray(new Account[0])) == null) ? new Account[0] : accountArr;
    }

    @Override // pjl.a
    public final Unit d(Account account, Bundle bundle) {
        Uri uriI = i("accounts");
        if (uriI == null) {
            return Unit.f186387a;
        }
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        for (String str : set) {
            String string = bundle.getString(str);
            if (string == null) {
                throw new IllegalArgumentException(p.a.p("Expected string value for ", str, " key").toString());
            }
            arrayList.add(new Pair(str, string));
        }
        j().insert(uriI, new m(account, arrayList).a());
        return Unit.f186387a;
    }

    @Override // pjl.a
    public final Object e(Account account, String str, s0 s0Var) {
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, new oqk.i(this, account, str, null, 22), s0Var);
    }

    @Override // pjl.a
    public final Unit f(Account account) {
        Uri uriI = i("accounts");
        if (uriI == null) {
            return Unit.f186387a;
        }
        j().delete(uriI, null, new k(account).a());
        return Unit.f186387a;
    }

    @Override // pjl.a
    public final Unit g(Account account, String str, String str2) {
        Uri uriI = i("1/userData");
        if (uriI == null) {
            return Unit.f186387a;
        }
        j().insert(uriI, new m(account, zhm.u.c(new Pair(str, str2))).a());
        return Unit.f186387a;
    }

    public final boolean h(String str) {
        ProviderInfo providerInfoResolveContentProvider = this.f236797a.getPackageManager().resolveContentProvider(a0.d.r(str, ".sso.provider"), 8);
        if (providerInfoResolveContentProvider == null) {
            String strP = p.a.p("Can't find content provider info for authority by ", str, " package name");
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "Revolut SSO", strP, null, null, 16);
            return false;
        }
        String packageName = providerInfoResolveContentProvider.packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        if (this.f236798b.a(packageName)) {
            return true;
        }
        String strP2 = p.a.p("Content provider is owned by not trusted ", providerInfoResolveContentProvider.packageName, " app");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "Revolut SSO", strP2, null, h0Var);
        return false;
    }

    public final Uri i(String str) {
        Object next;
        String str2 = this.d;
        if (str2 == null) {
            String packageName = this.f236797a.getPackageName();
            if (Intrinsics.f(packageName, "com.revolut.revolut")) {
                Iterator it8 = e.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (h((String) next)) {
                        break;
                    }
                }
                String str3 = (String) next;
                if (str3 == null) {
                    String strQ = j6.a.q("No suitable content resolver to use for a fallback in ", packageName);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", strQ, null, h0Var);
                    str2 = null;
                    this.d = str2;
                } else {
                    str2 = str3;
                    this.d = str2;
                }
            } else {
                String str4 = h("com.revolut.revolut") ? "com.revolut.revolut" : null;
                if (str4 == null) {
                    String strQ2 = j6.a.q("No suitable content resolver to use for a fallback in ", packageName);
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", strQ2, null, h0Var2);
                    str2 = null;
                    this.d = str2;
                } else {
                    str2 = str4;
                    this.d = str2;
                }
            }
        }
        if (str2 == null) {
            return null;
        }
        return new Uri.Builder().scheme("content").authority(str2.concat(".sso.provider")).path(str).build();
    }

    public final ContentResolver j() {
        Object value = this.f236799c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ContentResolver) value;
    }
}
