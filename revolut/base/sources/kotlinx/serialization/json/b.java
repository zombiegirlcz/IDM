package kotlinx.serialization.json;

import mlm.g;
import org.jetbrains.annotations.NotNull;
import rlm.w;

/* JADX INFO: loaded from: classes14.dex */
@g(with = w.class)
public abstract class b extends JsonElement {

    @NotNull
    public static final JsonPrimitive$Companion Companion = new JsonPrimitive$Companion();

    public abstract String a();

    public abstract boolean b();

    public String toString() {
        return a();
    }
}
