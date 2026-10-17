package com.revolut.data.network.models.auth;

import com.revolut.domain.models.auth.PasswordResetStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDomain", "Lcom/revolut/domain/models/auth/PasswordResetStrategy;", "Lcom/revolut/data/network/models/auth/ResetPasswordStrategyDto;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ResetPasswordStrategyDtoKt {
    @NotNull
    public static final PasswordResetStrategy toDomain(@NotNull ResetPasswordStrategyDto resetPasswordStrategyDto) {
        Intrinsics.checkNotNullParameter(resetPasswordStrategyDto, "<this>");
        String type = resetPasswordStrategyDto.getType();
        int iHashCode = type.hashCode();
        if (iHashCode != -1475869074) {
            if (iHashCode != -676244292) {
                if (iHashCode == 78603 && type.equals("OTP")) {
                    return PasswordResetStrategy.CODE;
                }
            } else if (type.equals("LASTFOUR")) {
                return PasswordResetStrategy.LAST_FOUR;
            }
        } else if (type.equals("LASTAMOUNT")) {
            return PasswordResetStrategy.LAST_AMOUNT;
        }
        throw new IllegalStateException("Unknown password reset strategy");
    }
}
