package com.revolut.feature.apm.core.impl.data.network.settings;

import fz1.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/settings/ApmRecipientSettingsService;", "", "", "recipientId", "Lfz1/a;", "body", "", "patchSettings", "(Ljava/lang/String;Lfz1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmRecipientSettingsService {
    @PATCH("/beneficiary/{id}/attributes")
    Object patchSettings(@Path("id") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super Unit> continuation);
}
