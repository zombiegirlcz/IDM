package pld;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f237364a;

    public h(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f237364a = json;
    }
}
