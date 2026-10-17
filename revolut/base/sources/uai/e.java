package uai;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cii.a f278666a;

    public e(cii.a model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f278666a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f278666a, ((e) obj2).f278666a);
    }

    public final int hashCode() {
        return this.f278666a.hashCode();
    }
}
