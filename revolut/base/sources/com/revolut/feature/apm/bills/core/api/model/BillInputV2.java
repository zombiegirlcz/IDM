package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "Landroid/os/Parcelable;", "<init>", "()V", "BillInputAddress", "BillInputMoney", "BillInputText", "BillInputNested", "BillInputRepeaterDropdown", "BillInputRepeater", "BillInputUntypedInputs", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputAddress;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputMoney;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputNested;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputRepeater;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputRepeaterDropdown;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputText;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputUntypedInputs;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BillInputV2 implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputText;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputText extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputText> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61318c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList arrayList = null;
                c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BillInputText.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BillInputText(string, cVarValueOf, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputText[i];
            }
        }

        public BillInputText(String name, c cVar, List list, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f61316a = name;
            this.f61317b = cVar;
            this.f61318c = list;
            this.d = str;
        }

        public static BillInputText c(BillInputText billInputText, List list, String str, int i) {
            String name = billInputText.f61316a;
            c cVar = billInputText.f61317b;
            if ((i & 4) != 0) {
                list = billInputText.f61318c;
            }
            if ((i & 8) != 0) {
                str = billInputText.d;
            }
            billInputText.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            return new BillInputText(name, cVar, list, str);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61318c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            String str = this.d;
            return true ^ (str == null || str.length() == 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputText)) {
                return false;
            }
            BillInputText billInputText = (BillInputText) obj2;
            return Intrinsics.f(this.f61316a, billInputText.f61316a) && this.f61317b == billInputText.f61317b && Intrinsics.f(this.f61318c, billInputText.f61318c) && Intrinsics.f(this.d, billInputText.d);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61316a;
        }

        public final int hashCode() {
            int iHashCode = this.f61316a.hashCode() * 31;
            c cVar = this.f61317b;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            List list = this.f61318c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.d;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61316a);
            c cVar = this.f61317b;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            List list = this.f61318c;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputUntypedInputs;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputUntypedInputs extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputUntypedInputs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61321c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillInputUntypedInputs.class, parcel, arrayList, iE, 1);
                }
                return new BillInputUntypedInputs(string, cVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputUntypedInputs[i];
            }
        }

        public BillInputUntypedInputs(String str, c cVar, List inputs) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.f61319a = str;
            this.f61320b = cVar;
            this.f61321c = inputs;
        }

        public static BillInputUntypedInputs c(BillInputUntypedInputs billInputUntypedInputs, List inputs) {
            String str = billInputUntypedInputs.f61319a;
            c cVar = billInputUntypedInputs.f61320b;
            billInputUntypedInputs.getClass();
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new BillInputUntypedInputs(str, cVar, inputs);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61321c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            return !this.f61321c.isEmpty();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputUntypedInputs)) {
                return false;
            }
            BillInputUntypedInputs billInputUntypedInputs = (BillInputUntypedInputs) obj2;
            return Intrinsics.f(this.f61319a, billInputUntypedInputs.f61319a) && this.f61320b == billInputUntypedInputs.f61320b && Intrinsics.f(this.f61321c, billInputUntypedInputs.f61321c);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61319a;
        }

        public final int hashCode() {
            String str = this.f61319a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            c cVar = this.f61320b;
            return this.f61321c.hashCode() + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61319a);
            c cVar = this.f61320b;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            Iterator itV = p.a.v(this.f61321c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private BillInputV2() {
    }

    /* JADX INFO: renamed from: a */
    public abstract List getF61321c();

    public abstract boolean b();

    /* JADX INFO: renamed from: getName */
    public abstract String getF61319a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputNested;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputNested extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputNested> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61309c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                c cVarValueOf = c.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillInputNested.class, parcel, arrayList, iE, 1);
                }
                return new BillInputNested(string, cVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputNested[i];
            }
        }

        public BillInputNested(String name, c type, List inputs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.f61307a = name;
            this.f61308b = type;
            this.f61309c = inputs;
        }

        public static BillInputNested c(BillInputNested billInputNested, List inputs) {
            String name = billInputNested.f61307a;
            c type = billInputNested.f61308b;
            billInputNested.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new BillInputNested(name, type, inputs);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61309c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            return !this.f61309c.isEmpty();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputNested)) {
                return false;
            }
            BillInputNested billInputNested = (BillInputNested) obj2;
            return Intrinsics.f(this.f61307a, billInputNested.f61307a) && this.f61308b == billInputNested.f61308b && Intrinsics.f(this.f61309c, billInputNested.f61309c);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61307a;
        }

        public final int hashCode() {
            return this.f61309c.hashCode() + ((this.f61308b.hashCode() + (this.f61307a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61307a);
            dest.writeString(this.f61308b.name());
            Iterator itV = p.a.v(this.f61309c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        public /* synthetic */ BillInputNested(String str, List list) {
            this(str, c.NESTED_ITEM, list);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputRepeater;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputRepeater extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputRepeater> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61312c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillInputRepeater.class, parcel, arrayList, iE, 1);
                }
                return new BillInputRepeater(string, cVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputRepeater[i];
            }
        }

        public BillInputRepeater(String name, c cVar, List inputs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.f61310a = name;
            this.f61311b = cVar;
            this.f61312c = inputs;
        }

        public static BillInputRepeater c(BillInputRepeater billInputRepeater, List inputs) {
            String name = billInputRepeater.f61310a;
            c cVar = billInputRepeater.f61311b;
            billInputRepeater.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new BillInputRepeater(name, cVar, inputs);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61312c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            return !this.f61312c.isEmpty();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputRepeater)) {
                return false;
            }
            BillInputRepeater billInputRepeater = (BillInputRepeater) obj2;
            return Intrinsics.f(this.f61310a, billInputRepeater.f61310a) && this.f61311b == billInputRepeater.f61311b && Intrinsics.f(this.f61312c, billInputRepeater.f61312c);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61310a;
        }

        public final int hashCode() {
            int iHashCode = this.f61310a.hashCode() * 31;
            c cVar = this.f61311b;
            return this.f61312c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61310a);
            c cVar = this.f61311b;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            Iterator itV = p.a.v(this.f61312c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        public /* synthetic */ BillInputRepeater(String str, List list) {
            this(str, c.REPEATER, list);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputRepeaterDropdown;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputRepeaterDropdown extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputRepeaterDropdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61315c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                c cVarValueOf = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BillInputRepeaterDropdown.class, parcel, arrayList, iE, 1);
                }
                return new BillInputRepeaterDropdown(string, cVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputRepeaterDropdown[i];
            }
        }

        public BillInputRepeaterDropdown(String name, c cVar, List inputs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.f61313a = name;
            this.f61314b = cVar;
            this.f61315c = inputs;
        }

        public static BillInputRepeaterDropdown c(BillInputRepeaterDropdown billInputRepeaterDropdown, List inputs) {
            String name = billInputRepeaterDropdown.f61313a;
            c cVar = billInputRepeaterDropdown.f61314b;
            billInputRepeaterDropdown.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new BillInputRepeaterDropdown(name, cVar, inputs);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61315c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            return !this.f61315c.isEmpty();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputRepeaterDropdown)) {
                return false;
            }
            BillInputRepeaterDropdown billInputRepeaterDropdown = (BillInputRepeaterDropdown) obj2;
            return Intrinsics.f(this.f61313a, billInputRepeaterDropdown.f61313a) && this.f61314b == billInputRepeaterDropdown.f61314b && Intrinsics.f(this.f61315c, billInputRepeaterDropdown.f61315c);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61313a;
        }

        public final int hashCode() {
            int iHashCode = this.f61313a.hashCode() * 31;
            c cVar = this.f61314b;
            return this.f61315c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61313a);
            c cVar = this.f61314b;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            Iterator itV = p.a.v(this.f61315c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }

        public /* synthetic */ BillInputRepeaterDropdown(String str, List list) {
            this(str, c.REPEATER_DROPDOWN, list);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputAddress;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputAddress extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61303c;
        public final Address d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                c cVarValueOf = c.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BillInputAddress.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BillInputAddress(string, cVarValueOf, arrayList, (Address) parcel.readParcelable(BillInputAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputAddress[i];
            }
        }

        public BillInputAddress(String name, c type, List list, Address address) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f61301a = name;
            this.f61302b = type;
            this.f61303c = list;
            this.d = address;
        }

        public static BillInputAddress c(BillInputAddress billInputAddress, Address address) {
            String name = billInputAddress.f61301a;
            c type = billInputAddress.f61302b;
            List list = billInputAddress.f61303c;
            billInputAddress.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            return new BillInputAddress(name, type, list, address);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61303c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            return this.d != null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputAddress)) {
                return false;
            }
            BillInputAddress billInputAddress = (BillInputAddress) obj2;
            return Intrinsics.f(this.f61301a, billInputAddress.f61301a) && this.f61302b == billInputAddress.f61302b && Intrinsics.f(this.f61303c, billInputAddress.f61303c) && Intrinsics.f(this.d, billInputAddress.d);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61301a;
        }

        public final int hashCode() {
            int iHashCode = (this.f61302b.hashCode() + (this.f61301a.hashCode() * 31)) * 31;
            List list = this.f61303c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Address address = this.d;
            return iHashCode2 + (address != null ? address.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61301a);
            dest.writeString(this.f61302b.name());
            List list = this.f61303c;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ BillInputAddress(String str, ArrayList arrayList, Address address) {
            this(str, c.ADDRESS, arrayList, address);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2$BillInputMoney;", "Lcom/revolut/feature/apm/bills/core/api/model/BillInputV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillInputMoney extends BillInputV2 {

        @NotNull
        public static final Parcelable.Creator<BillInputMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f61305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f61306c;
        public final d d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                c cVarValueOf = c.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(BillInputMoney.class, parcel, arrayList2, iE, 1);
                    }
                    arrayList = arrayList2;
                }
                return new BillInputMoney(string, cVarValueOf, arrayList, (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillInputMoney[i];
            }
        }

        public BillInputMoney(String name, c type, List list, d dVar) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f61304a = name;
            this.f61305b = type;
            this.f61306c = list;
            this.d = dVar;
        }

        public static BillInputMoney c(BillInputMoney billInputMoney, d dVar) {
            String name = billInputMoney.f61304a;
            c type = billInputMoney.f61305b;
            List list = billInputMoney.f61306c;
            billInputMoney.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            return new BillInputMoney(name, type, list, dVar);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF61321c() {
            return this.f61306c;
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        public final boolean b() {
            return this.d != null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillInputMoney)) {
                return false;
            }
            BillInputMoney billInputMoney = (BillInputMoney) obj2;
            return Intrinsics.f(this.f61304a, billInputMoney.f61304a) && this.f61305b == billInputMoney.f61305b && Intrinsics.f(this.f61306c, billInputMoney.f61306c) && Intrinsics.f(this.d, billInputMoney.d);
        }

        @Override // com.revolut.feature.apm.bills.core.api.model.BillInputV2
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF61319a() {
            return this.f61304a;
        }

        public final int hashCode() {
            int iHashCode = (this.f61305b.hashCode() + (this.f61304a.hashCode() * 31)) * 31;
            List list = this.f61306c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            d dVar = this.d;
            return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61304a);
            dest.writeString(this.f61305b.name());
            List list = this.f61306c;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeParcelable((Parcelable) itQ.next(), i);
                }
            }
            dest.writeSerializable(this.d);
        }

        public /* synthetic */ BillInputMoney(d dVar, String str, ArrayList arrayList) {
            this(str, c.MONEY, arrayList, dVar);
        }
    }
}
