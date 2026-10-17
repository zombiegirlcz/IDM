package kei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkei/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "state", "d", "mandatoryLevel", "Lkei/b;", "Lkei/b;", "()Lkei/b;", "applicationData", "Lkei/g;", "e", "Lkei/g;", "()Lkei/g;", "messageMetadata", "Lkei/e;", "Lkei/e;", "()Lkei/e;", "content", "feature_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("mandatoryLevel")
    private final String mandatoryLevel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("applicationData")
    private final b applicationData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("messageMetadata")
    private final g messageMetadata;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final e content;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getApplicationData() {
        return this.applicationData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMandatoryLevel() {
        return this.mandatoryLevel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getMessageMetadata() {
        return this.messageMetadata;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.state, fVar.state) && Intrinsics.f(this.mandatoryLevel, fVar.mandatoryLevel) && Intrinsics.f(this.applicationData, fVar.applicationData) && Intrinsics.f(this.messageMetadata, fVar.messageMetadata) && Intrinsics.f(this.content, fVar.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.state);
        String str = this.mandatoryLevel;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.applicationData;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        g gVar = this.messageMetadata;
        return this.content.hashCode() + ((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }
}
