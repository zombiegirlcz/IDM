package fi6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f135315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f135316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f135317c;

    public i(ArrayList personal, ArrayList pro, ArrayList joint) {
        Intrinsics.checkNotNullParameter(personal, "personal");
        Intrinsics.checkNotNullParameter(pro, "pro");
        Intrinsics.checkNotNullParameter(joint, "joint");
        this.f135315a = personal;
        this.f135316b = pro;
        this.f135317c = joint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f135315a.equals(iVar.f135315a) && this.f135316b.equals(iVar.f135316b) && this.f135317c.equals(iVar.f135317c);
    }

    public final int hashCode() {
        return this.f135317c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f135316b, this.f135315a.hashCode() * 31, 31);
    }
}
