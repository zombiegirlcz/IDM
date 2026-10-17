package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qg0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class dd1 implements qg0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kd1 f27711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f27712c;

    public dd1(kd1 intent, Map eventAttributes) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(eventAttributes, "eventAttributes");
        this.f27711b = intent;
        this.f27712c = eventAttributes;
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public Map getAttributes() {
        return zhm.r0.p(this.f27712c, zhm.q0.c(new Pair("intent", ld1.a(this.f27711b))));
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getEventName() {
        return "item_clicked";
    }

    @Override // com.fourthline.orca.internal.qg0.a, ib.f
    public String getSchema() {
        return "iglu:com.fourthline.sdk/item_clicked/jsonschema/1-0-1";
    }
}
