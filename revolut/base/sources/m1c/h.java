package m1c;

import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTextWithLinks f201369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f201370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201371c;
    public final ArrayList d;
    public final c e;
    public final c f;

    public h(RevPointsTextWithLinks revPointsTextWithLinks, f fVar, String contentSectionTitle, ArrayList contentItems, c cVar, c cVar2) {
        Intrinsics.checkNotNullParameter(contentSectionTitle, "contentSectionTitle");
        Intrinsics.checkNotNullParameter(contentItems, "contentItems");
        this.f201369a = revPointsTextWithLinks;
        this.f201370b = fVar;
        this.f201371c = contentSectionTitle;
        this.d = contentItems;
        this.e = cVar;
        this.f = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f201369a, hVar.f201369a) && Intrinsics.f(this.f201370b, hVar.f201370b) && Intrinsics.f(this.f201371c, hVar.f201371c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        RevPointsTextWithLinks revPointsTextWithLinks = this.f201369a;
        int iHashCode = (revPointsTextWithLinks == null ? 0 : revPointsTextWithLinks.hashCode()) * 31;
        f fVar = this.f201370b;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f201371c), 31);
        c cVar = this.e;
        int iHashCode2 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
