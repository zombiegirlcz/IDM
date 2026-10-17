package yb4;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f312184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f312185b;

    public f(Map selectedCheckboxes, Map editableFieldValues) {
        Intrinsics.checkNotNullParameter(selectedCheckboxes, "selectedCheckboxes");
        Intrinsics.checkNotNullParameter(editableFieldValues, "editableFieldValues");
        this.f312184a = selectedCheckboxes;
        this.f312185b = editableFieldValues;
    }

    public static f a(f fVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        Map selectedCheckboxes = linkedHashMap;
        if ((i & 1) != 0) {
            selectedCheckboxes = fVar.f312184a;
        }
        Map editableFieldValues = linkedHashMap2;
        if ((i & 2) != 0) {
            editableFieldValues = fVar.f312185b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectedCheckboxes, "selectedCheckboxes");
        Intrinsics.checkNotNullParameter(editableFieldValues, "editableFieldValues");
        return new f(selectedCheckboxes, editableFieldValues);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f312184a, fVar.f312184a) && Intrinsics.f(this.f312185b, fVar.f312185b);
    }

    public final int hashCode() {
        return this.f312185b.hashCode() + (this.f312184a.hashCode() * 31);
    }

    public f() {
        this(r0.g(), r0.g());
    }
}
