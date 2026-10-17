package to5;

import ce0.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import qlm.e;
import qlm.v1;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f272513a;

    public d(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f272513a = json;
    }

    public final List a(String str) {
        if (str == null) {
            return null;
        }
        Json json = this.f272513a;
        json.getClass();
        return (List) json.b(nlm.a.c(new e(v1.f247718a)), str);
    }
}
