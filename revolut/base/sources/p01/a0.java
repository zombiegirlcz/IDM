package p01;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f231407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f231408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f231409c;
    public final x d;
    public final boolean e;

    public a0(Clause titleText, Image image, MoneyClause mainText, x xVar, boolean z) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        this.f231407a = titleText;
        this.f231408b = image;
        this.f231409c = mainText;
        this.d = xVar;
        this.e = z;
    }

    public final z a(jid.z zVar) {
        jid.z zVar2;
        k01.h hVar = null;
        Image image = this.f231408b;
        if (image != null) {
            float f = 20;
            float f4 = l01.b.f191141a.density;
            int i = (int) (f * f4);
            int i2 = (int) (f * f4);
            zVar.getClass();
            Intrinsics.checkNotNullParameter(image, "<this>");
            CoroutineScope coroutineScope = (CoroutineScope) zVar.f174461b;
            k01.l lVar = (k01.l) zVar.f174462c;
            zVar2 = zVar;
            hVar = new k01.h(e0.g(coroutineScope, null, null, new bt9.v(new k01.k(zVar2, lVar, image, i, i2, null, 0), null), 3), lVar.d);
        } else {
            zVar2 = zVar;
        }
        return new z(zVar2, this, hVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f231407a, a0Var.f231407a) && Intrinsics.f(this.f231408b, a0Var.f231408b) && Intrinsics.f(this.f231409c, a0Var.f231409c) && Intrinsics.f(this.d, a0Var.d) && this.e == a0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f231407a.hashCode() * 31;
        Image image = this.f231408b;
        int iA = v7.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f231409c);
        x xVar = this.d;
        return Boolean.hashCode(this.e) + ((iA + (xVar != null ? xVar.hashCode() : 0)) * 31);
    }
}
