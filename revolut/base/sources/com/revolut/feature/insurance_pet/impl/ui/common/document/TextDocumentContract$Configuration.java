package com.revolut.feature.insurance_pet.impl.ui.common.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/common/document/TextDocumentContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextDocumentContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextDocumentContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f76263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76264c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(TextDocumentContract$Configuration.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TextDocumentContract$Configuration.class, parcel, arrayList, iE, 1);
            }
            return new TextDocumentContract$Configuration(clause, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextDocumentContract$Configuration[i];
        }
    }

    public TextDocumentContract$Configuration(Clause documentName, String flowName, List documentParagraphs) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        Intrinsics.checkNotNullParameter(documentParagraphs, "documentParagraphs");
        this.f76262a = flowName;
        this.f76263b = documentName;
        this.f76264c = documentParagraphs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextDocumentContract$Configuration)) {
            return false;
        }
        TextDocumentContract$Configuration textDocumentContract$Configuration = (TextDocumentContract$Configuration) obj2;
        return Intrinsics.f(this.f76262a, textDocumentContract$Configuration.f76262a) && Intrinsics.f(this.f76263b, textDocumentContract$Configuration.f76263b) && Intrinsics.f(this.f76264c, textDocumentContract$Configuration.f76264c);
    }

    public final int hashCode() {
        return this.f76264c.hashCode() + p.a.a(this.f76262a.hashCode() * 31, 31, this.f76263b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76262a);
        dest.writeParcelable(this.f76263b, i);
        Iterator itV = p.a.v(this.f76264c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
