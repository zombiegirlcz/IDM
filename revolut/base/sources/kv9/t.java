package kv9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkv9/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "imageUrl", "e", "title", "", "J", "()J", "expirationDate", "Lkv9/t$a;", "Lkv9/t$a;", "()Lkv9/t$a;", "action", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("imageUrl")
    @NotNull
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final long expirationDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("action")
    @NotNull
    private final a action;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lkv9/t$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "deeplink", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        public a(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.deeplink, ((a) obj2).deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode();
        }
    }

    public t(String id10, String imageUrl, String title, long j2, a action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = id10;
        this.imageUrl = imageUrl;
        this.title = title;
        this.expirationDate = j2;
        this.action = action;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.id, tVar.id) && Intrinsics.f(this.imageUrl, tVar.imageUrl) && Intrinsics.f(this.title, tVar.title) && this.expirationDate == tVar.expirationDate && Intrinsics.f(this.action, tVar.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + a0.d.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.imageUrl), 31, this.title), 31, this.expirationDate);
    }
}
