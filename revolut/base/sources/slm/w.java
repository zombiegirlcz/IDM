package slm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class w extends u {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JsonObject f264289j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f264290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f264291m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Json json, JsonObject value) {
        super(json, value, (String) null, 12);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f264289j = value;
        List listD1 = zhm.d0.d1(value.f187951a.keySet());
        this.k = listD1;
        this.f264290l = listD1.size() * 2;
        this.f264291m = -1;
    }

    @Override // slm.u, plm.d
    public final int d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f264291m;
        if (i >= this.f264290l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f264291m = i2;
        return i2;
    }

    @Override // slm.u, slm.b
    public final JsonElement e(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return this.f264291m % 2 == 0 ? rlm.j.c(tag2) : (JsonElement) r0.h(tag2, this.f264289j);
    }

    @Override // slm.u, slm.b, plm.d
    public final void endStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // slm.u, slm.b
    public final String r(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.k.get(i / 2);
    }

    @Override // slm.u, slm.b
    public final JsonElement t() {
        return this.f264289j;
    }

    @Override // slm.u
    /* JADX INFO: renamed from: y */
    public final JsonObject t() {
        return this.f264289j;
    }
}
