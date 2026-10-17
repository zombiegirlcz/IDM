package z45;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f319323c;
    public final b d;

    public e(String title, String str, b primaryButton, b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f319321a = title;
        this.f319322b = str;
        this.f319323c = primaryButton;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f319321a, eVar.f319321a) && Intrinsics.f(this.f319322b, eVar.f319322b) && Intrinsics.f(this.f319323c, eVar.f319323c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f319321a.hashCode() * 31;
        String str = this.f319322b;
        int iHashCode2 = (this.f319323c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        b bVar = this.d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
