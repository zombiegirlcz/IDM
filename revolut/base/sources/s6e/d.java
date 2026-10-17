package s6e;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements g6e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bn2.p f260270a;

    public d(bn2.p backgroundsInteractor) {
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        this.f260270a = backgroundsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.backgroundpicker.models.RetailBackgroundKey r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s6e.c
            if (r0 == 0) goto L13
            r0 = r6
            s6e.c r0 = (s6e.c) r0
            int r1 = r0.f260268x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260268x = r1
            goto L18
        L13:
            s6e.c r0 = new s6e.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260268x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f260268x = r3
            bn2.p r6 = r4.f260270a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r6 = (com.revolut.feature.backgroundpicker.api.model.ChosenBackground) r6
            if (r6 == 0) goto L46
            return r6
        L46:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find default background {"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6e.d.a(com.revolut.feature.backgroundpicker.models.RetailBackgroundKey, gim.c):java.lang.Object");
    }

    public final Object b(SubaccountType subaccountType, xi0.b bVar, boolean z, gim.c cVar) {
        RetailBackgroundKey subAccountPersonal;
        if (subaccountType == null) {
            em2.e eVar = (em2.e) zhm.d0.b0((List) zhm.d0.a0(((Map) this.f260270a.f17034b.f185695c.f185709a.getValue()).values()));
            return new ChosenBackground(eVar.a(), fm2.a.a(eVar));
        }
        EntityInfo entityInfo = new EntityInfo(com.revolut.feature.subaccount.api.models.a.a(subaccountType), null, z ? md6.d.OPENED : md6.d.DISCOVERY, 2);
        if (subaccountType.equals(SubaccountType.Personal.f88963a) || (subaccountType instanceof SubaccountType.Joint) || (subaccountType instanceof SubaccountType.Junior) || subaccountType.equals(SubaccountType.Pro.f88964a) || subaccountType.equals(SubaccountType.ProTax.f88965a) || subaccountType.equals(SubaccountType.Teen.f88966a)) {
            subAccountPersonal = new RetailBackgroundKey.SubAccountPersonal(null, bVar, entityInfo);
        } else {
            if (!subaccountType.equals(SubaccountType.Group.f88960a)) {
                throw new NoWhenBranchMatchedException();
            }
            subAccountPersonal = new RetailBackgroundKey.SubAccountGroup(null, bVar, entityInfo);
        }
        return a(subAccountPersonal, cVar);
    }

    public final LayeredImage c(SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        return d(com.revolut.feature.subaccount.api.models.a.b(subaccountType));
    }

    public final LayeredImage d(ExtendedSubaccountType extendedSubaccountType) {
        int i;
        Intrinsics.checkNotNullParameter(extendedSubaccountType, "extendedSubaccountType");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        if ((extendedSubaccountType instanceof ExtendedSubaccountType.Personal) || (extendedSubaccountType instanceof ExtendedSubaccountType.Collateral)) {
            i = R$drawable.uikit_icn_24_wallet;
        } else if ((extendedSubaccountType instanceof ExtendedSubaccountType.Junior) || (extendedSubaccountType instanceof ExtendedSubaccountType.Teen)) {
            i = R$drawable.uikit_icn_24_children;
        } else if (extendedSubaccountType instanceof ExtendedSubaccountType.Group) {
            i = R$drawable.uikit_icn_24_people;
        } else if (extendedSubaccountType instanceof ExtendedSubaccountType.PlanCashback) {
            i = R$drawable.uikit_icn_24_cashback;
        } else if (extendedSubaccountType instanceof ExtendedSubaccountType.RevPoints) {
            i = R$drawable.uikit_icn_24_rev_points_mono;
        } else if (extendedSubaccountType instanceof ExtendedSubaccountType.Pro) {
            i = R$drawable.uikit_icn_24_services;
        } else if (extendedSubaccountType instanceof ExtendedSubaccountType.ProTax) {
            i = R$drawable.uikit_icn_24_coins_earning;
        } else {
            if (!(extendedSubaccountType instanceof ExtendedSubaccountType.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_joint;
        }
        return companion.j(i, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorBlue));
    }

    public final Object e(String str, SubaccountType subaccountType, xi0.b bVar, String str2, gim.c cVar) {
        Object objF = this.f260270a.f(age.b.e(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, com.revolut.feature.subaccount.api.models.a.b(subaccountType)), ProductId.SUBACCOUNT), new ProductAccountMetadata(new ProductAccountBalance.CurrencyOnly(bVar), true)), str2, cVar);
        return objF == fim.a.COROUTINE_SUSPENDED ? objF : Unit.f186387a;
    }
}
