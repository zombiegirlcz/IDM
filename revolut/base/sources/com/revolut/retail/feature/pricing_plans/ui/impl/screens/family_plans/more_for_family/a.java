package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import aii.u;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$ClickParcel;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$JointSavingsAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsAccountAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$KidsSavingsAvailability;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.i implements Function1 {
    public b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoreForFamilyScreenContract$ClickParcel f103441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f103442x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MoreForFamilyScreenContract$ClickParcel moreForFamilyScreenContract$ClickParcel, b bVar, Continuation continuation) {
        super(1, continuation);
        this.f103441w = moreForFamilyScreenContract$ClickParcel;
        this.f103442x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f103441w, this.f103442x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        b bVar2;
        b bVar3;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i == 1) {
                bVar3 = this.u;
                o.b(obj2);
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return bVar3.A2(u0.b((NaviCommand) obj2));
            }
            if (i == 2) {
                bVar2 = this.u;
                o.b(obj2);
                return bVar2.A2((u) obj2);
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.u;
            o.b(obj2);
            return bVar.A2((u) obj2);
        }
        o.b(obj2);
        MoreForFamilyScreenContract$ClickParcel.JointAccounts jointAccounts = MoreForFamilyScreenContract$ClickParcel.JointAccounts.f103422a;
        MoreForFamilyScreenContract$ClickParcel moreForFamilyScreenContract$ClickParcel = this.f103441w;
        boolean zEquals = moreForFamilyScreenContract$ClickParcel.equals(jointAccounts);
        b bVar4 = this.f103442x;
        if (zEquals) {
            ufm.i iVarB = ((l48.e) bVar4.f103443l).b();
            this.u = bVar4;
            this.v = 1;
            obj2 = nim.a.b(iVarB, this);
            if (obj2 != aVar) {
                bVar3 = bVar4;
                Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
                return bVar3.A2(u0.b((NaviCommand) obj2));
            }
        } else if (moreForFamilyScreenContract$ClickParcel instanceof MoreForFamilyScreenContract$ClickParcel.JointSavings) {
            MoreForFamilyScreenContract$JointSavingsAvailability moreForFamilyScreenContract$JointSavingsAvailability = ((MoreForFamilyScreenContract$ClickParcel.JointSavings) moreForFamilyScreenContract$ClickParcel).f103423a;
            this.u = bVar4;
            this.v = 2;
            if (moreForFamilyScreenContract$JointSavingsAvailability instanceof MoreForFamilyScreenContract$JointSavingsAvailability.CreationAvailable) {
                obj2 = bVar4.b3(this);
            } else {
                bVar4.getClass();
                if (!(moreForFamilyScreenContract$JointSavingsAvailability instanceof MoreForFamilyScreenContract$JointSavingsAvailability.HasActiveAccounts)) {
                    if (Intrinsics.f(moreForFamilyScreenContract$JointSavingsAvailability, MoreForFamilyScreenContract$JointSavingsAvailability.NotAvailable.f103430a)) {
                        throw new IllegalStateException("NotAvailable state should not be reaching the code");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(((MoreForFamilyScreenContract$JointSavingsAvailability.HasActiveAccounts) moreForFamilyScreenContract$JointSavingsAvailability).f103429b, null), ProductId.SAVINGS), null), null, null, 12));
            }
            if (obj2 != aVar) {
                bVar2 = bVar4;
                return bVar2.A2((u) obj2);
            }
        } else {
            if (!(moreForFamilyScreenContract$ClickParcel instanceof MoreForFamilyScreenContract$ClickParcel.KidsAccount)) {
                if (!(moreForFamilyScreenContract$ClickParcel instanceof MoreForFamilyScreenContract$ClickParcel.KidsSavings)) {
                    throw new NoWhenBranchMatchedException();
                }
                MoreForFamilyScreenContract$KidsSavingsAvailability moreForFamilyScreenContract$KidsSavingsAvailability = ((MoreForFamilyScreenContract$ClickParcel.KidsSavings) moreForFamilyScreenContract$ClickParcel).f103425a;
                if (moreForFamilyScreenContract$KidsSavingsAvailability instanceof MoreForFamilyScreenContract$KidsSavingsAvailability.CreationAvailable) {
                    n.P2(bVar4, bVar4.o2(u68.c.f277503a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                } else {
                    if (!(moreForFamilyScreenContract$KidsSavingsAvailability instanceof MoreForFamilyScreenContract$KidsSavingsAvailability.HasActiveAccounts)) {
                        bVar4.getClass();
                        if (Intrinsics.f(moreForFamilyScreenContract$KidsSavingsAvailability, MoreForFamilyScreenContract$KidsSavingsAvailability.NotAvailable.f103440a)) {
                            throw new IllegalStateException("NotAvailable state should not be reaching the code");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    okk.b bVar5 = bVar4.f103445n;
                    String savingPocketId = ((MoreForFamilyScreenContract$KidsSavingsAvailability.HasActiveAccounts) moreForFamilyScreenContract$KidsSavingsAvailability).f103439c;
                    bVar5.getClass();
                    Intrinsics.checkNotNullParameter(savingPocketId, "savingPocketId");
                    bVar4.A2(new MainContainerScreenDestination.JustShow(new MainScreenTab(ibb.c.f160140a.f83420a), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(savingPocketId, null), ProductId.SAVINGS), null), (AccountCreationTransitionAnimation) null, 12));
                }
                return Unit.f186387a;
            }
            MoreForFamilyScreenContract$KidsAccountAvailability moreForFamilyScreenContract$KidsAccountAvailability = ((MoreForFamilyScreenContract$ClickParcel.KidsAccount) moreForFamilyScreenContract$ClickParcel).f103424a;
            this.u = bVar4;
            this.v = 3;
            okk.b bVar6 = bVar4.f103445n;
            if (moreForFamilyScreenContract$KidsAccountAvailability instanceof MoreForFamilyScreenContract$KidsAccountAvailability.ActiveAccounts) {
                obj2 = u68.b.c(bVar6.f226133a, ((MoreForFamilyScreenContract$KidsAccountAvailability.ActiveAccounts) moreForFamilyScreenContract$KidsAccountAvailability).f103432b, null, null, this, 14);
            } else {
                if (!Intrinsics.f(moreForFamilyScreenContract$KidsAccountAvailability, MoreForFamilyScreenContract$KidsAccountAvailability.CreationAvailable.f103433a)) {
                    if (Intrinsics.f(moreForFamilyScreenContract$KidsAccountAvailability, MoreForFamilyScreenContract$KidsAccountAvailability.NotAvailable.f103434a)) {
                        throw new IllegalStateException("NotAvailable state should not be reaching the code");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                bVar6.getClass();
                obj2 = new JuniorOnboardingDestination.Creation((mh8.h) null, 3);
            }
            if (obj2 != aVar) {
                bVar = bVar4;
                return bVar.A2((u) obj2);
            }
        }
        return aVar;
    }
}
