package fa;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f133014c;
    public final i d;

    public j(String title, String str, ArrayList sections, i continueAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(continueAction, "continueAction");
        this.f133012a = title;
        this.f133013b = str;
        this.f133014c = sections;
        this.d = continueAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f133012a, jVar.f133012a) && Intrinsics.f(this.f133013b, jVar.f133013b) && this.f133014c.equals(jVar.f133014c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f133012a.hashCode() * 31;
        String str = this.f133013b;
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f133014c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = v0.a.m("NavigationHubContent(title=", this.f133012a, ", subtitle=", this.f133013b, ", sections=");
        sbM.append(this.f133014c);
        sbM.append(", continueAction=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
