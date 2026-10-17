package com.revolut.feature.credit.direct.debit.account_details_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreenContract$AccountInfo", "Landroid/os/Parcelable;", "Clabe", "Lcom/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreenContract$AccountInfo$Clabe;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DirectDebitAccountDetailsScreenContract$AccountInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreenContract$AccountInfo$Clabe;", "Lcom/revolut/feature/credit/direct/debit/account_details_v2/DirectDebitAccountDetailsScreenContract$AccountInfo;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Clabe implements DirectDebitAccountDetailsScreenContract$AccountInfo {

        @NotNull
        public static final Parcelable.Creator<Clabe> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f69879c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Clabe((Image) parcel.readParcelable(Clabe.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Clabe[i];
            }
        }

        public Clabe(Image bankImage, String bankName, String clabe) {
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            Intrinsics.checkNotNullParameter(clabe, "clabe");
            Intrinsics.checkNotNullParameter(bankImage, "bankImage");
            this.f69877a = bankName;
            this.f69878b = clabe;
            this.f69879c = bankImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Clabe)) {
                return false;
            }
            Clabe clabe = (Clabe) obj2;
            return Intrinsics.f(this.f69877a, clabe.f69877a) && Intrinsics.f(this.f69878b, clabe.f69878b) && Intrinsics.f(this.f69879c, clabe.f69879c);
        }

        public final int hashCode() {
            return this.f69879c.hashCode() + p.a.c(this.f69877a.hashCode() * 31, 31, this.f69878b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69877a);
            dest.writeString(this.f69878b);
            dest.writeParcelable(this.f69879c, i);
        }
    }
}
