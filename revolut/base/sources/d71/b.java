package d71;

import com.revolut.domain.models.support.TroubleshootingSource;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TroubleshootingSource f111745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111747c;
    public final String d;
    public final ArrayList e;
    public final d f;

    public b(TroubleshootingSource source, String title, String content, String str, ArrayList actions, d dVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f111745a = source;
        this.f111746b = title;
        this.f111747c = content;
        this.d = str;
        this.e = actions;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f111745a == bVar.f111745a && Intrinsics.f(this.f111746b, bVar.f111746b) && Intrinsics.f(this.f111747c, bVar.f111747c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f111745a.hashCode() * 31, 31, this.f111746b), 31, this.f111747c);
        String str = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        d dVar = this.f;
        return iB + (dVar != null ? dVar.hashCode() : 0);
    }
}
