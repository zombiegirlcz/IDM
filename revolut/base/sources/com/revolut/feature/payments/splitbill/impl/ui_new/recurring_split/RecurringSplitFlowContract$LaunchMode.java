package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode", "Landroid/os/Parcelable;", "Update", "Creation", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode$Creation;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode$Update;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecurringSplitFlowContract$LaunchMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode$Creation;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode;", "<init>", "()V", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Creation implements RecurringSplitFlowContract$LaunchMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Creation f79898a = new Creation();

        @NotNull
        public static final Parcelable.Creator<Creation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Creation.f79898a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Creation[i];
            }
        }

        private Creation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode$Update;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlowContract$LaunchMode;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Update implements RecurringSplitFlowContract$LaunchMode {

        @NotNull
        public static final Parcelable.Creator<Update> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f79901c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(Update.class, parcel, arrayList2, iE, 1);
                }
                return new Update(string, arrayList, arrayList2, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Update[i];
            }
        }

        public Update(String id10, List preselectedContacts, List participantsSplits, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(preselectedContacts, "preselectedContacts");
            Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
            this.f79899a = id10;
            this.f79900b = preselectedContacts;
            this.f79901c = participantsSplits;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Update)) {
                return false;
            }
            Update update = (Update) obj2;
            return Intrinsics.f(this.f79899a, update.f79899a) && Intrinsics.f(this.f79900b, update.f79900b) && Intrinsics.f(this.f79901c, update.f79901c) && Intrinsics.f(this.d, update.d);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.d(this.f79899a.hashCode() * 31, 31, this.f79900b), 31, this.f79901c);
            String str = this.d;
            return iD + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79899a);
            Iterator itV = p.a.v(this.f79900b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = p.a.v(this.f79901c, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
            dest.writeString(this.d);
        }
    }
}
