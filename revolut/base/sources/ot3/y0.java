package ot3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001c"}, d2 = {"Lot3/y0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "attemptsCount", "b", "attemptsDelaySeconds", "", "Lot3/x0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "content", "Lot3/z0;", "d", "Lot3/z0;", "f", "()Lot3/z0;", "popup", "e", "Ljava/lang/String;", "insideFlowBehaviour", "outsideFlowBehaviour", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("attemptsCount")
    private final Integer attemptsCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("attemptsDelaySeconds")
    private final Integer attemptsDelaySeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    private final List<x0> content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("popup")
    @NotNull
    private final z0 popup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("insideFlowBehaviour")
    private final String insideFlowBehaviour;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("outsideFlowBehaviour")
    private final String outsideFlowBehaviour;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAttemptsCount() {
        return this.attemptsCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAttemptsDelaySeconds() {
        return this.attemptsDelaySeconds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInsideFlowBehaviour() {
        return this.insideFlowBehaviour;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOutsideFlowBehaviour() {
        return this.outsideFlowBehaviour;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.attemptsCount, y0Var.attemptsCount) && Intrinsics.f(this.attemptsDelaySeconds, y0Var.attemptsDelaySeconds) && Intrinsics.f(this.content, y0Var.content) && Intrinsics.f(this.popup, y0Var.popup) && Intrinsics.f(this.insideFlowBehaviour, y0Var.insideFlowBehaviour) && Intrinsics.f(this.outsideFlowBehaviour, y0Var.outsideFlowBehaviour);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final z0 getPopup() {
        return this.popup;
    }

    public final int hashCode() {
        Integer num = this.attemptsCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.attemptsDelaySeconds;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<x0> list = this.content;
        int iHashCode3 = (this.popup.hashCode() + ((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str = this.insideFlowBehaviour;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.outsideFlowBehaviour;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
