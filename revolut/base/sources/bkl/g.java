package bkl;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f16430a;

    public g(Json jsonParser, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
                this.f16430a = jsonParser;
                break;
            default:
                Intrinsics.checkNotNullParameter(jsonParser, "json");
                this.f16430a = jsonParser;
                break;
        }
    }
}
