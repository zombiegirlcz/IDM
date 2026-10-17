package cie;

import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.r f24527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f24528b;

    public w(mp.r productIntroInteractor, c0 accountsProductIntroProvider) {
        Intrinsics.checkNotNullParameter(productIntroInteractor, "productIntroInteractor");
        Intrinsics.checkNotNullParameter(accountsProductIntroProvider, "accountsProductIntroProvider");
        this.f24527a = productIntroInteractor;
        this.f24528b = accountsProductIntroProvider;
    }

    public final boolean a(ProductAccountDescriptor$Value productAccountDescriptor$Value, AccountWidgetItemModel.EmptyStateStories emptyStateStories) {
        boolean zH;
        if (productAccountDescriptor$Value != null) {
            if (emptyStateStories != null && !emptyStateStories.equals(AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a)) {
                if (emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.DelayedStories) {
                    return false;
                }
                AccountWidgetItemModel.EmptyStateStories.V2 v2 = emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.V2 ? (AccountWidgetItemModel.EmptyStateStories.V2) emptyStateStories : null;
                ola.c cVar = v2 != null ? v2.f89494b : null;
                mp.r rVar = this.f24527a;
                if (cVar != null) {
                    zH = rVar.h(cVar);
                } else {
                    boolean z = emptyStateStories instanceof AccountWidgetItemModel.EmptyStateStories.Sequence;
                    c0 c0Var = this.f24528b;
                    if (z) {
                        ArrayList arrayList = ((AccountWidgetItemModel.EmptyStateStories.Sequence) emptyStateStories).f89490a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            ola.c cVarB = ((AccountWidgetItemModel.EmptyStateStories.V2) it8.next()).f89494b;
                            if (cVarB == null) {
                                cVarB = c0Var.b(productAccountDescriptor$Value);
                            }
                            if (cVarB != null) {
                                arrayList2.add(cVarB);
                            }
                        }
                        List list = (List) ue0.e.M(arrayList2);
                        if (list != null) {
                            List list2 = list;
                            if (!list2.isEmpty()) {
                                Iterator it9 = list2.iterator();
                                while (it9.hasNext()) {
                                    if (rVar.h((ola.c) it9.next())) {
                                    }
                                }
                            }
                        }
                    } else {
                        ola.c cVarB2 = c0Var.b(productAccountDescriptor$Value);
                        if (cVarB2 != null && !Intrinsics.f(productAccountDescriptor$Value.getF89728b().f89729a, "JOINT_PENDING_INVITATION_PRODUCT_ID")) {
                            zH = rVar.h(cVarB2);
                        }
                    }
                }
                return !zH;
            }
            return true;
        }
        return false;
    }
}
