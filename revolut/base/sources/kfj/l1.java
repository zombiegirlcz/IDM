package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkfj/l1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "type", "b", "d", "text", "c", "description", "", "Lkfj/y1;", "Ljava/util/List;", "()Ljava/util/List;", "preferredScheduleOptions", "Lkfj/j1;", "additionalAttributes", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("preferredScheduleOptions")
    @NotNull
    private final List<y1> preferredScheduleOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("additionalAttributes")
    private final List<j1> additionalAttributes;

    public l1(String type, String text, String str, ArrayList preferredScheduleOptions, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
        this.type = type;
        this.text = text;
        this.description = str;
        this.preferredScheduleOptions = preferredScheduleOptions;
        this.additionalAttributes = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPreferredScheduleOptions() {
        return this.preferredScheduleOptions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.type, l1Var.type) && Intrinsics.f(this.text, l1Var.text) && Intrinsics.f(this.description, l1Var.description) && Intrinsics.f(this.preferredScheduleOptions, l1Var.preferredScheduleOptions) && Intrinsics.f(this.additionalAttributes, l1Var.additionalAttributes);
    }

    public final int hashCode() {
        int iC = p.a.c(this.type.hashCode() * 31, 31, this.text);
        String str = this.description;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.preferredScheduleOptions);
        List<j1> list = this.additionalAttributes;
        return iD + (list != null ? list.hashCode() : 0);
    }
}
