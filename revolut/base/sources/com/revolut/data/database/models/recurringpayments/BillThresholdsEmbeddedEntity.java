package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;", "", "Ljo3/b;", "minAmount", "maxAmount", "<init>", "(Ljo3/b;Ljo3/b;)V", "component1", "()Ljo3/b;", "component2", "copy", "(Ljo3/b;Ljo3/b;)Lcom/revolut/data/database/models/recurringpayments/BillThresholdsEmbeddedEntity;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "getMinAmount", "getMaxAmount", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillThresholdsEmbeddedEntity {

    @b("maxAmount")
    private final jo3.b maxAmount;

    @b("minAmount")
    private final jo3.b minAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public BillThresholdsEmbeddedEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BillThresholdsEmbeddedEntity copy$default(BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity, jo3.b bVar, jo3.b bVar2, int i, Object obj2) {
        if ((i & 1) != 0) {
            bVar = billThresholdsEmbeddedEntity.minAmount;
        }
        if ((i & 2) != 0) {
            bVar2 = billThresholdsEmbeddedEntity.maxAmount;
        }
        return billThresholdsEmbeddedEntity.copy(bVar, bVar2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final jo3.b getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final jo3.b getMaxAmount() {
        return this.maxAmount;
    }

    @NotNull
    public final BillThresholdsEmbeddedEntity copy(jo3.b minAmount, jo3.b maxAmount) {
        return new BillThresholdsEmbeddedEntity(minAmount, maxAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillThresholdsEmbeddedEntity)) {
            return false;
        }
        BillThresholdsEmbeddedEntity billThresholdsEmbeddedEntity = (BillThresholdsEmbeddedEntity) other;
        return Intrinsics.f(this.minAmount, billThresholdsEmbeddedEntity.minAmount) && Intrinsics.f(this.maxAmount, billThresholdsEmbeddedEntity.maxAmount);
    }

    public final jo3.b getMaxAmount() {
        return this.maxAmount;
    }

    public final jo3.b getMinAmount() {
        return this.minAmount;
    }

    public int hashCode() {
        jo3.b bVar = this.minAmount;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.maxAmount;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public BillThresholdsEmbeddedEntity(jo3.b bVar, jo3.b bVar2) {
        this.minAmount = bVar;
        this.maxAmount = bVar2;
    }

    public /* synthetic */ BillThresholdsEmbeddedEntity(jo3.b bVar, jo3.b bVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : bVar2);
    }
}
