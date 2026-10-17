package jl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();
    public static final KSerializer[] e = {null, null, new qlm.e(a1.f175522a), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f175561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f175562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f175563c;
    public final String d;

    public o1(int i, r rVar, q0 q0Var, List list, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(m1.f175556a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175561a = rVar;
        this.f175562b = q0Var;
        if ((i & 4) == 0) {
            this.f175563c = zhm.f0.f322471a;
        } else {
            this.f175563c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f175561a, o1Var.f175561a) && this.f175562b == o1Var.f175562b && Intrinsics.f(this.f175563c, o1Var.f175563c) && Intrinsics.f(this.d, o1Var.d);
    }

    public final int hashCode() {
        r rVar = this.f175561a;
        int iD = p.a.d((this.f175562b.hashCode() + ((rVar == null ? 0 : rVar.hashCode()) * 31)) * 31, 31, this.f175563c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "WorkflowResponse(currentTask=" + this.f175561a + ", interactiveTaskStatus=" + this.f175562b + ", remainingApplicantTasks=" + this.f175563c + ", workflowId=" + this.d + ")";
    }
}
