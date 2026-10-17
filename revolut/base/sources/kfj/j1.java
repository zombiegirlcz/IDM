package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkfj/j1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "key", "b", "e", "label", "c", "hint", "Lkfj/e0;", "Lkfj/e0;", "()Lkfj/e0;", "caption", "dataType", "f", "mask", "Lkfj/k1;", "g", "Lkfj/k1;", "()Lkfj/k1;", "validation", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("key")
    @NotNull
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("caption")
    private final e0 caption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dataType")
    @NotNull
    private final String dataType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("mask")
    private final String mask;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("validation")
    @NotNull
    private final k1 validation;

    public j1(String key, String label, String str, e0 e0Var, String dataType, String str2, k1 validation) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(validation, "validation");
        this.key = key;
        this.label = label;
        this.hint = str;
        this.caption = e0Var;
        this.dataType = dataType;
        this.mask = str2;
        this.validation = validation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e0 getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.key, j1Var.key) && Intrinsics.f(this.label, j1Var.label) && Intrinsics.f(this.hint, j1Var.hint) && Intrinsics.f(this.caption, j1Var.caption) && Intrinsics.f(this.dataType, j1Var.dataType) && Intrinsics.f(this.mask, j1Var.mask) && Intrinsics.f(this.validation, j1Var.validation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k1 getValidation() {
        return this.validation;
    }

    public final int hashCode() {
        int iC = p.a.c(this.key.hashCode() * 31, 31, this.label);
        String str = this.hint;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        e0 e0Var = this.caption;
        int iC2 = p.a.c((iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31, this.dataType);
        String str2 = this.mask;
        return this.validation.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
