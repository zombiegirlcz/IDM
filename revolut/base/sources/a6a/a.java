package a6a;

import a5g.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f1582a;

    public a(Json baseJson) {
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        this.f1582a = e.b(baseJson, new h(8));
    }
}
