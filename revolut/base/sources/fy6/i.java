package fy6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentSchedule;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$ScheduleTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoicePaymentSchedule f138938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f138939c;
    public final InvoicePaymentScheduleScreenContract$ScheduleTab d;

    public i(Data invoiceInfoData, InvoicePaymentSchedule invoiceSchedule, h hVar, InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab) {
        Intrinsics.checkNotNullParameter(invoiceInfoData, "invoiceInfoData");
        Intrinsics.checkNotNullParameter(invoiceSchedule, "invoiceSchedule");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f138937a = invoiceInfoData;
        this.f138938b = invoiceSchedule;
        this.f138939c = hVar;
        this.d = selectedTab;
    }

    public static i a(i iVar, Data invoiceInfoData, InvoicePaymentSchedule invoiceSchedule, h hVar, InvoicePaymentScheduleScreenContract$ScheduleTab selectedTab, int i) {
        if ((i & 1) != 0) {
            invoiceInfoData = iVar.f138937a;
        }
        if ((i & 2) != 0) {
            invoiceSchedule = iVar.f138938b;
        }
        if ((i & 4) != 0) {
            hVar = iVar.f138939c;
        }
        if ((i & 8) != 0) {
            selectedTab = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(invoiceInfoData, "invoiceInfoData");
        Intrinsics.checkNotNullParameter(invoiceSchedule, "invoiceSchedule");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new i(invoiceInfoData, invoiceSchedule, hVar, selectedTab);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f138937a, iVar.f138937a) && Intrinsics.f(this.f138938b, iVar.f138938b) && Intrinsics.f(this.f138939c, iVar.f138939c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f138938b.hashCode() + (this.f138937a.hashCode() * 31)) * 31;
        h hVar = this.f138939c;
        return this.d.hashCode() + ((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31);
    }
}
