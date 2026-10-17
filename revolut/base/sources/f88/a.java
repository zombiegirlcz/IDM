package f88;

import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.transfer.core.models.SourceAccount;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nel.s0;
import nel.w0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f132744b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f132743a = i;
        this.f132744b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Object next;
        switch (this.f132743a) {
            case 0:
                List pockets = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Iterator it8 = pockets.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (z92.f.l((io3.d) next).equals(z92.f.l(((p78.b) this.f132744b).f233572a))) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar = (io3.d) next;
                return dVar != null ? new SourceAccount.Pocket(dVar.f163145a, null, null, 6) : SourceAccount.Default.f92247a;
            default:
                w0 wealthInstrumentOnboardingDetails = (w0) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(wealthInstrumentOnboardingDetails, "wealthInstrumentOnboardingDetails");
                Intrinsics.checkNotNullParameter(wealthInstrumentOnboardingDetails, "<this>");
                return v.l(((wealthInstrumentOnboardingDetails instanceof s0) && wealthInstrumentOnboardingDetails.a()) ? (PlusActionNavBarMenuItem) this.f132744b.getValue() : null);
        }
    }
}
