package w29;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f293981a;

    public b(Json baseJson, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f293981a = e.b(baseJson, new wd3.a(7));
                break;
            default:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f293981a = e.b(baseJson, new a(0));
                break;
        }
    }
}
