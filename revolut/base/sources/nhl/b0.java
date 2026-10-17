package nhl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 extends qlm.p0 {
    public static final b0 d = new b0();

    private b0() {
        super(kotlin.jvm.internal.o0.f186429a.b(a0.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        boolean z = element instanceof JsonObject;
        if (z && ((JsonObject) element).containsKey("values")) {
            return x.INSTANCE.serializer();
        }
        if (z) {
            JsonObject jsonObject = (JsonObject) element;
            if (jsonObject.containsKey("min") || jsonObject.containsKey("max")) {
                return y.INSTANCE.serializer();
            }
        }
        return z.INSTANCE.serializer();
    }
}
