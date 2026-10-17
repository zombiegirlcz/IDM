package com.revolut.data.network.models.recurringpayment.mapper;

import com.revolut.data.network.models.recurringpayment.WalletAutomationRequestDto;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import jo3.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\tH\u0002J\u0010\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/mapper/WalletAutomationDtoMapper;", "", "<init>", "()V", "toDto", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto;", "automation", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation;", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$DropsBelowDto;", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$DropsBelow;", "Lcom/revolut/data/network/models/recurringpayment/WalletAutomationRequestDto$ExceedsDto;", "Lcom/revolut/feature/shared/recurring_payments/models/WalletAutomation$Exceeds;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletAutomationDtoMapper {

    @NotNull
    public static final WalletAutomationDtoMapper INSTANCE = new WalletAutomationDtoMapper();

    private WalletAutomationDtoMapper() {
    }

    @NotNull
    public final WalletAutomationRequestDto toDto(@NotNull WalletAutomation automation) {
        Intrinsics.checkNotNullParameter(automation, "automation");
        if (automation instanceof WalletAutomation.DropsBelow) {
            return toDto((WalletAutomation.DropsBelow) automation);
        }
        if (automation instanceof WalletAutomation.Exceeds) {
            return toDto((WalletAutomation.Exceeds) automation);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final WalletAutomationRequestDto.DropsBelowDto toDto(WalletAutomation.DropsBelow automation) {
        a aVarP = mo3.a.p(automation.f86443a);
        a aVarP2 = mo3.a.p(automation.f86444b);
        String str = automation.f86445c;
        String str2 = automation.d;
        WalletAutomation.Limit limit = automation.e;
        return new WalletAutomationRequestDto.DropsBelowDto(aVarP, aVarP2, str, str2, limit != null ? new WalletAutomationRequestDto.LimitDto(mo3.a.p(limit.f86449a), limit.f86450b.b()) : null);
    }

    private final WalletAutomationRequestDto.ExceedsDto toDto(WalletAutomation.Exceeds automation) {
        a aVarP = mo3.a.p(automation.f86446a);
        String str = automation.f86447b;
        String str2 = automation.f86448c;
        WalletAutomation.Limit limit = automation.d;
        return new WalletAutomationRequestDto.ExceedsDto(aVarP, str, str2, limit != null ? new WalletAutomationRequestDto.LimitDto(mo3.a.p(limit.f86449a), limit.f86450b.b()) : null);
    }
}
