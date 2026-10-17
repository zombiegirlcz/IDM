package r5l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Lr5l/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "code", "Lr5l/d;", "b", "Lr5l/d;", "c", "()Lr5l/d;", "images", "Lr5l/b;", "Lr5l/b;", "()Lr5l/b;", "colors", "Lr5l/j;", "d", "Lr5l/j;", "()Lr5l/j;", "videos", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final d images;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("colours")
    @NotNull
    private final b colors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("videos")
    private final j videos;

    public c(String code, d images, b colors, j jVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.code = code;
        this.images = images;
        this.colors = colors;
        this.videos = jVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getColors() {
        return this.colors;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getVideos() {
        return this.videos;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.code, cVar.code) && Intrinsics.f(this.images, cVar.images) && Intrinsics.f(this.colors, cVar.colors) && Intrinsics.f(this.videos, cVar.videos);
    }

    public final int hashCode() {
        int iHashCode = (this.colors.hashCode() + ((this.images.hashCode() + (this.code.hashCode() * 31)) * 31)) * 31;
        j jVar = this.videos;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
