package com.revolut.data.network.models.privacy_settings;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/privacy_settings/NotificationSettingDto;", "", "id", "", "email", "", "push", "<init>", "(Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "getEmail", "()Z", "getPush", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotificationSettingDto {

    @b("email")
    private final boolean email;

    @b("id")
    @NotNull
    private final String id;

    @b("push")
    private final boolean push;

    public NotificationSettingDto(@NotNull String id10, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.email = z;
        this.push = z3;
    }

    public static /* synthetic */ NotificationSettingDto copy$default(NotificationSettingDto notificationSettingDto, String str, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = notificationSettingDto.id;
        }
        if ((i & 2) != 0) {
            z = notificationSettingDto.email;
        }
        if ((i & 4) != 0) {
            z3 = notificationSettingDto.push;
        }
        return notificationSettingDto.copy(str, z, z3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPush() {
        return this.push;
    }

    @NotNull
    public final NotificationSettingDto copy(@NotNull String id10, boolean email, boolean push) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new NotificationSettingDto(id10, email, push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationSettingDto)) {
            return false;
        }
        NotificationSettingDto notificationSettingDto = (NotificationSettingDto) other;
        return Intrinsics.f(this.id, notificationSettingDto.id) && this.email == notificationSettingDto.email && this.push == notificationSettingDto.push;
    }

    public final boolean getEmail() {
        return this.email;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getPush() {
        return this.push;
    }

    public int hashCode() {
        return Boolean.hashCode(this.push) + a.c(this.id.hashCode() * 31, 31, this.email);
    }
}
