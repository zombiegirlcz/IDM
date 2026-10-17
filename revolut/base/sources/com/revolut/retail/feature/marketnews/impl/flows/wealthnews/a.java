package com.revolut.retail.feature.marketnews.impl.flows.wealthnews;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.WealthNewsFlowContract$Step;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlow;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreenContract$InputData;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements r0k.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WealthNewsFlowContract$Step f101844t;
    public final WealthNewsFlowContract$State u;

    public a(WealthNewsFlowContract$InputData inputData) {
        WealthNewsFlowContract$Step allNews;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof WealthNewsFlowContract$InputData.Overview) {
            allNews = new WealthNewsFlowContract$Step.Overview(((WealthNewsFlowContract$InputData.Overview) inputData).f101833a);
        } else if (inputData instanceof WealthNewsFlowContract$InputData.Reader) {
            WealthNewsFlowContract$InputData.Reader reader = (WealthNewsFlowContract$InputData.Reader) inputData;
            allNews = new WealthNewsFlowContract$Step.Reader(reader.f101834a, reader.f101835b);
        } else if (inputData instanceof WealthNewsFlowContract$InputData.DailyNews) {
            WealthNewsFlowContract$InputData.DailyNews dailyNews = (WealthNewsFlowContract$InputData.DailyNews) inputData;
            allNews = new WealthNewsFlowContract$Step.DailyNews(dailyNews.f101830a, dailyNews.f101831b, dailyNews.f101832c);
        } else {
            if (!(inputData instanceof WealthNewsFlowContract$InputData.AllNews)) {
                throw new NoWhenBranchMatchedException();
            }
            allNews = new WealthNewsFlowContract$Step.AllNews(((WealthNewsFlowContract$InputData.AllNews) inputData).f101829a);
        }
        this.f101844t = allNews;
        this.u = WealthNewsFlowContract$State.f101836a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        WealthNewsFlowContract$Step step = (WealthNewsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof WealthNewsFlowContract$Step.Overview) {
            return new WealthNewsOverviewFlow(new WealthNewsOverviewFlowContract$InputData(((WealthNewsFlowContract$Step.Overview) step).f101841a));
        }
        if (step instanceof WealthNewsFlowContract$Step.Reader) {
            WealthNewsFlowContract$Step.Reader reader = (WealthNewsFlowContract$Step.Reader) step;
            return new WealthNewsArticleReaderScreen(new WealthNewsArticleReaderScreenContract$InputData(reader.f101842a, reader.f101843b));
        }
        if (step instanceof WealthNewsFlowContract$Step.DailyNews) {
            WealthNewsFlowContract$Step.DailyNews dailyNews = (WealthNewsFlowContract$Step.DailyNews) step;
            return new WealthDailyNewsScreen(new WealthDailyNewsScreenContract$InputData(dailyNews.f101838a, dailyNews.f101839b, dailyNews.f101840c));
        }
        if (step instanceof WealthNewsFlowContract$Step.AllNews) {
            return new WealthAllNewsScreen(new WealthAllNewsContract$InputData(((WealthNewsFlowContract$Step.AllNews) step).f101837a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f101844t;
    }
}
