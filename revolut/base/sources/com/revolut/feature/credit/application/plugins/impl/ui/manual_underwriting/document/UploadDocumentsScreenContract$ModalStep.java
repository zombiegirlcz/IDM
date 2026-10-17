package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/UploadDocumentsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PasswordInput", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/UploadDocumentsScreenContract$ModalStep$PasswordInput;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UploadDocumentsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/UploadDocumentsScreenContract$ModalStep$PasswordInput;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/document/UploadDocumentsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordInput extends UploadDocumentsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PasswordInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f67924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DocumentValidationConfig f67925c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PasswordInput(parcel.readString(), parcel.readString(), (DocumentValidationConfig) parcel.readParcelable(PasswordInput.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PasswordInput[i];
            }
        }

        public PasswordInput(String documentPath, String documentName, DocumentValidationConfig validationConfig) {
            Intrinsics.checkNotNullParameter(documentPath, "documentPath");
            Intrinsics.checkNotNullParameter(documentName, "documentName");
            Intrinsics.checkNotNullParameter(validationConfig, "validationConfig");
            this.f67923a = documentPath;
            this.f67924b = documentName;
            this.f67925c = validationConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PasswordInput)) {
                return false;
            }
            PasswordInput passwordInput = (PasswordInput) obj2;
            return Intrinsics.f(this.f67923a, passwordInput.f67923a) && Intrinsics.f(this.f67924b, passwordInput.f67924b) && Intrinsics.f(this.f67925c, passwordInput.f67925c);
        }

        public final int hashCode() {
            return this.f67925c.hashCode() + p.a.c(this.f67923a.hashCode() * 31, 31, this.f67924b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67923a);
            dest.writeString(this.f67924b);
            dest.writeParcelable(this.f67925c, i);
        }
    }

    private UploadDocumentsScreenContract$ModalStep() {
    }
}
