package w98;

import com.revolut.feature.junior.isa.impl.navigation.JuniorIsaInternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import xii.b;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    @NotNull
    public static final C1632a Companion = new C1632a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f295695a = y0.b("youth/trading/beneficiary/details?beneficiaryId={beneficiaryId}");

    /* JADX INFO: renamed from: w98.a$a, reason: collision with other inner class name */
    public static final class C1632a {
        private C1632a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f295695a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("beneficiaryId", deeplink.f195041c);
        if (strA != null && strA.length() != 0) {
            return new JuniorIsaInternalDestination.JISADetailsFlowDestination(strA);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("beneficiaryId is null or empty cannot navigate to jisa details screen.");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }
}
