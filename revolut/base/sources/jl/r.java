package jl;

import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonObject f175567c;
    public final JsonObject d;

    public /* synthetic */ r(int i, String str, String str2, JsonObject jsonObject, JsonObject jsonObject2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p.f175564a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175565a = str;
        this.f175566b = str2;
        if ((i & 4) == 0) {
            this.f175567c = new JsonObject(zhm.r0.g());
        } else {
            this.f175567c = jsonObject;
        }
        if ((i & 8) == 0) {
            this.d = new JsonObject(zhm.r0.g());
        } else {
            this.d = jsonObject2;
        }
    }
}
