package n09;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f210931c;
    public final String d;
    public final int e;
    public final boolean f;

    public c0(List navBarMenuItems, ArrayList items, ArrayList tabs, String selectedTabId, int i, boolean z) {
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f210929a = navBarMenuItems;
        this.f210930b = items;
        this.f210931c = tabs;
        this.d = selectedTabId;
        this.e = i;
        this.f = z;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof c0)) {
            return null;
        }
        return new b0(!Intrinsics.f(r5.d, this.d), ((c0) oldState).e != this.e);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f210929a.equals(c0Var.f210929a) && this.f210930b.equals(c0Var.f210930b) && this.f210931c.equals(c0Var.f210931c) && Intrinsics.f(this.d, c0Var.d) && this.e == c0Var.e && this.f == c0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.b(this.e, p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f210931c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f210930b, this.f210929a.hashCode() * 31, 31), 31), 31, this.d), 31);
    }
}
