package com.revolut.data.network.models.privacy_settings;

import com.revolut.data.network.models.security.SettingDescriptionDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/network/models/privacy_settings/PrivacySettingsDto;", "", "notificationSettings", "", "Lcom/revolut/data/network/models/privacy_settings/NotificationSettingDto;", "securitySettings", "Lcom/revolut/data/network/models/security/SettingDescriptionDto;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getNotificationSettings", "()Ljava/util/List;", "getSecuritySettings", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrivacySettingsDto {

    @b("notifications")
    @NotNull
    private final List<NotificationSettingDto> notificationSettings;

    @b("settings")
    @NotNull
    private final List<SettingDescriptionDto> securitySettings;

    public PrivacySettingsDto(@NotNull List<NotificationSettingDto> notificationSettings, @NotNull List<SettingDescriptionDto> securitySettings) {
        Intrinsics.checkNotNullParameter(notificationSettings, "notificationSettings");
        Intrinsics.checkNotNullParameter(securitySettings, "securitySettings");
        this.notificationSettings = notificationSettings;
        this.securitySettings = securitySettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacySettingsDto copy$default(PrivacySettingsDto privacySettingsDto, List list, List list2, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = privacySettingsDto.notificationSettings;
        }
        if ((i & 2) != 0) {
            list2 = privacySettingsDto.securitySettings;
        }
        return privacySettingsDto.copy(list, list2);
    }

    @NotNull
    public final List<NotificationSettingDto> component1() {
        return this.notificationSettings;
    }

    @NotNull
    public final List<SettingDescriptionDto> component2() {
        return this.securitySettings;
    }

    @NotNull
    public final PrivacySettingsDto copy(@NotNull List<NotificationSettingDto> notificationSettings, @NotNull List<SettingDescriptionDto> securitySettings) {
        Intrinsics.checkNotNullParameter(notificationSettings, "notificationSettings");
        Intrinsics.checkNotNullParameter(securitySettings, "securitySettings");
        return new PrivacySettingsDto(notificationSettings, securitySettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacySettingsDto)) {
            return false;
        }
        PrivacySettingsDto privacySettingsDto = (PrivacySettingsDto) other;
        return Intrinsics.f(this.notificationSettings, privacySettingsDto.notificationSettings) && Intrinsics.f(this.securitySettings, privacySettingsDto.securitySettings);
    }

    @NotNull
    public final List<NotificationSettingDto> getNotificationSettings() {
        return this.notificationSettings;
    }

    @NotNull
    public final List<SettingDescriptionDto> getSecuritySettings() {
        return this.securitySettings;
    }

    public int hashCode() {
        return this.securitySettings.hashCode() + (this.notificationSettings.hashCode() * 31);
    }
}
