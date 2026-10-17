package bem;

import aem.v;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdm.b f14873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14875c;
    public final Function0 d;

    public b(oem.a key, vdm.b client, Object pluginConfig) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        this.f14873a = client;
        this.f14874b = pluginConfig;
        this.f14875c = new ArrayList();
        this.d = new v(1);
    }

    public final void a(a hook, gim.i iVar) {
        Intrinsics.checkNotNullParameter(hook, "hook");
        this.f14875c.add(new e(hook, iVar));
    }
}
