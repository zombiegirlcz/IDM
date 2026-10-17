package jl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonElement f175559a;

    public /* synthetic */ o(int i, JsonElement jsonElement) {
        if (1 == (i & 1)) {
            this.f175559a = jsonElement;
        } else {
            qlm.j1.f(m.f175555a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public o(JsonElement data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f175559a = data;
    }
}
