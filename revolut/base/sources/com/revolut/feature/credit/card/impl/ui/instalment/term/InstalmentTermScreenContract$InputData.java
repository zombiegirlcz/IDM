package com.revolut.feature.credit.card.impl.ui.instalment.term;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Credit", "Debit", "Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData$Credit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData$Debit;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstalmentTermScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData$Credit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Credit implements InstalmentTermScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Credit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f69512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f69513c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Credit(l.valueOf(parcel.readString()), string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Credit[i];
            }
        }

        public Credit(l pocketType, String facilityId, Set transactionIds) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f69511a = facilityId;
            this.f69512b = transactionIds;
            this.f69513c = pocketType;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData
        /* JADX INFO: renamed from: X4, reason: from getter */
        public final l getF69515b() {
            return this.f69513c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Credit)) {
                return false;
            }
            Credit credit = (Credit) obj2;
            return Intrinsics.f(this.f69511a, credit.f69511a) && Intrinsics.f(this.f69512b, credit.f69512b) && this.f69513c == credit.f69513c;
        }

        public final int hashCode() {
            return this.f69513c.hashCode() + p.a.f(this.f69511a.hashCode() * 31, 31, this.f69512b);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData
        /* JADX INFO: renamed from: v0, reason: from getter */
        public final Set getF69514a() {
            return this.f69512b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69511a);
            Iterator itV = n.v(this.f69512b, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            dest.writeString(this.f69513c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData$Debit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Debit implements InstalmentTermScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Debit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f69514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f69515b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Debit(linkedHashSet, l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Debit[i];
            }
        }

        public Debit(Set transactionIds, l pocketType) {
            Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f69514a = transactionIds;
            this.f69515b = pocketType;
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData
        /* JADX INFO: renamed from: X4, reason: from getter */
        public final l getF69515b() {
            return this.f69515b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Debit)) {
                return false;
            }
            Debit debit = (Debit) obj2;
            return Intrinsics.f(this.f69514a, debit.f69514a) && this.f69515b == debit.f69515b;
        }

        public final int hashCode() {
            return this.f69515b.hashCode() + (this.f69514a.hashCode() * 31);
        }

        @Override // com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData
        /* JADX INFO: renamed from: v0, reason: from getter */
        public final Set getF69514a() {
            return this.f69514a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f69514a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            dest.writeString(this.f69515b.name());
        }
    }

    /* JADX INFO: renamed from: X4 */
    l getF69515b();

    /* JADX INFO: renamed from: v0 */
    Set getF69514a();
}
