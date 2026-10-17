package slm;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes14.dex */
public final class x extends t {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f264292j;

    @Override // slm.t
    public final JsonElement j() {
        return new JsonObject((LinkedHashMap) this.f264284h);
    }

    @Override // slm.t
    public final void m(JsonElement element, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!this.f264292j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f264284h;
            String str = this.i;
            if (str == null) {
                Intrinsics.r("tag");
                throw null;
            }
            linkedHashMap.put(str, element);
            this.f264292j = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.b) {
            this.i = ((kotlinx.serialization.json.b) element).a();
            this.f264292j = false;
        } else {
            if (element instanceof JsonObject) {
                throw q.b(rlm.v.f255126b);
            }
            if (!(element instanceof kotlinx.serialization.json.a)) {
                throw new NoWhenBranchMatchedException();
            }
            throw q.b(rlm.e.f255098b);
        }
    }
}
