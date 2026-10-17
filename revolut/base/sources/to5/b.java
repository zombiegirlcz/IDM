package to5;

import ce0.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import qo5.j;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f272511a;

    public b(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f272511a = json;
    }

    public final j a(String str) {
        if (str == null) {
            return null;
        }
        Json json = this.f272511a;
        json.getClass();
        return (j) json.b(nlm.a.c(j.Companion.serializer()), str);
    }
}
