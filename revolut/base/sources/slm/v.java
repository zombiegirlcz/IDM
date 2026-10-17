package slm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes14.dex */
public final class v extends b {
    public final kotlinx.serialization.json.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f264287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f264288h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Json json, kotlinx.serialization.json.a value) {
        super(json, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        this.f264287g = value.f187952a.size();
        this.f264288h = -1;
    }

    @Override // plm.d
    public final int d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.f264288h;
        if (i >= this.f264287g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f264288h = i2;
        return i2;
    }

    @Override // slm.b
    public final JsonElement e(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        return (JsonElement) this.f.f187952a.get(Integer.parseInt(tag2));
    }

    @Override // slm.b
    public final String r(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // slm.b
    public final JsonElement t() {
        return this.f;
    }
}
