package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode;", "Landroid/os/Parcelable;", "SingleSelect", "MultiSelect", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode$MultiSelect;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode$SingleSelect;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContactsChooserMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode$MultiSelect;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultiSelect implements ContactsChooserMode {

        @NotNull
        public static final Parcelable.Creator<MultiSelect> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f66077a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultiSelect(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultiSelect[i];
            }
        }

        public MultiSelect() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MultiSelect) && Intrinsics.f(this.f66077a, ((MultiSelect) obj2).f66077a);
        }

        public final int hashCode() {
            Integer num = this.f66077a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.f66077a;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }

        public MultiSelect(Integer num) {
            this.f66077a = num;
            if (num != null && num.intValue() <= 0) {
                throw new IllegalArgumentException("maxSelectableContacts must be null or positive");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode$SingleSelect;", "Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserMode;", "<init>", "()V", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SingleSelect implements ContactsChooserMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SingleSelect f66078a = new SingleSelect();

        @NotNull
        public static final Parcelable.Creator<SingleSelect> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SingleSelect.f66078a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleSelect[i];
            }
        }

        private SingleSelect() {
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
}
