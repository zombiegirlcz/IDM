package com.revolut.feature.user_declarations.shared.flows.pep.screens.pep_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Help", "Relationship", "DocumentType", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep$DocumentType;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep$Help;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep$Relationship;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PepFormScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep$DocumentType;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentType implements PepFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentType f94653a = new DocumentType();

        @NotNull
        public static final Parcelable.Creator<DocumentType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentType.f94653a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentType[i];
            }
        }

        private DocumentType() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep$Help;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Help implements PepFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Help f94654a = new Help();

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Help.f94654a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Help[i];
            }
        }

        private Help() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep$Relationship;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/pep_form/PepFormScreenContract$ModalStep;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Relationship implements PepFormScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Relationship f94655a = new Relationship();

        @NotNull
        public static final Parcelable.Creator<Relationship> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Relationship.f94655a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Relationship[i];
            }
        }

        private Relationship() {
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
}
