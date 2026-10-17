package wf4;

import cv3.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv3.h f296966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f296967b;

    public e(cv3.h type, d0 parameters) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f296966a = type;
        this.f296967b = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f296966a == eVar.f296966a && Intrinsics.f(this.f296967b, eVar.f296967b);
    }

    public final int hashCode() {
        return this.f296967b.hashCode() + (this.f296966a.hashCode() * 31);
    }
}
