package ij8;

import com.revolut.feature.junior_profile.api.models.WorkflowConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f161732c;
    public final f d;
    public final WorkflowConfiguration e;

    public g(String title, String value, e state, f type, WorkflowConfiguration workflowConfiguration) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f161730a = title;
        this.f161731b = value;
        this.f161732c = state;
        this.d = type;
        this.e = workflowConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f161730a, gVar.f161730a) && Intrinsics.f(this.f161731b, gVar.f161731b) && this.f161732c == gVar.f161732c && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f161732c.hashCode() + p.a.c(this.f161730a.hashCode() * 31, 31, this.f161731b)) * 31)) * 31;
        WorkflowConfiguration workflowConfiguration = this.e;
        return iHashCode + (workflowConfiguration == null ? 0 : workflowConfiguration.hashCode());
    }
}
