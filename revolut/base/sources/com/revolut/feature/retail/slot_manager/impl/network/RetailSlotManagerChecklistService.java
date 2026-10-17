package com.revolut.feature.retail.slot_manager.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import xqb.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/slot_manager/impl/network/RetailSlotManagerChecklistService;", "", "", "basePath", "Lxqb/c;", "request", "", "sendChecklistStepCompletion", "(Ljava/lang/String;Lxqb/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RetailSlotManagerChecklistService {
    @POST("{basePath}/incentives/checklist-challenges/step-completion")
    Object sendChecklistStepCompletion(@Path("basePath") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);
}
