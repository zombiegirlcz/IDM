package com.revolut.feature.payments.social.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import jz9.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/StartAction;", "Landroid/os/Parcelable;", "<init>", "()V", "ShowBottomDialog", "Lcom/revolut/feature/payments/social/api/model/StartAction$ShowBottomDialog;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StartAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/model/StartAction$ShowBottomDialog;", "Lcom/revolut/feature/payments/social/api/model/StartAction;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBottomDialog extends StartAction {

        @NotNull
        public static final Parcelable.Creator<ShowBottomDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f79725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f79726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f79727c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBottomDialog((Clause) parcel.readParcelable(ShowBottomDialog.class.getClassLoader()), (Clause) parcel.readParcelable(ShowBottomDialog.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBottomDialog[i];
            }
        }

        public ShowBottomDialog(Clause title, Clause subtitle, b type) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f79725a = title;
            this.f79726b = subtitle;
            this.f79727c = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowBottomDialog)) {
                return false;
            }
            ShowBottomDialog showBottomDialog = (ShowBottomDialog) obj2;
            return Intrinsics.f(this.f79725a, showBottomDialog.f79725a) && Intrinsics.f(this.f79726b, showBottomDialog.f79726b) && this.f79727c == showBottomDialog.f79727c;
        }

        public final int hashCode() {
            return this.f79727c.hashCode() + p.a.a(this.f79725a.hashCode() * 31, 31, this.f79726b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79725a, i);
            dest.writeParcelable(this.f79726b, i);
            dest.writeString(this.f79727c.name());
        }
    }

    private StartAction() {
    }
}
