package bjk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lbjk/w0;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/y0;", "a", "Lbjk/y0;", "b", "()Lbjk/y0;", "header", "", "Lbjk/d;", "Ljava/util/List;", "()Ljava/util/List;", "content", "Lbjk/v0;", "c", "Lbjk/v0;", "d", "()Lbjk/v0;", "onboarding", "Lbjk/u0;", "Lbjk/u0;", "e", "()Lbjk/u0;", "productArticle", "Lbjk/t0;", "modals", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    @NotNull
    private final y0 header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final List<d> content;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("onboarding")
    private final v0 onboarding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("productArticle")
    private final u0 productArticle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("modals")
    private final List<t0> modals;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final y0 getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getModals() {
        return this.modals;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v0 getOnboarding() {
        return this.onboarding;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u0 getProductArticle() {
        return this.productArticle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.header, w0Var.header) && Intrinsics.f(this.content, w0Var.content) && Intrinsics.f(this.onboarding, w0Var.onboarding) && Intrinsics.f(this.productArticle, w0Var.productArticle) && Intrinsics.f(this.modals, w0Var.modals);
    }

    public final int hashCode() {
        int iD = p.a.d(this.header.hashCode() * 31, 31, this.content);
        v0 v0Var = this.onboarding;
        int iHashCode = (iD + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        u0 u0Var = this.productArticle;
        int iHashCode2 = (iHashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        List<t0> list = this.modals;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
