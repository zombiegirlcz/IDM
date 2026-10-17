package ahe;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 implements b1 {

    @NotNull
    private static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f5009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f5010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5011c;

    public k1(ne0.j memoryCache, ue0.c storage, Map accountIdSerializers) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(accountIdSerializers, "accountIdSerializers");
        this.f5009a = memoryCache;
        this.f5010b = storage;
        this.f5011c = accountIdSerializers;
    }

    public final ProductAccountDescriptor$Value.Main a(e1 e1Var) {
        ProductAccountId.Payload payload;
        Object next;
        Iterator<E> it8 = ProductId.a().iterator();
        while (true) {
            payload = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ProductId) next).getId(), e1Var.f4986a)) {
                break;
            }
        }
        ProductId productId = (ProductId) next;
        if (productId == null) {
            return null;
        }
        if (e1Var.f4988c != null) {
            pfe.e eVar = (pfe.e) this.f5011c.get(productId);
            if (eVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("No serializer for " + productId + ", skipping descriptor");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return null;
            }
            try {
                ProductAccountId.Payload payloadB = eVar.b(e1Var.f4988c);
                if (payloadB == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Deserializer returned null for " + productId + ", skipping descriptor");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                    return null;
                }
                payload = payloadB;
            } catch (Exception e) {
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var3);
                return null;
            }
        }
        return new ProductAccountDescriptor$Value.Main(new ProductAccountId(e1Var.f4987b, payload), productId);
    }
}
