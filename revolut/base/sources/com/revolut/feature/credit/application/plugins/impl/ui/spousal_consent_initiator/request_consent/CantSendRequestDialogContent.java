package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/spousal_consent_initiator/request_consent/CantSendRequestDialogContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CantSendRequestDialogContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CantSendRequestDialogContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f68448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f68449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f68450c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CantSendRequestDialogContent((Clause) parcel.readParcelable(CantSendRequestDialogContent.class.getClassLoader()), (Clause) parcel.readParcelable(CantSendRequestDialogContent.class.getClassLoader()), (Clause) parcel.readParcelable(CantSendRequestDialogContent.class.getClassLoader()), (Clause) parcel.readParcelable(CantSendRequestDialogContent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CantSendRequestDialogContent[i];
        }
    }

    public CantSendRequestDialogContent(Clause title, Clause description, Clause primaryButtonText, Clause secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f68448a = title;
        this.f68449b = description;
        this.f68450c = primaryButtonText;
        this.d = secondaryButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CantSendRequestDialogContent)) {
            return false;
        }
        CantSendRequestDialogContent cantSendRequestDialogContent = (CantSendRequestDialogContent) obj2;
        return Intrinsics.f(this.f68448a, cantSendRequestDialogContent.f68448a) && Intrinsics.f(this.f68449b, cantSendRequestDialogContent.f68449b) && Intrinsics.f(this.f68450c, cantSendRequestDialogContent.f68450c) && Intrinsics.f(this.d, cantSendRequestDialogContent.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f68448a.hashCode() * 31, 31, this.f68449b), 31, this.f68450c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68448a, i);
        dest.writeParcelable(this.f68449b, i);
        dest.writeParcelable(this.f68450c, i);
        dest.writeParcelable(this.d, i);
    }
}
