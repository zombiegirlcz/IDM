package m9i;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lm9i/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "Lm9i/a$a;", "b", "Lm9i/a$a;", "()Lm9i/a$a;", "images", "feature_reactions_keyboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final C1154a images;

    /* JADX INFO: renamed from: m9i.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Lm9i/a$a;", "", "", "toString", "()Ljava/lang/String;", "Lm9i/a$b;", "a", "Lm9i/a$b;", "b", "()Lm9i/a$b;", "fixedWidth", "c", "fixedWidthSmallStill", "downsizedMedium", "feature_reactions_keyboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1154a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("fixed_width")
        @NotNull
        private final b fixedWidth;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fixed_width_small_still")
        @NotNull
        private final b fixedWidthSmallStill;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("downsized_medium")
        @NotNull
        private final b downsizedMedium;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getDownsizedMedium() {
            return this.downsizedMedium;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getFixedWidth() {
            return this.fixedWidth;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getFixedWidthSmallStill() {
            return this.fixedWidthSmallStill;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1154a)) {
                return false;
            }
            C1154a c1154a = (C1154a) obj2;
            return Intrinsics.f(this.fixedWidth, c1154a.fixedWidth) && Intrinsics.f(this.fixedWidthSmallStill, c1154a.fixedWidthSmallStill) && Intrinsics.f(this.downsizedMedium, c1154a.downsizedMedium);
        }

        public final int hashCode() {
            return this.downsizedMedium.hashCode() + ((this.fixedWidthSmallStill.hashCode() + (this.fixedWidth.hashCode() * 31)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Lm9i/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "c", "width", "height", "feature_reactions_keyboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        @NotNull
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("width")
        @NotNull
        private final String width;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("height")
        @NotNull
        private final String height;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getWidth() {
            return this.width;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.url, bVar.url) && Intrinsics.f(this.width, bVar.width) && Intrinsics.f(this.height, bVar.height);
        }

        public final int hashCode() {
            return this.height.hashCode() + p.a.c(this.url.hashCode() * 31, 31, this.width);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1154a getImages() {
        return this.images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.images, aVar.images);
    }

    public final int hashCode() {
        return this.images.hashCode() + (this.id.hashCode() * 31);
    }
}
