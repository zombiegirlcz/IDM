package v5b;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f286188a;

    public d(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f286188a = json;
    }
}
