package gs4;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ql4.t;
import ql4.x;
import ql4.y;
import tof.a3;
import yhm.m;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.d f146316a;

    public f(thf.d transactionIconResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        this.f146316a = transactionIconResourcesMapper;
    }

    public final a a(d dVar) throws Throwable {
        Image imageI;
        InactiveCircleBadge inactiveCircleBadge;
        Object objA;
        ProgressStyle progressStyleC = null;
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            List list = bVar.d;
            k71.q qVar = bVar.e;
            try {
                m.Companion companion = yhm.m.INSTANCE;
                objA = list.size() == 1 ? this.f146316a.b((a3) d0.b0(list), qVar) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_documents_pair, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, null, null, 48);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof yhm.n) {
                objA = null;
            }
            imageI = (Image) objA;
            if (imageI == null) {
                imageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorOnAccent, R$attr.uikit_colorTeal);
            }
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            imageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_statement, R$attr.uikit_colorOnAccent, R$attr.uikit_colorTeal);
        }
        t state = dVar.getState();
        int[] iArr = e.f146314a;
        int i = iArr[state.ordinal()];
        if (i == 1) {
            inactiveCircleBadge = new InactiveCircleBadge(dw0.a.Cancelled);
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            inactiveCircleBadge = null;
        }
        t state2 = dVar.getState();
        int iB = dVar.b();
        int iA = dVar.a();
        int i2 = iArr[state2.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                progressStyleC = ProgressStyle.Companion.c(ProgressStyle.INSTANCE, iA == 0 ? 0 : rim.d.b((((double) iB) / ((double) iA)) * ((double) 100)), R$attr.uikit_colorAccent);
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new a(imageI, inactiveCircleBadge, progressStyleC);
    }

    public final a b(ql4.i model) throws Throwable {
        d cVar;
        Intrinsics.checkNotNullParameter(model, "model");
        switch (e.f146315b[model.f247132j.ordinal()]) {
            case 1:
                cVar = new c(model.f247131h, model.d, model.e);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                t tVar = model.f247131h;
                int i = model.d;
                int i2 = model.e;
                ql4.h hVar = model.f247134m;
                List list = hVar.f247124a;
                Object obj2 = hVar.f247125b;
                k71.q qVarA = obj2 instanceof k71.q ? (k71.q) obj2 : null;
                if (qVarA == null) {
                    k71.q.Companion.getClass();
                    qVarA = k71.p.a();
                }
                cVar = new b(tVar, i, i2, list, qVarA);
                break;
            case 6:
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    throw new IllegalStateException("Unsupported instalment type");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    Throwable thA = yhm.m.a(yhm.o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    cVar = null;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return cVar != null ? a(cVar) : new a(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorOnAccent, R$attr.uikit_colorTeal), null, null);
    }

    public final a c(ql4.q instalment, List transactions, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(instalment, "instalment");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return a(new b(instalment.u, instalment.e, instalment.F.f247152b.d, transactions, transactionsExtraData));
    }

    public final a d(y instalment, List transactions, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(instalment, "instalment");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        t tVar = instalment.f247195b;
        int i = instalment.d;
        x xVar = instalment.e.f247187b;
        return a(new b(tVar, i, xVar.d + xVar.e, transactions, transactionsExtraData));
    }
}
