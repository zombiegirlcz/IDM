package com.revolut.feature.slot_manager.impl.network;

import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tkd.h;
import tkd.k;
import zj0.a;
import zj0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JJ\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/slot_manager/impl/network/SlotManagerService;", "", "", "basePath", "screenId", "", "targetIds", "", "headers", "Ltkd/k;", "getSlots", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltkd/h;", "actionsRequest", "", "sendActions", "(Ljava/lang/String;Ltkd/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "campaignId", "targetId", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklist;", "getChecklist", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SlotManagerService {
    @GET("{basePath}/slots/checklists/screens/{screenId}/campaigns/{campaignId}")
    Object getChecklist(@Path("basePath") @NotNull String str, @Path("screenId") @NotNull String str2, @Path("campaignId") @NotNull String str3, @Query("targetId") String str4, @NotNull Continuation<? super SlotChecklist> continuation);

    @a
    @GET("{basePath}/slots/screens/{screenId}")
    Object getSlots(@Path("basePath") @NotNull String str, @Path("screenId") @NotNull String str2, @NotNull @Query("targetIds") Set<String> set, @HeaderMap @NotNull Map<String, String> map, @NotNull Continuation<? super k> continuation);

    @b
    @POST("{basePath}/slots/impressions")
    Object sendActions(@Path("basePath") @NotNull String str, @Body @NotNull h hVar, @NotNull Continuation<? super Unit> continuation);
}
