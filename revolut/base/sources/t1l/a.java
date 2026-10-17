package t1l;

import a2l.o;
import a2l.p;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import s1l.c0;
import s1l.j0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final o a(j0 j0Var) {
        p pVar;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        String str = j0Var.f259182a;
        String str2 = j0Var.f259183b;
        p[] pVarArrValues = p.values();
        int length = pVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pVar = null;
                break;
            }
            pVar = pVarArrValues[i];
            if (a0.z(pVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (pVar == null) {
            pVar = p.UNKNOWN;
        }
        return new o(str, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a2l.y b(s1l.z0 r33) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1l.a.b(s1l.z0):a2l.y");
    }

    public static final TravelStatusLinkAccountInfo.LinkAccountButton c(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        String str = c0Var.f259162a;
        String str2 = c0Var.f259163b;
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (!Intrinsics.f(upperCase, "URL")) {
            if (Intrinsics.f(upperCase, "API")) {
                return new TravelStatusLinkAccountInfo.LinkAccountButton(str2, TravelStatusLinkAccountInfo.LinkAccountAction.Api.f104298a);
            }
            return null;
        }
        String str3 = c0Var.f259164c;
        if (str3 != null) {
            if (d0.W(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                return new TravelStatusLinkAccountInfo.LinkAccountButton(str2, new TravelStatusLinkAccountInfo.LinkAccountAction.Url(str3));
            }
        }
        return null;
    }

    public static final c0 d(TravelStatusLinkAccountInfo.LinkAccountButton linkAccountButton) {
        Intrinsics.checkNotNullParameter(linkAccountButton, "<this>");
        TravelStatusLinkAccountInfo.LinkAccountAction linkAccountAction = linkAccountButton.f104301b;
        String str = linkAccountButton.f104300a;
        if (linkAccountAction instanceof TravelStatusLinkAccountInfo.LinkAccountAction.Url) {
            return new c0("URL", str, ((TravelStatusLinkAccountInfo.LinkAccountAction.Url) linkAccountAction).f104299a);
        }
        if (Intrinsics.f(linkAccountAction, TravelStatusLinkAccountInfo.LinkAccountAction.Api.f104298a)) {
            return new c0("API", str, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
