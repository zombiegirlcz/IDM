package com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import ht3.l0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny3.f;
import ny3.g;
import ny3.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Summary", "UploadDocument", "Info", "MissingOptionalDocumentConfirmation", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$Info;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$MissingOptionalDocumentConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$Summary;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$UploadDocument;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentsUploadFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$Info;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info implements DocumentsUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f67588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditPromptAnalyticsConfiguration f67589b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((l0) parcel.readSerializable(), (CreditPromptAnalyticsConfiguration) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(l0 configuration, CreditPromptAnalyticsConfiguration analyticsConfiguration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(analyticsConfiguration, "analyticsConfiguration");
            this.f67588a = configuration;
            this.f67589b = analyticsConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Info)) {
                return false;
            }
            Info info = (Info) obj2;
            return Intrinsics.f(this.f67588a, info.f67588a) && Intrinsics.f(this.f67589b, info.f67589b);
        }

        public final int hashCode() {
            return this.f67589b.hashCode() + (this.f67588a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67588a);
            dest.writeParcelable(this.f67589b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$MissingOptionalDocumentConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MissingOptionalDocumentConfirmation implements DocumentsUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MissingOptionalDocumentConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f67590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f67591b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                g gVar = (g) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string = parcel.readString();
                    int i3 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i3);
                    int iC = 0;
                    while (iC != i3) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                    }
                    linkedHashMap.put(string, arrayList);
                }
                return new MissingOptionalDocumentConfirmation(gVar, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MissingOptionalDocumentConfirmation[i];
            }
        }

        public MissingOptionalDocumentConfirmation(g missingOptionalDocumentConfirmationPopup, Map uploadedDocuments) {
            Intrinsics.checkNotNullParameter(missingOptionalDocumentConfirmationPopup, "missingOptionalDocumentConfirmationPopup");
            Intrinsics.checkNotNullParameter(uploadedDocuments, "uploadedDocuments");
            this.f67590a = missingOptionalDocumentConfirmationPopup;
            this.f67591b = uploadedDocuments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MissingOptionalDocumentConfirmation)) {
                return false;
            }
            MissingOptionalDocumentConfirmation missingOptionalDocumentConfirmation = (MissingOptionalDocumentConfirmation) obj2;
            return Intrinsics.f(this.f67590a, missingOptionalDocumentConfirmation.f67590a) && Intrinsics.f(this.f67591b, missingOptionalDocumentConfirmation.f67591b);
        }

        public final int hashCode() {
            return this.f67591b.hashCode() + (this.f67590a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67590a);
            Iterator itZ = j6.a.z(this.f67591b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                Iterator itV = p.a.v((List) entry.getValue(), dest);
                while (itV.hasNext()) {
                    dest.writeSerializable((Serializable) itV.next());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$Summary;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements DocumentsUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f67592a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(h configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67592a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Summary) && Intrinsics.f(this.f67592a, ((Summary) obj2).f67592a);
        }

        public final int hashCode() {
            return this.f67592a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67592a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step$UploadDocument;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/documents_upload/flow/DocumentsUploadFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UploadDocument implements DocumentsUploadFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UploadDocument> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f67593a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UploadDocument((f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UploadDocument[i];
            }
        }

        public UploadDocument(f configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67593a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UploadDocument) && Intrinsics.f(this.f67593a, ((UploadDocument) obj2).f67593a);
        }

        public final int hashCode() {
            return this.f67593a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67593a);
        }
    }
}
