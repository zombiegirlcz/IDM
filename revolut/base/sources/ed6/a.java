package ed6;

import ad6.h;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ld6.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements wc6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f124918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd6.b f124919b;

    public a(ImmutableMap mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        this.f124918a = mappers;
        cd6.b.Companion.getClass();
        this.f124919b = cd6.b.f23194c;
    }

    @Override // wc6.a
    public final ld6.b a(g product) {
        Intrinsics.checkNotNullParameter(product, "product");
        h hVar = (h) this.f124918a.get(product.getClass());
        if (hVar == null) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar.b(product, this.f124919b);
        }
        return null;
    }

    @Override // wc6.a
    public final Clause b(md6.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        ld6.b bVarA = a(product);
        if (bVarA != null) {
            return bVarA.b();
        }
        return null;
    }
}
