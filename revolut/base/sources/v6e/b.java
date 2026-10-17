package v6e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final CreateSubaccountFlowProvider$CreateSubaccountType a(SubaccountType subaccountType, CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
        Intrinsics.checkNotNullParameter(subaccountType, "<this>");
        Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
        if (subaccountType instanceof SubaccountType.Personal) {
            return new CreateSubaccountFlowProvider$CreateSubaccountType.Personal(currencySelectionMode);
        }
        if (subaccountType instanceof SubaccountType.Joint) {
            return new CreateSubaccountFlowProvider$CreateSubaccountType.Joint(currencySelectionMode);
        }
        if (subaccountType instanceof SubaccountType.Group) {
            return new CreateSubaccountFlowProvider$CreateSubaccountType.Group(currencySelectionMode);
        }
        if (subaccountType instanceof SubaccountType.Pro) {
            return new CreateSubaccountFlowProvider$CreateSubaccountType.Pro(currencySelectionMode);
        }
        if (subaccountType instanceof SubaccountType.ProTax) {
            return new CreateSubaccountFlowProvider$CreateSubaccountType.ProTax(currencySelectionMode);
        }
        if (subaccountType instanceof SubaccountType.Junior) {
            return new CreateSubaccountFlowProvider$CreateSubaccountType.Junior(currencySelectionMode);
        }
        if (subaccountType instanceof SubaccountType.Teen) {
            throw new IllegalArgumentException("CreateSubaccountType.Teen not supported");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SubaccountType b(CreateSubaccountFlowProvider$CreateSubaccountType createSubaccountFlowProvider$CreateSubaccountType) {
        Intrinsics.checkNotNullParameter(createSubaccountFlowProvider$CreateSubaccountType, "<this>");
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.Group) {
            return SubaccountType.Group.f88960a;
        }
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.Personal) {
            return SubaccountType.Personal.f88963a;
        }
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.RevPoints) {
            return null;
        }
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.Pro) {
            return SubaccountType.Pro.f88964a;
        }
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.ProTax) {
            return SubaccountType.ProTax.f88965a;
        }
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.Joint) {
            return SubaccountType.Joint.f88961a;
        }
        if (createSubaccountFlowProvider$CreateSubaccountType instanceof CreateSubaccountFlowProvider$CreateSubaccountType.Junior) {
            return SubaccountType.Junior.f88962a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
