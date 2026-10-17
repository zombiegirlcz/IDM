package dvk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f118152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f118153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f118154c;
    public final String d;
    public final List e;

    public h(TextLocalisedClause title, TextLocalisedClause description, ArrayList tabs, String str, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f118152a = title;
        this.f118153b = description;
        this.f118154c = tabs;
        this.d = str;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f118152a.equals(hVar.f118152a) && this.f118153b.equals(hVar.f118153b) && this.f118154c.equals(hVar.f118154c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f118154c, t61.a.a(this.f118152a.hashCode() * 31, 31, this.f118153b), 31);
        String str = this.d;
        return this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
