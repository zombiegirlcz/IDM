package k4l;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f180947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f180948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f180949c;

    public b0(ArrayList available, ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(arrayList, "default");
        this.f180947a = available;
        this.f180948b = arrayList;
        this.f180949c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f180947a.equals(b0Var.f180947a) && this.f180948b.equals(b0Var.f180948b) && this.f180949c == b0Var.f180949c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180949c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f180948b, this.f180947a.hashCode() * 31, 31);
    }
}
