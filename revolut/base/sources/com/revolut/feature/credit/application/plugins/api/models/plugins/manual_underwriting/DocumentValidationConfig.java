package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/DocumentValidationConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentValidationConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentValidationConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f66469b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Keyword.CREATOR, parcel, arrayList, iA, 1);
            }
            return new DocumentValidationConfig(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentValidationConfig[i];
        }
    }

    public DocumentValidationConfig(String referralFlagName, ArrayList keywords) {
        Intrinsics.checkNotNullParameter(referralFlagName, "referralFlagName");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        this.f66468a = referralFlagName;
        this.f66469b = keywords;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentValidationConfig)) {
            return false;
        }
        DocumentValidationConfig documentValidationConfig = (DocumentValidationConfig) obj2;
        return Intrinsics.f(this.f66468a, documentValidationConfig.f66468a) && this.f66469b.equals(documentValidationConfig.f66469b);
    }

    public final int hashCode() {
        return this.f66469b.hashCode() + (this.f66468a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66468a);
        Iterator itY = j6.a.y(this.f66469b, dest);
        while (itY.hasNext()) {
            ((Keyword) itY.next()).writeToParcel(dest, i);
        }
    }
}
