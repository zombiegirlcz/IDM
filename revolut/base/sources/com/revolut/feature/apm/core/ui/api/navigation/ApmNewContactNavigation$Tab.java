package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab", "Landroid/os/Parcelable;", "PHONE", "EMAIL", "TAX", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab$EMAIL;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab$PHONE;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab$TAX;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmNewContactNavigation$Tab implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62251a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab$EMAIL;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab;", "<init>", "()V", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EMAIL extends ApmNewContactNavigation$Tab {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EMAIL f62252b = new EMAIL();

        @NotNull
        public static final Parcelable.Creator<EMAIL> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EMAIL.f62252b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EMAIL[i];
            }
        }

        private EMAIL() {
            super("EMAIL");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab$PHONE;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab;", "<init>", "()V", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PHONE extends ApmNewContactNavigation$Tab {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PHONE f62253b = new PHONE();

        @NotNull
        public static final Parcelable.Creator<PHONE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PHONE.f62253b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PHONE[i];
            }
        }

        private PHONE() {
            super("PHONE");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab$TAX;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmNewContactNavigation$Tab;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TAX extends ApmNewContactNavigation$Tab {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f62254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f62255c;
        public final Clause d;

        @NotNull
        public static final Parcelable.Creator<TAX> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TAX((Clause) parcel.readParcelable(TAX.class.getClassLoader()), (Clause) parcel.readParcelable(TAX.class.getClassLoader()), (Clause) parcel.readParcelable(TAX.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TAX[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TAX(Clause title, Clause hint, Clause clause) {
            super("TAX");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(hint, "hint");
            this.f62254b = title;
            this.f62255c = hint;
            this.d = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TAX)) {
                return false;
            }
            TAX tax = (TAX) obj2;
            return Intrinsics.f(this.f62254b, tax.f62254b) && Intrinsics.f(this.f62255c, tax.f62255c) && Intrinsics.f(this.d, tax.d);
        }

        public final int hashCode() {
            int iA = p.a.a(this.f62254b.hashCode() * 31, 31, this.f62255c);
            Clause clause = this.d;
            return iA + (clause == null ? 0 : clause.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62254b, i);
            dest.writeParcelable(this.f62255c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    public ApmNewContactNavigation$Tab(String str) {
        this.f62251a = str;
    }
}
