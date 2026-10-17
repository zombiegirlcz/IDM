package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a5 {

    @NotNull
    public static final z4 Companion = new z4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f153020a;

    public /* synthetic */ a5(int i, t9 t9Var) {
        if (1 == (i & 1)) {
            this.f153020a = t9Var;
        } else {
            qlm.j1.f(y4.f153376a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a5) && Intrinsics.f(this.f153020a, ((a5) obj2).f153020a);
    }

    public final int hashCode() {
        return this.f153020a.hashCode();
    }

    public a5(t9 survey) {
        Intrinsics.checkNotNullParameter(survey, "survey");
        this.f153020a = survey;
    }
}
