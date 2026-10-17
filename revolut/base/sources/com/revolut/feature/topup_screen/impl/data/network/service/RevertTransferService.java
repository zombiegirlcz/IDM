package com.revolut.feature.topup_screen.impl.data.network.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import vue.a;
import wj0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\fJ0\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/RevertTransferService;", "", "", "transactionId", "", "emptyRequest", "Lwj0/b;", "idempotencyTag", "Lvue/a;", "revertTransfer", "(Ljava/lang/String;Lkotlin/Unit;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevertTransferService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f90580a;

    /* JADX INFO: renamed from: com.revolut.feature.topup_screen.impl.data.network.service.RevertTransferService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f90580a = new Companion();

        private Companion() {
        }
    }

    @POST("transaction/{id}/revert")
    Object revertTransfer(@Path("id") @NotNull String str, @Body @NotNull Unit unit, @Tag b bVar, @NotNull Continuation<? super a> continuation);
}
