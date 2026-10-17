package i20;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Li20/f;", "Li20/d0;", "", "toString", "()Ljava/lang/String;", "Li20/h;", "a", "Li20/h;", "b", "()Li20/h;", "textMessage", "", "Li20/e;", "Ljava/util/List;", "c", "()Ljava/util/List;", "uploads", "Li20/g;", "Li20/g;", "()Li20/g;", "meta", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("textMessage")
    private final h textMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("uploads")
    @NotNull
    private final List<e> uploads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("meta")
    private final g meta;

    public f() {
        zhm.f0 uploads = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(uploads, "uploads");
        this.textMessage = null;
        this.uploads = uploads;
        this.meta = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getMeta() {
        return this.meta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getTextMessage() {
        return this.textMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getUploads() {
        return this.uploads;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.textMessage, fVar.textMessage) && Intrinsics.f(this.uploads, fVar.uploads) && Intrinsics.f(this.meta, fVar.meta);
    }

    public final int hashCode() {
        h hVar = this.textMessage;
        int iD = p.a.d((hVar == null ? 0 : hVar.hashCode()) * 31, 31, this.uploads);
        g gVar = this.meta;
        return iD + (gVar != null ? gVar.hashCode() : 0);
    }
}
