package quc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.security_hub.impl.ui.learn_about_security.LearnAboutSecurityScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u09.v;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LearnAboutSecurityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LearnAboutSecurityScreen learnAboutSecurityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = learnAboutSecurityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.P.getValue();
        String listId = model.f53228a;
        g gVar = (g) dVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -2030750236:
                if (listId.equals("FAQ_LOST_PHONE_ITEM_ID")) {
                    gVar.I2("question.my-phone-has-been-lost-or-stolen");
                }
                break;
            case 297400031:
                if (listId.equals("LEARN_ABOUT_FRAUD_ITEM_ID")) {
                    od0.a aVar2 = od0.a.f224253a;
                    gVar.C1(new LearnKompotFeatureConfig.CourseOverview.Destination(od0.a.g() ? "protecting_yourself_impersonation_scams-c3c" : "pd_31_01_23_-9f1", v.FRAUD, null, null));
                }
                break;
            case 383743996:
                if (listId.equals("FAQ_PREVENT_FRAUD_ITEM_ID")) {
                    gVar.I2("question.how-can-i-prevent-fraud");
                }
                break;
            case 863962606:
                if (listId.equals("FAQ_REVOLUT_PROTECT_ITEM_ID")) {
                    gVar.I2("question.how-does-revolut-protect-me-against-fraud");
                }
                break;
        }
        return Unit.f186387a;
    }
}
