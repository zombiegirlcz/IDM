package ljk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ljk.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lljk/q;", "", "", "toString", "()Ljava/lang/String;", "Lljk/m;", "a", "Lljk/m;", "b", "()Lljk/m;", "header", "", "Lljk/d;", "Ljava/util/List;", "()Ljava/util/List;", "content", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    @NotNull
    private final m header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final List<d> content;

    public q(m.b header, ArrayList content) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        this.header = header;
        this.content = content;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getHeader() {
        return this.header;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.header, qVar.header) && Intrinsics.f(this.content, qVar.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + (this.header.hashCode() * 31);
    }
}
