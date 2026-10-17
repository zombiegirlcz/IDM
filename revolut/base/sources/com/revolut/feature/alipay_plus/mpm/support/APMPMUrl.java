package com.revolut.feature.alipay_plus.mpm.support;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import t61.a;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMUrl;", "", "<init>", "()V", "hasScheme", "", "value", "", "normalizedAbsoluteUrl", "queryParameter", "url", "key", "forceHttps", "decode", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMUrl {

    @NotNull
    public static final APMPMUrl INSTANCE = new APMPMUrl();

    private APMPMUrl() {
    }

    private final String decode(String value) throws UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(value, StandardCharsets.UTF_8.name());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return strDecode;
    }

    public final String forceHttps(@NotNull String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        if (!a0.H(url2, "http://", true)) {
            return null;
        }
        String strSubstring = url2.substring(7);
        return a.p(strSubstring, "substring(...)", "https://", strSubstring);
    }

    public final boolean hasScheme(@NotNull String value) {
        Object objA;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            m.Companion companion = m.INSTANCE;
            objA = Boolean.valueOf(new URI(value).getScheme() != null);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Object obj2 = Boolean.FALSE;
        if (objA instanceof n) {
            objA = obj2;
        }
        return ((Boolean) objA).booleanValue();
    }

    public final String normalizedAbsoluteUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String string = d0.F0(value).toString();
        if (string.length() != 0 && hasScheme(string)) {
            return string;
        }
        return null;
    }

    public final String queryParameter(@NotNull String url2, @NotNull String key) throws UnsupportedEncodingException {
        Object objA;
        Object next;
        String str;
        Pair pair;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            m.Companion companion = m.INSTANCE;
            objA = new URI(url2).getRawQuery();
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        String str2 = (String) objA;
        if (str2 == null) {
            return null;
        }
        List<String> listN0 = d0.n0(str2, new String[]{"&"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (String str3 : listN0) {
            int iT = d0.T(str3, "=", 0, false, 6);
            if (iT < 0) {
                pair = null;
            } else {
                APMPMUrl aPMPMUrl = INSTANCE;
                String strSubstring = str3.substring(0, iT);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strDecode = aPMPMUrl.decode(strSubstring);
                String strSubstring2 = str3.substring(iT + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                pair = new Pair(strDecode, aPMPMUrl.decode(strSubstring2));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((Pair) next).f186385a, key)) {
                break;
            }
        }
        Pair pair2 = (Pair) next;
        if (pair2 == null || (str = (String) pair2.f186386b) == null || d0.W(str)) {
            return null;
        }
        return str;
    }
}
