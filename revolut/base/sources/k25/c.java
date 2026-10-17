package k25;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180328b;

    public c(List toDoSection, List mainSections) {
        Intrinsics.checkNotNullParameter(toDoSection, "toDoSection");
        Intrinsics.checkNotNullParameter(mainSections, "mainSections");
        this.f180327a = toDoSection;
        this.f180328b = mainSections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f180327a, cVar.f180327a) && Intrinsics.f(this.f180328b, cVar.f180328b);
    }

    public final int hashCode() {
        return this.f180328b.hashCode() + (this.f180327a.hashCode() * 31);
    }
}
