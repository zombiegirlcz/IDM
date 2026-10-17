package com.revolut.retail.analytics.tracking.impl.privacy;

import com.revolut.data.network.models.security.SecuritySettingRequestDto;
import com.revolut.data.network.models.security.SettingDescriptionDto;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/analytics/tracking/impl/privacy/PrivacyService;", "", "Lefm/d0;", "", "Lcom/revolut/data/network/models/security/SettingDescriptionDto;", "getPrivacySettings", "()Lefm/d0;", "", "settingName", "Lcom/revolut/data/network/models/security/SecuritySettingRequestDto;", "request", "Lefm/b;", "putSecuritySetting", "(Ljava/lang/String;Lcom/revolut/data/network/models/security/SecuritySettingRequestDto;)Lefm/b;", "retail_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PrivacyService {
    @GET("/user/current/settings/privacy")
    @NotNull
    d0<List<SettingDescriptionDto>> getPrivacySettings();

    @PUT("/user/current/settings/privacy/{settingName}")
    @NotNull
    b putSecuritySetting(@Path("settingName") @NotNull String settingName, @Body @NotNull SecuritySettingRequestDto request);
}
