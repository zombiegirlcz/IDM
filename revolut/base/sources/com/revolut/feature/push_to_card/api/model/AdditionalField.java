package com.revolut.feature.push_to_card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/push_to_card/api/model/AdditionalField;", "Landroid/os/Parcelable;", "<init>", "()V", "TextField", "DropdownField", "Lcom/revolut/feature/push_to_card/api/model/AdditionalField$DropdownField;", "Lcom/revolut/feature/push_to_card/api/model/AdditionalField$TextField;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdditionalField implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/model/AdditionalField$DropdownField;", "Lcom/revolut/feature/push_to_card/api/model/AdditionalField;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropdownField extends AdditionalField {

        @NotNull
        public static final Parcelable.Creator<DropdownField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DropdownFieldContent f81504b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropdownField(parcel.readString(), DropdownFieldContent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropdownField[i];
            }
        }

        public DropdownField(String id10, DropdownFieldContent content) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f81503a = id10;
            this.f81504b = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropdownField)) {
                return false;
            }
            DropdownField dropdownField = (DropdownField) obj2;
            return Intrinsics.f(this.f81503a, dropdownField.f81503a) && Intrinsics.f(this.f81504b, dropdownField.f81504b);
        }

        public final int hashCode() {
            return this.f81504b.hashCode() + (this.f81503a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81503a);
            this.f81504b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/model/AdditionalField$TextField;", "Lcom/revolut/feature/push_to_card/api/model/AdditionalField;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextField extends AdditionalField {

        @NotNull
        public static final Parcelable.Creator<TextField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextFieldContent f81506b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextField(parcel.readString(), TextFieldContent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextField[i];
            }
        }

        public TextField(String id10, TextFieldContent content) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f81505a = id10;
            this.f81506b = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) obj2;
            return Intrinsics.f(this.f81505a, textField.f81505a) && Intrinsics.f(this.f81506b, textField.f81506b);
        }

        public final int hashCode() {
            return this.f81506b.hashCode() + (this.f81505a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81505a);
            this.f81506b.writeToParcel(dest, i);
        }
    }

    private AdditionalField() {
    }
}
