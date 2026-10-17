package joi;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f177139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f177140c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f177141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f177142h;
    public final qv0.c i;

    public w(List holders, View view, ArrayList holderClipStates, int i, int i2, int i3, int i5, int i6, qv0.c revealHeaderOutlinePosition) {
        Intrinsics.checkNotNullParameter(holders, "holders");
        Intrinsics.checkNotNullParameter(holderClipStates, "holderClipStates");
        Intrinsics.checkNotNullParameter(revealHeaderOutlinePosition, "revealHeaderOutlinePosition");
        this.f177138a = holders;
        this.f177139b = view;
        this.f177140c = holderClipStates;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f177141g = i5;
        this.f177142h = i6;
        this.i = revealHeaderOutlinePosition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f177138a, wVar.f177138a) && Intrinsics.f(this.f177139b, wVar.f177139b) && this.f177140c.equals(wVar.f177140c) && this.d == wVar.d && this.e == wVar.e && this.f == wVar.f && this.f177141g == wVar.f177141g && this.f177142h == wVar.f177142h && Intrinsics.f(this.i, wVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f177138a.hashCode() * 31;
        View view = this.f177139b;
        return this.i.hashCode() + j6.a.b(this.f177142h, j6.a.b(this.f177141g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f177140c, (iHashCode + (view == null ? 0 : view.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
    }
}
