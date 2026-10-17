package kk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f184537c;

    public h(Data content, String str, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f184535a = str;
        this.f184536b = requestId;
        this.f184537c = content;
    }

    public static h a(h hVar, String str, String requestId, Data content, int i) {
        if ((i & 1) != 0) {
            str = hVar.f184535a;
        }
        if ((i & 2) != 0) {
            requestId = hVar.f184536b;
        }
        if ((i & 4) != 0) {
            content = hVar.f184537c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new h(content, str, requestId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f184535a, hVar.f184535a) && Intrinsics.f(this.f184536b, hVar.f184536b) && Intrinsics.f(this.f184537c, hVar.f184537c);
    }

    public final int hashCode() {
        String str = this.f184535a;
        return this.f184537c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f184536b);
    }
}
