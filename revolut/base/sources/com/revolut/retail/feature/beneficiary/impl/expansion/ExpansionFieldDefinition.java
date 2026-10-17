package com.revolut.retail.feature.beneficiary.impl.expansion;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/expansion/ExpansionFieldDefinition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Choice", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpansionFieldDefinition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExpansionFieldDefinition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f99653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99654c;
    public final List d;
    public final Choice e;
    public final Choice f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/expansion/ExpansionFieldDefinition$Choice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Choice implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Choice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u2j.b f99656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f99657c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Choice(parcel.readString(), u2j.b.valueOf(parcel.readString()), (Clause) parcel.readParcelable(Choice.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Choice[i];
            }
        }

        public Choice(String id10, u2j.b type, Clause clause) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(clause, "clause");
            this.f99655a = id10;
            this.f99656b = type;
            this.f99657c = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) obj2;
            return Intrinsics.f(this.f99655a, choice.f99655a) && this.f99656b == choice.f99656b && Intrinsics.f(this.f99657c, choice.f99657c);
        }

        public final int hashCode() {
            return this.f99657c.hashCode() + ((this.f99656b.hashCode() + (this.f99655a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99655a);
            dest.writeString(this.f99656b.name());
            dest.writeParcelable(this.f99657c, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            Clause clause = (Clause) parcel.readParcelable(ExpansionFieldDefinition.class.getClassLoader());
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Choice.CREATOR, parcel, arrayList, iA, 1);
            }
            Parcelable.Creator<Choice> creator = Choice.CREATOR;
            return new ExpansionFieldDefinition(bVar, clause, string, arrayList, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpansionFieldDefinition[i];
        }
    }

    public ExpansionFieldDefinition(b country, Clause title, String key, List choices, Choice proposedValue, Choice selectedValue) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(choices, "choices");
        Intrinsics.checkNotNullParameter(proposedValue, "proposedValue");
        Intrinsics.checkNotNullParameter(selectedValue, "selectedValue");
        this.f99652a = country;
        this.f99653b = title;
        this.f99654c = key;
        this.d = choices;
        this.e = proposedValue;
        this.f = selectedValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpansionFieldDefinition)) {
            return false;
        }
        ExpansionFieldDefinition expansionFieldDefinition = (ExpansionFieldDefinition) obj2;
        return Intrinsics.f(this.f99652a, expansionFieldDefinition.f99652a) && Intrinsics.f(this.f99653b, expansionFieldDefinition.f99653b) && Intrinsics.f(this.f99654c, expansionFieldDefinition.f99654c) && Intrinsics.f(this.d, expansionFieldDefinition.d) && Intrinsics.f(this.e, expansionFieldDefinition.e) && Intrinsics.f(this.f, expansionFieldDefinition.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.c(p.a.a(this.f99652a.f297794a.hashCode() * 31, 31, this.f99653b), 31, this.f99654c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99652a);
        dest.writeParcelable(this.f99653b, i);
        dest.writeString(this.f99654c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((Choice) itV.next()).writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
    }
}
