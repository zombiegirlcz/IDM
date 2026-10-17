package oza;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Loza/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "title", "b", "d", "text", "c", "backgroundMedia", "", "Loza/a;", "Ljava/util/List;", "()Ljava/util/List;", "buttons", "Loza/g;", "Loza/g;", "()Loza/g;", "style", "feature_remote_stories_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("backgroundMedia")
    @NotNull
    private final String backgroundMedia;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("buttons")
    @NotNull
    private final List<a> buttons;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("style")
    private final g style;

    public f(String title, String text, String backgroundMedia, ArrayList buttons, g gVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundMedia, "backgroundMedia");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.title = title;
        this.text = text;
        this.backgroundMedia = backgroundMedia;
        this.buttons = buttons;
        this.style = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundMedia() {
        return this.backgroundMedia;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getButtons() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getStyle() {
        return this.style;
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
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.text, fVar.text) && Intrinsics.f(this.backgroundMedia, fVar.backgroundMedia) && Intrinsics.f(this.buttons, fVar.buttons) && Intrinsics.f(this.style, fVar.style);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.text), 31, this.backgroundMedia), 31, this.buttons);
        g gVar = this.style;
        return iD + (gVar == null ? 0 : gVar.hashCode());
    }
}
