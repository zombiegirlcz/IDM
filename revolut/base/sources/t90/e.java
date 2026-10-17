package t90;

import com.revolut.feature.backend_flow.domain.models.BackendFlowIcon;
import java.util.Map;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import nkm.y;
import q90.o;
import t73.y2;
import xl2.m;

/* JADX INFO: loaded from: classes19.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f268937a = yhm.j.b(new t73.h(15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f268938b = yhm.j.b(new t73.h(16));

    public static final BackendFlowIcon a(o oVar, m mVar) throws Throwable {
        String strD;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        if (oVar.getCountryCode() != null) {
            return new BackendFlowIcon.Country(oVar.getCountryCode());
        }
        String strO = null;
        if (oVar.getName() == null) {
            hx7.e.n(new IllegalStateException("Either icon name or countryCode must be present"));
            return new BackendFlowIcon.Default(null, "IGNORED");
        }
        String name = oVar.getName();
        String str = (String) ((Map) f268938b.getValue()).get(name);
        if (str != null) {
            strD = (mVar == null ? -1 : d.f268936a[mVar.ordinal()]) == 1 ? a0.D(str, "ICON_SIZE_PREFIX_PLACEHOLDER", "16", false) : a0.D(str, "ICON_SIZE_PREFIX_PLACEHOLDER", "24", false);
        } else {
            strD = null;
        }
        if (strD == null) {
            String strU = y.u(y.x(Regex.c((Regex) f268937a.getValue(), name), new y2(25)), "_", new y2(26), 30);
            if (d0.W(strU)) {
                strU = null;
            }
            if (strU != null) {
                strO = com.google.android.gms.internal.mlkit_vision_face.a.o((mVar != null ? d.f268936a[mVar.ordinal()] : -1) == 1 ? "16" : "24", "_", strU);
            }
        } else {
            strO = strD;
        }
        return new BackendFlowIcon.Default(strO, oVar.getName());
    }

    public static final o b(BackendFlowIcon backendFlowIcon) {
        Intrinsics.checkNotNullParameter(backendFlowIcon, "<this>");
        if (backendFlowIcon instanceof BackendFlowIcon.Default) {
            return new o(((BackendFlowIcon.Default) backendFlowIcon).f63284b, null);
        }
        if (backendFlowIcon instanceof BackendFlowIcon.Country) {
            return new o(null, ((BackendFlowIcon.Country) backendFlowIcon).f63282a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
