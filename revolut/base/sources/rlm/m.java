package rlm;

import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes14.dex */
public interface m extends Encoder, CompositeEncoder {
    Json a();

    void b(JsonElement jsonElement);
}
