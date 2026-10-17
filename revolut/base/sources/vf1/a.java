package vf1;

import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements xii.b {

    @NotNull
    public static final C1597a Companion = new C1597a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f288502a = y0.b("add-new-product");

    /* JADX INFO: renamed from: vf1.a$a, reason: collision with other inner class name */
    public static final class C1597a {
        private C1597a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f288502a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("category", deeplink.f195041c);
        return new AddNewProductDestination(strA != null ? uj3.b.r(strA) : null, 2);
    }
}
