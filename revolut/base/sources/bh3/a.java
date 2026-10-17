package bh3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import rlm.o;
import ue0.e;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f15224a;

    public a(Json baseJson, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f15224a = e.b(baseJson, new kcd.a(0));
                break;
            default:
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                this.f15224a = e.b(baseJson, new bek.a(12));
                break;
        }
    }
}
