package com.revolut.feature_retail_user_declarations.risk_assessment.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem;", "Landroid/os/Parcelable;", "Option", "None", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem$None;", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem$Option;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RiskItem extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem$None;", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class None implements RiskItem {

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f97734a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new None((Clause) parcel.readParcelable(None.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        public None(Clause title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f97734a = title;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof None) && Intrinsics.f(this.f97734a, ((None) obj2).f97734a);
        }

        @Override // com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem
        /* JADX INFO: renamed from: getId */
        public final String getF97735a() {
            return "none_option_id";
        }

        @Override // com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF97736b() {
            return this.f97734a;
        }

        public final int hashCode() {
            return this.f97734a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97734a, i);
        }

        @Override // com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem
        /* JADX INFO: renamed from: y5 */
        public final boolean getF97737c() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem$Option;", "Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskItem;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option implements RiskItem {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f97736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97737c;
        public final Clause d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f97738g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option(parcel.readString(), (Clause) parcel.readParcelable(Option.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(Option.class.getClassLoader()), (Clause) parcel.readParcelable(Option.class.getClassLoader()), (Clause) parcel.readParcelable(Option.class.getClassLoader()), (Clause) parcel.readParcelable(Option.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Option[i];
            }
        }

        public Option(String id10, Clause title, boolean z, Clause confirmDialogDescription, Clause infoDialogTitle, Clause infoDialogDescription, Clause confirmDialogTitle) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(confirmDialogDescription, "confirmDialogDescription");
            Intrinsics.checkNotNullParameter(infoDialogTitle, "infoDialogTitle");
            Intrinsics.checkNotNullParameter(infoDialogDescription, "infoDialogDescription");
            Intrinsics.checkNotNullParameter(confirmDialogTitle, "confirmDialogTitle");
            this.f97735a = id10;
            this.f97736b = title;
            this.f97737c = z;
            this.d = confirmDialogDescription;
            this.e = infoDialogTitle;
            this.f = infoDialogDescription;
            this.f97738g = confirmDialogTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Option)) {
                return false;
            }
            Option option = (Option) obj2;
            return Intrinsics.f(this.f97735a, option.f97735a) && Intrinsics.f(this.f97736b, option.f97736b) && this.f97737c == option.f97737c && Intrinsics.f(this.d, option.d) && Intrinsics.f(this.e, option.e) && Intrinsics.f(this.f, option.f) && Intrinsics.f(this.f97738g, option.f97738g);
        }

        @Override // com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF97735a() {
            return this.f97735a;
        }

        @Override // com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF97736b() {
            return this.f97736b;
        }

        public final int hashCode() {
            return this.f97738g.hashCode() + p.a.a(p.a.a(p.a.a(j6.a.c(p.a.a(this.f97735a.hashCode() * 31, 31, this.f97736b), 31, this.f97737c), 31, this.d), 31, this.e), 31, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97735a);
            dest.writeParcelable(this.f97736b, i);
            dest.writeInt(this.f97737c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f97738g, i);
        }

        @Override // com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskItem
        /* JADX INFO: renamed from: y5, reason: from getter */
        public final boolean getF97737c() {
            return this.f97737c;
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF97735a();

    /* JADX INFO: renamed from: getTitle */
    Clause getF97736b();

    /* JADX INFO: renamed from: y5 */
    boolean getF97737c();
}
