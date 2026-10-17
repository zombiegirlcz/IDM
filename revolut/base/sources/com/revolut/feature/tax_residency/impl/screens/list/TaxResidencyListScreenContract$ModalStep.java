package com.revolut.feature.tax_residency.impl.screens.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zme.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "WhatIsTaxResidency", "RationaleFlow", "Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep$RationaleFlow;", "Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep$WhatIsTaxResidency;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxResidencyListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep$RationaleFlow;", "Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RationaleFlow implements TaxResidencyListScreenContract$ModalStep, Parcelable {

        @NotNull
        public static final Parcelable.Creator<RationaleFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f90088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f90089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f90090c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                l lVar = (l) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                int iC2 = 0;
                while (iC2 != i) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                return new RationaleFlow(arrayList, arrayList2, bVar, lVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RationaleFlow[i];
            }
        }

        public RationaleFlow(List existedTaxResidencies, List rules, b userCountryCode, l taxResidencyRule) {
            Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
            Intrinsics.checkNotNullParameter(taxResidencyRule, "taxResidencyRule");
            Intrinsics.checkNotNullParameter(existedTaxResidencies, "existedTaxResidencies");
            Intrinsics.checkNotNullParameter(rules, "rules");
            this.f90088a = userCountryCode;
            this.f90089b = taxResidencyRule;
            this.f90090c = existedTaxResidencies;
            this.d = rules;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RationaleFlow)) {
                return false;
            }
            RationaleFlow rationaleFlow = (RationaleFlow) obj2;
            return Intrinsics.f(this.f90088a, rationaleFlow.f90088a) && Intrinsics.f(this.f90089b, rationaleFlow.f90089b) && Intrinsics.f(this.f90090c, rationaleFlow.f90090c) && Intrinsics.f(this.d, rationaleFlow.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.d((this.f90089b.hashCode() + (this.f90088a.f297794a.hashCode() * 31)) * 31, 31, this.f90090c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90088a);
            dest.writeSerializable(this.f90089b);
            Iterator itV = p.a.v(this.f90090c, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = p.a.v(this.d, dest);
            while (itV2.hasNext()) {
                dest.writeSerializable((Serializable) itV2.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep$WhatIsTaxResidency;", "Lcom/revolut/feature/tax_residency/impl/screens/list/TaxResidencyListScreenContract$ModalStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WhatIsTaxResidency implements TaxResidencyListScreenContract$ModalStep, Parcelable {

        @NotNull
        public static final Parcelable.Creator<WhatIsTaxResidency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f90091a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WhatIsTaxResidency((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatIsTaxResidency[i];
            }
        }

        public WhatIsTaxResidency(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f90091a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WhatIsTaxResidency) && Intrinsics.f(this.f90091a, ((WhatIsTaxResidency) obj2).f90091a);
        }

        public final int hashCode() {
            return this.f90091a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90091a);
        }
    }
}
