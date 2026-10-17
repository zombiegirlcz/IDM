package com.revolut.feature.insurance_home.api.widget.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Item", "jw7/a", "Action", "feature_insurance_home_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsuranceHomeWidgetContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsuranceHomeWidgetContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f76158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f76159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Action f76160c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action;", "Landroid/os/Parcelable;", "OpenHome", "OpenDetails", "Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action$OpenDetails;", "Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action$OpenHome;", "feature_insurance_home_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Action extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action$OpenDetails;", "Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action;", "", "toString", "()Ljava/lang/String;", "feature_insurance_home_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenDetails implements Action {

            @NotNull
            public static final Parcelable.Creator<OpenDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f76161a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenDetails(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenDetails[i];
                }
            }

            public OpenDetails(String product) {
                Intrinsics.checkNotNullParameter(product, "product");
                this.f76161a = product;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenDetails) && Intrinsics.f(this.f76161a, ((OpenDetails) obj2).f76161a);
            }

            public final int hashCode() {
                return this.f76161a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76161a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action$OpenHome;", "Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Action;", "<init>", "()V", "feature_insurance_home_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class OpenHome implements Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OpenHome f76162a = new OpenHome();

            @NotNull
            public static final Parcelable.Creator<OpenHome> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OpenHome.f76162a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenHome[i];
                }
            }

            private OpenHome() {
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
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_home/api/widget/models/InsuranceHomeWidgetContent$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_home_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f76164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jw7.a f76165c;
        public final Action d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(parcel.readString(), (Clause) parcel.readParcelable(Item.class.getClassLoader()), jw7.a.valueOf(parcel.readString()), (Action) parcel.readParcelable(Item.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String str, Clause title, jw7.a state, Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f76163a = str;
            this.f76164b = title;
            this.f76165c = state;
            this.d = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return Intrinsics.f(this.f76163a, item.f76163a) && Intrinsics.f(this.f76164b, item.f76164b) && this.f76165c == item.f76165c && Intrinsics.f(this.d, item.d);
        }

        public final int hashCode() {
            String str = this.f76163a;
            return this.d.hashCode() + ((this.f76165c.hashCode() + p.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f76164b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76163a);
            dest.writeParcelable(this.f76164b, i);
            dest.writeString(this.f76165c.name());
            dest.writeParcelable(this.d, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", InsuranceHomeWidgetContent.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
            }
            return new InsuranceHomeWidgetContent(clause, arrayList, (Action) parcel.readParcelable(InsuranceHomeWidgetContent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsuranceHomeWidgetContent[i];
        }
    }

    public InsuranceHomeWidgetContent(Clause title, ArrayList items, Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f76158a = title;
        this.f76159b = items;
        this.f76160c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsuranceHomeWidgetContent)) {
            return false;
        }
        InsuranceHomeWidgetContent insuranceHomeWidgetContent = (InsuranceHomeWidgetContent) obj2;
        return Intrinsics.f(this.f76158a, insuranceHomeWidgetContent.f76158a) && this.f76159b.equals(insuranceHomeWidgetContent.f76159b) && Intrinsics.f(this.f76160c, insuranceHomeWidgetContent.f76160c);
    }

    public final int hashCode() {
        return this.f76160c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f76159b, this.f76158a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76158a, i);
        Iterator itY = j6.a.y(this.f76159b, dest);
        while (itY.hasNext()) {
            ((Item) itY.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f76160c, i);
    }
}
