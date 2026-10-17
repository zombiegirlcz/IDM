package com.revolut.feature.payments.recipients.settings.impl.data.network;

import efm.b;
import efm.d0;
import ey9.a;
import ey9.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/impl/data/network/RecipientPaymentsSettingsService;", "", "Lefm/d0;", "", "Ley9/a;", "getRecipientSettings", "()Lefm/d0;", "Ley9/b;", "body", "Lefm/b;", "patchRecipientSettings", "(Ley9/b;)Lefm/b;", "Ley9/d;", "", "patchRecipientsSettings", "(Ley9/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_payments_recipients_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecipientPaymentsSettingsService {
    @GET("user/current/recipient-settings")
    @NotNull
    d0<List<a>> getRecipientSettings();

    @PATCH("user/current/recipient-settings")
    @NotNull
    b patchRecipientSettings(@Body @NotNull ey9.b body);

    @PATCH("user/current/recipient-settings")
    Object patchRecipientsSettings(@Body @NotNull d dVar, @NotNull Continuation<? super Unit> continuation);
}
