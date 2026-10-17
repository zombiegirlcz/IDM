package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1rSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1bSDK implements AFc1fSDK {

    @NotNull
    private final AFd1nSDK AFInAppEventParameterName;
    Map<String, Object> AFKeystoreWrapper;
    private boolean values;

    public AFc1bSDK(@NotNull AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.AFInAppEventParameterName = aFd1nSDK;
    }

    private boolean AFKeystoreWrapper() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final void AFInAppEventParameterName(boolean z) {
        this.values = z;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final Map<String, Object> AFInAppEventType() {
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final boolean values() {
        if (!AFKeystoreWrapper()) {
            return false;
        }
        Map<String, Object> map = this.AFKeystoreWrapper;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final void AFInAppEventParameterName() {
        Context context;
        if (AFKeystoreWrapper() && (context = this.AFInAppEventParameterName.AFKeystoreWrapper) != null) {
            this.AFKeystoreWrapper = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1rSDK.4
                    private /* synthetic */ AFa1ySDK AFInAppEventType;
                    private /* synthetic */ Class valueOf;

                    public AnonymousClass4(Class cls3, AFa1ySDK aFa1zSDK2) {
                        cls = cls3;
                        aFa1ySDK = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj2, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1ySDK aFa1ySDK = aFa1ySDK;
                            if (aFa1ySDK != null) {
                                aFa1ySDK.values("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj3 = objArr[0];
                        if (obj3 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", null).invoke(cls.cast(obj3), null));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1ySDK aFa1ySDK2 = aFa1ySDK;
                            if (aFa1ySDK2 != null) {
                                aFa1ySDK2.values(string2, string3, string);
                            }
                        } else {
                            AFa1ySDK aFa1ySDK3 = aFa1ySDK;
                            if (aFa1ySDK3 != null) {
                                aFa1ySDK3.values(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1zSDK2.values("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1zSDK2.values(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1zSDK2.values(e2.toString());
            } catch (NoSuchMethodException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e4);
                aFa1zSDK2.values(e4.toString());
            } catch (InvocationTargetException e5) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e5);
                aFa1zSDK2.values(e5.toString());
            }
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class AFa1zSDK implements AFa1rSDK.AFa1ySDK {
        private /* synthetic */ long AFInAppEventParameterName;

        public AFa1zSDK(long j2) {
            this.AFInAppEventParameterName = j2;
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1ySDK
        public final void values(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFc1bSDK.this.AFKeystoreWrapper;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFc1bSDK.this.AFKeystoreWrapper) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFc1bSDK aFc1bSDK = AFc1bSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFc1bSDK.AFKeystoreWrapper;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFc1bSDK.this.AFKeystoreWrapper;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.AFInAppEventParameterName);
            Map<String, Object> map5 = AFc1bSDK.this.AFKeystoreWrapper;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1ySDK
        public final void values(String str) {
            Map<String, Object> map = AFc1bSDK.this.AFKeystoreWrapper;
            if (map != null) {
                map.put("error", str);
            }
        }
    }
}
