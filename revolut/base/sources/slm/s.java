package slm;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes14.dex */
public final class s extends b {
    public final JsonElement f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Json json, JsonElement value, String str) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        this.f264236a.add("primitive");
    }

    @Override // plm.d
    public final int d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // slm.b
    public final JsonElement e(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        if (tag2 == "primitive") {
            return this.f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // slm.b
    public final JsonElement t() {
        return this.f;
    }
}
