package aw0;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f10254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10256c;
    public final HashMap d;
    public final int e;

    public c3(y2 header, ArrayList segments, String str, HashMap details, int i) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f10254a = header;
        this.f10255b = segments;
        this.f10256c = str;
        this.d = details;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return this.f10254a.equals(c3Var.f10254a) && this.f10255b.equals(c3Var.f10255b) && Intrinsics.f(this.f10256c, c3Var.f10256c) && this.d.equals(c3Var.d) && this.e == c3Var.e;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f10255b, this.f10254a.hashCode() * 31, 31);
        String str = this.f10256c;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
