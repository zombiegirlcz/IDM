package com.revolut.feature.insurance_common.ui.screen.documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.insurance_common.data.model.DocumentsGroup;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lno/m;", "<init>", "()V", "Policy", "Preloaded", "Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData$Policy;", "Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData$Preloaded;", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentListScreenContract$InputData implements IOData$Input, m {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData$Policy;", "Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData;", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Policy extends DocumentListScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Policy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f75720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f75721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75722c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Policy((Clause) parcel.readParcelable(Policy.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Policy.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Policy[i];
            }
        }

        public Policy(Clause title, AnalyticsProduct analyticsProduct, boolean z, String policyId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            this.f75720a = title;
            this.f75721b = analyticsProduct;
            this.f75722c = z;
            this.d = policyId;
        }

        @Override // com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF75723a() {
            return this.f75720a;
        }

        @Override // com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData, no.m
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF75724b() {
            return this.f75721b;
        }

        @Override // com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF75725c() {
            return this.f75722c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75720a, i);
            dest.writeParcelable(this.f75721b, i);
            dest.writeInt(this.f75722c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData$Preloaded;", "Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData;", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Preloaded extends DocumentListScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Preloaded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f75723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f75724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75725c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", Preloaded.class);
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(Preloaded.class.getClassLoader());
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DocumentsGroup.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Preloaded(clause, analyticsProduct, z, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Preloaded[i];
            }
        }

        public Preloaded(Clause title, AnalyticsProduct analyticsProduct, boolean z, ArrayList documents) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f75723a = title;
            this.f75724b = analyticsProduct;
            this.f75725c = z;
            this.d = documents;
        }

        @Override // com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF75723a() {
            return this.f75723a;
        }

        @Override // com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData, no.m
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF75724b() {
            return this.f75724b;
        }

        @Override // com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF75725c() {
            return this.f75725c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75723a, i);
            dest.writeParcelable(this.f75724b, i);
            dest.writeInt(this.f75725c ? 1 : 0);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((DocumentsGroup) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    private DocumentListScreenContract$InputData() {
    }

    /* JADX INFO: renamed from: G */
    public abstract Clause getF75723a();

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public abstract AnalyticsProduct getF75724b();

    /* JADX INFO: renamed from: a */
    public abstract boolean getF75725c();
}
