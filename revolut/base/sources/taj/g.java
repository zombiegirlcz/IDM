package taj;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f269349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f269350c;

    public g(ArrayList content, ArrayList links, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f269348a = name;
        this.f269349b = content;
        this.f269350c = links;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f269348a, gVar.f269348a) && this.f269349b.equals(gVar.f269349b) && this.f269350c.equals(gVar.f269350c);
    }

    public final int hashCode() {
        return this.f269350c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f269349b, this.f269348a.hashCode() * 31, 31);
    }
}
