package ulm;

import ch.qos.logback.core.CoreConstants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f281164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f281165c;
    public final String d;
    public final int e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f281166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f281167h;
    public final String i;

    public x0(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f281163a = str;
        this.f281164b = str2;
        this.f281165c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.f281166g = arrayList2;
        this.f281167h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.f281165c.length() == 0) {
            return "";
        }
        int length = this.f281163a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(kotlin.text.d0.S(str, CoreConstants.COLON_CHAR, length, 4) + 1, kotlin.text.d0.S(str, '@', 0, 6));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f281163a.length() + 3;
        String str = this.i;
        int iS = kotlin.text.d0.S(str, '/', length, 4);
        String strSubstring = str.substring(iS, vlm.h.j(iS, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f281163a.length() + 3;
        String str = this.i;
        int iS = kotlin.text.d0.S(str, '/', length, 4);
        int iJ = vlm.h.j(iS, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iS < iJ) {
            int i = iS + 1;
            int iK = vlm.h.k(str, '/', i, iJ);
            String strSubstring = str.substring(i, iK);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iS = iK;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f281166g == null) {
            return null;
        }
        String str = this.i;
        int iS = kotlin.text.d0.S(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iS, vlm.h.k(str, '#', iS, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f281164b.length() == 0) {
            return "";
        }
        int length = this.f281163a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, vlm.h.j(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof x0) && Intrinsics.f(((x0) obj2).i, this.i);
    }

    public final boolean f() {
        return Intrinsics.f(this.f281163a, "https");
    }

    public final v0 g() {
        String strA;
        v0 v0Var = new v0();
        String str = this.f281163a;
        v0Var.f281156a = str;
        String strE = e();
        Intrinsics.checkNotNullParameter(strE, "<set-?>");
        v0Var.f281157b = strE;
        String strA2 = a();
        Intrinsics.checkNotNullParameter(strA2, "<set-?>");
        v0Var.f281158c = strA2;
        v0Var.d = this.d;
        Companion.getClass();
        int iB = w0.b(str);
        int i = this.e;
        if (i == iB) {
            i = -1;
        }
        v0Var.e = i;
        ArrayList arrayList = v0Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        v0Var.f281159g = (strD == null || (strA = jmm.a.a(strD, 0, true, " \"'<>#", 0, 83)) == null) ? null : v0.i(strA);
        if (this.f281167h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(kotlin.text.d0.S(str2, '#', 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        v0Var.f281160h = strSubstring;
        return v0Var;
    }

    public final v0 h(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            v0 v0Var = new v0();
            v0Var.d(this, link);
            return v0Var;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        v0 v0VarH = h("/...");
        Intrinsics.h(v0VarH);
        Intrinsics.checkNotNullParameter("", "username");
        v0VarH.f281157b = jmm.a.a("", 0, false, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
        Intrinsics.checkNotNullParameter("", "password");
        v0VarH.f281158c = jmm.a.a("", 0, false, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
        return v0VarH.b().i;
    }

    public final URI j() {
        v0 v0VarG = g();
        ArrayList arrayList = v0VarG.f;
        String str = v0VarG.d;
        v0VarG.d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, jmm.a.a((String) arrayList.get(i), 0, true, "[]", 0, 99));
        }
        ArrayList arrayList2 = v0VarG.f281159g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? jmm.a.a(str2, 0, true, "\\^`{|}", 0, 67) : null);
            }
        }
        String str3 = v0VarG.f281160h;
        v0VarG.f281160h = str3 != null ? jmm.a.a(str3, 0, true, " \"#<>\\^`{|}", 0, 35) : null;
        String string = v0VarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.h(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL k() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        return this.i;
    }
}
