package i4k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import ip0.kr;
import ip0.lr;
import ip0.mr;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f158534a = w.y0(new hzl.a(23));

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    public static final String a(InputTextDelegate.Model input, String str) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (str != null) {
            try {
                mr mrVar = input.u;
                if (!Intrinsics.f(mrVar, kr.f165065a)) {
                    if (!(mrVar instanceof lr)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((lr) mrVar).f165251a == 2) {
                        Regex regex = (Regex) f158534a.getValue();
                        t0 t0Var = t0.f186434a;
                        m70.a.c(t0Var);
                        String strReplace = regex.replace(str, "");
                        if (strReplace.length() <= 0) {
                            strReplace = null;
                        }
                        if (strReplace != null) {
                            char[] charArray = "1234567890".concat(strReplace).toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                            List listJ = kotlin.collections.d.J(charArray);
                            Intrinsics.checkNotNullParameter(t0Var, "<this>");
                            String strK0 = d0.k0(listJ, "", null, null, 0, null, 62);
                            if (strK0 != null) {
                                return strK0;
                            }
                        }
                        return "1234567890";
                    }
                }
            } catch (PatternSyntaxException e) {
                gom.e.f145194a.e(e, "Can't parse pattern", new Object[0]);
                return null;
            }
        }
        return null;
    }
}
