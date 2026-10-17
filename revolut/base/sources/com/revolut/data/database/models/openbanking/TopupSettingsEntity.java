package com.revolut.data.database.models.openbanking;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/revolut/data/database/models/openbanking/TopupSettingsEntity;", "", "system", "", "recurrenceSupported", "", "<init>", "(Ljava/lang/String;Z)V", "getSystem", "()Ljava/lang/String;", "getRecurrenceSupported", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupSettingsEntity {
    private final boolean recurrenceSupported;

    @NotNull
    private final String system;

    public TopupSettingsEntity(@NotNull String system, boolean z) {
        Intrinsics.checkNotNullParameter(system, "system");
        this.system = system;
        this.recurrenceSupported = z;
    }

    public static /* synthetic */ TopupSettingsEntity copy$default(TopupSettingsEntity topupSettingsEntity, String str, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = topupSettingsEntity.system;
        }
        if ((i & 2) != 0) {
            z = topupSettingsEntity.recurrenceSupported;
        }
        return topupSettingsEntity.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSystem() {
        return this.system;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRecurrenceSupported() {
        return this.recurrenceSupported;
    }

    @NotNull
    public final TopupSettingsEntity copy(@NotNull String system, boolean recurrenceSupported) {
        Intrinsics.checkNotNullParameter(system, "system");
        return new TopupSettingsEntity(system, recurrenceSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupSettingsEntity)) {
            return false;
        }
        TopupSettingsEntity topupSettingsEntity = (TopupSettingsEntity) other;
        return Intrinsics.f(this.system, topupSettingsEntity.system) && this.recurrenceSupported == topupSettingsEntity.recurrenceSupported;
    }

    public final boolean getRecurrenceSupported() {
        return this.recurrenceSupported;
    }

    @NotNull
    public final String getSystem() {
        return this.system;
    }

    public int hashCode() {
        return Boolean.hashCode(this.recurrenceSupported) + (this.system.hashCode() * 31);
    }
}
