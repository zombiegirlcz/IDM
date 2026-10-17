package com.revolut.feature.kyc.impl.document_collection.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DocumentSelection", "Citizenship", "Lcom/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step$Citizenship;", "Lcom/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step$DocumentSelection;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentCollectionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step$Citizenship;", "Lcom/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Citizenship implements DocumentCollectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Citizenship f77629a = new Citizenship();

        @NotNull
        public static final Parcelable.Creator<Citizenship> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Citizenship.f77629a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Citizenship[i];
            }
        }

        private Citizenship() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step$DocumentSelection;", "Lcom/revolut/feature/kyc/impl/document_collection/flow/DocumentCollectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelection implements DocumentCollectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f77631b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new DocumentSelection(arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        public DocumentSelection(List documents, b citizenship) {
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f77630a = citizenship;
            this.f77631b = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentSelection)) {
                return false;
            }
            DocumentSelection documentSelection = (DocumentSelection) obj2;
            return Intrinsics.f(this.f77630a, documentSelection.f77630a) && Intrinsics.f(this.f77631b, documentSelection.f77631b);
        }

        public final int hashCode() {
            return this.f77631b.hashCode() + (this.f77630a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77630a);
            Iterator itV = p.a.v(this.f77631b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }
}
