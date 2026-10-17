package com.revolut.feature.giro.impl.ui.form.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/giro/impl/ui/form/domain/FormState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_giro_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FormState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f74553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f74555c;
    public final LocalDate d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FormState((Biller) parcel.readParcelable(FormState.class.getClassLoader()), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormState[i];
        }
    }

    public FormState(Biller creditor, String consumerId, LocalDate startDate, LocalDate localDate, d dVar) {
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f74553a = creditor;
        this.f74554b = consumerId;
        this.f74555c = startDate;
        this.d = localDate;
        this.e = dVar;
    }

    public static FormState a(FormState formState, Biller biller, String str, LocalDate localDate, LocalDate localDate2, d dVar, int i) {
        if ((i & 1) != 0) {
            biller = formState.f74553a;
        }
        Biller creditor = biller;
        if ((i & 2) != 0) {
            str = formState.f74554b;
        }
        String consumerId = str;
        if ((i & 4) != 0) {
            localDate = formState.f74555c;
        }
        LocalDate startDate = localDate;
        if ((i & 8) != 0) {
            localDate2 = formState.d;
        }
        LocalDate localDate3 = localDate2;
        if ((i & 16) != 0) {
            dVar = formState.e;
        }
        formState.getClass();
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return new FormState(creditor, consumerId, startDate, localDate3, dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormState)) {
            return false;
        }
        FormState formState = (FormState) obj2;
        return Intrinsics.f(this.f74553a, formState.f74553a) && Intrinsics.f(this.f74554b, formState.f74554b) && Intrinsics.f(this.f74555c, formState.f74555c) && Intrinsics.f(this.d, formState.d) && Intrinsics.f(this.e, formState.e);
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(this.f74553a.hashCode() * 31, 31, this.f74554b), 31, this.f74555c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        d dVar = this.e;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74553a, i);
        dest.writeString(this.f74554b);
        dest.writeSerializable(this.f74555c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
