package com.revolut.feature.insurance_embedded.impl.ui.screen.document.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/screen/document/text/SimpleTextDocumentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimpleTextDocumentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SimpleTextDocumentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f76097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76098b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimpleTextDocumentScreenContract$InputData((Clause) parcel.readParcelable(SimpleTextDocumentScreenContract$InputData.class.getClassLoader()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleTextDocumentScreenContract$InputData[i];
        }
    }

    public SimpleTextDocumentScreenContract$InputData(Clause title, List values) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f76097a = title;
        this.f76098b = values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimpleTextDocumentScreenContract$InputData)) {
            return false;
        }
        SimpleTextDocumentScreenContract$InputData simpleTextDocumentScreenContract$InputData = (SimpleTextDocumentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f76097a, simpleTextDocumentScreenContract$InputData.f76097a) && Intrinsics.f(this.f76098b, simpleTextDocumentScreenContract$InputData.f76098b);
    }

    public final int hashCode() {
        return this.f76098b.hashCode() + (this.f76097a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76097a, i);
        dest.writeStringList(this.f76098b);
    }
}
