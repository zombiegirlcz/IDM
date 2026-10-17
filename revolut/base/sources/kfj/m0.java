package kfj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lkfj/m0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "title", "b", "d", "subtitle", "Lkfj/e0;", "c", "Lkfj/e0;", "()Lkfj/e0;", "content", "", "Lkfj/h0;", "Ljava/util/List;", "()Ljava/util/List;", "items", "e", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    private final e0 content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("items")
    private final List<h0> items;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("terms")
    private final e0 terms;

    public m0(String title, String str, e0 e0Var, List list, e0 e0Var2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = str;
        this.content = e0Var;
        this.items = list;
        this.terms = e0Var2;
    }

    public static m0 a(m0 m0Var, e0 e0Var) {
        String title = m0Var.title;
        String str = m0Var.subtitle;
        e0 e0Var2 = m0Var.content;
        List<h0> list = m0Var.items;
        Intrinsics.checkNotNullParameter(title, "title");
        return new m0(title, str, e0Var2, list, e0Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e0 getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0 getTerms() {
        return this.terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.title, m0Var.title) && Intrinsics.f(this.subtitle, m0Var.subtitle) && Intrinsics.f(this.content, m0Var.content) && Intrinsics.f(this.items, m0Var.items) && Intrinsics.f(this.terms, m0Var.terms);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e0 e0Var = this.content;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        List<h0> list = this.items;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        e0 e0Var2 = this.terms;
        return iHashCode4 + (e0Var2 != null ? e0Var2.hashCode() : 0);
    }
}
