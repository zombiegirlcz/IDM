package oc4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax4.b f224093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224094b;

    public d() {
        this(0);
    }

    public static d a(d dVar, ax4.b constructorState, Data contentData, int i) {
        if ((i & 1) != 0) {
            constructorState = dVar.f224093a;
        }
        if ((i & 2) != 0) {
            contentData = dVar.f224094b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        return new d(constructorState, contentData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f224093a, dVar.f224093a) && Intrinsics.f(this.f224094b, dVar.f224094b);
    }

    public final int hashCode() {
        return this.f224094b.hashCode() + (this.f224093a.hashCode() * 31);
    }

    public d(ax4.b constructorState, Data contentData) {
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f224093a = constructorState;
        this.f224094b = contentData;
    }

    public /* synthetic */ d(int i) {
        this(new ax4.b(0), new Data(null, null, true, 3, null));
    }
}
