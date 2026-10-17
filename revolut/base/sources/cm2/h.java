package cm2;

import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThemedBackgroundKey f25113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f25114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f25115c;

    public h(ThemedBackgroundKey themedBackgroundKey, List scopes, i iVar) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f25113a = themedBackgroundKey;
        this.f25114b = scopes;
        this.f25115c = iVar;
    }

    public final ThemedBackgroundKey b() {
        return this.f25113a;
    }

    public final i c() {
        return this.f25115c;
    }

    public final List d() {
        return this.f25114b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f25113a, hVar.f25113a) && Intrinsics.f(this.f25114b, hVar.f25114b) && this.f25115c == hVar.f25115c;
    }

    public final int hashCode() {
        ThemedBackgroundKey themedBackgroundKey = this.f25113a;
        int iD = p.a.d((themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode()) * 31, 31, this.f25114b);
        i iVar = this.f25115c;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
