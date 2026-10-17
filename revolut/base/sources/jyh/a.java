package jyh;

import kotlin.jvm.internal.Intrinsics;
import vzh.d;
import zyh.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f179443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f179444b;

    public a(d controllerExtension, c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f179443a = controllerExtension;
        this.f179444b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f179443a.equals(aVar.f179443a) && this.f179444b.equals(aVar.f179444b);
    }

    public final int hashCode() {
        return this.f179444b.hashCode() + (this.f179443a.hashCode() * 31);
    }
}
