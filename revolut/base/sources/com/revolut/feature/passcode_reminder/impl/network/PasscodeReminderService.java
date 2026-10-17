package com.revolut.feature.passcode_reminder.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/passcode_reminder/impl/network/PasscodeReminderService;", "", "stopPasscodeReminder", "Lretrofit2/Response;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_passcode_reminder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PasscodeReminderService {
    @POST("security-hub/passcode/stop-reminder")
    Object stopPasscodeReminder(@NotNull Continuation<? super Response<Unit>> continuation);
}
