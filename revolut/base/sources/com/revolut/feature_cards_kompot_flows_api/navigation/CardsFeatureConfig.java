package com.revolut.feature_cards_kompot_flows_api.navigation;

import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "ShowCardPin", "ShowCardPinWithCta", "ChangeCardLabel", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig$ChangeCardLabel;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig$ShowCardPin;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig$ShowCardPinWithCta;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig$ChangeCardLabel;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCardLabel extends CardsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f96639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f96640h;

        /* JADX WARN: Illegal instructions before constructor call */
        public ChangeCardLabel(int i, String cardId, Integer num) {
            num = (i & 4) != 0 ? null : num;
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            super(new CardDetailsFlowDestination(new CardDetailsFlowDestination.StartType.ChangeCardLabel(cardId, 20)), num);
            this.f96639g = cardId;
            this.f96640h = num;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF75028j() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF96645j() {
            return this.f96640h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeCardLabel)) {
                return false;
            }
            ChangeCardLabel changeCardLabel = (ChangeCardLabel) obj2;
            return Intrinsics.f(this.f96639g, changeCardLabel.f96639g) && Intrinsics.f(this.f96640h, changeCardLabel.f96640h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f96639g.hashCode() * 961;
            Integer num = this.f96640h;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig$ShowCardPin;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowCardPin extends CardsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f96641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f96642h;
        public final boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowCardPin(String cardId, boolean z) {
            super(new CardDetailsFlowDestination(new CardDetailsFlowDestination.StartType.ShowPin(cardId, true, false, z)), null);
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f96641g = cardId;
            this.f96642h = true;
            this.i = z;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF75028j() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c */
        public final Integer getF96645j() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowCardPin)) {
                return false;
            }
            ShowCardPin showCardPin = (ShowCardPin) obj2;
            return Intrinsics.f(this.f96641g, showCardPin.f96641g) && this.f96642h == showCardPin.f96642h && this.i == showCardPin.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return a.c(a.c(a.c(this.f96641g.hashCode() * 31, 31, this.f96642h), 31, false), 961, this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig$ShowCardPinWithCta;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowCardPinWithCta extends CardsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f96643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f96644h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f96645j;

        /* JADX WARN: Illegal instructions before constructor call */
        public ShowCardPinWithCta(int i, Integer num, String cardId, boolean z) {
            boolean z3 = (i & 4) == 0;
            num = (i & 16) != 0 ? null : num;
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            super(new CardDetailsFlowDestination(new CardDetailsFlowDestination.StartType.ShowPinWithCtaImmediately(cardId, z, z3)), num);
            this.f96643g = cardId;
            this.f96644h = z;
            this.i = z3;
            this.f96645j = num;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF75028j() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF96645j() {
            return this.f96645j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowCardPinWithCta)) {
                return false;
            }
            ShowCardPinWithCta showCardPinWithCta = (ShowCardPinWithCta) obj2;
            return Intrinsics.f(this.f96643g, showCardPinWithCta.f96643g) && this.f96644h == showCardPinWithCta.f96644h && this.i == showCardPinWithCta.i && Intrinsics.f(this.f96645j, showCardPinWithCta.f96645j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iC = a.c(a.c(this.f96643g.hashCode() * 31, 31, this.f96644h), 961, this.i);
            Integer num = this.f96645j;
            return iC + (num == null ? 0 : num.hashCode());
        }
    }

    public CardsFeatureConfig(CardDetailsFlowDestination cardDetailsFlowDestination, Integer num) {
        super((ActivityAnimation) null, (ParcelableDestination) cardDetailsFlowDestination, false, num, 0, 52);
    }
}
