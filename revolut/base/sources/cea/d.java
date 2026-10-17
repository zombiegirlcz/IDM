package cea;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String strH;
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) obj2;
        k kVar = (k) this.receiver;
        KProperty[] kPropertyArr = LinkedAccountDetailsScreen.V;
        com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) kVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53337a, "LIST_ID_SHARE_BTN")) {
            f domainState = (f) ((j2) aVar.I.f22677a).getValue();
            z zVar = aVar.f80816p;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            dda.d dVar = (dda.d) domainState.f23443b.getContent();
            if (dVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Account details content should be present once details share requested");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                strH = null;
            } else {
                strH = zVar.f23468b.h(dVar, domainState.f23442a.f163147c);
            }
            if (strH == null) {
                r6.b.D("Account details should present once share button is clicked");
            } else {
                aVar.C2(new h(((s70.b) aVar.E).f("", strH, null)));
            }
        }
        return Unit.f186387a;
    }
}
