package mel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f204755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f204756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f204757c;
    public final o d;

    public i0(q value, ArrayList movingAverages, ArrayList oscillators, o description) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(movingAverages, "movingAverages");
        Intrinsics.checkNotNullParameter(oscillators, "oscillators");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f204755a = value;
        this.f204756b = movingAverages;
        this.f204757c = oscillators;
        this.d = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f204755a == i0Var.f204755a && this.f204756b.equals(i0Var.f204756b) && this.f204757c.equals(i0Var.f204757c) && this.d.equals(i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f204757c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f204756b, this.f204755a.hashCode() * 31, 31), 31);
    }
}
