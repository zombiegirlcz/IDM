package oc3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f224078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f224079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah0.a f224080c;
    public final List d;
    public final q e;
    public final o f;

    public r(ArrayList mapMarkers, boolean z, ah0.a aVar, List recyclerContent, q searchWidgetState, o bottomDialogModel) {
        Intrinsics.checkNotNullParameter(mapMarkers, "mapMarkers");
        Intrinsics.checkNotNullParameter(recyclerContent, "recyclerContent");
        Intrinsics.checkNotNullParameter(searchWidgetState, "searchWidgetState");
        Intrinsics.checkNotNullParameter(bottomDialogModel, "bottomDialogModel");
        this.f224078a = mapMarkers;
        this.f224079b = z;
        this.f224080c = aVar;
        this.d = recyclerContent;
        this.e = searchWidgetState;
        this.f = bottomDialogModel;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        boolean z;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof r)) {
            return null;
        }
        r rVar = (r) oldState;
        boolean z6 = !rVar.f224078a.equals(this.f224078a);
        boolean z11 = !Intrinsics.f(rVar.f224080c, this.f224080c);
        if (rVar.f224079b != this.f224079b) {
            z = true;
            z3 = z11;
            z4 = true;
        } else {
            z = true;
            z3 = z11;
            z4 = false;
        }
        return new p(z6, z3, z4, Intrinsics.f(rVar.d, this.d) ^ z, rVar.e != this.e ? z : false, rVar.f.equals(this.f) ^ z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f224078a.equals(rVar.f224078a) && this.f224079b == rVar.f224079b && Intrinsics.f(this.f224080c, rVar.f224080c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && this.f.equals(rVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f224078a.hashCode() * 31, 31, this.f224079b);
        ah0.a aVar = this.f224080c;
        return this.f.hashCode() + ((this.e.hashCode() + p.a.d((iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d)) * 31);
    }
}
