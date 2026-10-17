package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class my0 {
    public static final String a(eb0 eb0Var) {
        Intrinsics.checkNotNullParameter(eb0Var, "<this>");
        return a(eb0Var.b(), "Set-Cookie");
    }

    private static final String b(String str) {
        String string = kotlin.text.d0.F0(str).toString();
        if (string.length() == 0) {
            return null;
        }
        boolean z = false;
        for (int i = 0; i < string.length(); i++) {
            char cCharAt = string.charAt(i);
            if (cCharAt == '\"') {
                z = !z;
            } else if (cCharAt == ';' && !z) {
                String strSubstring = string.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return kotlin.text.d0.F0(strSubstring).toString();
            }
        }
        return string;
    }

    public static final String a(Map map, String name) {
        Object next;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it8 = map.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (kotlin.text.a0.z((String) ((Map.Entry) next).getKey(), name, true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (String) entry.getValue();
        }
        return null;
    }

    public static final String a(String setCookieFieldValue) {
        int iS;
        Intrinsics.checkNotNullParameter(setCookieFieldValue, "setCookieFieldValue");
        String strB = b(setCookieFieldValue);
        if (strB == null || (iS = kotlin.text.d0.S(strB, '=', 0, 6)) <= 0 || iS == kotlin.text.d0.P(strB)) {
            return null;
        }
        return strB;
    }
}
