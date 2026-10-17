package com.revolut.network;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkConfigurationProvider f98469b;

    public /* synthetic */ b(NetworkConfigurationProvider networkConfigurationProvider, int i) {
        this.f98468a = i;
        this.f98469b = networkConfigurationProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f98468a) {
            case 0:
                return this.f98469b.getAppVersionName();
            case 1:
                return Boolean.valueOf(NetworkConfigurationProvider.provideNetworkConfiguration$lambda$1(this.f98469b));
            default:
                return Boolean.valueOf(NetworkConfigurationProvider.provideNetworkConfiguration$lambda$2(this.f98469b));
        }
    }
}
