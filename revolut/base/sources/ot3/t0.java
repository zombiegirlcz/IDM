package ot3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\t\u0010\u0010R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lot3/t0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "storyName", "b", "e", "storyVariant", "c", "postRequestPath", "Lot3/t0$a;", "Lot3/t0$a;", "()Lot3/t0$a;", "nextButton", "", "Lot3/s0;", "Ljava/util/Map;", "()Ljava/util/Map;", "actions", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyName")
    @NotNull
    private final String storyName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyVariant")
    private final String storyVariant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("postRequestPath")
    private final String postRequestPath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextButton")
    private final a nextButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actions")
    private final Map<String, s0> actions;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lot3/t0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "action", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final String action;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.action, ((a) obj2).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getNextButton() {
        return this.nextButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPostRequestPath() {
        return this.postRequestPath;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStoryName() {
        return this.storyName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStoryVariant() {
        return this.storyVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.storyName, t0Var.storyName) && Intrinsics.f(this.storyVariant, t0Var.storyVariant) && Intrinsics.f(this.postRequestPath, t0Var.postRequestPath) && Intrinsics.f(this.nextButton, t0Var.nextButton) && Intrinsics.f(this.actions, t0Var.actions);
    }

    public final int hashCode() {
        int iHashCode = this.storyName.hashCode() * 31;
        String str = this.storyVariant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.postRequestPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.nextButton;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map<String, s0> map = this.actions;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }
}
