package com.fourthline.core.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public final class p extends b {
    private static final a d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26373c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String mrzString) {
        super(mrzString);
        Intrinsics.checkNotNullParameter(mrzString, "mrzString");
        this.f26373c = mrzString;
    }

    private final List e(String str) {
        List listD = d(str);
        if (listD.size() <= 1) {
            int length = str.length();
            if (length == 72) {
                return kotlin.text.f0.M0(36, str);
            }
            if (length == 88) {
                return kotlin.text.f0.M0(44, str);
            }
            if (length == 90) {
                return kotlin.text.f0.M0(30, str);
            }
        }
        return listD;
    }

    @Override // com.fourthline.core.internal.b
    public String a() {
        return this.f26373c;
    }

    @Override // com.fourthline.core.internal.b
    public boolean b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        List<String> listE = e(str);
        boolean z = listE instanceof Collection;
        if (!z || !listE.isEmpty()) {
            Iterator it8 = listE.iterator();
            while (it8.hasNext()) {
                if (((String) it8.next()).length() != ((String) zhm.d0.b0(listE)).length()) {
                    return false;
                }
            }
        }
        if (z && listE.isEmpty()) {
            return true;
        }
        for (String str2 : listE) {
            if (str2.length() != 30 && str2.length() != 36 && str2.length() != 44) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fourthline.core.internal.b
    public boolean c(String str) {
        int size;
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() != 0 && 2 <= (size = e(str).size()) && size < 4;
    }

    @Override // com.fourthline.core.internal.b
    public boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex("([A-Z0-9<!|bi])+").f(kotlin.text.a0.D(str, "\n", "", false));
    }
}
