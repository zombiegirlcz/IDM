package com.revolut.shared.feature.suspicious_transaction.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "Landroid/os/Parcelable;", "<init>", "()V", "Question", "Action", "Warning", "Redirection", "DeeplinkRedirection", "Screen", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Action;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$DeeplinkRedirection;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Question;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Redirection;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Warning;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SuspiciousTransactionDialog implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Action;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action extends SuspiciousTransactionDialog {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f104936c;
        public final String d;
        public final List e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f104937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f104938h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f104939j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SuspiciousTransactionDialogLink.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Action(z, string, string2, string3, arrayListCreateStringArrayList, string4, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(boolean z, String title, String str, String guideTitle, List guideSteps, String actionsTitle, ArrayList actionsLinks, String disclaimer, String cancelButtonTitle, String confirmButtonTitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(guideTitle, "guideTitle");
            Intrinsics.checkNotNullParameter(guideSteps, "guideSteps");
            Intrinsics.checkNotNullParameter(actionsTitle, "actionsTitle");
            Intrinsics.checkNotNullParameter(actionsLinks, "actionsLinks");
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(cancelButtonTitle, "cancelButtonTitle");
            Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
            this.f104934a = z;
            this.f104935b = title;
            this.f104936c = str;
            this.d = guideTitle;
            this.e = guideSteps;
            this.f = actionsTitle;
            this.f104937g = actionsLinks;
            this.f104938h = disclaimer;
            this.i = cancelButtonTitle;
            this.f104939j = confirmButtonTitle;
        }

        @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF104967a() {
            return this.f104934a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return this.f104934a == action.f104934a && Intrinsics.f(this.f104935b, action.f104935b) && Intrinsics.f(this.f104936c, action.f104936c) && Intrinsics.f(this.d, action.d) && Intrinsics.f(this.e, action.e) && Intrinsics.f(this.f, action.f) && this.f104937g.equals(action.f104937g) && Intrinsics.f(this.f104938h, action.f104938h) && Intrinsics.f(this.i, action.i) && Intrinsics.f(this.f104939j, action.f104939j);
        }

        public final int hashCode() {
            int iC = p.a.c(Boolean.hashCode(this.f104934a) * 31, 31, this.f104935b);
            String str = this.f104936c;
            return this.f104939j.hashCode() + p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104937g, p.a.c(p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31), 31, this.f104938h), 31, this.i);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f104934a ? 1 : 0);
            dest.writeString(this.f104935b);
            dest.writeString(this.f104936c);
            dest.writeString(this.d);
            dest.writeStringList(this.e);
            dest.writeString(this.f);
            Iterator itY = j6.a.y(this.f104937g, dest);
            while (itY.hasNext()) {
                ((SuspiciousTransactionDialogLink) itY.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f104938h);
            dest.writeString(this.i);
            dest.writeString(this.f104939j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$DeeplinkRedirection;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeeplinkRedirection extends SuspiciousTransactionDialog {

        @NotNull
        public static final Parcelable.Creator<DeeplinkRedirection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104940a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeeplinkRedirection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeeplinkRedirection[i];
            }
        }

        public DeeplinkRedirection(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f104940a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeeplinkRedirection) && Intrinsics.f(this.f104940a, ((DeeplinkRedirection) obj2).f104940a);
        }

        public final int hashCode() {
            return this.f104940a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104940a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Question;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Question extends SuspiciousTransactionDialog {

        @NotNull
        public static final Parcelable.Creator<Question> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f104943c;
        public final String d;
        public final String e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f104944g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z = parcel.readInt() != 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SuspiciousTransactionDialogAnswer.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Question.class.getClassLoader()));
                }
                return new Question(z, string, string2, string3, string4, arrayList, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Question[i];
            }
        }

        public Question(boolean z, String title, String str, String questionTitle, String questionType, ArrayList answers, Map nextDialog) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(questionTitle, "questionTitle");
            Intrinsics.checkNotNullParameter(questionType, "questionType");
            Intrinsics.checkNotNullParameter(answers, "answers");
            Intrinsics.checkNotNullParameter(nextDialog, "nextDialog");
            this.f104941a = z;
            this.f104942b = title;
            this.f104943c = str;
            this.d = questionTitle;
            this.e = questionType;
            this.f = answers;
            this.f104944g = nextDialog;
        }

        @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF104967a() {
            return this.f104941a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Question)) {
                return false;
            }
            Question question = (Question) obj2;
            return this.f104941a == question.f104941a && Intrinsics.f(this.f104942b, question.f104942b) && Intrinsics.f(this.f104943c, question.f104943c) && Intrinsics.f(this.d, question.d) && Intrinsics.f(this.e, question.e) && this.f.equals(question.f) && this.f104944g.equals(question.f104944g);
        }

        public final int hashCode() {
            int iC = p.a.c(Boolean.hashCode(this.f104941a) * 31, 31, this.f104942b);
            String str = this.f104943c;
            return this.f104944g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f104941a ? 1 : 0);
            dest.writeString(this.f104942b);
            dest.writeString(this.f104943c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((SuspiciousTransactionDialogAnswer) itY.next()).writeToParcel(dest, i);
            }
            Iterator itT = o.t(this.f104944g, dest);
            while (itT.hasNext()) {
                Map.Entry entry = (Map.Entry) itT.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Redirection;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Redirection extends SuspiciousTransactionDialog {

        @NotNull
        public static final Parcelable.Creator<Redirection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104946b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Redirection(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Redirection[i];
            }
        }

        public Redirection(boolean z, String str) {
            this.f104945a = z;
            this.f104946b = str;
        }

        @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF104967a() {
            return this.f104945a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Redirection)) {
                return false;
            }
            Redirection redirection = (Redirection) obj2;
            return this.f104945a == redirection.f104945a && Intrinsics.f(this.f104946b, redirection.f104946b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f104945a) * 31;
            String str = this.f104946b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f104945a ? 1 : 0);
            dest.writeString(this.f104946b);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "<init>", "()V", "SimpleWarning", "CircleWarning", "SimpleConfirmation", "RiskAgreement", "Cancel", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$Cancel;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$CircleWarning;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$RiskAgreement;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$SimpleConfirmation;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$SimpleWarning;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Screen extends SuspiciousTransactionDialog {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$Cancel;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "", "toString", "()Ljava/lang/String;", "Survey", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cancel extends Screen {

            @NotNull
            public static final Parcelable.Creator<Cancel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104947a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104948b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f104949c;
            public final String d;
            public final String e;
            public final TransactionCell f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Survey f104950g;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$Cancel$Survey;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Survey implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Survey> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f104951a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ArrayList f104952b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        String string = parcel.readString();
                        int i = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(Answer.CREATOR, parcel, arrayList, iA, 1);
                        }
                        return new Survey(string, arrayList);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Survey[i];
                    }
                }

                public Survey(String questionType, ArrayList answers) {
                    Intrinsics.checkNotNullParameter(questionType, "questionType");
                    Intrinsics.checkNotNullParameter(answers, "answers");
                    this.f104951a = questionType;
                    this.f104952b = answers;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Survey)) {
                        return false;
                    }
                    Survey survey = (Survey) obj2;
                    return Intrinsics.f(this.f104951a, survey.f104951a) && this.f104952b.equals(survey.f104952b);
                }

                public final int hashCode() {
                    return this.f104952b.hashCode() + (this.f104951a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f104951a);
                    Iterator itY = j6.a.y(this.f104952b, dest);
                    while (itY.hasNext()) {
                        ((Answer) itY.next()).writeToParcel(dest, i);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(ActionButton.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Cancel(string, string2, arrayList, parcel.readString(), parcel.readString(), TransactionCell.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Survey.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cancel[i];
                }
            }

            public Cancel(String title, String str, ArrayList buttons, String trackingId, String str2, TransactionCell transaction, Survey survey) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                Intrinsics.checkNotNullParameter(trackingId, "trackingId");
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                this.f104947a = title;
                this.f104948b = str;
                this.f104949c = buttons;
                this.d = trackingId;
                this.e = str2;
                this.f = transaction;
                this.f104950g = survey;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            public final List b() {
                return this.f104949c;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF104965b() {
                return this.f104948b;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getD() {
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
                if (!(obj2 instanceof Cancel)) {
                    return false;
                }
                Cancel cancel = (Cancel) obj2;
                return Intrinsics.f(this.f104947a, cancel.f104947a) && Intrinsics.f(this.f104948b, cancel.f104948b) && this.f104949c.equals(cancel.f104949c) && Intrinsics.f(this.d, cancel.d) && Intrinsics.f(this.e, cancel.e) && Intrinsics.f(this.f, cancel.f) && Intrinsics.f(this.f104950g, cancel.f104950g);
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF104964a() {
                return this.f104947a;
            }

            public final int hashCode() {
                int iHashCode = this.f104947a.hashCode() * 31;
                String str = this.f104948b;
                int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104949c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
                String str2 = this.e;
                int iHashCode2 = (this.f.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Survey survey = this.f104950g;
                return iHashCode2 + (survey != null ? survey.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104947a);
                dest.writeString(this.f104948b);
                Iterator itY = j6.a.y(this.f104949c, dest);
                while (itY.hasNext()) {
                    ((ActionButton) itY.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.d);
                dest.writeString(this.e);
                this.f.writeToParcel(dest, i);
                Survey survey = this.f104950g;
                if (survey == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    survey.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$CircleWarning;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CircleWarning extends Screen {

            @NotNull
            public static final Parcelable.Creator<CircleWarning> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104953a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104954b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f104955c;
            public final String d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final BigDecimal f104956g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f104957h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(ActionButton.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new CircleWarning(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CircleWarning[i];
                }
            }

            public CircleWarning(String title, String str, ArrayList buttons, String trackingId, String subtitle, String riskHeader, BigDecimal riskValue, String riskSubtitle) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                Intrinsics.checkNotNullParameter(trackingId, "trackingId");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(riskHeader, "riskHeader");
                Intrinsics.checkNotNullParameter(riskValue, "riskValue");
                Intrinsics.checkNotNullParameter(riskSubtitle, "riskSubtitle");
                this.f104953a = title;
                this.f104954b = str;
                this.f104955c = buttons;
                this.d = trackingId;
                this.e = subtitle;
                this.f = riskHeader;
                this.f104956g = riskValue;
                this.f104957h = riskSubtitle;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            public final List b() {
                return this.f104955c;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF104965b() {
                return this.f104954b;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getD() {
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
                if (!(obj2 instanceof CircleWarning)) {
                    return false;
                }
                CircleWarning circleWarning = (CircleWarning) obj2;
                return Intrinsics.f(this.f104953a, circleWarning.f104953a) && Intrinsics.f(this.f104954b, circleWarning.f104954b) && this.f104955c.equals(circleWarning.f104955c) && Intrinsics.f(this.d, circleWarning.d) && Intrinsics.f(this.e, circleWarning.e) && Intrinsics.f(this.f, circleWarning.f) && Intrinsics.f(this.f104956g, circleWarning.f104956g) && Intrinsics.f(this.f104957h, circleWarning.f104957h);
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF104964a() {
                return this.f104953a;
            }

            public final int hashCode() {
                int iHashCode = this.f104953a.hashCode() * 31;
                String str = this.f104954b;
                return this.f104957h.hashCode() + t61.a.d(this.f104956g, p.a.c(p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104955c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104953a);
                dest.writeString(this.f104954b);
                Iterator itY = j6.a.y(this.f104955c, dest);
                while (itY.hasNext()) {
                    ((ActionButton) itY.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeSerializable(this.f104956g);
                dest.writeString(this.f104957h);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$RiskAgreement;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RiskAgreement extends Screen {

            @NotNull
            public static final Parcelable.Creator<RiskAgreement> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104958a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104959b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f104960c;
            public final String d;
            public final TransactionCell e;
            public final Agreement f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(ActionButton.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new RiskAgreement(string, string2, arrayList, parcel.readString(), TransactionCell.CREATOR.createFromParcel(parcel), Agreement.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RiskAgreement[i];
                }
            }

            public RiskAgreement(String title, String str, ArrayList buttons, String trackingId, TransactionCell transaction, Agreement agreement) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                Intrinsics.checkNotNullParameter(trackingId, "trackingId");
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(agreement, "agreement");
                this.f104958a = title;
                this.f104959b = str;
                this.f104960c = buttons;
                this.d = trackingId;
                this.e = transaction;
                this.f = agreement;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            public final List b() {
                return this.f104960c;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF104965b() {
                return this.f104959b;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getD() {
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
                if (!(obj2 instanceof RiskAgreement)) {
                    return false;
                }
                RiskAgreement riskAgreement = (RiskAgreement) obj2;
                return Intrinsics.f(this.f104958a, riskAgreement.f104958a) && Intrinsics.f(this.f104959b, riskAgreement.f104959b) && this.f104960c.equals(riskAgreement.f104960c) && Intrinsics.f(this.d, riskAgreement.d) && Intrinsics.f(this.e, riskAgreement.e) && Intrinsics.f(this.f, riskAgreement.f);
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF104964a() {
                return this.f104958a;
            }

            public final int hashCode() {
                int iHashCode = this.f104958a.hashCode() * 31;
                String str = this.f104959b;
                return this.f.hashCode() + ((this.e.hashCode() + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104960c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104958a);
                dest.writeString(this.f104959b);
                Iterator itY = j6.a.y(this.f104960c, dest);
                while (itY.hasNext()) {
                    ((ActionButton) itY.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.d);
                this.e.writeToParcel(dest, i);
                this.f.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$SimpleConfirmation;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SimpleConfirmation extends Screen {

            @NotNull
            public static final Parcelable.Creator<SimpleConfirmation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104962b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f104963c;
            public final String d;
            public final List e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(ActionButton.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new SimpleConfirmation(string, string2, arrayList, parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SimpleConfirmation[i];
                }
            }

            public SimpleConfirmation(String title, String str, ArrayList buttons, String trackingId, List tips, String str2) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                Intrinsics.checkNotNullParameter(trackingId, "trackingId");
                Intrinsics.checkNotNullParameter(tips, "tips");
                this.f104961a = title;
                this.f104962b = str;
                this.f104963c = buttons;
                this.d = trackingId;
                this.e = tips;
                this.f = str2;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            public final List b() {
                return this.f104963c;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF104965b() {
                return this.f104962b;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getD() {
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
                if (!(obj2 instanceof SimpleConfirmation)) {
                    return false;
                }
                SimpleConfirmation simpleConfirmation = (SimpleConfirmation) obj2;
                return Intrinsics.f(this.f104961a, simpleConfirmation.f104961a) && Intrinsics.f(this.f104962b, simpleConfirmation.f104962b) && this.f104963c.equals(simpleConfirmation.f104963c) && Intrinsics.f(this.d, simpleConfirmation.d) && Intrinsics.f(this.e, simpleConfirmation.e) && Intrinsics.f(this.f, simpleConfirmation.f);
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF104964a() {
                return this.f104961a;
            }

            public final int hashCode() {
                int iHashCode = this.f104961a.hashCode() * 31;
                String str = this.f104962b;
                int iD = p.a.d(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104963c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e);
                String str2 = this.f;
                return iD + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104961a);
                dest.writeString(this.f104962b);
                Iterator itY = j6.a.y(this.f104963c, dest);
                while (itY.hasNext()) {
                    ((ActionButton) itY.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.d);
                dest.writeStringList(this.e);
                dest.writeString(this.f);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen$SimpleWarning;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SimpleWarning extends Screen {

            @NotNull
            public static final Parcelable.Creator<SimpleWarning> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f104964a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104965b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f104966c;
            public final String d;
            public final String e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(ActionButton.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new SimpleWarning(string, string2, parcel.readString(), parcel.readString(), parcel.readString(), arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SimpleWarning[i];
                }
            }

            public SimpleWarning(String title, String str, String trackingId, String subtitle, String str2, ArrayList buttons) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                Intrinsics.checkNotNullParameter(trackingId, "trackingId");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.f104964a = title;
                this.f104965b = str;
                this.f104966c = buttons;
                this.d = trackingId;
                this.e = subtitle;
                this.f = str2;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            public final List b() {
                return this.f104966c;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF104965b() {
                return this.f104965b;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getD() {
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
                if (!(obj2 instanceof SimpleWarning)) {
                    return false;
                }
                SimpleWarning simpleWarning = (SimpleWarning) obj2;
                return Intrinsics.f(this.f104964a, simpleWarning.f104964a) && Intrinsics.f(this.f104965b, simpleWarning.f104965b) && this.f104966c.equals(simpleWarning.f104966c) && Intrinsics.f(this.d, simpleWarning.d) && Intrinsics.f(this.e, simpleWarning.e) && Intrinsics.f(this.f, simpleWarning.f);
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog.Screen
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF104964a() {
                return this.f104964a;
            }

            public final int hashCode() {
                int iHashCode = this.f104964a.hashCode() * 31;
                String str = this.f104965b;
                int iC = p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f104966c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31, this.e);
                String str2 = this.f;
                return iC + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104964a);
                dest.writeString(this.f104965b);
                Iterator itY = j6.a.y(this.f104966c, dest);
                while (itY.hasNext()) {
                    ((ActionButton) itY.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        private Screen() {
        }

        public abstract List b();

        /* JADX INFO: renamed from: c */
        public abstract String getF104965b();

        /* JADX INFO: renamed from: d */
        public abstract String getD();

        /* JADX INFO: renamed from: getTitle */
        public abstract String getF104964a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog$Warning;", "Lcom/revolut/shared/feature/suspicious_transaction/api/models/SuspiciousTransactionDialog;", "", "toString", "()Ljava/lang/String;", "feature_shared_suspicious_transaction_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Warning extends SuspiciousTransactionDialog {

        @NotNull
        public static final Parcelable.Creator<Warning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f104969c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f104970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f104971h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SuspiciousTransactionDialog f104972j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Warning(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (SuspiciousTransactionDialog) parcel.readParcelable(Warning.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Warning[i];
            }
        }

        public Warning(boolean z, String title, String str, String description, String riskBoxTopLine, String riskPercentage, String riskBoxBottomLine, String cancelButtonTitle, String confirmButtonTitle, SuspiciousTransactionDialog nextDialog) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(riskBoxTopLine, "riskBoxTopLine");
            Intrinsics.checkNotNullParameter(riskPercentage, "riskPercentage");
            Intrinsics.checkNotNullParameter(riskBoxBottomLine, "riskBoxBottomLine");
            Intrinsics.checkNotNullParameter(cancelButtonTitle, "cancelButtonTitle");
            Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
            Intrinsics.checkNotNullParameter(nextDialog, "nextDialog");
            this.f104967a = z;
            this.f104968b = title;
            this.f104969c = str;
            this.d = description;
            this.e = riskBoxTopLine;
            this.f = riskPercentage;
            this.f104970g = riskBoxBottomLine;
            this.f104971h = cancelButtonTitle;
            this.i = confirmButtonTitle;
            this.f104972j = nextDialog;
        }

        @Override // com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF104967a() {
            return this.f104967a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) obj2;
            return this.f104967a == warning.f104967a && Intrinsics.f(this.f104968b, warning.f104968b) && Intrinsics.f(this.f104969c, warning.f104969c) && Intrinsics.f(this.d, warning.d) && Intrinsics.f(this.e, warning.e) && Intrinsics.f(this.f, warning.f) && Intrinsics.f(this.f104970g, warning.f104970g) && Intrinsics.f(this.f104971h, warning.f104971h) && Intrinsics.f(this.i, warning.i) && Intrinsics.f(this.f104972j, warning.f104972j);
        }

        public final int hashCode() {
            int iC = p.a.c(Boolean.hashCode(this.f104967a) * 31, 31, this.f104968b);
            String str = this.f104969c;
            return this.f104972j.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f104970g), 31, this.f104971h), 31, this.i);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f104967a ? 1 : 0);
            dest.writeString(this.f104968b);
            dest.writeString(this.f104969c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f104970g);
            dest.writeString(this.f104971h);
            dest.writeString(this.i);
            dest.writeParcelable(this.f104972j, i);
        }
    }

    private SuspiciousTransactionDialog() {
    }

    /* JADX INFO: renamed from: a */
    public boolean getF104967a() {
        return false;
    }
}
