package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.model.AdditionalFieldOption;
import com.revolut.feature.push_to_card.api.model.DropdownFieldContent;
import com.revolut.feature.push_to_card.api.model.TextFieldContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uqa.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput;", "Landroid/os/Parcelable;", "<init>", "()V", "TextInput", "DropdownInput", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput$DropdownInput;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput$TextInput;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdditionalFieldInput implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput$DropdownInput;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropdownInput extends AdditionalFieldInput {

        @NotNull
        public static final Parcelable.Creator<DropdownInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DropdownFieldContent f81560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AdditionalFieldOption f81561c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropdownInput(parcel.readString(), (DropdownFieldContent) parcel.readParcelable(DropdownInput.class.getClassLoader()), (AdditionalFieldOption) parcel.readParcelable(DropdownInput.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropdownInput[i];
            }
        }

        public DropdownInput(String id10, DropdownFieldContent content, AdditionalFieldOption additionalFieldOption) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f81559a = id10;
            this.f81560b = content;
            this.f81561c = additionalFieldOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DropdownInput)) {
                return false;
            }
            DropdownInput dropdownInput = (DropdownInput) obj2;
            return Intrinsics.f(this.f81559a, dropdownInput.f81559a) && Intrinsics.f(this.f81560b, dropdownInput.f81560b) && Intrinsics.f(this.f81561c, dropdownInput.f81561c);
        }

        @Override // com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF81562a() {
            return this.f81559a;
        }

        public final int hashCode() {
            int iHashCode = (this.f81560b.hashCode() + (this.f81559a.hashCode() * 31)) * 31;
            AdditionalFieldOption additionalFieldOption = this.f81561c;
            return iHashCode + (additionalFieldOption == null ? 0 : additionalFieldOption.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81559a);
            dest.writeParcelable(this.f81560b, i);
            dest.writeParcelable(this.f81561c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput$TextInput;", "Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/model/AdditionalFieldInput;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextInput extends AdditionalFieldInput {

        @NotNull
        public static final Parcelable.Creator<TextInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextFieldContent f81563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81564c;
        public final String d;
        public final b e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextInput(parcel.readString(), (TextFieldContent) parcel.readParcelable(TextInput.class.getClassLoader()), parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextInput[i];
            }
        }

        public TextInput(String id10, TextFieldContent content, String inputValue, String formattedInput, b validationState) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(inputValue, "inputValue");
            Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            this.f81562a = id10;
            this.f81563b = content;
            this.f81564c = inputValue;
            this.d = formattedInput;
            this.e = validationState;
        }

        public static TextInput a(TextInput textInput, String inputValue, String formattedInput, b validationState) {
            String id10 = textInput.f81562a;
            TextFieldContent content = textInput.f81563b;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(inputValue, "inputValue");
            Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
            Intrinsics.checkNotNullParameter(validationState, "validationState");
            return new TextInput(id10, content, inputValue, formattedInput, validationState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TextInput)) {
                return false;
            }
            TextInput textInput = (TextInput) obj2;
            return Intrinsics.f(this.f81562a, textInput.f81562a) && Intrinsics.f(this.f81563b, textInput.f81563b) && Intrinsics.f(this.f81564c, textInput.f81564c) && Intrinsics.f(this.d, textInput.d) && this.e == textInput.e;
        }

        @Override // com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF81562a() {
            return this.f81562a;
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c((this.f81563b.hashCode() + (this.f81562a.hashCode() * 31)) * 31, 31, this.f81564c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81562a);
            dest.writeParcelable(this.f81563b, i);
            dest.writeString(this.f81564c);
            dest.writeString(this.d);
            dest.writeString(this.e.name());
        }
    }

    private AdditionalFieldInput() {
    }

    /* JADX INFO: renamed from: getId */
    public abstract String getF81562a();
}
