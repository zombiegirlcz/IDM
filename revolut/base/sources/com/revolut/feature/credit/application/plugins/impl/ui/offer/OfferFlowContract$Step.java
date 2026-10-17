package com.revolut.feature.credit.application.plugins.impl.ui.offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AnimatedIntro", "OfferContent", "EditOffer", "DocumentViewer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$AnimatedIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$EditOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$OfferContent;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OfferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$AnimatedIntro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnimatedIntro extends OfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AnimatedIntro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hs3.c f68066a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnimatedIntro((hs3.c) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnimatedIntro[i];
            }
        }

        public AnimatedIntro(hs3.c intro) {
            Intrinsics.checkNotNullParameter(intro, "intro");
            this.f68066a = intro;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnimatedIntro) && Intrinsics.f(this.f68066a, ((AnimatedIntro) obj2).f68066a);
        }

        public final int hashCode() {
            return this.f68066a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68066a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$DocumentViewer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentViewer extends OfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentViewer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final su3.a f68068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocumentViewerScreenConfig f68069c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentViewer(parcel.readString(), (su3.a) parcel.readSerializable(), (DocumentViewerScreenConfig) parcel.readParcelable(DocumentViewer.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentViewer[i];
            }
        }

        public DocumentViewer(String documentId, su3.a document, DocumentViewerScreenConfig screenConfig, String str) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            this.f68067a = documentId;
            this.f68068b = document;
            this.f68069c = screenConfig;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentViewer)) {
                return false;
            }
            DocumentViewer documentViewer = (DocumentViewer) obj2;
            return Intrinsics.f(this.f68067a, documentViewer.f68067a) && Intrinsics.f(this.f68068b, documentViewer.f68068b) && Intrinsics.f(this.f68069c, documentViewer.f68069c) && Intrinsics.f(this.d, documentViewer.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f68069c.hashCode() + ((this.f68068b.hashCode() + (this.f68067a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68067a);
            dest.writeSerializable(this.f68068b);
            dest.writeParcelable(this.f68069c, i);
            dest.writeString(this.d);
        }
    }

    private OfferFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$EditOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditOffer extends OfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f68070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f68071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fu3.a f68072c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditOffer(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? fu3.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditOffer[i];
            }
        }

        public EditOffer(Long l2, Long l3, fu3.a aVar) {
            this.f68070a = l2;
            this.f68071b = l3;
            this.f68072c = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditOffer)) {
                return false;
            }
            EditOffer editOffer = (EditOffer) obj2;
            return Intrinsics.f(this.f68070a, editOffer.f68070a) && Intrinsics.f(this.f68071b, editOffer.f68071b) && this.f68072c == editOffer.f68072c;
        }

        public final int hashCode() {
            Long l2 = this.f68070a;
            int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
            Long l3 = this.f68071b;
            int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
            fu3.a aVar = this.f68072c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l2 = this.f68070a;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            Long l3 = this.f68071b;
            if (l3 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l3);
            }
            fu3.a aVar = this.f68072c;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        public EditOffer() {
            this(null, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step$OfferContent;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer/OfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OfferContent extends OfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OfferContent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f68073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f68074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fu3.a f68075c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OfferContent(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? fu3.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfferContent[i];
            }
        }

        public OfferContent(Long l2, Long l3, fu3.a aVar) {
            this.f68073a = l2;
            this.f68074b = l3;
            this.f68075c = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OfferContent)) {
                return false;
            }
            OfferContent offerContent = (OfferContent) obj2;
            return Intrinsics.f(this.f68073a, offerContent.f68073a) && Intrinsics.f(this.f68074b, offerContent.f68074b) && this.f68075c == offerContent.f68075c;
        }

        public final int hashCode() {
            Long l2 = this.f68073a;
            int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
            Long l3 = this.f68074b;
            int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
            fu3.a aVar = this.f68075c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l2 = this.f68073a;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            Long l3 = this.f68074b;
            if (l3 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l3);
            }
            fu3.a aVar = this.f68075c;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }

        public OfferContent() {
            this(null, null, null);
        }
    }
}
