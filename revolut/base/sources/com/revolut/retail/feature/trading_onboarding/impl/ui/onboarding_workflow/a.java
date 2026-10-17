package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow;

import cfl.p;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowContract$Step;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import cp5.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import oki.h;
import til.m;
import yhm.j;
import yki.b;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements n0l.a {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OnboardingWorkflowContract$InputData f104243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f104244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f104245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f104246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f104247t;

    public a(m workflowFlowProvider, OnboardingWorkflowContract$InputData inputData, Map productsProviders) {
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        this.o = workflowFlowProvider;
        this.f104243p = inputData;
        this.f104244q = productsProviders;
        final int i = 0;
        this.f104245r = j.b(new Function0(this) { // from class: n0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.a f211057b;

            {
                this.f211057b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Iterable iterable;
                boolean z;
                switch (i) {
                    case 0:
                        List listK = v.k(p.PRIVATE_BANK, p.PRIVATE_MARKETS);
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = listK.iterator();
                        while (it8.hasNext()) {
                            ybl.a aVar = (ybl.a) this.f211057b.f104244q.get((p) it8.next());
                            Set setB = aVar != null ? aVar.b() : null;
                            if (setB == null) {
                                setB = h0.f322473a;
                            }
                            a0.x(setB, arrayList);
                        }
                        return d0.i1(arrayList);
                    default:
                        com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.a aVar2 = this.f211057b;
                        TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig = aVar2.f104243p.f104237a;
                        if (tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) {
                            TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = ((TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) tradingOnboardingFeatureConfig).f104106b;
                            if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) {
                                iterable = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) tradingAccountOrType).f104115b;
                            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) {
                                iterable = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) tradingAccountOrType).f104118b;
                            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) {
                                iterable = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) tradingAccountOrType).f104112c;
                            } else {
                                if (!(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId) && !(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) && !(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iterable = f0.f322471a;
                            }
                        } else {
                            if (!(tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iterable = f0.f322471a;
                        }
                        Iterable iterable2 = iterable;
                        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                            z = true;
                        } else {
                            Iterator it9 = iterable2.iterator();
                            while (it9.hasNext()) {
                                if (((Set) aVar2.f104245r.getValue()).contains((TradingProductCode) it9.next())) {
                                    z = false;
                                }
                            }
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.f104246s = j.b(new Function0(this) { // from class: n0l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.a f211057b;

            {
                this.f211057b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Iterable iterable;
                boolean z;
                switch (i2) {
                    case 0:
                        List listK = v.k(p.PRIVATE_BANK, p.PRIVATE_MARKETS);
                        ArrayList arrayList = new ArrayList();
                        Iterator it8 = listK.iterator();
                        while (it8.hasNext()) {
                            ybl.a aVar = (ybl.a) this.f211057b.f104244q.get((p) it8.next());
                            Set setB = aVar != null ? aVar.b() : null;
                            if (setB == null) {
                                setB = h0.f322473a;
                            }
                            a0.x(setB, arrayList);
                        }
                        return d0.i1(arrayList);
                    default:
                        com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.a aVar2 = this.f211057b;
                        TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig = aVar2.f104243p.f104237a;
                        if (tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) {
                            TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = ((TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) tradingOnboardingFeatureConfig).f104106b;
                            if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) {
                                iterable = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) tradingAccountOrType).f104115b;
                            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) {
                                iterable = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) tradingAccountOrType).f104118b;
                            } else if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) {
                                iterable = ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) tradingAccountOrType).f104112c;
                            } else {
                                if (!(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId) && !(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) && !(tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                iterable = f0.f322471a;
                            }
                        } else {
                            if (!(tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iterable = f0.f322471a;
                        }
                        Iterable iterable2 = iterable;
                        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                            z = true;
                        } else {
                            Iterator it9 = iterable2.iterator();
                            while (it9.hasNext()) {
                                if (((Set) aVar2.f104245r.getValue()).contains((TradingProductCode) it9.next())) {
                                    z = false;
                                }
                            }
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        r rVar = new r(this, 4);
        this.f104247t = d.a(this, OnboardingWorkflowContract$Step.Workflow.f104242a, f0.f322471a, rVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f104247t;
    }
}
