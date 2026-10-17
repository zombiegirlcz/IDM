package com.revolut.feature.credit.application.plugins.impl.ui.card_ordering;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CardOrderingLoadingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.kompot.common.IOData$Input;
import ft3.j1;
import grl.r2;
import h30.l;
import h93.j0;
import h93.l0;
import hs3.q;
import hs3.v;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowContract$Input;", "PhysicalAndVirtualCard", "VirtualCard", "CardOrdered", "FromPayload", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$CardOrdered;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$FromPayload;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$PhysicalAndVirtualCard;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$VirtualCard;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardOrderingFlowContract$InputData extends IOData$Input, PluginFlowContract$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$CardOrdered;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOrdered implements CardOrderingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CardOrdered> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardOrderingLoadingScreenConfig f67190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f67191c;
        public final CreditApplicationPluginFlowContract$Configuration d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardOrdered(parcel.readString(), (CardOrderingLoadingScreenConfig) parcel.readParcelable(CardOrdered.class.getClassLoader()), parcel.readInt() != 0, (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(CardOrdered.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrdered[i];
            }
        }

        public CardOrdered(String facilityId, CardOrderingLoadingScreenConfig screenConfig, boolean z, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67189a = facilityId;
            this.f67190b = screenConfig;
            this.f67191c = z;
            this.d = pluginConfiguration;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: H9, reason: from getter */
        public final boolean getF() {
            return this.f67191c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67510a() {
            return this.d;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final r2 P9() {
            return this.d.f66893c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final j1 R2() {
            return this.d.d;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: S7 */
        public final j0 getD() {
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardOrdered)) {
                return false;
            }
            CardOrdered cardOrdered = (CardOrdered) obj2;
            return Intrinsics.f(this.f67189a, cardOrdered.f67189a) && Intrinsics.f(this.f67190b, cardOrdered.f67190b) && this.f67191c == cardOrdered.f67191c && Intrinsics.f(this.d, cardOrdered.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c((this.f67190b.hashCode() + (this.f67189a.hashCode() * 31)) * 31, 31, this.f67191c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final String k8() {
            return getF67510a().f66892b;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: t3 */
        public final l0 getE() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67189a);
            dest.writeParcelable(this.f67190b, i);
            dest.writeInt(this.f67191c ? 1 : 0);
            dest.writeParcelable(this.d, i);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF67197a() {
            return this.f67189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$FromPayload;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromPayload implements CardOrderingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<FromPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PluginPayload f67192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f67193b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromPayload((PluginPayload) parcel.readParcelable(FromPayload.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(FromPayload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromPayload[i];
            }
        }

        public FromPayload(PluginPayload payload, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67192a = payload;
            this.f67193b = pluginConfiguration;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: H9 */
        public final boolean getF() {
            return false;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67510a() {
            return this.f67193b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final r2 P9() {
            return this.f67193b.f66893c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final j1 R2() {
            return this.f67193b.d;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: S7 */
        public final j0 getD() {
            Object obj2;
            Object next;
            PluginPayload pluginPayload = this.f67192a;
            if (pluginPayload.getMetadata() instanceof q) {
                Object metadata = pluginPayload.getMetadata();
                if (metadata == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
                }
                obj2 = (q) metadata;
            } else {
                List listA = pluginPayload.a();
                if (listA != null) {
                    Iterator it8 = listA.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (next instanceof q) {
                            break;
                        }
                    }
                    obj2 = (v) next;
                } else {
                    obj2 = null;
                }
            }
            q qVar = (q) obj2;
            if (qVar != null) {
                return qVar.f154931c;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FromPayload)) {
                return false;
            }
            FromPayload fromPayload = (FromPayload) obj2;
            return Intrinsics.f(this.f67192a, fromPayload.f67192a) && Intrinsics.f(this.f67193b, fromPayload.f67193b);
        }

        public final int hashCode() {
            return this.f67193b.hashCode() + (this.f67192a.hashCode() * 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final String k8() {
            return getF67510a().f66892b;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: t3 */
        public final l0 getE() {
            Object obj2;
            Object next;
            PluginPayload pluginPayload = this.f67192a;
            if (pluginPayload.getMetadata() instanceof q) {
                Object metadata = pluginPayload.getMetadata();
                if (metadata == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
                }
                obj2 = (q) metadata;
            } else {
                List listA = pluginPayload.a();
                if (listA != null) {
                    Iterator it8 = listA.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (next instanceof q) {
                            break;
                        }
                    }
                    obj2 = (v) next;
                } else {
                    obj2 = null;
                }
            }
            q qVar = (q) obj2;
            if (qVar != null) {
                return qVar.d;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67192a, i);
            dest.writeParcelable(this.f67193b, i);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: y */
        public final String getF67197a() {
            Object obj2;
            String str;
            PluginPayload pluginPayload = this.f67192a;
            if (pluginPayload.getMetadata() instanceof q) {
                Object metadata = pluginPayload.getMetadata();
                if (metadata == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.CardOrderingMetadata");
                }
                obj2 = (q) metadata;
            } else {
                List listA = pluginPayload.a();
                Object obj3 = null;
                if (listA != null) {
                    Iterator it8 = listA.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (next instanceof q) {
                            obj3 = next;
                            break;
                        }
                    }
                    obj2 = (v) obj3;
                } else {
                    obj2 = null;
                }
            }
            q qVar = (q) obj2;
            if (qVar != null && (str = qVar.e) != null) {
                return str;
            }
            String str2 = pluginPayload.f66247a.f168330m;
            if (str2 != null) {
                return str2;
            }
            throw new IllegalStateException("Facility id can't be null with Card ordering plugin");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$PhysicalAndVirtualCard;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhysicalAndVirtualCard implements CardOrderingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PhysicalAndVirtualCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardOrderingIntroScreenConfig f67195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f67196c;
        public final j0 d;
        public final l0 e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhysicalAndVirtualCard(parcel.readString(), (CardOrderingIntroScreenConfig) parcel.readParcelable(PhysicalAndVirtualCard.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(PhysicalAndVirtualCard.class.getClassLoader()), parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhysicalAndVirtualCard[i];
            }
        }

        public PhysicalAndVirtualCard(String facilityId, CardOrderingIntroScreenConfig screenConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, j0 j0Var, l0 l0Var, boolean z) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67194a = facilityId;
            this.f67195b = screenConfig;
            this.f67196c = pluginConfiguration;
            this.d = j0Var;
            this.e = l0Var;
            this.f = z;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: H9, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67510a() {
            return this.f67196c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final r2 P9() {
            return this.f67196c.f66893c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final j1 R2() {
            return this.f67196c.d;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: S7, reason: from getter */
        public final j0 getD() {
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
            if (!(obj2 instanceof PhysicalAndVirtualCard)) {
                return false;
            }
            PhysicalAndVirtualCard physicalAndVirtualCard = (PhysicalAndVirtualCard) obj2;
            return Intrinsics.f(this.f67194a, physicalAndVirtualCard.f67194a) && Intrinsics.f(this.f67195b, physicalAndVirtualCard.f67195b) && Intrinsics.f(this.f67196c, physicalAndVirtualCard.f67196c) && this.d == physicalAndVirtualCard.d && this.e == physicalAndVirtualCard.e && this.f == physicalAndVirtualCard.f;
        }

        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f67196c, (this.f67195b.hashCode() + (this.f67194a.hashCode() * 31)) * 31, 31);
            j0 j0Var = this.d;
            int iHashCode = (iC + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            l0 l0Var = this.e;
            return Boolean.hashCode(this.f) + ((iHashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final String k8() {
            return getF67510a().f66892b;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: t3, reason: from getter */
        public final l0 getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67194a);
            dest.writeParcelable(this.f67195b, i);
            dest.writeParcelable(this.f67196c, i);
            j0 j0Var = this.d;
            if (j0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(j0Var.name());
            }
            l0 l0Var = this.e;
            if (l0Var == null) {
                dest.writeInt(0);
            } else {
                l.B(dest, 1, l0Var);
            }
            dest.writeInt(this.f ? 1 : 0);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF67197a() {
            return this.f67194a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData$VirtualCard;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/card_ordering/CardOrderingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VirtualCard implements CardOrderingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<VirtualCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardOrderingLoadingScreenConfig f67198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f67199c;
        public final j0 d;
        public final l0 e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VirtualCard(parcel.readString(), (CardOrderingLoadingScreenConfig) parcel.readParcelable(VirtualCard.class.getClassLoader()), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(VirtualCard.class.getClassLoader()), parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() != 0 ? l0.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualCard[i];
            }
        }

        public VirtualCard(String facilityId, CardOrderingLoadingScreenConfig screenConfig, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, j0 j0Var, l0 l0Var, boolean z) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67197a = facilityId;
            this.f67198b = screenConfig;
            this.f67199c = pluginConfiguration;
            this.d = j0Var;
            this.e = l0Var;
            this.f = z;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: H9, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67510a() {
            return this.f67199c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final r2 P9() {
            return this.f67199c.f66893c;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final j1 R2() {
            return this.f67199c.d;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: S7, reason: from getter */
        public final j0 getD() {
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
            if (!(obj2 instanceof VirtualCard)) {
                return false;
            }
            VirtualCard virtualCard = (VirtualCard) obj2;
            return Intrinsics.f(this.f67197a, virtualCard.f67197a) && Intrinsics.f(this.f67198b, virtualCard.f67198b) && Intrinsics.f(this.f67199c, virtualCard.f67199c) && this.d == virtualCard.d && this.e == virtualCard.e && this.f == virtualCard.f;
        }

        public final int hashCode() {
            int iC = org.bouncycastle.jcajce.provider.digest.a.c(this.f67199c, (this.f67198b.hashCode() + (this.f67197a.hashCode() * 31)) * 31, 31);
            j0 j0Var = this.d;
            int iHashCode = (iC + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            l0 l0Var = this.e;
            return Boolean.hashCode(this.f) + ((iHashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract
        public final String k8() {
            return getF67510a().f66892b;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: t3, reason: from getter */
        public final l0 getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67197a);
            dest.writeParcelable(this.f67198b, i);
            dest.writeParcelable(this.f67199c, i);
            j0 j0Var = this.d;
            if (j0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(j0Var.name());
            }
            l0 l0Var = this.e;
            if (l0Var == null) {
                dest.writeInt(0);
            } else {
                l.B(dest, 1, l0Var);
            }
            dest.writeInt(this.f ? 1 : 0);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$InputData
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getF67197a() {
            return this.f67197a;
        }
    }

    /* JADX INFO: renamed from: H9 */
    boolean getF();

    /* JADX INFO: renamed from: S7 */
    j0 getD();

    /* JADX INFO: renamed from: t3 */
    l0 getE();

    /* JADX INFO: renamed from: y */
    String getF67197a();
}
