package lz3;

import com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import hs3.v;
import hs3.y;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f200922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wie.a f200923b;

    public g(w revolutJobInteractor, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f200922a = revolutJobInteractor;
        this.f200923b = creditAccountDestinationResolver;
    }

    @Override // lz3.a
    public final Object a(it3.d dVar, Continuation continuation) {
        Object obj2;
        Object next;
        String str;
        Object obj3 = dVar.e;
        if (!(obj3 instanceof y)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof y) {
                        break;
                    }
                }
                obj2 = (v) next;
            } else {
                obj2 = null;
            }
        } else {
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.ExitMetadata");
            }
            obj2 = (y) obj3;
        }
        y yVar = (y) obj2;
        if (yVar == null || (str = yVar.f154971a) == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "FamilyCreditCardExitDelegate", "facilityId is null after finishing the application", null, null, 16);
            return null;
        }
        ((nzl.a) this.f200922a).d(5L, str);
        return ((cge.e) this.f200923b.f297885b).a(wie.a.d(new CreditAccountType.CreditCard(str)), dVar.f168334r != it3.k.INVITATION ? new TabAccountsInitialPayload.Action(u0.f(new AdditionalCardsDestination(str, null))) : null, (gim.c) continuation);
    }
}
