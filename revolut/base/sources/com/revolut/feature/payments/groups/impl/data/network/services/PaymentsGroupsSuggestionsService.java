package com.revolut.feature.payments.groups.impl.data.network.services;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/data/network/services/PaymentsGroupsSuggestionsService;", "", "Lefm/d0;", "", "Lcr9/d0;", "getGroupSuggestions", "()Lefm/d0;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentsGroupsSuggestionsService {
    @GET("suggestion/groups")
    @NotNull
    d0<List<cr9.d0>> getGroupSuggestions();
}
