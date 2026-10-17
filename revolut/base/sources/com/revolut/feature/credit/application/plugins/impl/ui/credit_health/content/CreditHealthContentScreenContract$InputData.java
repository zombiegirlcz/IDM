package com.revolut.feature.credit.application.plugins.impl.ui.credit_health.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/credit_health/content/CreditHealthContentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditHealthContentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditHealthContentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f67393c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CreditHealthContentScreenContract$InputData(string, string2, parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditHealthContentScreenContract$InputData[i];
        }
    }

    public CreditHealthContentScreenContract$InputData(String title, String str, String primaryButtonTitle, String str2, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f67391a = title;
        this.f67392b = str;
        this.f67393c = items;
        this.d = primaryButtonTitle;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditHealthContentScreenContract$InputData)) {
            return false;
        }
        CreditHealthContentScreenContract$InputData creditHealthContentScreenContract$InputData = (CreditHealthContentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67391a, creditHealthContentScreenContract$InputData.f67391a) && Intrinsics.f(this.f67392b, creditHealthContentScreenContract$InputData.f67392b) && Intrinsics.f(this.f67393c, creditHealthContentScreenContract$InputData.f67393c) && Intrinsics.f(this.d, creditHealthContentScreenContract$InputData.d) && Intrinsics.f(this.e, creditHealthContentScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f67391a.hashCode() * 31;
        String str = this.f67392b;
        int iC = p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f67393c), 31, this.d);
        String str2 = this.e;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67391a);
        dest.writeString(this.f67392b);
        Iterator itV = p.a.v(this.f67393c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
