package st3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lst3/e;", "Lst3/p;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "", "Lst3/e$a;", "Ljava/util/List;", "()Ljava/util/List;", "images", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<a> images;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lst3/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "imageUrl", "Lst3/e$a$a;", "Lst3/e$a$a;", "()Lst3/e$a$a;", "hint", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("image")
        @NotNull
        private final String imageUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("hint")
        private final C1488a hint;

        /* JADX INFO: renamed from: st3.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lst3/e$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "text", "icon", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1488a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("text")
            @NotNull
            private final String text;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            private final String icon;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1488a)) {
                    return false;
                }
                C1488a c1488a = (C1488a) obj2;
                return Intrinsics.f(this.text, c1488a.text) && Intrinsics.f(this.icon, c1488a.icon);
            }

            public final int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.icon;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1488a getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.imageUrl, aVar.imageUrl) && Intrinsics.f(this.hint, aVar.hint);
        }

        public final int hashCode() {
            int iHashCode = this.imageUrl.hashCode() * 31;
            C1488a c1488a = this.hint;
            return iHashCode + (c1488a == null ? 0 : c1488a.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.images, eVar.images);
    }

    public final int hashCode() {
        String str = this.title;
        return this.images.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
