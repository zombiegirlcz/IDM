package i29;

import i29.b;
import ip0.v7;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.JsonElement;
import qlm.p0;
import rlm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends p0 {
    public static final a d = new a();

    private a() {
        super(o0.f186429a.b(b.class));
    }

    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "items");
        kotlinx.serialization.json.a aVarJ = jsonElement2 != null ? j.j(jsonElement2) : null;
        return (aVarJ == null || aVarJ.isEmpty()) ? b.c.INSTANCE.serializer() : b.C0906b.INSTANCE.serializer();
    }
}
