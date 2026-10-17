package cie;

import aw0.e8;
import aw0.f8;
import aw0.h8;
import aw0.i8;
import aw0.v7;
import aw0.x7;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f24455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f24456b;

    public c0(kla.a introToggleResolver, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(introToggleResolver, "introToggleResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f24455a = featureToggleInteractor;
        this.f24456b = yhm.j.b(new bvb.a(this, 18));
    }

    public final ola.c a() {
        return ((Boolean) this.f24456b.getValue()).booleanValue() ? ola.c.CURRENCY_WITH_CONTENT_BG : ola.c.CURRENCY;
    }

    public final ola.c b(nie.c descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        switch (b0.f24453a[descriptor.getF89727a().ordinal()]) {
            case 1:
                return a();
            case 2:
                return ola.c.JUNIOR;
            case 3:
                return ola.c.SAVINGS;
            case 4:
                return ola.c.LINKED;
            case 5:
                return ola.c.JOINT;
            case 6:
                return ola.c.PRO;
            case 7:
                ProductAccountId.Payload payload = descriptor.getF89728b().f89730b;
                if (!(payload instanceof CreditAccountType.EmptyState)) {
                    if (payload instanceof CreditAccountType.CreditCard) {
                        return ola.c.CREDIT_CARD;
                    }
                    if (payload instanceof CreditAccountType.Loan) {
                        return ola.c.LOAN;
                    }
                    return null;
                }
                ft3.q0 q0Var = ((CreditAccountType.EmptyState) payload).f70627b;
                if (q0Var instanceof ft3.w) {
                    return ola.c.LOAN;
                }
                if (q0Var instanceof ft3.g) {
                    return ola.c.CREDIT_CARD;
                }
                return null;
            case 8:
                ProductAccountId.Payload payload2 = descriptor.getF89728b().f89730b;
                if ((payload2 instanceof ExtendedSubaccountType.Group) || (payload2 instanceof ExtendedSubaccountType.Personal)) {
                    return ola.c.POCKETS;
                }
                return null;
            default:
                return null;
        }
    }

    public final i8 c(ProductAccountDescriptor$Value.Main productAccountDescriptor, AccountWidgetItemModel.EmptyStateStories emptyStateStories) {
        Intrinsics.checkNotNullParameter(productAccountDescriptor, "productAccountDescriptor");
        Intrinsics.checkNotNullParameter(emptyStateStories, "emptyStateStories");
        ola.c cVarB = b(productAccountDescriptor);
        if (cVarB == null) {
            return new e8(true);
        }
        if (Intrinsics.f(emptyStateStories, AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a)) {
            e8.Companion.getClass();
            return new e8(false);
        }
        if (emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.NotApplicable) {
            return new e8(true);
        }
        if (emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.V1) {
            List list = ((AccountWidgetItemModel.EmptyStateStories.V1) emptyStateStories).f89492a;
            return !list.isEmpty() ? new v7(list, cVarB) : new e8(true);
        }
        if (emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.V2) {
            AccountWidgetItemModel.EmptyStateStories.V2 v2 = (AccountWidgetItemModel.EmptyStateStories.V2) emptyStateStories;
            List list2 = v2.f89493a;
            if (list2.isEmpty()) {
                return new e8(true);
            }
            ola.c cVar = v2.f89494b;
            if (cVar != null) {
                cVarB = cVar;
            }
            return new x7(cVarB, list2);
        }
        if (!(emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.Sequence)) {
            throw new NoWhenBranchMatchedException();
        }
        AccountWidgetItemModel.EmptyStateStories.Sequence sequence = (AccountWidgetItemModel.EmptyStateStories.Sequence) emptyStateStories;
        ArrayList<AccountWidgetItemModel.EmptyStateStories.V2> arrayList = sequence.f89490a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (AccountWidgetItemModel.EmptyStateStories.V2 v22 : arrayList) {
            ola.c cVar2 = v22.f89494b;
            if (cVar2 == null) {
                cVar2 = cVarB;
            }
            arrayList2.add(new x7(cVar2, v22.f89493a));
        }
        return new h8(arrayList2, new f8(sequence.f89491b));
    }
}
