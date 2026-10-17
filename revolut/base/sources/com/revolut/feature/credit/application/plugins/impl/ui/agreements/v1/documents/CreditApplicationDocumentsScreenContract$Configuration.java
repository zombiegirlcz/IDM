package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/documents/CreditApplicationDocumentsScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationDocumentsScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationDocumentsScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f67003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f67004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f67005c;
    public final Image d;
    public final Clause e;
    public final AgreementsScreenConfig.Disclaimer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f67006g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CreditApplicationDocumentsScreenContract$Configuration(arrayList, (Clause) parcel.readParcelable(CreditApplicationDocumentsScreenContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(CreditApplicationDocumentsScreenContract$Configuration.class.getClassLoader()), (Image) parcel.readParcelable(CreditApplicationDocumentsScreenContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(CreditApplicationDocumentsScreenContract$Configuration.class.getClassLoader()), (AgreementsScreenConfig.Disclaimer) parcel.readParcelable(CreditApplicationDocumentsScreenContract$Configuration.class.getClassLoader()), (Clause) parcel.readParcelable(CreditApplicationDocumentsScreenContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationDocumentsScreenContract$Configuration[i];
        }
    }

    public CreditApplicationDocumentsScreenContract$Configuration(List documents, Clause title, Clause clause, Image image, Clause description, AgreementsScreenConfig.Disclaimer disclaimer, Clause buttonText) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f67003a = documents;
        this.f67004b = title;
        this.f67005c = clause;
        this.d = image;
        this.e = description;
        this.f = disclaimer;
        this.f67006g = buttonText;
    }

    public final CreditApplicationDocumentsScreenContract$Configuration a(String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        List<du3.a> list = this.f67003a;
        ArrayList documents = new ArrayList(w.t(list, 10));
        for (du3.a aVar : list) {
            boolean z = aVar.f || Intrinsics.f(aVar.f117551a, documentId);
            String id10 = aVar.f117551a;
            String displayName = aVar.f117552b;
            String str = aVar.f117553c;
            String documentHtmlUrl = aVar.d;
            String documentPdfUrl = aVar.e;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(documentHtmlUrl, "documentHtmlUrl");
            Intrinsics.checkNotNullParameter(documentPdfUrl, "documentPdfUrl");
            documents.add(new du3.a(id10, displayName, str, documentHtmlUrl, documentPdfUrl, z));
        }
        Intrinsics.checkNotNullParameter(documents, "documents");
        Clause title = this.f67004b;
        Intrinsics.checkNotNullParameter(title, "title");
        Clause description = this.e;
        Intrinsics.checkNotNullParameter(description, "description");
        Clause buttonText = this.f67006g;
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new CreditApplicationDocumentsScreenContract$Configuration(documents, title, this.f67005c, this.d, description, this.f, buttonText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationDocumentsScreenContract$Configuration)) {
            return false;
        }
        CreditApplicationDocumentsScreenContract$Configuration creditApplicationDocumentsScreenContract$Configuration = (CreditApplicationDocumentsScreenContract$Configuration) obj2;
        return Intrinsics.f(this.f67003a, creditApplicationDocumentsScreenContract$Configuration.f67003a) && Intrinsics.f(this.f67004b, creditApplicationDocumentsScreenContract$Configuration.f67004b) && Intrinsics.f(this.f67005c, creditApplicationDocumentsScreenContract$Configuration.f67005c) && Intrinsics.f(this.d, creditApplicationDocumentsScreenContract$Configuration.d) && Intrinsics.f(this.e, creditApplicationDocumentsScreenContract$Configuration.e) && Intrinsics.f(this.f, creditApplicationDocumentsScreenContract$Configuration.f) && Intrinsics.f(this.f67006g, creditApplicationDocumentsScreenContract$Configuration.f67006g);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f67003a.hashCode() * 31, 31, this.f67004b);
        Clause clause = this.f67005c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.d;
        int iA2 = p.a.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.e);
        AgreementsScreenConfig.Disclaimer disclaimer = this.f;
        return this.f67006g.hashCode() + ((iA2 + (disclaimer != null ? disclaimer.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f67003a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeParcelable(this.f67004b, i);
        dest.writeParcelable(this.f67005c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f67006g, i);
    }
}
