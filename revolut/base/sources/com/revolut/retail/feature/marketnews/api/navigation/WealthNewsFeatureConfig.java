package com.revolut.retail.feature.marketnews.api.navigation;

import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsOverviewDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tzj.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Overview", "Reader", "Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig$Overview;", "Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig$Reader;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WealthNewsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig$Overview;", "Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overview extends WealthNewsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final a f101812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f101813h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Overview(a section, ActivityAnimation.System system) {
            super(system, new WealthNewsOverviewDestination(section), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(section, "section");
            this.f101812g = section;
            this.f101813h = system;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF101813h() {
            return this.f101813h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) obj2;
            return this.f101812g == overview.f101812g && Intrinsics.f(this.f101813h, overview.f101813h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f101812g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f101813h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig$Reader;", "Lcom/revolut/retail/feature/marketnews/api/navigation/WealthNewsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_market_news_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reader extends WealthNewsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WealthNewsArticle f101814g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f101815h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reader(WealthNewsArticle article) {
            super(null, new WealthNewsArticleReaderDestination(article, true, null), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(article, "article");
            this.f101814g = article;
            this.f101815h = true;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF101813h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Reader)) {
                return false;
            }
            Reader reader = (Reader) obj2;
            return Intrinsics.f(this.f101814g, reader.f101814g) && this.f101815h == reader.f101815h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return j6.a.c(this.f101814g.hashCode() * 31, 31, this.f101815h);
        }
    }
}
