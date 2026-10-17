package com.revolut.data.database.models.payments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/revolut/data/database/models/payments/PaymentsSettingEmbeddedEntity;", "", "id", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsSettingEmbeddedEntity {
    private final boolean enabled;

    @NotNull
    private final String id;

    public PaymentsSettingEmbeddedEntity(@NotNull String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.enabled = z;
    }

    public static /* synthetic */ PaymentsSettingEmbeddedEntity copy$default(PaymentsSettingEmbeddedEntity paymentsSettingEmbeddedEntity, String str, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = paymentsSettingEmbeddedEntity.id;
        }
        if ((i & 2) != 0) {
            z = paymentsSettingEmbeddedEntity.enabled;
        }
        return paymentsSettingEmbeddedEntity.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final PaymentsSettingEmbeddedEntity copy(@NotNull String id10, boolean enabled) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new PaymentsSettingEmbeddedEntity(id10, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsSettingEmbeddedEntity)) {
            return false;
        }
        PaymentsSettingEmbeddedEntity paymentsSettingEmbeddedEntity = (PaymentsSettingEmbeddedEntity) other;
        return Intrinsics.f(this.id, paymentsSettingEmbeddedEntity.id) && this.enabled == paymentsSettingEmbeddedEntity.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.id.hashCode() * 31);
    }
}
