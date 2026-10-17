package ib;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160069c;
    public final aim.f d;

    public d(String name, Throwable th10, Map initialAttributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(initialAttributes, "initialAttributes");
        this.f160068b = "app_event";
        this.f160069c = "iglu:com.fourthline.sdk/app_event/jsonschema/1-0-0";
        aim.f builder = new aim.f();
        builder.putAll(initialAttributes);
        builder.put("name", name);
        if (th10 != null) {
            builder.put("error", th10.getMessage());
            builder.putAll(a1m.e.N(th10));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.d = builder.b();
    }

    @Override // ib.f
    public final Map getAttributes() {
        return this.d;
    }

    @Override // ib.f
    public final String getEventName() {
        return this.f160068b;
    }

    @Override // ib.f
    public final String getSchema() {
        return this.f160069c;
    }

    public /* synthetic */ d(int i, String str, Throwable th10, Map map) {
        this(str, (i & 4) != 0 ? null : th10, (i & 2) != 0 ? r0.g() : map);
    }
}
