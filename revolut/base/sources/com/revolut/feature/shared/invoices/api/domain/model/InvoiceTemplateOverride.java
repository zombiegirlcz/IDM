package com.revolut.feature.shared.invoices.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u9d.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shared/invoices/api/domain/model/InvoiceTemplateOverride;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Value", "u9d/c", "a", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceTemplateOverride implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9d.b f86410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f86412c;
    public final Value d;
    public final Value e;

    @NotNull
    public static final Parcelable.Creator<InvoiceTemplateOverride> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/invoices/api/domain/model/InvoiceTemplateOverride$Value;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f86413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86414b;

        @NotNull
        public static final Parcelable.Creator<Value> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Value(parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Value[i];
            }
        }

        public Value(c cVar, String str) {
            this.f86413a = cVar;
            this.f86414b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Value)) {
                return false;
            }
            Value value = (Value) obj2;
            return this.f86413a == value.f86413a && Intrinsics.f(this.f86414b, value.f86414b);
        }

        public final int hashCode() {
            c cVar = this.f86413a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            String str = this.f86414b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            c cVar = this.f86413a;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            dest.writeString(this.f86414b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            u9d.b bVarValueOf = parcel.readInt() == 0 ? null : u9d.b.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(InvoiceTemplate.CustomField.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new InvoiceTemplateOverride(bVarValueOf, string, arrayList, parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Value.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceTemplateOverride[i];
        }
    }

    public InvoiceTemplateOverride(u9d.b bVar, String str, List list, Value value, Value value2) {
        this.f86410a = bVar;
        this.f86411b = str;
        this.f86412c = list;
        this.d = value;
        this.e = value2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoiceTemplateOverride)) {
            return false;
        }
        InvoiceTemplateOverride invoiceTemplateOverride = (InvoiceTemplateOverride) obj2;
        return this.f86410a == invoiceTemplateOverride.f86410a && Intrinsics.f(this.f86411b, invoiceTemplateOverride.f86411b) && Intrinsics.f(this.f86412c, invoiceTemplateOverride.f86412c) && Intrinsics.f(this.d, invoiceTemplateOverride.d) && Intrinsics.f(this.e, invoiceTemplateOverride.e);
    }

    public final int hashCode() {
        u9d.b bVar = this.f86410a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f86411b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f86412c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Value value = this.d;
        int iHashCode4 = (iHashCode3 + (value == null ? 0 : value.hashCode())) * 31;
        Value value2 = this.e;
        return iHashCode4 + (value2 != null ? value2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        u9d.b bVar = this.f86410a;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f86411b);
        List list = this.f86412c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((InvoiceTemplate.CustomField) itQ.next()).writeToParcel(dest, i);
            }
        }
        Value value = this.d;
        if (value == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            value.writeToParcel(dest, i);
        }
        Value value2 = this.e;
        if (value2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            value2.writeToParcel(dest, i);
        }
    }

    public InvoiceTemplateOverride() {
        this(null, null, null, null, null);
    }
}
