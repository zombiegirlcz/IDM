package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny3.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/documents_upload/summary/SummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f67597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f67598c;
    public final zv3.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SummaryScreenContract$InputData(parcel.readString(), (o) parcel.readSerializable(), parcel.createStringArrayList(), zv3.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SummaryScreenContract$InputData[i];
        }
    }

    public SummaryScreenContract$InputData(String context, o configuration, ArrayList requiredDocumentsIds, zv3.a navigationIcon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(requiredDocumentsIds, "requiredDocumentsIds");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f67596a = context;
        this.f67597b = configuration;
        this.f67598c = requiredDocumentsIds;
        this.d = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SummaryScreenContract$InputData)) {
            return false;
        }
        SummaryScreenContract$InputData summaryScreenContract$InputData = (SummaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67596a, summaryScreenContract$InputData.f67596a) && Intrinsics.f(this.f67597b, summaryScreenContract$InputData.f67597b) && Intrinsics.f(this.f67598c, summaryScreenContract$InputData.f67598c) && this.d == summaryScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f67597b.hashCode() + (this.f67596a.hashCode() * 31)) * 31, 31, this.f67598c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67596a);
        dest.writeSerializable(this.f67597b);
        dest.writeStringList(this.f67598c);
        dest.writeString(this.d.name());
    }
}
