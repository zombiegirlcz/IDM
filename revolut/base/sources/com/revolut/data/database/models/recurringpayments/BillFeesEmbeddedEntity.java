package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;", "", "Ljo3/b;", "interest", "fine", "discount", "totalFees", "<init>", "(Ljo3/b;Ljo3/b;Ljo3/b;Ljo3/b;)V", "component1", "()Ljo3/b;", "component2", "component3", "component4", "copy", "(Ljo3/b;Ljo3/b;Ljo3/b;Ljo3/b;)Lcom/revolut/data/database/models/recurringpayments/BillFeesEmbeddedEntity;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "getInterest", "getFine", "getDiscount", "getTotalFees", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillFeesEmbeddedEntity {

    @b("discount")
    private final jo3.b discount;

    @b("fine")
    private final jo3.b fine;

    @b("interest")
    private final jo3.b interest;

    @b("totalFees")
    private final jo3.b totalFees;

    public BillFeesEmbeddedEntity() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BillFeesEmbeddedEntity copy$default(BillFeesEmbeddedEntity billFeesEmbeddedEntity, jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, int i, Object obj2) {
        if ((i & 1) != 0) {
            bVar = billFeesEmbeddedEntity.interest;
        }
        if ((i & 2) != 0) {
            bVar2 = billFeesEmbeddedEntity.fine;
        }
        if ((i & 4) != 0) {
            bVar3 = billFeesEmbeddedEntity.discount;
        }
        if ((i & 8) != 0) {
            bVar4 = billFeesEmbeddedEntity.totalFees;
        }
        return billFeesEmbeddedEntity.copy(bVar, bVar2, bVar3, bVar4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final jo3.b getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final jo3.b getFine() {
        return this.fine;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final jo3.b getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final jo3.b getTotalFees() {
        return this.totalFees;
    }

    @NotNull
    public final BillFeesEmbeddedEntity copy(jo3.b interest, jo3.b fine, jo3.b discount, jo3.b totalFees) {
        return new BillFeesEmbeddedEntity(interest, fine, discount, totalFees);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillFeesEmbeddedEntity)) {
            return false;
        }
        BillFeesEmbeddedEntity billFeesEmbeddedEntity = (BillFeesEmbeddedEntity) other;
        return Intrinsics.f(this.interest, billFeesEmbeddedEntity.interest) && Intrinsics.f(this.fine, billFeesEmbeddedEntity.fine) && Intrinsics.f(this.discount, billFeesEmbeddedEntity.discount) && Intrinsics.f(this.totalFees, billFeesEmbeddedEntity.totalFees);
    }

    public final jo3.b getDiscount() {
        return this.discount;
    }

    public final jo3.b getFine() {
        return this.fine;
    }

    public final jo3.b getInterest() {
        return this.interest;
    }

    public final jo3.b getTotalFees() {
        return this.totalFees;
    }

    public int hashCode() {
        jo3.b bVar = this.interest;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.fine;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.discount;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.totalFees;
        return iHashCode3 + (bVar4 != null ? bVar4.hashCode() : 0);
    }

    public BillFeesEmbeddedEntity(jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4) {
        this.interest = bVar;
        this.fine = bVar2;
        this.discount = bVar3;
        this.totalFees = bVar4;
    }

    public /* synthetic */ BillFeesEmbeddedEntity(jo3.b bVar, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : bVar2, (i & 4) != 0 ? null : bVar3, (i & 8) != 0 ? null : bVar4);
    }
}
