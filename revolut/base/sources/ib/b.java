package ib;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b {

    @NotNull
    public static final String Analysis = "analysis";

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public static final String DeviceSecurity = "device_security";

    @NotNull
    public static final String Features = "features";

    @NotNull
    public static final String Flow = "flow";

    @NotNull
    public static final String Scanner = "scanner";

    @NotNull
    public static final String Screen = "screen";

    @NotNull
    public static final String Session = "session";

    @NotNull
    public static final String Workflow = "workflow";

    @NotNull
    private final Map<String, Object> _mutableData;

    @NotNull
    private final String name;

    public b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this._mutableData = r0.n(new Pair("name", name));
    }

    public final void clear(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this._mutableData.remove(key);
    }

    @NotNull
    public final Map<String, Object> getData() {
        return this._mutableData;
    }

    public abstract String getIdentifier();

    @NotNull
    public final String getName() {
        return this.name;
    }

    public abstract String getSchema();

    public final void set(@NotNull String key, Object obj2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this._mutableData.put(key, obj2);
    }
}
