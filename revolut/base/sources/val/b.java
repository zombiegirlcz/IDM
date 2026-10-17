package val;

import android.net.Uri;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogLink;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ActionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionsScreen actionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = actionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListCellDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListCellDelegate.Model model = (ListCellDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Z.getValue();
        Object obj3 = model.f52696g;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogLink");
        SuspiciousTransactionDialogLink link = (SuspiciousTransactionDialogLink) obj3;
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        hVar.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(link.f104977c), 0, null, 494));
        return Unit.f186387a;
    }
}
