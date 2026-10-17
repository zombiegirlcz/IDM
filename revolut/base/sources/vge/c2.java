package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c2 implements x1 {

    @NotNull
    private static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f288878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f288879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rfe.a f288880c;

    public c2(ue0.c storage, Map accountIdSerializers, rfe.a accountVisibilityFilter) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(accountIdSerializers, "accountIdSerializers");
        Intrinsics.checkNotNullParameter(accountVisibilityFilter, "accountVisibilityFilter");
        this.f288878a = storage;
        this.f288879b = accountIdSerializers;
        this.f288880c = accountVisibilityFilter;
    }

    public static final void a(c2 c2Var, String str, ProductAccountDescriptor$Value.Main main) {
        c2Var.getClass();
        String id10 = main.f89727a.getId();
        ProductAccountId productAccountId = main.f89728b;
        String str2 = productAccountId.f89729a;
        ProductAccountId.Payload payload = productAccountId.f89730b;
        IllegalStateException illegalStateException = new IllegalStateException(v0.a.i(p.a.t(str, ". productId=", id10, ", accountId=", str2), ", payloadType=", payload != null ? payload.getClass().getSimpleName() : null));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, "ProductAccountLastSelectedStorage", null, illegalStateException, h0Var);
    }

    public static final ProductAccountDescriptor$Value.Main b(c2 c2Var) {
        ProductAccountDescriptor$Value.Main main;
        String str = (String) c2Var.f288878a.T2("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2", String.class);
        if (str == null) {
            return null;
        }
        x1.Companion.getClass();
        Pair pairA = w1.a(str);
        if (pairA == null) {
            main = null;
        } else {
            main = new ProductAccountDescriptor$Value.Main((ProductAccountId) pairA.f186386b, (ProductId) pairA.f186385a);
        }
        if (main != null) {
            return main;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Stored last selected product account descriptor is malformed");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, "ProductAccountLastSelectedStorage", null, illegalStateException, h0Var);
        c2Var.d();
        return null;
    }

    public static final ProductAccountId.Payload c(c2 c2Var, ProductAccountDescriptor$Value.Main main) {
        ProductId productId = main.f89727a;
        ue0.c cVar = c2Var.f288878a;
        String str = (String) cVar.T2("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY", String.class);
        if (str == null) {
            return null;
        }
        try {
            Object obj2 = c2Var.f288879b.get(productId);
            if (obj2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ProductAccountId.Payload payloadB = ((pfe.e) obj2).b(str);
            if (payloadB != null) {
                return payloadB;
            }
            cVar.I0("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY");
            throw new IllegalArgumentException("Unknown product account payload for productId=" + productId.getId());
        } catch (Exception error) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, "ProductAccountLastSelectedStorage", null, error, h0Var);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(error, "error");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, error, h0Var2);
            Unit unit = Unit.f186387a;
            return null;
        }
    }

    public final void d() {
        ue0.c cVar = this.f288878a;
        cVar.I0("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2");
        cVar.I0("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY");
        cVar.I0("LAST_SELECTED_ACCOUNT_METADATA_KEY");
    }
}
