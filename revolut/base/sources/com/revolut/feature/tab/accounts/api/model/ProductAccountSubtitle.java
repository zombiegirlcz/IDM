package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sfe.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle;", "Landroid/os/Parcelable;", "sfe/t", "Clickable", "Text", "Parts", "CopyValue", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Clickable;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Parts;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Text;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductAccountSubtitle implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f89517a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Clickable;", "Landroid/os/Parcelable;", "T", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle;", "Lsfe/t;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Clickable<T extends Parcelable> extends ProductAccountSubtitle implements t {

        @NotNull
        public static final Parcelable.Creator<Clickable<?>> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f89518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsContext f89519c;
        public final ProductAccountSubtitleAction d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Clickable((Clause) parcel.readParcelable(Clickable.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(Clickable.class.getClassLoader()), (ProductAccountSubtitleAction) parcel.readParcelable(Clickable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Clickable[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Clickable(Clause clause, AnalyticsContext analyticsContext, ProductAccountSubtitleAction action) {
            super(clause, 0);
            Intrinsics.checkNotNullParameter(action, "action");
            this.f89518b = clause;
            this.f89519c = analyticsContext;
            this.d = action;
        }

        @Override // sfe.t
        /* JADX INFO: renamed from: B, reason: from getter */
        public final ProductAccountSubtitleAction getD() {
            return this.d;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle
        /* JADX INFO: renamed from: R, reason: from getter */
        public final AnalyticsContext getF89526c() {
            return this.f89519c;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF89517a() {
            return this.f89518b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj2;
            return Intrinsics.f(this.f89518b, clickable.f89518b) && Intrinsics.f(this.f89519c, clickable.f89519c) && Intrinsics.f(this.d, clickable.d);
        }

        public final int hashCode() {
            Clause clause = this.f89518b;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            AnalyticsContext analyticsContext = this.f89519c;
            return this.d.hashCode() + ((iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89518b, i);
            dest.writeParcelable(this.f89519c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$CopyValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CopyValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CopyValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89520a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CopyValue(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyValue[i];
            }
        }

        public CopyValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f89520a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CopyValue) && Intrinsics.f(this.f89520a, ((CopyValue) obj2).f89520a);
        }

        public final int hashCode() {
            return this.f89520a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89520a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Parts;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle;", "Lsfe/t;", "", "toString", "()Ljava/lang/String;", "Part", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Parts extends ProductAccountSubtitle implements t {

        @NotNull
        public static final Parcelable.Creator<Parts> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f89521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsContext f89522c;
        public final ProductAccountSubtitleAction d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Parts$Part;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Part implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Part> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f89523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Parcelable f89524b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Part((Clause) parcel.readParcelable(Part.class.getClassLoader()), parcel.readParcelable(Part.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Part[i];
                }
            }

            public Part(Clause clause, Parcelable parcelable) {
                Intrinsics.checkNotNullParameter(clause, "clause");
                this.f89523a = clause;
                this.f89524b = parcelable;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Part)) {
                    return false;
                }
                Part part = (Part) obj2;
                return Intrinsics.f(this.f89523a, part.f89523a) && Intrinsics.f(this.f89524b, part.f89524b);
            }

            public final int hashCode() {
                int iHashCode = this.f89523a.hashCode() * 31;
                Parcelable parcelable = this.f89524b;
                return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89523a, i);
                dest.writeParcelable(this.f89524b, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Part.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Parts(arrayList, (AnalyticsContext) parcel.readParcelable(Parts.class.getClassLoader()), (ProductAccountSubtitleAction) parcel.readParcelable(Parts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Parts[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parts(AbstractList parts, AnalyticsContext analyticsContext, ProductAccountSubtitleAction action) {
            super(null, 0);
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f89521b = parts;
            this.f89522c = analyticsContext;
            this.d = action;
        }

        @Override // sfe.t
        /* JADX INFO: renamed from: B, reason: from getter */
        public final ProductAccountSubtitleAction getD() {
            return this.d;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle
        /* JADX INFO: renamed from: R, reason: from getter */
        public final AnalyticsContext getF89526c() {
            return this.f89522c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Parts)) {
                return false;
            }
            Parts parts = (Parts) obj2;
            return Intrinsics.f(this.f89521b, parts.f89521b) && Intrinsics.f(this.f89522c, parts.f89522c) && Intrinsics.f(this.d, parts.d);
        }

        public final int hashCode() {
            int iHashCode = this.f89521b.hashCode() * 31;
            AnalyticsContext analyticsContext = this.f89522c;
            return this.d.hashCode() + ((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f89521b, dest);
            while (itV.hasNext()) {
                ((Part) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f89522c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle$Text;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountSubtitle;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends ProductAccountSubtitle {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f89525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsContext f89526c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text((Clause) parcel.readParcelable(Text.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(Text.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(Clause clause, AnalyticsContext analyticsContext) {
            super(clause, 0);
            this.f89525b = clause;
            this.f89526c = analyticsContext;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle
        /* JADX INFO: renamed from: R, reason: from getter */
        public final AnalyticsContext getF89526c() {
            return this.f89526c;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF89517a() {
            return this.f89525b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Text)) {
                return false;
            }
            Text text = (Text) obj2;
            return Intrinsics.f(this.f89525b, text.f89525b) && Intrinsics.f(this.f89526c, text.f89526c);
        }

        public final int hashCode() {
            Clause clause = this.f89525b;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            AnalyticsContext analyticsContext = this.f89526c;
            return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89525b, i);
            dest.writeParcelable(this.f89526c, i);
        }
    }

    public ProductAccountSubtitle(Clause clause, int i) {
        this.f89517a = clause;
    }

    /* JADX INFO: renamed from: R */
    public abstract AnalyticsContext getF89526c();

    /* JADX INFO: renamed from: a, reason: from getter */
    public Clause getF89517a() {
        return this.f89517a;
    }
}
