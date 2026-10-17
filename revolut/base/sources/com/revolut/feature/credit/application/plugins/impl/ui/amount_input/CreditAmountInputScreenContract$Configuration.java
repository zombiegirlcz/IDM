package com.revolut.feature.credit.application.plugins.impl.ui.amount_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration", "Landroid/os/Parcelable;", "Local", "Remote", "Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration$Local;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration$Remote;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditAmountInputScreenContract$Configuration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration$Local;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local implements CreditAmountInputScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f67030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f67031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67032c;
        public final int d;
        public final int e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local((Clause) parcel.readParcelable(Local.class.getClassLoader()), (Clause) parcel.readParcelable(Local.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Local[i];
            }
        }

        public Local(Clause suggestionMin, Clause suggestionMax, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(suggestionMin, "suggestionMin");
            Intrinsics.checkNotNullParameter(suggestionMax, "suggestionMax");
            this.f67030a = suggestionMin;
            this.f67031b = suggestionMax;
            this.f67032c = i;
            this.d = i2;
            this.e = i3;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$Configuration
        /* JADX INFO: renamed from: A6, reason: from getter */
        public final Clause getF67033a() {
            return this.f67030a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Local)) {
                return false;
            }
            Local local = (Local) obj2;
            return Intrinsics.f(this.f67030a, local.f67030a) && Intrinsics.f(this.f67031b, local.f67031b) && this.f67032c == local.f67032c && this.d == local.d && this.e == local.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f67032c, p.a.a(this.f67030a.hashCode() * 31, 31, this.f67031b), 31), 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$Configuration
        /* JADX INFO: renamed from: p6, reason: from getter */
        public final Clause getF67034b() {
            return this.f67031b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67030a, i);
            dest.writeParcelable(this.f67031b, i);
            dest.writeInt(this.f67032c);
            dest.writeInt(this.d);
            dest.writeInt(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration$Remote;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/amount_input/CreditAmountInputScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote implements CreditAmountInputScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f67033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f67034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f67035c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote((Clause) parcel.readParcelable(Remote.class.getClassLoader()), (Clause) parcel.readParcelable(Remote.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remote[i];
            }
        }

        public Remote(Clause suggestionMin, Clause suggestionMax, String errorMax, String errorMin, String roundingTemplate) {
            Intrinsics.checkNotNullParameter(suggestionMin, "suggestionMin");
            Intrinsics.checkNotNullParameter(suggestionMax, "suggestionMax");
            Intrinsics.checkNotNullParameter(errorMax, "errorMax");
            Intrinsics.checkNotNullParameter(errorMin, "errorMin");
            Intrinsics.checkNotNullParameter(roundingTemplate, "roundingTemplate");
            this.f67033a = suggestionMin;
            this.f67034b = suggestionMax;
            this.f67035c = errorMax;
            this.d = errorMin;
            this.e = roundingTemplate;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$Configuration
        /* JADX INFO: renamed from: A6, reason: from getter */
        public final Clause getF67033a() {
            return this.f67033a;
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
            return Intrinsics.f(this.f67033a, remote.f67033a) && Intrinsics.f(this.f67034b, remote.f67034b) && Intrinsics.f(this.f67035c, remote.f67035c) && Intrinsics.f(this.d, remote.d) && Intrinsics.f(this.e, remote.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.c(p.a.c(p.a.a(this.f67033a.hashCode() * 31, 31, this.f67034b), 31, this.f67035c), 31, this.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$Configuration
        /* JADX INFO: renamed from: p6, reason: from getter */
        public final Clause getF67034b() {
            return this.f67034b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67033a, i);
            dest.writeParcelable(this.f67034b, i);
            dest.writeString(this.f67035c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    /* JADX INFO: renamed from: A6 */
    Clause getF67033a();

    /* JADX INFO: renamed from: p6 */
    Clause getF67034b();
}
