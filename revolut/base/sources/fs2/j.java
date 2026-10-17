package fs2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f137563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f137564c;
    public final ArrayList d;
    public final String e;

    public j(TextLocalisedClause title, TextLocalisedClause subtitle, boolean z, ArrayList tabs, String selectedTabId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f137562a = title;
        this.f137563b = subtitle;
        this.f137564c = z;
        this.d = tabs;
        this.e = selectedTabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f137562a.equals(jVar.f137562a) && this.f137563b.equals(jVar.f137563b) && this.f137564c == jVar.f137564c && this.d.equals(jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.c(t61.a.a(this.f137562a.hashCode() * 31, 31, this.f137563b), 31, this.f137564c), 31);
    }
}
