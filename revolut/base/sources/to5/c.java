package to5;

import ce0.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f272512a;

    public c(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f272512a = json;
    }

    public final ep5.c a(String str) {
        if (str == null) {
            return null;
        }
        Json json = this.f272512a;
        json.getClass();
        return (ep5.c) json.b(nlm.a.c(ep5.c.Companion.serializer()), str);
    }
}
