package com.onfido.android.sdk.capture.internal.util.logging;

import com.onfido.android.sdk.capture.internal.util.logging.network.OnfidoLoggerApi;
import com.onfido.android.sdk.capture.network.error.ErrorHandler;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LoggerRepository_Factory implements b {
    private final Provider errorHandlerProvider;
    private final Provider loggerApiProvider;
    private final Provider loggerCachingDataSourceProvider;
    private final Provider onfidoLogMapperProvider;

    public LoggerRepository_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.loggerApiProvider = provider;
        this.onfidoLogMapperProvider = provider2;
        this.errorHandlerProvider = provider3;
        this.loggerCachingDataSourceProvider = provider4;
    }

    public static LoggerRepository_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new LoggerRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static LoggerRepository newInstance(OnfidoLoggerApi onfidoLoggerApi, OnfidoLogMapper onfidoLogMapper, ErrorHandler errorHandler, LoggerCachingDataSource loggerCachingDataSource) {
        return new LoggerRepository(onfidoLoggerApi, onfidoLogMapper, errorHandler, loggerCachingDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public LoggerRepository get() {
        return newInstance((OnfidoLoggerApi) this.loggerApiProvider.get(), (OnfidoLogMapper) this.onfidoLogMapperProvider.get(), (ErrorHandler) this.errorHandlerProvider.get(), (LoggerCachingDataSource) this.loggerCachingDataSourceProvider.get());
    }
}
