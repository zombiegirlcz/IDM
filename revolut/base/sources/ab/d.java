package ab;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\b\u0010\u000eR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lab/d;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "title", "b", "c", "state", "flowName", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "legacy", "", "Lab/g;", "e", "Ljava/util/List;", "()Ljava/util/List;", "values", "feature_user_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("flowName")
    @NotNull
    private final String flowName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("legacy")
    private final Boolean legacy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("values")
    @NotNull
    private final List<g> values;

    public d(String title, String state, String flowName, Boolean bool, ArrayList values) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.title = title;
        this.state = state;
        this.flowName = flowName;
        this.legacy = bool;
        this.values = values;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFlowName() {
        return this.flowName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getLegacy() {
        return this.legacy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getValues() {
        return this.values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.state, dVar.state) && Intrinsics.f(this.flowName, dVar.flowName) && Intrinsics.f(this.legacy, dVar.legacy) && Intrinsics.f(this.values, dVar.values);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.state), 31, this.flowName);
        Boolean bool = this.legacy;
        return this.values.hashCode() + ((iC + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.state;
        String str3 = this.flowName;
        Boolean bool = this.legacy;
        List<g> list = this.values;
        StringBuilder sbM = v0.a.m("ItemDto(title=", str, ", state=", str2, ", flowName=");
        sbM.append(str3);
        sbM.append(", legacy=");
        sbM.append(bool);
        sbM.append(", values=");
        return t61.a.q(")", list, sbM);
    }
}
