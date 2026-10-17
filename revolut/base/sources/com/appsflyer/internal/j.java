package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.app.LocaleConfig;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ MeasurementManager a(Object obj2) {
        return (MeasurementManager) obj2;
    }

    public static /* synthetic */ LocaleConfig b(LocaleList localeList) {
        return new LocaleConfig(localeList);
    }

    public static /* bridge */ /* synthetic */ Class c() {
        return MeasurementManager.class;
    }
}
