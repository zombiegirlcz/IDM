package kl7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f185301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f185302c;

    public c2(int i, ArrayList documents, b2 batchState) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(batchState, "batchState");
        this.f185300a = i;
        this.f185301b = documents;
        this.f185302c = batchState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return this.f185300a == c2Var.f185300a && this.f185301b.equals(c2Var.f185301b) && this.f185302c == c2Var.f185302c;
    }

    public final int hashCode() {
        return this.f185302c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f185301b, Integer.hashCode(this.f185300a) * 31, 31);
    }
}
