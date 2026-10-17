package iw0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f168898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f168899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f168900c;

    public m(h hVar, List transactions, Image image) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f168898a = hVar;
        this.f168899b = transactions;
        this.f168900c = image;
    }

    @Override // iw0.a
    public final h a() {
        return this.f168898a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f168898a, mVar.f168898a) && Intrinsics.f(this.f168899b, mVar.f168899b) && Intrinsics.f(this.f168900c, mVar.f168900c);
    }

    public final int hashCode() {
        h hVar = this.f168898a;
        int iD = p.a.d((hVar == null ? 0 : hVar.hashCode()) * 31, 31, this.f168899b);
        Image image = this.f168900c;
        return iD + (image != null ? image.hashCode() : 0);
    }
}
