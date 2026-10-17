package com.revolut.feature.notification_centre.impl.data.retrofit.service;

import a79.n;
import a79.p;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u00070\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0002H'¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/data/retrofit/service/NotificationCentreService;", "", "Lefm/d0;", "", "", "", "La79/n;", "Lcom/revolut/feature/notification_centre/impl/data/model/NotificationCentreContentDto;", "getNotifications", "()Lefm/d0;", "La79/p;", "getPopups", "", "from", "", "getNewNotificationItemsCount", "(Ljava/lang/Long;)Lefm/d0;", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NotificationCentreService {
    @GET("/user/current/notification-center/updates-available")
    @NotNull
    d0<Boolean> getNewNotificationItemsCount(@Query("from") Long from);

    @GET("/user/current/notification-center/items")
    @NotNull
    d0<Map<String, List<n>>> getNotifications();

    @GET("/user/current/popups")
    @NotNull
    d0<List<p>> getPopups();
}
