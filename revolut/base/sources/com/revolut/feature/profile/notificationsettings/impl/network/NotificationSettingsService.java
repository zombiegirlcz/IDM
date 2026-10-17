package com.revolut.feature.profile.notificationsettings.impl.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import xoa.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/profile/notificationsettings/impl/network/NotificationSettingsService;", "", "Lefm/d0;", "", "Lxoa/a;", "fetchNotificationSettings", "()Lefm/d0;", "", "id", "Lxoa/b;", "settings", "Lefm/b;", "updateNotificationSettings", "(Ljava/lang/String;Lxoa/b;)Lefm/b;", "feature_profile_notificationsettings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NotificationSettingsService {
    @GET("user/current/settings/notifications")
    @NotNull
    d0<List<a>> fetchNotificationSettings();

    @PATCH("user/current/settings/notifications/{id}")
    @NotNull
    b updateNotificationSettings(@Path("id") @NotNull String id10, @Body @NotNull xoa.b settings);
}
