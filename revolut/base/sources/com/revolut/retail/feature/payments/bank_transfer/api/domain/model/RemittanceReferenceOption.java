package com.revolut.retail.feature.payments.bank_transfer.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceReferenceOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLabel", "label", "b", "type", "", "Lcom/revolut/retail/feature/payments/bank_transfer/api/domain/model/RemittanceReferenceField;", "c", "Ljava/util/List;", "()Ljava/util/List;", "fields", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittanceReferenceOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemittanceReferenceOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("fields")
    @NotNull
    private final List<RemittanceReferenceField> fields;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RemittanceReferenceField.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RemittanceReferenceOption(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittanceReferenceOption[i];
        }
    }

    public RemittanceReferenceOption(String label, String type, ArrayList fields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.label = label;
        this.type = type;
        this.fields = fields;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittanceReferenceOption)) {
            return false;
        }
        RemittanceReferenceOption remittanceReferenceOption = (RemittanceReferenceOption) obj2;
        return Intrinsics.f(this.label, remittanceReferenceOption.label) && Intrinsics.f(this.type, remittanceReferenceOption.type) && Intrinsics.f(this.fields, remittanceReferenceOption.fields);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        return this.fields.hashCode() + p.a.c(this.label.hashCode() * 31, 31, this.type);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.type);
        Iterator itV = p.a.v(this.fields, dest);
        while (itV.hasNext()) {
            ((RemittanceReferenceField) itV.next()).writeToParcel(dest, i);
        }
    }
}
