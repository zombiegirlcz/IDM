package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1mSDK implements AFi1pSDK {

    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.14.2", null, 4, null);

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        LinkedHashMap linkedHashMapN = r0.n(new Pair("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), new Pair("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            linkedHashMapN.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return linkedHashMapN;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final void values(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }
}
