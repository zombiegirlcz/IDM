package af0;

import kotlin.Lazy;
import kotlinx.serialization.json.Json;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f3818a = j.b(new a(0));

    private b() {
    }

    public static Json a() {
        return (Json) f3818a.getValue();
    }
}
