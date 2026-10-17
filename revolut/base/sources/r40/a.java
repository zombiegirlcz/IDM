package r40;

import com.revolut.feature.feedback.api.domain.Feedback;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f251319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f251320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f251321c;
    public final String d;
    public final Feedback e;
    public final Map f;

    public a(h chats, boolean z, f fVar, String str, Feedback feedback, Map reloadingChats) {
        Intrinsics.checkNotNullParameter(chats, "chats");
        Intrinsics.checkNotNullParameter(reloadingChats, "reloadingChats");
        this.f251319a = chats;
        this.f251320b = z;
        this.f251321c = fVar;
        this.d = str;
        this.e = feedback;
        this.f = reloadingChats;
    }

    public static a a(a aVar, h hVar, boolean z, d dVar, String str, Feedback feedback, Map map, int i) {
        if ((i & 1) != 0) {
            hVar = aVar.f251319a;
        }
        h chats = hVar;
        if ((i & 2) != 0) {
            z = aVar.f251320b;
        }
        boolean z3 = z;
        f fVar = dVar;
        if ((i & 4) != 0) {
            fVar = aVar.f251321c;
        }
        f fVar2 = fVar;
        if ((i & 8) != 0) {
            str = aVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            feedback = aVar.e;
        }
        Feedback feedback2 = feedback;
        if ((i & 32) != 0) {
            map = aVar.f;
        }
        Map reloadingChats = map;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(chats, "chats");
        Intrinsics.checkNotNullParameter(reloadingChats, "reloadingChats");
        return new a(chats, z3, fVar2, str2, feedback2, reloadingChats);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f251319a, aVar.f251319a) && this.f251320b == aVar.f251320b && Intrinsics.f(this.f251321c, aVar.f251321c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f251319a.hashCode() * 31, 31, this.f251320b);
        f fVar = this.f251321c;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Feedback feedback = this.e;
        return this.f.hashCode() + ((iHashCode2 + (feedback != null ? feedback.hashCode() : 0)) * 31);
    }
}
