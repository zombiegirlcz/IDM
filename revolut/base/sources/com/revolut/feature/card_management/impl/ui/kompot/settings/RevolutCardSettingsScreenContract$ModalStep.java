package com.revolut.feature.card_management.impl.ui.kompot.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yt8.i;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/card_management/impl/ui/kompot/settings/RevolutCardSettingsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CobrandedValueReminder", "Lcom/revolut/feature/card_management/impl/ui/kompot/settings/RevolutCardSettingsScreenContract$ModalStep$CobrandedValueReminder;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevolutCardSettingsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/kompot/settings/RevolutCardSettingsScreenContract$ModalStep$CobrandedValueReminder;", "Lcom/revolut/feature/card_management/impl/ui/kompot/settings/RevolutCardSettingsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CobrandedValueReminder implements RevolutCardSettingsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CobrandedValueReminder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f64903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f64904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f64905c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                f0 f0Var = (f0) parcel.readSerializable();
                i iVarValueOf = i.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iC = 0;
                    while (iC != i) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                    }
                    arrayList = arrayList2;
                }
                return new CobrandedValueReminder(f0Var, iVarValueOf, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CobrandedValueReminder[i];
            }
        }

        public CobrandedValueReminder(f0 card, i kycStatus, List list, boolean z) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
            this.f64903a = card;
            this.f64904b = kycStatus;
            this.f64905c = list;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CobrandedValueReminder)) {
                return false;
            }
            CobrandedValueReminder cobrandedValueReminder = (CobrandedValueReminder) obj2;
            return Intrinsics.f(this.f64903a, cobrandedValueReminder.f64903a) && this.f64904b == cobrandedValueReminder.f64904b && Intrinsics.f(this.f64905c, cobrandedValueReminder.f64905c) && this.d == cobrandedValueReminder.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f64904b.hashCode() + (this.f64903a.hashCode() * 31)) * 31;
            List list = this.f64905c;
            return Boolean.hashCode(this.d) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64903a);
            dest.writeString(this.f64904b.name());
            List list = this.f64905c;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeSerializable((Serializable) itQ.next());
                }
            }
            dest.writeInt(this.d ? 1 : 0);
        }
    }
}
