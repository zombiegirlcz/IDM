package com.revolut.shared.feature.move_money.impl.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import m8l.a;
import m8l.b;
import m8l.h;
import m8l.i;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/move_money/impl/data/MoveMoneyService;", "", "Lm8l/b;", "dto", "", "idempotencyId", "Lm8l/h;", "moveMoney", "(Lm8l/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savingAccountId", "Lm8l/a;", "Lretrofit2/Response;", "", "moveMoneyFromSavings", "(Ljava/lang/String;Lm8l/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm8l/i;", "moveMoneyToSavings", "(Ljava/lang/String;Lm8l/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoveMoneyService {
    @POST("/wallet-transfer")
    Object moveMoney(@Body @NotNull b bVar, @Header("X-Idempotency-Key") @NotNull String str, @NotNull Continuation<? super h> continuation);

    @POST("/money-boxes/{id}/withdraw")
    Object moveMoneyFromSavings(@Path("id") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/money-boxes/{id}/contribute")
    Object moveMoneyToSavings(@Path("id") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
