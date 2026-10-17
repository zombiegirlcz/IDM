package ay0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.views.scrolling.HideOnScrollViewBehavior;
import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$DomainState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f11002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f11003c;

    public /* synthetic */ b(Ref$ObjectRef ref$ObjectRef, HideOnScrollViewBehavior hideOnScrollViewBehavior, Ref$ObjectRef ref$ObjectRef2) {
        this.f11001a = 0;
        this.f11002b = ref$ObjectRef;
        this.f11003c = ref$ObjectRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f11001a) {
            case 0:
                View view = (View) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                boolean z = view instanceof AppBarLayout;
                Ref$ObjectRef ref$ObjectRef = this.f11002b;
                Ref$ObjectRef ref$ObjectRef2 = this.f11003c;
                boolean z3 = false;
                if (z) {
                    ref$ObjectRef.f186409a = view;
                } else if (view instanceof RecyclerView) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof AppBarLayout.ScrollingViewBehavior)) {
                        ref$ObjectRef2.f186409a = view;
                    }
                } else if (view instanceof ViewGroup) {
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams2).getBehavior() instanceof AppBarLayout.ScrollingViewBehavior)) {
                        View childAt = ((ViewGroup) view).getChildAt(0);
                        if (childAt instanceof RecyclerView) {
                            ref$ObjectRef2.f186409a = childAt;
                        }
                    }
                }
                if (ref$ObjectRef.f186409a != null && ref$ObjectRef2.f186409a != null) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 1:
                sq5.c cVar = (sq5.c) obj2;
                List list = (List) this.f11002b.f186409a;
                if (list == null) {
                    list = f0.f322471a;
                }
                List list2 = list;
                List list3 = (List) this.f11003c.f186409a;
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                return sq5.c.a(cVar, null, list2, list3, null, false, null, null, 121);
            default:
                CryptoDirectDepositFlowContract$DomainState update = (CryptoDirectDepositFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                MeshEvent.TransferCompleted transferCompleted = (MeshEvent.TransferCompleted) this.f11002b.f186409a;
                MeshEvent.IntegrationConnected integrationConnected = (MeshEvent.IntegrationConnected) this.f11003c.f186409a;
                update.getClass();
                return new CryptoDirectDepositFlowContract$DomainState(transferCompleted, integrationConnected);
        }
    }

    public /* synthetic */ b(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, int i) {
        this.f11001a = i;
        this.f11002b = ref$ObjectRef;
        this.f11003c = ref$ObjectRef2;
    }
}
