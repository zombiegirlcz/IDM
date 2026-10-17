package com.revolut.feature.workflow.engine.rfi.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import sil.c;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "Landroid/os/Parcelable;", "<init>", "()V", "Text", "MultiText", "YesNo", "Selection", "Income", "Documents", "City", "Timeline", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$City;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Documents;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Income;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$MultiText;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Text;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Timeline;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$YesNo;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Answer implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$City;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class City extends Answer {

        @NotNull
        public static final Parcelable.Creator<City> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f96515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f96516c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new City(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new City[i];
            }
        }

        public City(String questionId, String city, b country) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(city, "city");
            this.f96514a = questionId;
            this.f96515b = country;
            this.f96516c = city;
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96514a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof City)) {
                return false;
            }
            City city = (City) obj2;
            return Intrinsics.f(this.f96514a, city.f96514a) && Intrinsics.f(this.f96515b, city.f96515b) && Intrinsics.f(this.f96516c, city.f96516c);
        }

        public final int hashCode() {
            return this.f96516c.hashCode() + p.a.c(this.f96514a.hashCode() * 31, 31, this.f96515b.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96514a);
            dest.writeSerializable(this.f96515b);
            dest.writeString(this.f96516c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Documents;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents extends Answer {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f96518b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readSerializable(), parcel.readParcelable(Documents.class.getClassLoader()));
                }
                return new Documents(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(String questionId, Map files) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(files, "files");
            this.f96517a = questionId;
            this.f96518b = files;
        }

        public static Documents b(Documents documents, LinkedHashMap files) {
            String questionId = documents.f96517a;
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(files, "files");
            return new Documents(questionId, files);
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96517a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Documents)) {
                return false;
            }
            Documents documents = (Documents) obj2;
            return Intrinsics.f(this.f96517a, documents.f96517a) && this.f96518b.equals(documents.f96518b);
        }

        public final int hashCode() {
            return this.f96518b.hashCode() + (this.f96517a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96517a);
            Iterator itT = o.t(this.f96518b, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeSerializable((Serializable) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Income;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Income extends Answer {

        @NotNull
        public static final Parcelable.Creator<Income> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f96520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f96521c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Income(parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Income[i];
            }
        }

        public Income(String questionId, c cVar, d amount) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f96519a = questionId;
            this.f96520b = cVar;
            this.f96521c = amount;
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96519a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Income)) {
                return false;
            }
            Income income = (Income) obj2;
            return Intrinsics.f(this.f96519a, income.f96519a) && this.f96520b == income.f96520b && Intrinsics.f(this.f96521c, income.f96521c);
        }

        public final int hashCode() {
            int iHashCode = this.f96519a.hashCode() * 31;
            c cVar = this.f96520b;
            return this.f96521c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96519a);
            c cVar = this.f96520b;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            dest.writeSerializable(this.f96521c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$MultiText;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "Item", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultiText extends Answer {

        @NotNull
        public static final Parcelable.Creator<MultiText> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f96523b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$MultiText$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96524a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f96525b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String id10, String value) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f96524a = id10;
                this.f96525b = value;
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
                return Intrinsics.f(this.f96524a, item.f96524a) && Intrinsics.f(this.f96525b, item.f96525b);
            }

            public final int hashCode() {
                return this.f96525b.hashCode() + (this.f96524a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96524a);
                dest.writeString(this.f96525b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new MultiText(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultiText[i];
            }
        }

        public MultiText(String questionId, List items) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f96522a = questionId;
            this.f96523b = items;
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96522a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MultiText)) {
                return false;
            }
            MultiText multiText = (MultiText) obj2;
            return Intrinsics.f(this.f96522a, multiText.f96522a) && Intrinsics.f(this.f96523b, multiText.f96523b);
        }

        public final int hashCode() {
            return this.f96523b.hashCode() + (this.f96522a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96522a);
            Iterator itV = p.a.v(this.f96523b, dest);
            while (itV.hasNext()) {
                ((Item) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "<init>", "()V", "SingleChoice", "MultiChoice", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection$MultiChoice;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection$SingleChoice;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Selection extends Answer {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection$MultiChoice;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MultiChoice extends Selection {

            @NotNull
            public static final Parcelable.Creator<MultiChoice> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f96527b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MultiChoice(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MultiChoice[i];
                }
            }

            public MultiChoice(String questionId, List optionIds) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(optionIds, "optionIds");
                this.f96526a = questionId;
                this.f96527b = optionIds;
            }

            @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF96537a() {
                return this.f96526a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof MultiChoice)) {
                    return false;
                }
                MultiChoice multiChoice = (MultiChoice) obj2;
                return Intrinsics.f(this.f96526a, multiChoice.f96526a) && Intrinsics.f(this.f96527b, multiChoice.f96527b);
            }

            public final int hashCode() {
                return this.f96527b.hashCode() + (this.f96526a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96526a);
                dest.writeStringList(this.f96527b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection$SingleChoice;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Selection;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SingleChoice extends Selection {

            @NotNull
            public static final Parcelable.Creator<SingleChoice> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f96529b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SingleChoice(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SingleChoice[i];
                }
            }

            public SingleChoice(String questionId, String optionId) {
                Intrinsics.checkNotNullParameter(questionId, "questionId");
                Intrinsics.checkNotNullParameter(optionId, "optionId");
                this.f96528a = questionId;
                this.f96529b = optionId;
            }

            @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF96537a() {
                return this.f96528a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof SingleChoice)) {
                    return false;
                }
                SingleChoice singleChoice = (SingleChoice) obj2;
                return Intrinsics.f(this.f96528a, singleChoice.f96528a) && Intrinsics.f(this.f96529b, singleChoice.f96529b);
            }

            public final int hashCode() {
                return this.f96529b.hashCode() + (this.f96528a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96528a);
                dest.writeString(this.f96529b);
            }
        }

        private Selection() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Text;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends Answer {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96531b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(String questionId, String value) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f96530a = questionId;
            this.f96531b = value;
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96530a;
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
            return Intrinsics.f(this.f96530a, text.f96530a) && Intrinsics.f(this.f96531b, text.f96531b);
        }

        public final int hashCode() {
            return this.f96531b.hashCode() + (this.f96530a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96530a);
            dest.writeString(this.f96531b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Timeline;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "Item", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Timeline extends Answer {

        @NotNull
        public static final Parcelable.Creator<Timeline> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f96533b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Timeline$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Long f96535b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Long f96536c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String value, Long l2, Long l3) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.f96534a = value;
                this.f96535b = l2;
                this.f96536c = l3;
            }

            public static Item a(Item item, String value, Long l2, Long l3, int i) {
                if ((i & 1) != 0) {
                    value = item.f96534a;
                }
                if ((i & 2) != 0) {
                    l2 = item.f96535b;
                }
                if ((i & 4) != 0) {
                    l3 = item.f96536c;
                }
                item.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                return new Item(value, l2, l3);
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
                return Intrinsics.f(this.f96534a, item.f96534a) && Intrinsics.f(this.f96535b, item.f96535b) && Intrinsics.f(this.f96536c, item.f96536c);
            }

            public final int hashCode() {
                int iHashCode = this.f96534a.hashCode() * 31;
                Long l2 = this.f96535b;
                int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
                Long l3 = this.f96536c;
                return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96534a);
                Long l2 = this.f96535b;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    m72.b.A(dest, 1, l2);
                }
                Long l3 = this.f96536c;
                if (l3 == null) {
                    dest.writeInt(0);
                } else {
                    m72.b.A(dest, 1, l3);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Timeline(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Timeline[i];
            }
        }

        public Timeline(String questionId, List items) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f96532a = questionId;
            this.f96533b = items;
        }

        public static Timeline b(Timeline timeline, List items) {
            String questionId = timeline.f96532a;
            timeline.getClass();
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            Intrinsics.checkNotNullParameter(items, "items");
            return new Timeline(questionId, items);
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96532a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Timeline)) {
                return false;
            }
            Timeline timeline = (Timeline) obj2;
            return Intrinsics.f(this.f96532a, timeline.f96532a) && Intrinsics.f(this.f96533b, timeline.f96533b);
        }

        public final int hashCode() {
            return this.f96533b.hashCode() + (this.f96532a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96532a);
            Iterator itV = p.a.v(this.f96533b, dest);
            while (itV.hasNext()) {
                ((Item) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$YesNo;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "", "toString", "()Ljava/lang/String;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YesNo extends Answer {

        @NotNull
        public static final Parcelable.Creator<YesNo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f96538b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new YesNo(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YesNo[i];
            }
        }

        public YesNo(String questionId, boolean z) {
            Intrinsics.checkNotNullParameter(questionId, "questionId");
            this.f96537a = questionId;
            this.f96538b = z;
        }

        @Override // com.revolut.feature.workflow.engine.rfi.api.models.Answer
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF96537a() {
            return this.f96537a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof YesNo)) {
                return false;
            }
            YesNo yesNo = (YesNo) obj2;
            return Intrinsics.f(this.f96537a, yesNo.f96537a) && this.f96538b == yesNo.f96538b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f96538b) + (this.f96537a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96537a);
            dest.writeInt(this.f96538b ? 1 : 0);
        }
    }

    private Answer() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF96537a();
}
