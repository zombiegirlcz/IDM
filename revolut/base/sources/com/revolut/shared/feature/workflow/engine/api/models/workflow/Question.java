package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import sil.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "Landroid/os/Parcelable;", "<init>", "()V", "YesNo", "Text", "MultiText", "Choice", "Income", "Documents", "City", "Timeline", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$City;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Documents;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Income;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$MultiText;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Text;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Timeline;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$YesNo;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Question implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "<init>", "()V", "SingleChoice", "MultiChoice", "Option", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice$MultiChoice;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice$SingleChoice;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Choice extends Question {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice$MultiChoice;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MultiChoice extends Choice {

            @NotNull
            public static final Parcelable.Creator<MultiChoice> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105599a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105600b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105601c;
            public final ArrayList d;
            public final Dialog e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(Option.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new MultiChoice(parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel), string, string2, string3, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MultiChoice[i];
                }
            }

            public MultiChoice(Dialog dialog, String id10, String title, String str, ArrayList options) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(options, "options");
                this.f105599a = id10;
                this.f105600b = title;
                this.f105601c = str;
                this.d = options;
                this.e = dialog;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Dialog getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105638c() {
                return this.f105601c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question.Choice
            public final List c() {
                return this.d;
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
                return Intrinsics.f(this.f105599a, multiChoice.f105599a) && Intrinsics.f(this.f105600b, multiChoice.f105600b) && Intrinsics.f(this.f105601c, multiChoice.f105601c) && this.d.equals(multiChoice.d) && Intrinsics.f(this.e, multiChoice.e);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF105636a() {
                return this.f105599a;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF105637b() {
                return this.f105600b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105599a.hashCode() * 31, 31, this.f105600b);
                String str = this.f105601c;
                int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
                Dialog dialog = this.e;
                return iB + (dialog != null ? dialog.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105599a);
                dest.writeString(this.f105600b);
                dest.writeString(this.f105601c);
                Iterator itY = j6.a.y(this.d, dest);
                while (itY.hasNext()) {
                    ((Option) itY.next()).writeToParcel(dest, i);
                }
                Dialog dialog = this.e;
                if (dialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dialog.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice$Option;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Option implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Option> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105603b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105604c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Option(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Option[i];
                }
            }

            public Option(String id10, String title, String str) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                this.f105602a = id10;
                this.f105603b = title;
                this.f105604c = str;
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
                return Intrinsics.f(this.f105602a, option.f105602a) && Intrinsics.f(this.f105603b, option.f105603b) && Intrinsics.f(this.f105604c, option.f105604c);
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105602a.hashCode() * 31, 31, this.f105603b);
                String str = this.f105604c;
                return iC + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105602a);
                dest.writeString(this.f105603b);
                dest.writeString(this.f105604c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice$SingleChoice;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Choice;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SingleChoice extends Choice {

            @NotNull
            public static final Parcelable.Creator<SingleChoice> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105606b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105607c;
            public final ArrayList d;
            public final Dialog e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(Option.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new SingleChoice(parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel), string, string2, string3, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SingleChoice[i];
                }
            }

            public SingleChoice(Dialog dialog, String id10, String title, String str, ArrayList options) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(options, "options");
                this.f105605a = id10;
                this.f105606b = title;
                this.f105607c = str;
                this.d = options;
                this.e = dialog;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Dialog getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105638c() {
                return this.f105607c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question.Choice
            public final List c() {
                return this.d;
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
                return Intrinsics.f(this.f105605a, singleChoice.f105605a) && Intrinsics.f(this.f105606b, singleChoice.f105606b) && Intrinsics.f(this.f105607c, singleChoice.f105607c) && this.d.equals(singleChoice.d) && Intrinsics.f(this.e, singleChoice.e);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF105636a() {
                return this.f105605a;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF105637b() {
                return this.f105606b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105605a.hashCode() * 31, 31, this.f105606b);
                String str = this.f105607c;
                int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
                Dialog dialog = this.e;
                return iB + (dialog != null ? dialog.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105605a);
                dest.writeString(this.f105606b);
                dest.writeString(this.f105607c);
                Iterator itY = j6.a.y(this.d, dest);
                while (itY.hasNext()) {
                    ((Option) itY.next()).writeToParcel(dest, i);
                }
                Dialog dialog = this.e;
                if (dialog == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dialog.writeToParcel(dest, i);
                }
            }
        }

        private Choice() {
        }

        public abstract List c();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$City;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class City extends Question {

        @NotNull
        public static final Parcelable.Creator<City> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105610c;
        public final Dialog d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new City(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new City[i];
            }
        }

        public City(String id10, String title, String str, Dialog dialog) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f105608a = id10;
            this.f105609b = title;
            this.f105610c = str;
            this.d = dialog;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105610c;
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
            return Intrinsics.f(this.f105608a, city.f105608a) && Intrinsics.f(this.f105609b, city.f105609b) && Intrinsics.f(this.f105610c, city.f105610c) && Intrinsics.f(this.d, city.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105608a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105609b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105608a.hashCode() * 31, 31, this.f105609b);
            String str = this.f105610c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            return iHashCode + (dialog != null ? dialog.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105608a);
            dest.writeString(this.f105609b);
            dest.writeString(this.f105610c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Documents;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Documents extends Question {

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105613c;
        public final Dialog d;
        public final int e;
        public final Integer f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f105614g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Documents(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        public Documents(String id10, String title, String str, Dialog dialog, int i, Integer num, long j2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f105611a = id10;
            this.f105612b = title;
            this.f105613c = str;
            this.d = dialog;
            this.e = i;
            this.f = num;
            this.f105614g = j2;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105613c;
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
            return Intrinsics.f(this.f105611a, documents.f105611a) && Intrinsics.f(this.f105612b, documents.f105612b) && Intrinsics.f(this.f105613c, documents.f105613c) && Intrinsics.f(this.d, documents.d) && this.e == documents.e && Intrinsics.f(this.f, documents.f) && this.f105614g == documents.f105614g;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105611a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105612b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105611a.hashCode() * 31, 31, this.f105612b);
            String str = this.f105613c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            int iB = j6.a.b(this.e, (iHashCode + (dialog == null ? 0 : dialog.hashCode())) * 31, 31);
            Integer num = this.f;
            return Long.hashCode(this.f105614g) + ((iB + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105611a);
            dest.writeString(this.f105612b);
            dest.writeString(this.f105613c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
            dest.writeInt(this.e);
            Integer num = this.f;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeLong(this.f105614g);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Income;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Income extends Question {

        @NotNull
        public static final Parcelable.Creator<Income> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105617c;
        public final Dialog d;
        public final List e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Dialog dialogCreateFromParcel = parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(c.valueOf(parcel.readString()));
                }
                return new Income(string, string2, string3, dialogCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Income[i];
            }
        }

        public Income(String id10, String title, String str, Dialog dialog, List frequencies) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(frequencies, "frequencies");
            this.f105615a = id10;
            this.f105616b = title;
            this.f105617c = str;
            this.d = dialog;
            this.e = frequencies;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105617c;
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
            return Intrinsics.f(this.f105615a, income.f105615a) && Intrinsics.f(this.f105616b, income.f105616b) && Intrinsics.f(this.f105617c, income.f105617c) && Intrinsics.f(this.d, income.d) && Intrinsics.f(this.e, income.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105615a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105616b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105615a.hashCode() * 31, 31, this.f105616b);
            String str = this.f105617c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            return this.e.hashCode() + ((iHashCode + (dialog != null ? dialog.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105615a);
            dest.writeString(this.f105616b);
            dest.writeString(this.f105617c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeString(((c) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$MultiText;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "Item", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultiText extends Question {

        @NotNull
        public static final Parcelable.Creator<MultiText> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105620c;
        public final Dialog d;
        public final ArrayList e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$MultiText$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105622b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105623c;
            public final Integer d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(Integer num, String id10, String str, String str2) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f105621a = id10;
                this.f105622b = str;
                this.f105623c = str2;
                this.d = num;
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
                return Intrinsics.f(this.f105621a, item.f105621a) && Intrinsics.f(this.f105622b, item.f105622b) && Intrinsics.f(this.f105623c, item.f105623c) && Intrinsics.f(this.d, item.d);
            }

            public final int hashCode() {
                int iHashCode = this.f105621a.hashCode() * 31;
                String str = this.f105622b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f105623c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.d;
                return iHashCode3 + (num != null ? num.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105621a);
                dest.writeString(this.f105622b);
                dest.writeString(this.f105623c);
                Integer num = this.d;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                Dialog dialogCreateFromParcel = parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Item.CREATOR, parcel, arrayList, iA, 1);
                }
                return new MultiText(dialogCreateFromParcel, string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultiText[i];
            }
        }

        public MultiText(Dialog dialog, String id10, String title, String str, ArrayList items) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f105618a = id10;
            this.f105619b = title;
            this.f105620c = str;
            this.d = dialog;
            this.e = items;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105620c;
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
            return Intrinsics.f(this.f105618a, multiText.f105618a) && Intrinsics.f(this.f105619b, multiText.f105619b) && Intrinsics.f(this.f105620c, multiText.f105620c) && Intrinsics.f(this.d, multiText.d) && this.e.equals(multiText.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105618a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105619b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105618a.hashCode() * 31, 31, this.f105619b);
            String str = this.f105620c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            return this.e.hashCode() + ((iHashCode + (dialog != null ? dialog.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105618a);
            dest.writeString(this.f105619b);
            dest.writeString(this.f105620c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
            Iterator itY = j6.a.y(this.e, dest);
            while (itY.hasNext()) {
                ((Item) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Text;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends Question {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105626c;
        public final Dialog d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f105627g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(String id10, String title, String str, Dialog dialog, String str2, String str3, Integer num) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f105624a = id10;
            this.f105625b = title;
            this.f105626c = str;
            this.d = dialog;
            this.e = str2;
            this.f = str3;
            this.f105627g = num;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105626c;
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
            return Intrinsics.f(this.f105624a, text.f105624a) && Intrinsics.f(this.f105625b, text.f105625b) && Intrinsics.f(this.f105626c, text.f105626c) && Intrinsics.f(this.d, text.d) && Intrinsics.f(this.e, text.e) && Intrinsics.f(this.f, text.f) && Intrinsics.f(this.f105627g, text.f105627g);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105624a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105625b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105624a.hashCode() * 31, 31, this.f105625b);
            String str = this.f105626c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            int iHashCode2 = (iHashCode + (dialog == null ? 0 : dialog.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f105627g;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105624a);
            dest.writeString(this.f105625b);
            dest.writeString(this.f105626c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
            Integer num = this.f105627g;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Timeline;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "Item", "com/revolut/shared/feature/workflow/engine/api/models/workflow/a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Timeline extends Question {

        @NotNull
        public static final Parcelable.Creator<Timeline> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105630c;
        public final Dialog d;
        public final Item e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f105631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f105632h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Timeline$Item;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Item implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Item> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105634b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105635c;
            public final com.revolut.shared.feature.workflow.engine.api.models.workflow.a d;
            public final Long e;
            public final Long f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Item(parcel.readString(), parcel.readString(), parcel.readString(), com.revolut.shared.feature.workflow.engine.api.models.workflow.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Item[i];
                }
            }

            public Item(String valuePlaceholder, String startDatePlaceholder, String endDatePlaceholder, com.revolut.shared.feature.workflow.engine.api.models.workflow.a dateRangePrecision, Long l2, Long l3) {
                Intrinsics.checkNotNullParameter(valuePlaceholder, "valuePlaceholder");
                Intrinsics.checkNotNullParameter(startDatePlaceholder, "startDatePlaceholder");
                Intrinsics.checkNotNullParameter(endDatePlaceholder, "endDatePlaceholder");
                Intrinsics.checkNotNullParameter(dateRangePrecision, "dateRangePrecision");
                this.f105633a = valuePlaceholder;
                this.f105634b = startDatePlaceholder;
                this.f105635c = endDatePlaceholder;
                this.d = dateRangePrecision;
                this.e = l2;
                this.f = l3;
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
                return Intrinsics.f(this.f105633a, item.f105633a) && Intrinsics.f(this.f105634b, item.f105634b) && Intrinsics.f(this.f105635c, item.f105635c) && this.d == item.d && Intrinsics.f(this.e, item.e) && Intrinsics.f(this.f, item.f);
            }

            public final int hashCode() {
                int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f105633a.hashCode() * 31, 31, this.f105634b), 31, this.f105635c)) * 31;
                Long l2 = this.e;
                int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
                Long l3 = this.f;
                return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105633a);
                dest.writeString(this.f105634b);
                dest.writeString(this.f105635c);
                dest.writeString(this.d.name());
                Long l2 = this.e;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l2);
                }
                Long l3 = this.f;
                if (l3 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l3);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeline(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel), Item.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Timeline[i];
            }
        }

        public Timeline(String id10, String title, String str, Dialog dialog, Item item, String str2, int i, List itemLabels) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(itemLabels, "itemLabels");
            this.f105628a = id10;
            this.f105629b = title;
            this.f105630c = str;
            this.d = dialog;
            this.e = item;
            this.f = str2;
            this.f105631g = i;
            this.f105632h = itemLabels;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105630c;
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
            return Intrinsics.f(this.f105628a, timeline.f105628a) && Intrinsics.f(this.f105629b, timeline.f105629b) && Intrinsics.f(this.f105630c, timeline.f105630c) && Intrinsics.f(this.d, timeline.d) && Intrinsics.f(this.e, timeline.e) && Intrinsics.f(this.f, timeline.f) && this.f105631g == timeline.f105631g && Intrinsics.f(this.f105632h, timeline.f105632h);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105628a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105629b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105628a.hashCode() * 31, 31, this.f105629b);
            String str = this.f105630c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (dialog == null ? 0 : dialog.hashCode())) * 31)) * 31;
            String str2 = this.f;
            return this.f105632h.hashCode() + j6.a.b(this.f105631g, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105628a);
            dest.writeString(this.f105629b);
            dest.writeString(this.f105630c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
            this.e.writeToParcel(dest, i);
            dest.writeString(this.f);
            dest.writeInt(this.f105631g);
            dest.writeStringList(this.f105632h);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$YesNo;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YesNo extends Question {

        @NotNull
        public static final Parcelable.Creator<YesNo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105638c;
        public final Dialog d;
        public final String e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new YesNo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Dialog.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YesNo[i];
            }
        }

        public YesNo(String id10, String title, String str, Dialog dialog, String yesTitle, String noTitle) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(yesTitle, "yesTitle");
            Intrinsics.checkNotNullParameter(noTitle, "noTitle");
            this.f105636a = id10;
            this.f105637b = title;
            this.f105638c = str;
            this.d = dialog;
            this.e = yesTitle;
            this.f = noTitle;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Dialog getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF105638c() {
            return this.f105638c;
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
            return Intrinsics.f(this.f105636a, yesNo.f105636a) && Intrinsics.f(this.f105637b, yesNo.f105637b) && Intrinsics.f(this.f105638c, yesNo.f105638c) && Intrinsics.f(this.d, yesNo.d) && Intrinsics.f(this.e, yesNo.e) && Intrinsics.f(this.f, yesNo.f);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF105636a() {
            return this.f105636a;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.models.workflow.Question
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF105637b() {
            return this.f105637b;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105636a.hashCode() * 31, 31, this.f105637b);
            String str = this.f105638c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Dialog dialog = this.d;
            return this.f.hashCode() + p.a.c((iHashCode + (dialog != null ? dialog.hashCode() : 0)) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105636a);
            dest.writeString(this.f105637b);
            dest.writeString(this.f105638c);
            Dialog dialog = this.d;
            if (dialog == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dialog.writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            dest.writeString(this.f);
        }
    }

    private Question() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Dialog getD();

    /* JADX INFO: renamed from: b */
    public abstract String getF105638c();

    /* JADX INFO: renamed from: getId */
    public abstract String getF105636a();

    /* JADX INFO: renamed from: getTitle */
    public abstract String getF105637b();
}
