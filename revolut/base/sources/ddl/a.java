package ddl;

import dak.c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f113260a;

    public a(Json baseJson) {
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        this.f113260a = e.b(baseJson, new c(25));
    }
}
