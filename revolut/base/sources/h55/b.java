package h55;

import kotlin.Lazy;
import kotlinx.serialization.json.Json;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f149505a = j.b(new h43.b(4));

    private b() {
    }

    public static Json a() {
        return (Json) f149505a.getValue();
    }
}
