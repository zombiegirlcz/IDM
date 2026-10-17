package hqa;

import hp3.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import obg.q;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f154654a;

    public c(Json baseJson, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f154654a = e.b(baseJson, new q(25));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f154654a = e.b(baseJson, new rj7.b(15));
                break;
            default:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f154654a = e.b(baseJson, new r(28));
                break;
        }
    }
}
