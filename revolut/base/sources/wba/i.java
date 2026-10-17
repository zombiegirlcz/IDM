package wba;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f296077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f296078c;
    public final String d;
    public final String e;
    public final MutableStateFlow f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f296079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TransferScheduleData f296080h;

    public i(String decodedOperationId, dj0.d amount, String reference, String beneficiaryName, String institutionName, j2 qrDecodeResultFlow, LocalDate localDate, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(decodedOperationId, "decodedOperationId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(qrDecodeResultFlow, "qrDecodeResultFlow");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f296076a = decodedOperationId;
        this.f296077b = amount;
        this.f296078c = reference;
        this.d = beneficiaryName;
        this.e = institutionName;
        this.f = qrDecodeResultFlow;
        this.f296079g = localDate;
        this.f296080h = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f296076a, iVar.f296076a) && Intrinsics.f(this.f296077b, iVar.f296077b) && Intrinsics.f(this.f296078c, iVar.f296078c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f296079g, iVar.f296079g) && Intrinsics.f(this.f296080h, iVar.f296080h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c(p.a.c(v7.c(this.f296076a.hashCode() * 31, 31, this.f296077b), 31, this.f296078c), 31, this.d), 31, this.e)) * 31;
        LocalDate localDate = this.f296079g;
        return this.f296080h.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
