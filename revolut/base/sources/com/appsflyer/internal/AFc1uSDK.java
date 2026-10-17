package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1uSDK implements Runnable {

    @NotNull
    private final AFa1pSDK AFInAppEventParameterName;
    private final Map<String, Object> AFKeystoreWrapper;

    @NotNull
    private final AFd1fSDK valueOf;

    public AFc1uSDK(@NotNull AFd1fSDK aFd1fSDK, @NotNull AFa1pSDK aFa1pSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1fSDK, "");
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        this.valueOf = aFd1fSDK;
        this.AFInAppEventParameterName = aFa1pSDK;
        this.AFKeystoreWrapper = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1xSDK aFf1gSDK;
        if (this.AFInAppEventParameterName.AFInAppEventParameterName()) {
            AFf1fSDK aFf1fSDK = new AFf1fSDK(this.AFInAppEventParameterName, this.valueOf);
            aFf1fSDK.i = this.AFKeystoreWrapper;
            aFf1gSDK = aFf1fSDK;
        } else {
            aFf1gSDK = new AFf1gSDK(this.AFInAppEventParameterName, this.valueOf);
        }
        AFe1aSDK aFe1aSDKW = this.valueOf.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFf1gSDK));
        if (aFf1gSDK.AFKeystoreWrapper == AFf1ySDK.CONVERSION) {
            this.valueOf.afRDLog();
            if (AFe1bSDK.valueOf() && AFb1vSDK.AFKeystoreWrapper(this.valueOf.afInfoLog().AFKeystoreWrapper)) {
                AFe1aSDK aFe1aSDKW2 = this.valueOf.w();
                aFe1aSDKW2.AFInAppEventParameterName.execute(aFe1aSDKW2.new AnonymousClass4(new AFf1jSDK(this.valueOf, "install")));
            }
        }
    }
}
