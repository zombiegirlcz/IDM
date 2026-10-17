package n36;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import qlm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends p0 {
    public static final c0 d = new c0();

    private c0() {
        super(o0.f186429a.b(b0.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean z = element instanceof JsonObject;
        if (z) {
            JsonObject jsonObject = (JsonObject) element;
            if (jsonObject.containsKey("accountScopedId") && jsonObject.containsKey("ticker")) {
                return z.INSTANCE.serializer();
            }
        }
        if (z) {
            JsonObject jsonObject2 = (JsonObject) element;
            if (jsonObject2.containsKey("pocketId") && jsonObject2.containsKey("currencyCode")) {
                return a0.INSTANCE.serializer();
            }
        }
        throw new SerializationException("Unknown DeFi swap source shape: " + element);
    }
}
