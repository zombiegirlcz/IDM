package ryj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f258412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f258413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f258414c;
    public final int d;

    public s(ArrayList items, ArrayList tabs, String selectedTabId, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f258412a = items;
        this.f258413b = tabs;
        this.f258414c = selectedTabId;
        this.d = i;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof s)) {
            return null;
        }
        return new r(!Intrinsics.f(r5.f258414c, this.f258414c), ((s) oldState).d != this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f258412a.equals(sVar.f258412a) && this.f258413b.equals(sVar.f258413b) && Intrinsics.f(this.f258414c, sVar.f258414c) && this.d == sVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f258413b, this.f258412a.hashCode() * 31, 31), 31, this.f258414c);
    }
}
