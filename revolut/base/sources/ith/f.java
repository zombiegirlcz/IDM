package ith;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentGroup f168385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f168386b;

    public f(DocumentGroup documentGroup, List sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f168385a = documentGroup;
        this.f168386b = sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f168385a, fVar.f168385a) && Intrinsics.f(this.f168386b, fVar.f168386b);
    }

    public final int hashCode() {
        DocumentGroup documentGroup = this.f168385a;
        return this.f168386b.hashCode() + ((documentGroup == null ? 0 : documentGroup.hashCode()) * 31);
    }
}
