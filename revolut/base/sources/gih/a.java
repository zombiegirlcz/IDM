package gih;

import f88.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjh.b f144216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f144217b;

    public a(hjh.b controllerExtension, f controllerModelExtension) {
        Intrinsics.checkNotNullParameter(controllerExtension, "controllerExtension");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f144216a = controllerExtension;
        this.f144217b = controllerModelExtension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f144216a.equals(aVar.f144216a) && this.f144217b.equals(aVar.f144217b);
    }

    public final int hashCode() {
        return this.f144217b.hashCode() + (this.f144216a.hashCode() * 31);
    }
}
