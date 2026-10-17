package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document", "Landroid/os/Parcelable;", "Local", "Remote", "Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document$Local;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document$Remote;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditPdfDocumentControllerContract$Document extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document$Local;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local implements CreditPdfDocumentControllerContract$Document {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f67544a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local((File) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f67544a = file;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Local) && Intrinsics.f(this.f67544a, ((Local) obj2).f67544a);
        }

        public final int hashCode() {
            return this.f67544a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67544a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document$Remote;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Document;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote implements CreditPdfDocumentControllerContract$Document {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f67546b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(String url2, boolean z) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f67545a = url2;
            this.f67546b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj2;
            return Intrinsics.f(this.f67545a, remote.f67545a) && this.f67546b == remote.f67546b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f67546b) + (this.f67545a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67545a);
            dest.writeInt(this.f67546b ? 1 : 0);
        }
    }
}
