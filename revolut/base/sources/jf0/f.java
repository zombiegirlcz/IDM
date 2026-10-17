package jf0;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f173632a = new Regex("^http(s)?://(www\\.)?revolut\\.com");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f173633b = new Regex("^http(s)?://(www\\.)?revolut\\.(com|codes)");

    private f() {
    }

    public static String a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        od0.a aVar = od0.a.f224253a;
        return (od0.a.g() ? f173632a : f173633b).replace(url2, "revolut:/");
    }

    public static String b(String path) {
        Collection collectionV0;
        Intrinsics.checkNotNullParameter(path, "path");
        List listK = new Regex("/").k(path);
        if (listK.isEmpty()) {
            collectionV0 = f0.f322471a;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionV0 = d0.V0(listK, listIterator.nextIndex() + 1);
                    break;
                }
            }
            collectionV0 = f0.f322471a;
        }
        return c((String[]) collectionV0.toArray(new String[0]), 0);
    }

    public static String c(String[] strArr, int i) {
        int i2;
        if (strArr.length <= i) {
            return "";
        }
        String str = strArr[i];
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return kotlin.text.d0.W(lowerCase) ? c(strArr, i + 1) : (lowerCase.equals("rev-card") && (i2 = i + 2) < strArr.length && Intrinsics.f(strArr[i2], "limits")) ? com.google.android.gms.internal.mlkit_vision_face.a.o(j6.a.q("rev-card-limits/", strArr[i + 1]), "/", c(strArr, i + 3)) : (lowerCase.equals("waiting-list") && strArr.length == i + 3) ? j6.a.q("/waiting-list-friend/", strArr[i + 2]) : (lowerCase.equals("waiting-list") && strArr.length == i + 2) ? j6.a.q("/waiting-list-", strArr[i + 1]) : lowerCase.equals("waiting-list") ? "/waiting-list-me" : (lowerCase.equals("analytics") && strArr.length == i + 2) ? j6.a.q("/analytics-ccy/", strArr[i + 1]) : p.a.p("/", strArr[i], c(strArr, i + 1));
    }
}
