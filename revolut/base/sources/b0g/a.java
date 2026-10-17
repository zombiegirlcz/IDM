package b0g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lb0g/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "publishedDate", "b", "f", "userName", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "rating", "d", "e", "title", "text", "Lb0g/c;", "Lb0g/c;", "()Lb0g/c;", "source", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("publishedDate")
    @NotNull
    private final String publishedDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("userName")
    @NotNull
    private final String userName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rating")
    private final Integer rating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final c source;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPublishedDate() {
        return this.publishedDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.publishedDate, aVar.publishedDate) && Intrinsics.f(this.userName, aVar.userName) && Intrinsics.f(this.rating, aVar.rating) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.text, aVar.text) && Intrinsics.f(this.source, aVar.source);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    public final int hashCode() {
        int iC = p.a.c(this.publishedDate.hashCode() * 31, 31, this.userName);
        Integer num = this.rating;
        return this.source.hashCode() + p.a.c(p.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.title), 31, this.text);
    }
}
