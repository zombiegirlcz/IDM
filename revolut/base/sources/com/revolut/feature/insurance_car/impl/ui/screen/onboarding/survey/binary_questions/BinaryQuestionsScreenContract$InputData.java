package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kl7.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/survey/binary_questions/BinaryQuestionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BinaryQuestionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BinaryQuestionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f75635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75636c;
    public final Map d;
    public final List e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE = 0;
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BinaryQuestionInfo.CREATOR, parcel, arrayList, iA, 1);
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashMap.put(p1.valueOf(parcel.readString()), Boolean.valueOf(parcel.readInt() != 0));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            while (iE != i6) {
                iE = j6.a.e(BinaryQuestionsScreenContract$InputData.class, parcel, arrayList2, iE, 1);
            }
            return new BinaryQuestionsScreenContract$InputData(i, numValueOf, arrayList, linkedHashMap, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BinaryQuestionsScreenContract$InputData[i];
        }
    }

    public BinaryQuestionsScreenContract$InputData(int i, Integer num, List questions, Map startValues, List menuItems, String analyticsScreenName) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(analyticsScreenName, "analyticsScreenName");
        this.f75634a = i;
        this.f75635b = num;
        this.f75636c = questions;
        this.d = startValues;
        this.e = menuItems;
        this.f = analyticsScreenName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BinaryQuestionsScreenContract$InputData)) {
            return false;
        }
        BinaryQuestionsScreenContract$InputData binaryQuestionsScreenContract$InputData = (BinaryQuestionsScreenContract$InputData) obj2;
        return this.f75634a == binaryQuestionsScreenContract$InputData.f75634a && Intrinsics.f(this.f75635b, binaryQuestionsScreenContract$InputData.f75635b) && Intrinsics.f(this.f75636c, binaryQuestionsScreenContract$InputData.f75636c) && Intrinsics.f(this.d, binaryQuestionsScreenContract$InputData.d) && Intrinsics.f(this.e, binaryQuestionsScreenContract$InputData.e) && Intrinsics.f(this.f, binaryQuestionsScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f75634a) * 31;
        Integer num = this.f75635b;
        return this.f.hashCode() + p.a.d(p.a.e(p.a.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f75636c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f75634a);
        Integer num = this.f75635b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itV = p.a.v(this.f75636c, dest);
        while (itV.hasNext()) {
            ((BinaryQuestionInfo) itV.next()).writeToParcel(dest, i);
        }
        Iterator itZ = j6.a.z(this.d, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((p1) entry.getKey()).name());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        Iterator itV2 = p.a.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeString(this.f);
    }

    public BinaryQuestionsScreenContract$InputData(int i, Integer num, List list, LinkedHashMap linkedHashMap, List list2, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, list, (i2 & 8) != 0 ? r0.g() : linkedHashMap, (i2 & 16) != 0 ? f0.f322471a : list2, "BinaryQuestionsScreen");
    }
}
