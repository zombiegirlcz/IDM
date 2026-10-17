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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/invoices/api/domain/model/InvoiceTemplateCreatePayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceTemplateCreatePayload implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86407c;
    public final boolean d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u9d.b f86408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86409h;
    public final String i;

    @NotNull
    public static final Parcelable.Creator<InvoiceTemplateCreatePayload> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            boolean z4 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(InvoiceTemplate.CustomField.CREATOR, parcel, arrayList, iA, i);
            }
            return new InvoiceTemplateCreatePayload(string, string2, z, z3, z4, arrayList, parcel.readInt() == 0 ? null : u9d.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceTemplateCreatePayload[i];
        }
    }

    public InvoiceTemplateCreatePayload(String templateName, String invoiceTitle, boolean z, boolean z3, boolean z4, List customFields, u9d.b bVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(invoiceTitle, "invoiceTitle");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        this.f86405a = templateName;
        this.f86406b = invoiceTitle;
        this.f86407c = z;
        this.d = z3;
        this.e = z4;
        this.f = customFields;
        this.f86408g = bVar;
        this.f86409h = str;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoiceTemplateCreatePayload)) {
            return false;
        }
        InvoiceTemplateCreatePayload invoiceTemplateCreatePayload = (InvoiceTemplateCreatePayload) obj2;
        return Intrinsics.f(this.f86405a, invoiceTemplateCreatePayload.f86405a) && Intrinsics.f(this.f86406b, invoiceTemplateCreatePayload.f86406b) && this.f86407c == invoiceTemplateCreatePayload.f86407c && this.d == invoiceTemplateCreatePayload.d && this.e == invoiceTemplateCreatePayload.e && Intrinsics.f(this.f, invoiceTemplateCreatePayload.f) && this.f86408g == invoiceTemplateCreatePayload.f86408g && Intrinsics.f(this.f86409h, invoiceTemplateCreatePayload.f86409h) && Intrinsics.f(this.i, invoiceTemplateCreatePayload.i);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(j6.a.c(j6.a.c(p.a.c(this.f86405a.hashCode() * 31, 31, this.f86406b), 31, this.f86407c), 31, this.d), 31, this.e), 31, this.f);
        u9d.b bVar = this.f86408g;
        int iHashCode = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f86409h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86405a);
        dest.writeString(this.f86406b);
        dest.writeInt(this.f86407c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            ((InvoiceTemplate.CustomField) itV.next()).writeToParcel(dest, i);
        }
        u9d.b bVar = this.f86408g;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f86409h);
        dest.writeString(this.i);
    }
}
