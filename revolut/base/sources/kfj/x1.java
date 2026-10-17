package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkfj/x1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "title", "", "Lkfj/s2;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "steps", "Lkfj/i1;", "inlineActions", "Lkfj/i1;", "()Lkfj/i1;", "callToAction", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    private final List<s2> steps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("inlineActions")
    private final List<i1> inlineActions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("callToAction")
    private final i1 callToAction;

    public x1(String title, ArrayList arrayList, ArrayList arrayList2, i1 i1Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.steps = arrayList;
        this.inlineActions = arrayList2;
        this.callToAction = i1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i1 getCallToAction() {
        return this.callToAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getInlineActions() {
        return this.inlineActions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.title, x1Var.title) && Intrinsics.f(this.steps, x1Var.steps) && Intrinsics.f(this.inlineActions, x1Var.inlineActions) && Intrinsics.f(this.callToAction, x1Var.callToAction);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<s2> list = this.steps;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<i1> list2 = this.inlineActions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        i1 i1Var = this.callToAction;
        return iHashCode3 + (i1Var != null ? i1Var.hashCode() : 0);
    }
}
