package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b2 extends gim.i implements Function2 {
    public final /* synthetic */ c2 u;
    public final /* synthetic */ ProductAccountDescriptor$Value.Main v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductAccountMetadata f288875w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, ProductAccountDescriptor$Value.Main main, ProductAccountMetadata productAccountMetadata, Continuation continuation) {
        super(2, continuation);
        this.u = c2Var;
        this.v = main;
        this.f288875w = productAccountMetadata;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b2(this.u, this.v, this.f288875w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tge.c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c2 c2Var = this.u;
        rfe.a aVar2 = c2Var.f288880c;
        ue0.c cVar2 = c2Var.f288878a;
        ProductAccountDescriptor$Value.Main main = this.v;
        ProductId productId = main.f89727a;
        ProductId productId2 = main.f89727a;
        ProductAccountId productAccountId = main.f89728b;
        if (!aVar2.a(productId, productAccountId.f89730b)) {
            c2.a(c2Var, "Last selected product account is not visible in the current tab", main);
            c2Var.d();
            return null;
        }
        z9h.n.l(String.class, cVar2, "LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2", com.google.android.gms.internal.mlkit_vision_face.a.o(productId2.getId(), "_:_", productAccountId.f89729a));
        ProductAccountMetadata productAccountMetadata = this.f288875w;
        if (productAccountMetadata != null) {
            Intrinsics.checkNotNullParameter(productAccountMetadata, "<this>");
            ProductAccountBalance productAccountBalance = productAccountMetadata.f89515a;
            ProductAccountBalance.WithAmount withAmount = productAccountBalance instanceof ProductAccountBalance.WithAmount ? (ProductAccountBalance.WithAmount) productAccountBalance : null;
            dj0.d dVar = withAmount != null ? withAmount.f89509a : null;
            ProductAccountBalance.CurrencyOnly currencyOnly = productAccountBalance instanceof ProductAccountBalance.CurrencyOnly ? (ProductAccountBalance.CurrencyOnly) productAccountBalance : null;
            cVar = new tge.c(dVar, currencyOnly != null ? currencyOnly.f89508a : null, Boolean.valueOf(productAccountMetadata.f89516b));
        } else {
            cVar = null;
        }
        if (cVar != null) {
            cVar2.G(cVar, "LAST_SELECTED_ACCOUNT_METADATA_KEY", wim.z.d(kotlin.jvm.internal.o0.b(tge.c.class)));
        } else {
            cVar2.I0("LAST_SELECTED_ACCOUNT_METADATA_KEY");
        }
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (payload == null) {
            cVar2.I0("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY");
            return main;
        }
        try {
            Object obj3 = c2Var.f288879b.get(productId2);
            if (obj3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            cVar2.G(((pfe.e) obj3).a(payload), "LAST_SELECTED_ACCOUNT_PAYLOAD_KEY", wim.z.d(kotlin.jvm.internal.o0.b(String.class)));
            return main;
        } catch (Exception error) {
            cVar2.I0("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, "ProductAccountLastSelectedStorage", null, error, h0Var);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(error, "error");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, null, null, error, h0Var2);
            Unit unit = Unit.f186387a;
            return main;
        }
    }
}
