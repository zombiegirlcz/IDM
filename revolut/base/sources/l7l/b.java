package l7l;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f192707a = new Regex("[’‘]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f192708b = new Regex("^[\\p{L}\\p{M}\\-'`\\s]*$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f192709c;
    public final List d;
    public final List e;
    public final Set f;

    public static final class a {
        private a() {
        }
    }

    public b() {
        q qVar = q.IGNORE_CASE;
        this.f192709c = v.k(new Regex("^(.)\\1{2,}$", y0.b(qVar)), new Regex("^(Dr|Mr|Mrs|Miss|Ms|Prof)(?![\\p{L}\\p{M}\\p{N}_])(?!.*[\\p{L}\\p{M}\\p{N}_])", y0.b(qVar)));
        this.d = u.c(new Regex("^(.)\\1{0,}$", y0.b(qVar)));
        this.e = v.k(new Regex("^(.)\\1{0,}$", y0.b(qVar)), new Regex("^(?!(.*[aeiouAEIOU]){2,})(?!.*[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]{9,})[A-Za-z ]{6,}$", y0.b(qVar)));
        String[] elements = {"an other", "my customer", "my wallet", "btc btc", "eth eth", "unknown payer", "unknown", "not provided"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f = d.y0(elements);
    }

    public static boolean a(int i, String str) {
        if (str.length() > i) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.ROOT);
            characterInstance.setText(str);
            int i2 = 0;
            while (characterInstance.next() != -1) {
                i2++;
            }
            if (i2 > i) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strReplace = this.f192707a.replace(d0.F0(name).toString(), "'");
        if (strReplace.length() == 0) {
            return false;
        }
        String lowerCase = strReplace.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (this.f.contains(lowerCase) || strReplace.codePoints().noneMatch(new l7l.a())) {
            return false;
        }
        if (z) {
            if (a(80, strReplace)) {
                return false;
            }
        } else if (a(40, strReplace) || !this.f192708b.f(strReplace)) {
            return false;
        }
        List list = z ? this.d : this.f192709c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Regex) obj2).a(strReplace)) {
                arrayList.add(obj2);
            }
        }
        return arrayList.isEmpty();
    }

    public final boolean c(String fullName) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        String strReplace = this.f192707a.replace(d0.F0(fullName).toString(), "'");
        if (strReplace.length() == 0) {
            return false;
        }
        List list = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Regex) obj2).a(strReplace)) {
                arrayList.add(obj2);
            }
        }
        String lowerCase = strReplace.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return arrayList.isEmpty() && !this.f.contains(lowerCase);
    }
}
