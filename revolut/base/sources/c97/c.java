package c97;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lc97/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "context", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "hints", "c", "d", "searchableBlocks", "placeholderBlocks", "feature_global_search_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("context")
    @NotNull
    private final String context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hints")
    @NotNull
    private final List<String> hints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchableBlocks")
    @NotNull
    private final List<String> searchableBlocks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("placeholderBlocks")
    private final List<String> placeholderBlocks;

    public c(String context, List hints, ArrayList searchableBlocks, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hints, "hints");
        Intrinsics.checkNotNullParameter(searchableBlocks, "searchableBlocks");
        this.context = context;
        this.hints = hints;
        this.searchableBlocks = searchableBlocks;
        this.placeholderBlocks = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPlaceholderBlocks() {
        return this.placeholderBlocks;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSearchableBlocks() {
        return this.searchableBlocks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.context, cVar.context) && Intrinsics.f(this.hints, cVar.hints) && Intrinsics.f(this.searchableBlocks, cVar.searchableBlocks) && Intrinsics.f(this.placeholderBlocks, cVar.placeholderBlocks);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.context.hashCode() * 31, 31, this.hints), 31, this.searchableBlocks);
        List<String> list = this.placeholderBlocks;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
