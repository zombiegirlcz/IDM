package com.revolut.retail.feature.payments.bank_transfer.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import lg.b;
import org.jetbrains.annotations.NotNull;
import z1k.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\t\u0010\u001eR\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010$\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u000f\u0010\u001eR\u001a\u0010&\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\f\u0010\u001e¨\u0006'"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceReferenceField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "J", "type", "b", "getLabel", "label", "c", "getRegex", "regex", "d", "e", "inputMask", "Lz1k/d;", "Lz1k/d;", "j", "()Lz1k/d;", "inputType", "f", "getDescription", "description", "", "g", "Z", "z", "()Z", "optional", "h", "editable", "i", "defaultValue", "hiddenInput", "k", "hiddenInReview", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittanceReferenceField implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemittanceReferenceField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("regex")
    @NotNull
    private final String regex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("inputMask")
    private final String inputMask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("inputType")
    @NotNull
    private final d inputType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("description")
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("optional")
    private final boolean optional;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("editable")
    private final boolean editable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("defaultValue")
    @NotNull
    private final String defaultValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("hiddenInput")
    private final boolean hiddenInput;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @b("hiddenInReview")
    private final boolean hiddenInReview;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            String str;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            d dVarValueOf = d.valueOf(parcel.readString());
            String string5 = parcel.readString();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z3;
                str = string6;
                z6 = z4;
            } else {
                z4 = z3;
                str = string6;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new RemittanceReferenceField(string, string2, string3, string4, dVarValueOf, string5, z11, z12, str, z6, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittanceReferenceField[i];
        }
    }

    public RemittanceReferenceField(String type, String label, String regex, String str, d inputType, String str2, boolean z, boolean z3, String defaultValue, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.type = type;
        this.label = label;
        this.regex = regex;
        this.inputMask = str;
        this.inputType = inputType;
        this.description = str2;
        this.optional = z;
        this.editable = z3;
        this.defaultValue = defaultValue;
        this.hiddenInput = z4;
        this.hiddenInReview = z6;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean T() {
        String str = this.inputMask;
        return !(str == null || d0.W(str));
    }

    public final boolean W(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new Regex(this.regex).f(input);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHiddenInReview() {
        return this.hiddenInReview;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHiddenInput() {
        return this.hiddenInput;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInputMask() {
        return this.inputMask;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittanceReferenceField)) {
            return false;
        }
        RemittanceReferenceField remittanceReferenceField = (RemittanceReferenceField) obj2;
        return Intrinsics.f(this.type, remittanceReferenceField.type) && Intrinsics.f(this.label, remittanceReferenceField.label) && Intrinsics.f(this.regex, remittanceReferenceField.regex) && Intrinsics.f(this.inputMask, remittanceReferenceField.inputMask) && this.inputType == remittanceReferenceField.inputType && Intrinsics.f(this.description, remittanceReferenceField.description) && this.optional == remittanceReferenceField.optional && this.editable == remittanceReferenceField.editable && Intrinsics.f(this.defaultValue, remittanceReferenceField.defaultValue) && this.hiddenInput == remittanceReferenceField.hiddenInput && this.hiddenInReview == remittanceReferenceField.hiddenInReview;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.label), 31, this.regex);
        String str = this.inputMask;
        int iHashCode = (this.inputType.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.description;
        return Boolean.hashCode(this.hiddenInReview) + j6.a.c(p.a.c(j6.a.c(j6.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.optional), 31, this.editable), 31, this.defaultValue), 31, this.hiddenInput);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getInputType() {
        return this.inputType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type);
        dest.writeString(this.label);
        dest.writeString(this.regex);
        dest.writeString(this.inputMask);
        dest.writeString(this.inputType.name());
        dest.writeString(this.description);
        dest.writeInt(this.optional ? 1 : 0);
        dest.writeInt(this.editable ? 1 : 0);
        dest.writeString(this.defaultValue);
        dest.writeInt(this.hiddenInput ? 1 : 0);
        dest.writeInt(this.hiddenInReview ? 1 : 0);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getOptional() {
        return this.optional;
    }
}
