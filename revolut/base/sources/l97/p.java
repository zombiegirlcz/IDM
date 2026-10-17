package l97;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o97.i f193093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f193094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f193095c;

    public p(o97.i prefs, ArrayList placeholderSources, ArrayList searchableSources) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(placeholderSources, "placeholderSources");
        Intrinsics.checkNotNullParameter(searchableSources, "searchableSources");
        this.f193093a = prefs;
        this.f193094b = placeholderSources;
        this.f193095c = searchableSources;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f193093a.equals(pVar.f193093a) && this.f193094b.equals(pVar.f193094b) && this.f193095c.equals(pVar.f193095c);
    }

    public final int hashCode() {
        return this.f193095c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f193094b, this.f193093a.hashCode() * 31, 31);
    }
}
