package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Button", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPdfDocumentControllerContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditPdfDocumentControllerContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f67540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f67541b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$Configuration$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/credit/application/plugins/impl/ui/document/pdf/d", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f67542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f67543b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button((Clause) parcel.readParcelable(Button.class.getClassLoader()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(Clause text, d type) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f67542a = text;
            this.f67543b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f67542a, button.f67542a) && this.f67543b == button.f67543b;
        }

        public final int hashCode() {
            return this.f67543b.hashCode() + (this.f67542a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67542a, i);
            dest.writeString(this.f67543b.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPdfDocumentControllerContract$Configuration((Clause) parcel.readParcelable(CreditPdfDocumentControllerContract$Configuration.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPdfDocumentControllerContract$Configuration[i];
        }
    }

    public CreditPdfDocumentControllerContract$Configuration(Clause title, Button button) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f67540a = title;
        this.f67541b = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPdfDocumentControllerContract$Configuration)) {
            return false;
        }
        CreditPdfDocumentControllerContract$Configuration creditPdfDocumentControllerContract$Configuration = (CreditPdfDocumentControllerContract$Configuration) obj2;
        return Intrinsics.f(this.f67540a, creditPdfDocumentControllerContract$Configuration.f67540a) && Intrinsics.f(this.f67541b, creditPdfDocumentControllerContract$Configuration.f67541b);
    }

    public final int hashCode() {
        int iHashCode = this.f67540a.hashCode() * 31;
        Button button = this.f67541b;
        return iHashCode + (button == null ? 0 : button.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67540a, i);
        Button button = this.f67541b;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
    }
}
