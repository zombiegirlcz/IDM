package mz8;

import kotlin.Lazy;
import kotlinx.serialization.json.Json;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f210722a = j.b(new mw1.a(24));

    private a() {
    }

    public static Json a() {
        return (Json) f210722a.getValue();
    }
}
