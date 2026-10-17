package bp0;

import com.revolut.core.ui_kit.models.NameClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class g {
    public static String a(NameClause clause) {
        String strConcat;
        Intrinsics.checkNotNullParameter(clause, "clause");
        NameClause.Format format = clause.e;
        String str = clause.f57836b;
        String str2 = clause.f57835a;
        if (!Intrinsics.f(format, NameClause.Format.Full.f57838a)) {
            if (Intrinsics.f(format, NameClause.Format.Short.f57839a)) {
                return (str == null || d0.W(str)) ? b(str2, true) : a0.d.r(b(str2, false), str);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str3 = null;
        if (str != null) {
            m70.a.t(t0.f186434a);
            strConcat = " ".concat(str);
        } else {
            strConcat = null;
        }
        if (strConcat != null && !d0.W(strConcat)) {
            str3 = strConcat;
        }
        if (str3 == null) {
            str3 = "";
        }
        return a0.d.r(str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Character] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    public static String b(String str, boolean z) {
        m70.a.t(t0.f186434a);
        List listN0 = d0.n0(str, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listN0) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        String str2 = "";
        if (arrayList.isEmpty()) {
            m70.a.c(t0.f186434a);
            return "";
        }
        int i = 0;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (Object obj3 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ?? ValueOf = (String) obj3;
            if (!z || i != arrayList.size() - 1) {
                ValueOf = Character.valueOf(f0.P0(ValueOf));
            }
            arrayList2.add(ValueOf);
            i = i2;
        }
        if (z) {
            m70.a.c(t0.f186434a);
        } else {
            str2 = ". ";
        }
        return zhm.d0.k0(arrayList2, ". ", null, str2, 0, null, 58);
    }
}
