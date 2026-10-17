package com.revolut.feature.credit.application.plugins.impl.ui.loading;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final LoadingScreen a() {
        return new LoadingScreen(new LoadingScreenContract$InputData(true, (LoadingItems) new DefaultLoadingItems(), 1));
    }

    public static final LoadingScreen b() {
        return new LoadingScreen(new LoadingScreenContract$InputData(false, (LoadingItems) new FullScreenPromptScreenLoadingItems(), 1));
    }

    public static final LoadingScreen c() {
        return new LoadingScreen(new LoadingScreenContract$InputData(false, (LoadingItems) new MarketingPromptScreenLoadingItems(), 1));
    }
}
