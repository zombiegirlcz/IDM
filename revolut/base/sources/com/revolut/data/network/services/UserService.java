package com.revolut.data.network.services;

import com.revolut.data.network.models.confirmations.CardsAccountConfirmationDto;
import com.revolut.data.network.models.confirmations.ProfileAccountConfirmationDto;
import com.revolut.data.network.models.confirmations.SarAccountConfirmationDto;
import com.revolut.data.network.models.security.SecuritySettingRequestDto;
import com.revolut.data.network.models.security.SettingDescriptionDto;
import efm.b;
import efm.d0;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010H'¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/UserService;", "", "Lefm/d0;", "", "Lcom/revolut/data/network/models/security/SettingDescriptionDto;", "getPrivacySettings", "()Lefm/d0;", "", "settingName", "Lcom/revolut/data/network/models/security/SecuritySettingRequestDto;", "request", "Lefm/b;", "putSecuritySetting", "(Ljava/lang/String;Lcom/revolut/data/network/models/security/SecuritySettingRequestDto;)Lefm/b;", "walletId", "pocketType", "Lefm/r;", "Lcom/revolut/data/network/models/confirmations/ProfileAccountConfirmationDto;", "getProfileAccountConfirmation", "(Ljava/lang/String;Ljava/lang/String;)Lefm/r;", "Lcom/revolut/data/network/models/confirmations/CardsAccountConfirmationDto;", "getCardsConfirmation", "()Lefm/r;", "Lcom/revolut/data/network/models/confirmations/SarAccountConfirmationDto;", "getSarConfirmation", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserService {
    @GET("user/current/statements/card-confirmation")
    @NotNull
    r<CardsAccountConfirmationDto> getCardsConfirmation();

    @GET("/user/current/settings/privacy")
    @NotNull
    d0<List<SettingDescriptionDto>> getPrivacySettings();

    @GET("user/current/statements/account-confirmation")
    @NotNull
    r<ProfileAccountConfirmationDto> getProfileAccountConfirmation(@Query("walletId") String walletId, @Query("pocketType") String pocketType);

    @GET("user/current/statements/subject-access-request")
    @NotNull
    r<SarAccountConfirmationDto> getSarConfirmation();

    @PUT("/user/current/settings/privacy/{settingName}")
    @NotNull
    b putSecuritySetting(@Path("settingName") @NotNull String settingName, @Body @NotNull SecuritySettingRequestDto request);
}
