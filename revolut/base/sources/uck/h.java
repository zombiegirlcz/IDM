package uck;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f279053a;

    public h(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f279053a = json;
    }
}
