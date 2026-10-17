package com.revolut.feature.onboarding.api.user_migration;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/UnsupportedMigrationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnsupportedMigrationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedMigrationException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
