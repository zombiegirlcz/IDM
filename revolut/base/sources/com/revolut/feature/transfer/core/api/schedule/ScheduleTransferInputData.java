package com.revolut.feature.transfer.core.api.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jli.c;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/schedule/ScheduleTransferInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScheduleTransferInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScheduleTransferInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f92142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f92143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1l.a f92144c;
    public final Clause d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsContext f92146h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f92147j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f92148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f92149m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Clause clause = (Clause) j6.a.f(parcel, "parcel", ScheduleTransferInputData.class);
            TransferScheduleData transferScheduleData = (TransferScheduleData) parcel.readParcelable(ScheduleTransferInputData.class.getClassLoader());
            m1l.a aVarValueOf = m1l.a.valueOf(parcel.readString());
            Clause clause2 = (Clause) parcel.readParcelable(ScheduleTransferInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(c.valueOf(parcel.readString()));
            }
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new ScheduleTransferInputData(clause, transferScheduleData, aVarValueOf, clause2, arrayList, z3, parcel.readInt() != 0 ? z : false, (AnalyticsContext) parcel.readParcelable(ScheduleTransferInputData.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScheduleTransferInputData[i];
        }
    }

    public ScheduleTransferInputData(Clause titleText, TransferScheduleData scheduleData, m1l.a scheduleMode, Clause actionText, List paymentPeriods, boolean z, boolean z3, AnalyticsContext analyticsContext, LocalDate localDate, LocalDate localDate2, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(paymentPeriods, "paymentPeriods");
        this.f92142a = titleText;
        this.f92143b = scheduleData;
        this.f92144c = scheduleMode;
        this.d = actionText;
        this.e = paymentPeriods;
        this.f = z;
        this.f92145g = z3;
        this.f92146h = analyticsContext;
        this.i = localDate;
        this.f92147j = localDate2;
        this.k = z4;
        this.f92148l = z6;
        this.f92149m = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScheduleTransferInputData)) {
            return false;
        }
        ScheduleTransferInputData scheduleTransferInputData = (ScheduleTransferInputData) obj2;
        return Intrinsics.f(this.f92142a, scheduleTransferInputData.f92142a) && Intrinsics.f(this.f92143b, scheduleTransferInputData.f92143b) && this.f92144c == scheduleTransferInputData.f92144c && Intrinsics.f(this.d, scheduleTransferInputData.d) && Intrinsics.f(this.e, scheduleTransferInputData.e) && this.f == scheduleTransferInputData.f && this.f92145g == scheduleTransferInputData.f92145g && Intrinsics.f(this.f92146h, scheduleTransferInputData.f92146h) && Intrinsics.f(this.i, scheduleTransferInputData.i) && Intrinsics.f(this.f92147j, scheduleTransferInputData.f92147j) && this.k == scheduleTransferInputData.k && this.f92148l == scheduleTransferInputData.f92148l && this.f92149m == scheduleTransferInputData.f92149m;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d(p.a.a((this.f92144c.hashCode() + l.f(this.f92143b, this.f92142a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f92145g);
        AnalyticsContext analyticsContext = this.f92146h;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        LocalDate localDate = this.i;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f92147j;
        return Boolean.hashCode(this.f92149m) + j6.a.c(j6.a.c((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.k), 31, this.f92148l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92142a, i);
        dest.writeParcelable(this.f92143b, i);
        dest.writeString(this.f92144c.name());
        dest.writeParcelable(this.d, i);
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f92145g ? 1 : 0);
        dest.writeParcelable(this.f92146h, i);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f92147j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f92148l ? 1 : 0);
        dest.writeInt(this.f92149m ? 1 : 0);
    }

    public /* synthetic */ ScheduleTransferInputData(TextLocalisedClause textLocalisedClause, TransferScheduleData transferScheduleData, m1l.a aVar, TextLocalisedClause textLocalisedClause2, List list, boolean z, AnalyticsContext analyticsContext, LocalDate localDate, LocalDate localDate2, boolean z3, boolean z4, boolean z6, int i) {
        this((Clause) ((i & 1) != 0 ? new TextLocalisedClause(R.string.common_action_schedule, null, null, 14) : textLocalisedClause), transferScheduleData, aVar, (Clause) ((i & 8) != 0 ? new TextLocalisedClause(R$string.payments_transfer_schedule_action_set_schedule, null, null, 14) : textLocalisedClause2), (i & 16) != 0 ? d.v0(c.values()) : list, (i & 32) != 0 ? true : z, false, (i & 128) != 0 ? null : analyticsContext, (i & 256) != 0 ? null : localDate, (i & 512) != 0 ? null : localDate2, (i & 1024) != 0 ? true : z3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? true : z6);
    }
}
