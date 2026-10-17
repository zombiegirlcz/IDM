package com.revolut.feature.picker.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.R$string;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import prk.o;
import tx0.j0;
import y7a.s;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/picker/legacy/PickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "y7a/s", "NoResultsFoundConfig", "feature_picker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PickerScreenContract$InputData> CREATOR = new a();
    public final AnalyticsContext A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f80358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f80359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80360c;
    public final Clause d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f80361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f80362h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f80363j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f80364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f80365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f80366n;
    public final Clause o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f80367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f80368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f80369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f80370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f80371t;
    public final boolean u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f80372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AnalyticsProduct f80373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AnalyticsContext f80374y;
    public final NoResultsFoundConfig z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/picker/legacy/PickerScreenContract$InputData$NoResultsFoundConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_picker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoResultsFoundConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<NoResultsFoundConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f80375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f80376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f80377c;
        public final Integer d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NoResultsFoundConfig((Clause) parcel.readParcelable(NoResultsFoundConfig.class.getClassLoader()), (Clause) parcel.readParcelable(NoResultsFoundConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoResultsFoundConfig[i];
            }
        }

        public NoResultsFoundConfig() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NoResultsFoundConfig)) {
                return false;
            }
            NoResultsFoundConfig noResultsFoundConfig = (NoResultsFoundConfig) obj2;
            return Intrinsics.f(this.f80375a, noResultsFoundConfig.f80375a) && Intrinsics.f(this.f80376b, noResultsFoundConfig.f80376b) && Intrinsics.f(this.f80377c, noResultsFoundConfig.f80377c) && Intrinsics.f(this.d, noResultsFoundConfig.d);
        }

        public final int hashCode() {
            int iHashCode = this.f80375a.hashCode() * 31;
            Integer num = this.f80376b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Clause clause = this.f80377c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Integer num2 = this.d;
            return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80375a, i);
            Integer num = this.f80376b;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeParcelable(this.f80377c, i);
            Integer num2 = this.d;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
        }

        public NoResultsFoundConfig(Clause title, Clause clause, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f80375a = title;
            this.f80376b = num;
            this.f80377c = clause;
            this.d = num2;
        }

        public /* synthetic */ NoResultsFoundConfig(int i) {
            this(new TextLocalisedClause(R$string.search_empty_title, null, null, 14), null, null, null);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Object obj2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Object value = parcel.readValue(PickerScreenContract$InputData.class.getClassLoader());
            Clause clause = (Clause) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            Clause clause2 = (Clause) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader());
            boolean z3 = parcel.readInt() != 0;
            s sVarValueOf = parcel.readInt() == 0 ? null : s.valueOf(parcel.readString());
            boolean z4 = parcel.readInt() != 0;
            Clause clause4 = (Clause) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader());
            Clause clause5 = (Clause) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader());
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z6 = parcel.readInt() != 0;
            boolean z11 = parcel.readInt() != 0;
            Clause clause6 = (Clause) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            int i = parcel.readInt();
            boolean z29 = z;
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (true) {
                obj2 = value;
                if (iA == i) {
                    break;
                }
                iA = o.a(parcel, linkedHashSet, iA, 1);
                value = obj2;
            }
            boolean z31 = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE = 0;
            while (iE != i2) {
                iE = j6.a.e(PickerScreenContract$InputData.class, parcel, arrayList, iE, 1);
                i2 = i2;
            }
            return new PickerScreenContract$InputData(obj2, clause, z29, clause2, clause3, z3, sVarValueOf, z4, clause4, clause5, string, arrayListCreateStringArrayList, z6, z11, clause6, z12, string2, linkedHashSet, z31, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, j0.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader()), NoResultsFoundConfig.CREATOR.createFromParcel(parcel), (AnalyticsContext) parcel.readParcelable(PickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PickerScreenContract$InputData[i];
        }
    }

    public PickerScreenContract$InputData(Object obj2, Clause clause, boolean z, Clause clause2, Clause clause3, boolean z3, s sVar, boolean z4, Clause clause4, Clause clause5, String str, List list, boolean z6, boolean z11, Clause clause6, boolean z12, String str2, Set preSelectedModelIds, boolean z29, List menuItems, boolean z31, boolean z41, j0 headerTitleMode, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, NoResultsFoundConfig noResultsFoundConfig, AnalyticsContext analyticsContext2) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(headerTitleMode, "headerTitleMode");
        Intrinsics.checkNotNullParameter(noResultsFoundConfig, "noResultsFoundConfig");
        this.f80358a = obj2;
        this.f80359b = clause;
        this.f80360c = z;
        this.d = clause2;
        this.e = clause3;
        this.f = z3;
        this.f80361g = sVar;
        this.f80362h = z4;
        this.i = clause4;
        this.f80363j = clause5;
        this.k = str;
        this.f80364l = list;
        this.f80365m = z6;
        this.f80366n = z11;
        this.o = clause6;
        this.f80367p = z12;
        this.f80368q = str2;
        this.f80369r = preSelectedModelIds;
        this.f80370s = z29;
        this.f80371t = menuItems;
        this.u = z31;
        this.v = z41;
        this.f80372w = headerTitleMode;
        this.f80373x = analyticsProduct;
        this.f80374y = analyticsContext;
        this.z = noResultsFoundConfig;
        this.A = analyticsContext2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PickerScreenContract$InputData)) {
            return false;
        }
        PickerScreenContract$InputData pickerScreenContract$InputData = (PickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80358a, pickerScreenContract$InputData.f80358a) && Intrinsics.f(this.f80359b, pickerScreenContract$InputData.f80359b) && this.f80360c == pickerScreenContract$InputData.f80360c && Intrinsics.f(this.d, pickerScreenContract$InputData.d) && Intrinsics.f(this.e, pickerScreenContract$InputData.e) && this.f == pickerScreenContract$InputData.f && this.f80361g == pickerScreenContract$InputData.f80361g && this.f80362h == pickerScreenContract$InputData.f80362h && Intrinsics.f(this.i, pickerScreenContract$InputData.i) && Intrinsics.f(this.f80363j, pickerScreenContract$InputData.f80363j) && Intrinsics.f(this.k, pickerScreenContract$InputData.k) && Intrinsics.f(this.f80364l, pickerScreenContract$InputData.f80364l) && this.f80365m == pickerScreenContract$InputData.f80365m && this.f80366n == pickerScreenContract$InputData.f80366n && Intrinsics.f(this.o, pickerScreenContract$InputData.o) && this.f80367p == pickerScreenContract$InputData.f80367p && Intrinsics.f(this.f80368q, pickerScreenContract$InputData.f80368q) && Intrinsics.f(this.f80369r, pickerScreenContract$InputData.f80369r) && this.f80370s == pickerScreenContract$InputData.f80370s && Intrinsics.f(this.f80371t, pickerScreenContract$InputData.f80371t) && this.u == pickerScreenContract$InputData.u && this.v == pickerScreenContract$InputData.v && this.f80372w == pickerScreenContract$InputData.f80372w && Intrinsics.f(this.f80373x, pickerScreenContract$InputData.f80373x) && Intrinsics.f(this.f80374y, pickerScreenContract$InputData.f80374y) && Intrinsics.f(this.z, pickerScreenContract$InputData.z) && Intrinsics.f(this.A, pickerScreenContract$InputData.A);
    }

    public final int hashCode() {
        Object obj2 = this.f80358a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Clause clause = this.f80359b;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f80360c);
        Clause clause2 = this.d;
        int iHashCode2 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.e;
        int iC2 = j6.a.c((iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31, 31, this.f);
        s sVar = this.f80361g;
        int iC3 = j6.a.c((iC2 + (sVar == null ? 0 : sVar.hashCode())) * 31, 31, this.f80362h);
        Clause clause4 = this.i;
        int iHashCode3 = (iC3 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.f80363j;
        int iHashCode4 = (iHashCode3 + (clause5 == null ? 0 : clause5.hashCode())) * 31;
        String str = this.k;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f80364l;
        int iC4 = j6.a.c(j6.a.c((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f80365m), 31, this.f80366n);
        Clause clause6 = this.o;
        int iC5 = j6.a.c((iC4 + (clause6 == null ? 0 : clause6.hashCode())) * 31, 31, this.f80367p);
        String str2 = this.f80368q;
        int iHashCode6 = (this.f80372w.hashCode() + j6.a.c(j6.a.c(p.a.d(j6.a.c(p.a.f((iC5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f80369r), 31, this.f80370s), 31, this.f80371t), 31, this.u), 31, this.v)) * 31;
        AnalyticsProduct analyticsProduct = this.f80373x;
        int iHashCode7 = (iHashCode6 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f80374y;
        int iHashCode8 = (this.z.hashCode() + ((iHashCode7 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31)) * 31;
        AnalyticsContext analyticsContext2 = this.A;
        return iHashCode8 + (analyticsContext2 != null ? AnalyticsContext.a(analyticsContext2.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeValue(this.f80358a);
        dest.writeParcelable(this.f80359b, i);
        dest.writeInt(this.f80360c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        s sVar = this.f80361g;
        if (sVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(sVar.name());
        }
        dest.writeInt(this.f80362h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f80363j, i);
        dest.writeString(this.k);
        dest.writeStringList(this.f80364l);
        dest.writeInt(this.f80365m ? 1 : 0);
        dest.writeInt(this.f80366n ? 1 : 0);
        dest.writeParcelable(this.o, i);
        dest.writeInt(this.f80367p ? 1 : 0);
        dest.writeString(this.f80368q);
        Iterator itV = n.v(this.f80369r, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeInt(this.f80370s ? 1 : 0);
        Iterator itV2 = p.a.v(this.f80371t, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeInt(this.u ? 1 : 0);
        dest.writeInt(this.v ? 1 : 0);
        dest.writeString(this.f80372w.name());
        dest.writeParcelable(this.f80373x, i);
        dest.writeParcelable(this.f80374y, i);
        this.z.writeToParcel(dest, i);
        dest.writeParcelable(this.A, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PickerScreenContract$InputData(Object obj2, Clause clause, Clause clause2, s sVar, boolean z, Clause clause3, String str, ArrayList arrayList, String str2, Set set, List list, boolean z3, j0 j0Var, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, int i) {
        Set setB;
        Object obj3 = (i & 1) != 0 ? null : obj2;
        int i2 = 0;
        boolean z4 = (i & 4) == 0;
        Clause clause4 = (i & 16) != 0 ? null : clause2;
        s sVar2 = (i & 64) != 0 ? s.ARROW : sVar;
        boolean z6 = (i & 128) != 0 ? true : z;
        Clause clause5 = (i & 256) != 0 ? null : clause3;
        String str3 = (i & 1024) != 0 ? null : str;
        ArrayList arrayList2 = (i & 2048) != 0 ? null : arrayList;
        boolean z11 = (i & 4096) == 0;
        String str4 = (65536 & i) != 0 ? null : str2;
        if ((131072 & i) != 0) {
            setB = (str4 == null || d0.W(str4)) ? h0.f322473a : y0.b(str4);
        } else {
            setB = set;
        }
        this(obj3, clause, z4, null, clause4, true, sVar2, z6, clause5, null, str3, arrayList2, z11, false, null, false, str4, setB, false, (524288 & i) != 0 ? f0.f322471a : list, false, (2097152 & i) != 0 ? false : z3, (4194304 & i) != 0 ? j0.MULTILINE : j0Var, (8388608 & i) != 0 ? null : analyticsProduct, (i & 16777216) != 0 ? null : analyticsContext, new NoResultsFoundConfig(i2), null);
    }
}
