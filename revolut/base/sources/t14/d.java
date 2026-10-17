package t14;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lt14/d;", "Lt14/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "storyName", "c", "storyVariant", "", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "substitutionData", "nextButtonAction", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyName")
    @NotNull
    private final String storyName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyVariant")
    private final String storyVariant;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("substitutionData")
    private final Map<String, String> substitutionData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextButtonAction")
    @NotNull
    private final String nextButtonAction;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNextButtonAction() {
        return this.nextButtonAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStoryName() {
        return this.storyName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStoryVariant() {
        return this.storyVariant;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getSubstitutionData() {
        return this.substitutionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.storyName, dVar.storyName) && Intrinsics.f(this.storyVariant, dVar.storyVariant) && Intrinsics.f(this.substitutionData, dVar.substitutionData) && Intrinsics.f(this.nextButtonAction, dVar.nextButtonAction);
    }

    public final int hashCode() {
        int iHashCode = this.storyName.hashCode() * 31;
        String str = this.storyVariant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.substitutionData;
        return this.nextButtonAction.hashCode() + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }
}
